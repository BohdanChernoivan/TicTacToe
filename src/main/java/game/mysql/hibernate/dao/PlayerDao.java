package game.mysql.hibernate.dao;

import game.mysql.hibernate.entities.Match;
import game.mysql.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PlayerDao {

    public Match findById(String id) {
        return HibernateUtils.getSessionFactory().openSession().get(Match.class, id);
    }

    public void update(Match match) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(match);
        tx1.commit();
        session.close();
    }
}
