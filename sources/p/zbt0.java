package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zbt0 implements xpw {
    public final Context a;
    public final lzn0 b;
    public final wpv0 c;
    public final i9i1 d;
    public final js20 f;
    public final psw h;
    public static final String i = nik1.b2.a;
    public static final String t = nik1.W1.a;
    public static final String X = nik1.M5.a;
    public static final String Y = nik1.Y1.a;
    public final idd1 e = new idd1(new kks0(this, (byte) 7));
    public final ia00 g = n3o1.q(this).a(e9t0.c, e9t0.d);

    public zbt0(Context context, lzn0 lzn0Var, ov20 ov20Var, pcl pclVar, wpv0 wpv0Var, u3q0 u3q0Var, i9i1 i9i1Var) {
        this.a = context;
        this.b = lzn0Var;
        this.c = wpv0Var;
        this.d = i9i1Var;
        bw20 bw20Var = (bw20) ov20Var;
        this.f = x3p1.m(h5p1.q(new any(rqt0.u(new any(bw20Var.c("type", ""), (byte) 19)), (byte) 20), bw20Var.a("is-standalone-audiobooks", false), u3q0Var.b(), pclVar.a(), new x010(rqt0.u(new ld2(bw20Var.c("country_code", ""), "KR", (byte) 14)), rqt0.u(new php0(bw20Var.c("on-demand-trial-in-progress", "0"), (byte) 21)), new irp0(3, (lnm) null, (byte) 8), (byte) 1), new dad0((lnm) null, (byte) 1)), new wbt0(this, (byte) 0), new t1t0(this, (byte) 4), (o8n) null, new wbt0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(783851754, new t9r0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public static if5 e(tbt0 tbt0Var, x340 x340Var) {
        if (u890.j(tbt0Var, ak20.U0)) {
            x340Var.i0(-1489825115);
            x340Var.r(false);
            return new if5((Integer) null, (String) null, b610.X0, (hf5) null, 11);
        }
        if (tbt0Var instanceof sbt0) {
            x340Var.i0(-1489814621);
            int i2 = ((sbt0) tbt0Var).a;
            if5 if5Var = new if5((Integer) null, cwl1.U(2131820893, i2, new Object[]{Integer.valueOf(i2)}, x340Var), (b2i) null, (hf5) null, 13);
            x340Var.r(false);
            return if5Var;
        }
        if (u890.j(tbt0Var, zj20.U0)) {
            x340Var.i0(-1489805158);
            x340Var.r(false);
            return new if5(2131961935, (String) null, (b2i) null, (hf5) null, 14);
        }
        if (u890.j(tbt0Var, bk20.W0)) {
            x340Var.i0(1060791959);
            x340Var.r(false);
            return null;
        }
        if (!u890.j(tbt0Var, yj20.V0)) {
            throw p3d1.k(x340Var, -1489826283, false);
        }
        x340Var.i0(-1489800497);
        x340Var.r(false);
        return new if5(2131961937, (String) null, (b2i) null, (hf5) null, 14);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
