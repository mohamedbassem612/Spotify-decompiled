package p;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j7s implements wjh0, nrm0 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ j7s(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2) {
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.a = z;
        this.b = z2;
    }

    public mrs0 a() {
        mrs0 mrs0Var = new mrs0();
        mrs0Var.a = (CharSequence) this.c;
        mrs0Var.b = (IconCompat) this.d;
        mrs0Var.c = (String) this.e;
        mrs0Var.d = (String) this.f;
        mrs0Var.e = this.a;
        mrs0Var.f = this.b;
        return mrs0Var;
    }

    public u771 b() {
        ay61 ay61Var = (ay61) this.c;
        if (ay61Var == null) {
            eg.m("shareAssetContent must be set");
            return null;
        }
        wa71 wa71VarA = (wa71) this.f;
        if (wa71VarA == null) {
            wa71VarA = new wa71(ay61Var.d, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126);
        }
        Long l = (Long) this.e;
        if (l != null) {
            wa71VarA = wa71.a(wa71VarA, (String) null, mqo1.G(sqg0.P(wa71VarA.c, new mmr0("t", String.valueOf(l.longValue() / 1000)))), (String) null, 123);
        }
        return new u771(new t771(wa71VarA, tyo1.p(blc0.sg, new String[0])), new pz61(new y171(rc11.a.b(ynf0.class)), new dof0(ay61Var), az61.d, this.a || this.b), new bj71((Set) null, false, (String) this.d, 1));
    }

    public vqo c(boolean z) {
        m441 m441Var = z == this.a ? new m441(new p1r(this, (lnm) null, (byte) 25)) : new huz(Boolean.FALSE, (byte) 10);
        c0g.x.getClass();
        return new vqo("goPremium", new uqo((Integer) null, (String) null, (Integer) null, (ks21) null, 31), m441Var, cxo1.P0, (kly0) this.d, new sqo(new cb8(this, z, (byte) 11)));
    }

    public void d(Function0 function0, b0k b0kVar, int i) {
        ven0 ven0Var = (ven0) this.f;
        m4c m4cVar = fkj0.X;
        ven0 ven0Var2 = (ven0) this.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-449451366);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.g(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(ven0Var2) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new cb(function0, ven0Var2, (byte) 26);
                x340Var.s0(objT);
            }
            qxd0.S((Function0) objT, x340Var);
            c380 c380Var = (c380) ((ven0) this.d).getValue();
            boolean z = !((ezg0) this.e).c.d();
            boolean z2 = this.a;
            boolean z3 = this.b;
            boolean zI2 = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new c470(ven0Var, (byte) 18);
                x340Var.s0(objT2);
            }
            i9p1.c(c380Var, true, z, z2, z3, (Function0) objT2, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(this, function0, i, (byte) 10);
        }
    }

    public void e(jca jcaVar) {
        if (jcaVar == ((jca) this.e)) {
            this.f = null;
            this.e = null;
            this.a = true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.ExoPlaybackException */
    public void f(jca jcaVar) throws ExoPlaybackException {
        wjh0 wjh0Var;
        wjh0 wjh0VarH = jcaVar.h();
        if (wjh0VarH == null || wjh0VarH == (wjh0Var = (wjh0) this.f)) {
            return;
        }
        if (wjh0Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f = wjh0VarH;
        this.e = jcaVar;
        wjh0VarH.m(((zab1) this.c).e);
    }

    public void g(boolean z) {
        this.a = z;
    }

    public void h(IconCompat iconCompat) {
        this.d = iconCompat;
    }

    public void i(boolean z) {
        this.b = z;
    }

    public void j(String str) {
        this.f = str;
    }

    public void k(CharSequence charSequence) {
        this.c = charSequence;
    }

    public k2u0 l() {
        wjh0 wjh0Var = (wjh0) this.f;
        return wjh0Var != null ? wjh0Var.l() : ((zab1) this.c).e;
    }

    public void m(k2u0 k2u0Var) {
        wjh0 wjh0Var = (wjh0) this.f;
        if (wjh0Var != null) {
            wjh0Var.m(k2u0Var);
            k2u0Var = ((wjh0) this.f).l();
        }
        ((zab1) this.c).m(k2u0Var);
    }

    public boolean n() {
        if (this.a) {
            return false;
        }
        wjh0 wjh0Var = (wjh0) this.f;
        wjh0Var.getClass();
        return wjh0Var.n();
    }

    public void o(String str) {
        this.e = str;
    }

    public long p() {
        if (this.a) {
            return ((zab1) this.c).p();
        }
        wjh0 wjh0Var = (wjh0) this.f;
        wjh0Var.getClass();
        return wjh0Var.p();
    }

    public j7s(ov20 ov20Var, boolean z, boolean z2, thq thqVar, fzm0 fzm0Var, jkp0 jkp0Var) {
        this.c = ov20Var;
        this.a = z;
        this.b = z2;
        this.d = thqVar;
        this.e = fzm0Var;
        this.f = jkp0Var;
    }

    public j7s() {
    }
}
