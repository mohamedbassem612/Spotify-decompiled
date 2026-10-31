package p;

import j$.time.Duration;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p681 {
    public static final List d;
    public static final List e;
    public static final Duration f;
    public final gh40 a;
    public final dt71 b;
    public final xe01 c;

    static {
        List listM = p7h.M(new dh40[]{dh40.b, dh40.e, dh40.d});
        d = listM;
        e = listM;
        f = Duration.ofHours(24L);
    }

    public p681(gh40 gh40Var, u9c0 u9c0Var) {
        this.a = gh40Var;
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        this.b = dt71VarE;
        dt71VarE.a(rih1.a);
        jge jgeVarE = hu20.e(dt71VarE, new af01((lnm) null, (Object) this, (byte) 18));
        bu51 bu51Var = new bu51(3, (lnm) null, (byte) 2);
        r681 r681Var = r681.a;
        this.c = d5p1.t(new ipr(r681Var, jgeVarE, bu51Var, (byte) 16), u9c0Var, new alb1(0L, Long.MAX_VALUE), r681Var);
    }
}
