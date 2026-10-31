package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y08 implements tyq {
    public final ia00 N0;
    public final psw O0;
    public final o3r X;
    public final km1 Y;
    public final js20 Z;
    public final yqg a;
    public final y390 b;
    public final yh2 c;
    public final r6h1 d;
    public final q8n e;
    public final kkw0 f;
    public final d0r g;
    public final iac0 h;
    public final idd1 i = new idd1(new i26(this, (byte) 19));
    public final o3r t;

    public y08(yqg yqgVar, y390 y390Var, yh2 yh2Var, r6h1 r6h1Var, q8n q8nVar, kkw0 kkw0Var, d0r d0rVar, iac0 iac0Var) {
        this.a = yqgVar;
        this.b = y390Var;
        this.c = yh2Var;
        this.d = r6h1Var;
        this.e = q8nVar;
        this.f = kkw0Var;
        this.g = d0rVar;
        this.h = iac0Var;
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new wlu(jd11Var.b(pjw0.class)), 2, w08.c, new j4r(rq7.a1), w08.d);
        l4r l4rVar2 = new l4r(new wlu(jd11Var.b(xkk1.class)), 2, w08.e, new j4r(rq7.b1), w08.f);
        pwc0 pwc0Var = pwc0.s;
        this.t = w3p1.m(l4rVar, l4rVar2, new l4r(pwc0Var, 2, w08.g, new j4r(rq7.c1), w08.h), new rre1((Object) this, (byte) 29));
        this.X = w3p1.m(new l4r(new wlu(jd11Var.b(d7u0.class)), 2, w08.i, new j4r(rq7.X0), w08.t), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, w08.X, new j4r(rq7.Y0), rq7.d1), new l4r(pwc0Var, 2, rq7.e1, new j4r(rq7.Z0), w08.b), new rre1((Object) this, (byte) 28));
        this.Y = new km1(this, (byte) 3);
        byte b = 0;
        this.Z = x3p1.n(new r08(this, b), rq7.W0, new j1(2, this, y08.class, "mapToState", "mapToState(Lcom/spotify/songdna/elements/audiopreviewrowleadingelement/AudioPreviewRowLeadingElement$Props;Lcom/spotify/songdna/elements/audiopreviewrowleadingelement/AudioPreviewRowLeadingElement$ExternalState;)Lcom/spotify/songdna/elements/audiopreviewrowleadingelement/AudioPreviewRowLeadingElement$State;", 0, (byte) 11), (o8n) null, new r08(this, (byte) 1), 8);
        this.N0 = n3o1.q(this).a(d27.V0, new v08(this, b));
        j2i j2iVar = new j2i(237153227, new i43(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public static String g(xkk1 xkk1Var) {
        up70 up70VarA = xkk1Var.a.a(vp70.c);
        if (up70VarA != null) {
            return up70VarA.a.a;
        }
        return null;
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final d0r e() {
        return this.g;
    }

    public final void f(String str, boolean z, x4p1 x4p1Var, float f, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z2;
        h2c h2cVar;
        llj lljVar;
        vu30 vu30Var;
        tl3 tl3Var;
        boolean z3;
        tl3 tl3Var2 = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-173571365);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(x4p1Var) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarK = xcg1.k(cbx.a, i1p1.q(qim0Var3, cr31VarB));
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarK);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar4);
            nko1.F(x340Var);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var2);
            as80 as80Var = mif1.P0;
            Uri uri = (str == null || str.length() == 0) ? Uri.EMPTY : Uri.parse(str);
            uri.getClass();
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarF = hno1.f(i1p1.q(qim0Var3, er31.b(4.0f)), uwr.a());
            ltx ltxVar = ltx.c;
            nux nuxVar = new nux(ltxVar, ltxVar);
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarF, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1075314736, 0, 3512);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(-1665811471);
                h2c h2cVar2 = h2c.a;
                qim0 qim0VarF2 = dug.f(h2cVar2.b(qim0Var3), u7h.b(cbx.a(x340Var).a.c, 0.5f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar2);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar4, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var2);
                boolean z5 = x4p1Var instanceof qfu0;
                if (z5 || (x4p1Var instanceof jfu0)) {
                    h2cVar = h2cVar2;
                    lljVar = lljVar4;
                    vu30Var = vu30Var2;
                    tl3Var = tl3Var2;
                    x340Var.i0(-1562521357);
                    spx spxVar = spx.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(spxVar, islVar, h2cVar.a(u291.r(qim0Var3, 12.0f), tl3Var), 0L, 0L, false, x340Var, spx.d | 48, 56);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1562209032);
                    xpx xpxVar = xpx.c;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    h2cVar = h2cVar2;
                    tl3Var = tl3Var2;
                    vu30Var = vu30Var2;
                    lljVar = lljVar4;
                    w0h1.a(xpxVar, islVar, h2cVar2.a(u291.r(qim0Var3, 24.0f), tl3Var2), 0L, 0L, false, x340Var, xpx.d | 48, 56);
                    z3 = false;
                    x340Var.r(false);
                }
                x340Var.r(true);
                if (z5) {
                    x340Var.i0(-1664909340);
                    qim0 qim0VarB = h2cVar.b(qim0Var3);
                    gfh0 gfh0VarC3 = t1c.c(graVar, z3);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar2);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE3, x340Var, vu30Var);
                    z2 = true;
                    xto1.f(f, 4, ((i2 >> 9) & 14) | 24960, 0, cbx.a(x340Var).b.a, u7h.j, x340Var, h2cVar.a(qim0Var3, tl3Var));
                    x340Var.r(true);
                    z3 = false;
                    x340Var.r(false);
                } else {
                    z2 = true;
                    x340Var.i0(-1664531667);
                    x340Var.r(z3);
                }
                x340Var.r(z3);
            } else {
                z2 = true;
                x340Var.i0(-1664523731);
                x340Var.r(false);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o08(this, str, z, x4p1Var, f, qim0Var2, i, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    public final f4r getData() {
        return this.Y;
    }
}
