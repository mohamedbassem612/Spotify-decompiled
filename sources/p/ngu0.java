package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ngu0 {
    public static final ty9 a;
    public static final ty9 b;
    public static final ty9 c;
    public static final ty9 d;

    static {
        nbm1 nbm1Var = nbm1.a;
        a = b(280.0f, 94.0f, new pkb0(nbm1Var, 92.02f, -42.59f, 226.5f, 127.41f, 52.17f, null, 0, 960), 185.0f, 41.0f, 54.29f);
        b = b(190.0f, 214.0f, new pkb0(nbm1Var, -15.0f, -57.0f, 388.81f, 218.71f, 60.0f, null, 0, 960), 113.0f, 105.0f, 80.0f);
        c = b(190.0f, 329.0f, new pkb0(nbm1Var, -32.0f, 36.0f, 369.98f, 208.11f, 60.0f, null, 0, 960), 76.0f, 190.0f, 120.0f);
        d = b(395.0f, 331.0f, new pkb0(nbm1Var, 57.0f, -78.0f, 544.69f, 306.39f, 60.0f, null, 0, 960), 236.0f, 149.0f, 160.0f);
    }

    public static final p3v a(l6m1 l6m1Var, long j) {
        Object next;
        long jB = vy9.b(j, vy9.a);
        Iterator it = vy9.c(l6m1Var.a, jB).c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pkb0) next).a != nbm1.e);
        pkb0 pkb0Var = (pkb0) next;
        if (pkb0Var == null) {
            return null;
        }
        return new p3v((s3v.b(j) / s3v.b(jB)) * (s3v.b(jB) - pkb0Var.b));
    }

    public static final ty9 b(float f, float f2, pkb0 pkb0Var, float f3, float f4, float f5) {
        return new ty9(f, f2, p7h.M(new pkb0[]{pkb0.a(pkb0Var, 0.0f, 0.0f, 0.0f, 0.0f, 767), new pkb0(nbm1.b, 0.0f, 0.0f, f, f2, 0.0f, new dza(), 0, 864), new pkb0(nbm1.e, f3, f4, f5, f5, -12.85f, null, 5, 192)}));
    }
}
