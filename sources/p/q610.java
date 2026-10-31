package p;

import com.spotify.clientrestrictions.v1.RestrictedIntegration;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q610 {
    public final tf4 a;
    public final k811 b;
    public final Scheduler c;
    public tro1 d = n610.b;
    public final rku e = new rku();

    public q610(tf4 tf4Var, k811 k811Var, Scheduler scheduler) {
        this.a = tf4Var;
        this.b = k811Var;
        this.c = scheduler;
    }

    public final qro1 a(m210 m210Var) {
        Object next;
        if (this.a.a()) {
            m610 m610Var = this.d;
            if (!(m610Var instanceof n610) && !(m610Var instanceof l610)) {
                if (!(m610Var instanceof m610)) {
                    eg.o();
                    return null;
                }
                m610 m610Var2 = m610Var;
                if (m610Var2.F().p() != null) {
                    Iterator it = m610Var2.F().p().o().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!f6o1.r(((RestrictedIntegration) next).n(), m210Var));
                    RestrictedIntegration restrictedIntegration = (RestrictedIntegration) next;
                    String strO = restrictedIntegration != null ? restrictedIntegration.o() : null;
                    if (strO != null) {
                        return new j610(strO);
                    }
                }
            }
            return k610.b;
        }
        return i610.b;
    }
}
