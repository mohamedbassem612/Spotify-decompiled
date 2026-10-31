package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mc3 implements ebr0 {
    public final /* synthetic */ byte a;
    public ynb0 b;

    public final h0r0 a(Parcelable parcelable, q7r0 q7r0Var, Object obj) {
        switch (this.a) {
            case 0:
                return yzo1.l((hc3) this.b.get(), (lc3) parcelable, q7r0Var, (rih1) obj).c();
            case 1:
                return h0p1.o((i1o) this.b.get(), (l1o) parcelable, q7r0Var, (rih1) obj).i();
            case 2:
                return j0p1.j((ciz) this.b.get(), (eiz) parcelable, q7r0Var, (rih1) obj).m();
            case 3:
                return l0p1.g((vh00) this.b.get(), (wh00) parcelable, q7r0Var, (rih1) obj).t();
            case 4:
                wgp wgpVarR = m0p1.r((qk00) this.b.get(), (vk00) parcelable, q7r0Var, (rih1) obj);
                qk00 qk00Var = wgpVarR.a;
                z7e0 z7e0Var = (z7e0) qk00Var.d.get();
                c8o.l(z7e0Var);
                mfp mfpVar = (mfp) wgpVarR.i.get();
                tj00 tj00Var = (tj00) wgpVarR.p1.get();
                vk00 vk00Var = wgpVarR.c;
                bn70 bn70VarN = tk00.n(vk00Var);
                mk00 mk00Var = new mk00();
                w25 w25VarC = wgpVarR.c();
                t380 t380VarP = wgpVarR.p();
                luk lukVarB = qk00Var.b();
                c8o.l(lukVarB);
                boolean zB = sk00.b(new b35(lukVarB));
                t2j0 t2j0VarF = qk00Var.f();
                c8o.l(t2j0VarF);
                dxz0 dxz0VarC = qk00Var.c();
                c8o.l(dxz0VarC);
                return new kpn(z7e0Var, mfpVar, tj00Var, bn70VarN, mk00Var, w25VarC, t380VarP, zB, t2j0VarF, dxz0VarC, f7z.i(vk00Var));
            case 5:
                return u0p1.k((w530) this.b.get(), (b630) parcelable, q7r0Var, (rih1) obj).b();
            case 6:
                return h1p1.i((yw30) this.b.get(), (zw30) parcelable, q7r0Var, (rih1) obj).u();
            case 7:
                return n1p1.k((l8x0) this.b.get(), (sbx0) parcelable, q7r0Var, (rih1) obj).A();
            case 8:
                return p1p1.y((kpz0) this.b.get(), (aqr0) parcelable, q7r0Var, (rih1) obj).f();
            case 9:
                return s1p1.t((ml01) this.b.get(), (nl01) parcelable, q7r0Var, (rih1) obj).j();
            default:
                return b2p1.y((t2l1) this.b.get(), (u2l1) parcelable, q7r0Var, (rih1) obj).h();
        }
    }
}
