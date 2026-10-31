package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class pyf0 {
    public static final bs50 a;

    static {
        Object next;
        fyo1.r("kotlinx.coroutines.fast.service.loader", true);
        try {
            Iterator it = z561.k0(z561.Q(pze0.j())).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    ((ud4) next).getClass();
                    do {
                        ((ud4) it.next()).getClass();
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            ud4 ud4Var = (ud4) next;
            if (ud4Var != null) {
                a = wpb1.E(ud4Var);
            } else {
                wpb1.s(3, (Throwable) null);
                throw null;
            }
        } catch (Throwable th) {
            wpb1.s(2, th);
            throw null;
        }
    }
}
