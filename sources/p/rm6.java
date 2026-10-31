package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rm6 implements tyq {
    public final o3r a;
    public final o3r b;
    public final o3r c;
    public final o3r d;
    public final om6 e;
    public final js20 f;
    public final ia00 g;
    public final psw h;

    public rm6(a7a1 a7a1Var, d0r d0rVar, hvp0 hvp0Var, fos fosVar, xzq xzqVar, xzq xzqVar2, xyf1 xyf1Var, hw2 hw2Var, rea1 rea1Var, ttm0 ttm0Var, mjm mjmVar, cm0 cm0Var, ngs0 ngs0Var, na9 na9Var, r6h1 r6h1Var, String str, kt91 kt91Var) {
        jd11 jd11Var = rc11.a;
        this.a = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, qm6.d, new j4r(ag6.a1), qm6.e), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, qm6.f, new j4r(ag6.b1), qm6.g), new l4r(new wlu(jd11Var.b(jo70.class)), 2, qm6.h, new j4r(ag6.c1), qm6.i), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, qm6.t, new j4r(ag6.d1), qm6.X), new yxl1(this, (byte) 26));
        hvm hvmVar = hvm.c;
        this.b = w3p1.n(new l4r(hvmVar, 3, qm6.Z, new j4r(new tsm1(this, (byte) 25)), qm6.N0), new l4r(pwc0.b, 2, qm6.Y, new j4r(new ve3(a7a1Var, this)), qm6.c), new bom1(this, (byte) 22));
        this.c = w3p1.o(new l4r(hvmVar, 3, qm6.O0, new j4r(ag6.e1), qm6.P0), qm6.b);
        this.d = w3p1.o(new l4r(hvmVar, 3, qm6.Q0, new j4r(ag6.Y0), qm6.R0), ag6.Z0);
        this.e = new om6(xzqVar2, hw2Var, this, xzqVar);
        this.f = x3p1.n(new kd8(d0rVar, this, (byte) 13), yda.g, vq9.X, (o8n) null, yda.i, 8);
        this.g = n3o1.q(this).a(new pm6(str, (byte) 0), oy5.O0);
        j2i j2iVar = new j2i(546078406, new f9a1(ttm0Var, rea1Var, a7a1Var.b, a7a1Var.g, ngs0Var, na9Var, xzqVar2, d0rVar, fosVar, kt91Var, xzqVar, hw2Var, hvp0Var, mjmVar, xyf1Var, r6h1Var, cm0Var), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public static String f(im6 im6Var) {
        List list = im6Var.b;
        if (list.isEmpty()) {
            hhg1.n("Failed requirement.");
            return null;
        }
        return gvg.h("spotify:list:artists-popular-collaborations:", blo1.l(im6Var.a), "_", blo1.l((String) o7h.q0(list)));
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

    public final f4r getData() {
        return this.e;
    }
}
