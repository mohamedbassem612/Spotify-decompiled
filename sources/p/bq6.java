package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bq6 implements xpw {
    public final lzn0 a;
    public final gw70 b;
    public final zob1 c;
    public final gq6 d = new gq6((byte) 0);
    public final poy0 e = d4o1.f(new aq6(this, (byte) 0), gn6.R0, ad5.O0, new aq6(this, (byte) 1), 8);
    public final psw f;

    static {
        Collections.singleton(new zp21(iq6.class));
    }

    public bq6(lzn0 lzn0Var, gw70 gw70Var, zob1 zob1Var) {
        this.a = lzn0Var;
        this.b = gw70Var;
        this.c = zob1Var;
        j2i j2iVar = new j2i(780062862, new i43(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
