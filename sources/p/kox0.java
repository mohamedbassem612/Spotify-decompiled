package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kox0 implements syq {
    public final /* synthetic */ byte a;
    public final d0r b;
    public final ia00 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public kox0(d0r d0rVar, xfx xfxVar, q8n q8nVar) {
        this.a = (byte) 1;
        this.b = d0rVar;
        this.d = xfxVar;
        this.e = new i4r(uyf1.O0, mcz0.a);
        lzf1 lzf1Var = new lzf1(this, (byte) 0);
        yvf1 yvf1Var = new yvf1(this, (byte) 1);
        rvd1 rvd1Var = new rvd1(this, (byte) 15);
        qtr qtrVar = new qtr();
        qtrVar.b(new eri0(5, (lnm) null, (byte) 19));
        this.f = new js20(lzf1Var, yvf1Var, rvd1Var, qtrVar, true, q8nVar, false);
        this.c = n3o1.q(this).a(vrf1.N0, vrf1.O0);
        this.g = lnn1.g(uyf1.P0, uyf1.Q0, new lzf1(this, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    public static kzf1 f(kzf1 kzf1Var, kcz0 kcz0Var) {
        boolean z;
        String str;
        if (kzf1Var.e) {
            return kzf1Var;
        }
        gzf1 gzf1Var = kzf1Var.c;
        boolean z2 = kzf1Var.d;
        o3r o3rVar = mcz0.a;
        String str2 = null;
        String str3 = kcz0Var != null ? kcz0Var.a : null;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = gzf1Var.b;
        if (z2) {
            str4 = str5;
        } else {
            String str6 = kcz0Var != null ? kcz0Var.b : null;
            if (str6 != null) {
                str4 = str6;
            }
        }
        s27 s27Var = gzf1Var.m;
        boolean z3 = gzf1Var.q;
        if (kcz0Var != null) {
            str2 = kcz0Var.c;
            if (z3 && (str = kcz0Var.d) != null) {
                str2 = str;
            }
        }
        String str7 = str3;
        String str8 = str4;
        s27 s27Var2 = new s27(new g07(str2, s27Var.a.b), s27Var.b, s27Var.c);
        if (gzf1Var.r && kcz0Var != null) {
            z = kcz0Var.e;
        }
        return new kzf1(kzf1Var.a, kzf1Var.b, gzf1.a(gzf1Var, str7, str8, s27Var2, z, 389116), kzf1Var.d, kzf1Var.e, kzf1Var.f);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                return (nsw) this.f;
            default:
                return (kjv) this.g;
        }
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (rey0) this.e;
            default:
                return (js20) this.f;
        }
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (iik0) this.g;
            default:
                return (i4r) this.e;
        }
    }

    public kox0(jly0 jly0Var, fox0 fox0Var, d0r d0rVar, o3r o3rVar) {
        this.a = (byte) 0;
        this.b = d0rVar;
        qfv qfvVarM0 = fdg1.m0(fox0Var.a(d0rVar, o3rVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        this.d = qfvVarM0;
        this.e = ila0.D();
        this.c = n3o1.q(this).a(cnx0.g, cnx0.h);
        this.f = jch0.j(new wh(qfvVarM0, jly0Var, (byte) 28));
        this.g = new iik0(this, (byte) 12);
    }
}
