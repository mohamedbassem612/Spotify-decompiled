package p;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class fi6 {
    public static final pxg1 a;
    public static final float b;

    static {
        ilv.a.getClass();
        a = new pxg1(500, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, flv.h);
        b = 130.0f;
    }

    public static final void a(yj41 yj41Var, float f, float f2, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Bitmap bitmap = yj41Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1985094729);
        int i2 = i | (x340Var.i(yj41Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ilv.a.getClass();
            pxg1 pxg1VarO0 = irn1.o0(500, 0, flv.g, 2);
            tzg1 tzg1Var = rno1.a;
            int i3 = 8 | ((i2 >> 6) & 112);
            ven0 ven0VarR = zod.R(new hsi1("artistCardsPackLightFadeIn", fValueOf2, fValueOf, pxg1VarO0, tzg1Var), z, (Function0) null, x340Var, i3, 4);
            ven0 ven0VarR2 = zod.R(new hsi1("artistCardsPackLightFadeOut", fValueOf, fValueOf2, new pxg1(500, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, flv.j), tzg1Var), z, (Function0) null, x340Var, i3, 4);
            float f3 = 1.1470588f * f;
            float f4 = 0.8487179f * f3;
            float f5 = ((0.04632427f * f2) + b) - ((f2 + f4) / 2.0f);
            boolean zG = x340Var.g(bitmap);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new yk4(bitmap);
                x340Var.s0(objT);
            }
            yk4 yk4Var = (yk4) objT;
            as80 as80Var = mif1.P0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.v(eqr0.D(0.0f, f5, 1, qim0Var3), f3), f4);
            boolean zG2 = x340Var.g(ven0VarR) | x340Var.g(ven0VarR2);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new dy(ven0VarR, ven0VarR2, (byte) 1);
                x340Var.s0(objT2);
            }
            eso1.f(yk4Var, isl.a, i541.C(qim0VarH, (iu30) objT2), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, x340Var, 1797168, 384);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zh6(yj41Var, f, f2, z, qim0Var2, i);
        }
    }

    public static final void b(zyq0 zyq0Var, float f, float f2, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1322627808);
        int i2 = i | (x340Var.i(zyq0Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (i2 & 74899) != 74898)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            float f3 = f / 0.67085785f;
            float f4 = f3 * 0.04632427f;
            float f5 = f3 - f4;
            float fX0 = watVar.X0(f2);
            float fX1 = watVar.X0(-100.0f);
            float fX2 = watVar.X0(5.0f);
            ilv.a.getClass();
            ceo ceoVar = flv.g;
            hsi1 hsi1VarR = wxo1.r("artistCardsPackTopNudge", 0.0f, fX1, irn1.o0(500, 0, ceoVar, 2));
            int i3 = (i2 >> 6) & 112;
            int i4 = 8 | i3;
            ven0 ven0VarR = zod.R(hsi1VarR, z, (Function0) null, x340Var, i4, 4);
            ven0 ven0VarR2 = zod.R(wxo1.r("artistCardsPackTopRotation", 0.0f, -10.0f, irn1.o0(1500, 0, ceoVar, 2)), z, (Function0) null, x340Var, i4, 4);
            ceo ceoVar2 = flv.j;
            ven0 ven0VarR3 = zod.R(wxo1.r("artistCardsPackTopExit", 0.0f, -fX0, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, ceoVar2)), z, function0, x340Var, i3 | 392, 0);
            ven0 ven0VarR4 = zod.R(wxo1.r("artistCardsPackBottomNudge", 0.0f, fX2, irn1.o0(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 0, ceoVar, 2)), z, (Function0) null, x340Var, i4, 4);
            ven0 ven0VarR5 = zod.R(wxo1.r("artistCardsPackBottomExit", 0.0f, fX0, a), z, (Function0) null, x340Var, i4, 4);
            ven0 ven0VarP = zod.P(mqo1.s(new hsi1[]{wxo1.r("artistCardsPackBottomTransformOut", 0.0f, 1.0f, irn1.o0(500, 0, ceoVar, 2)), wxo1.r("artistCardsPackBottomTransformSettle", 1.0f, 0.0f, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 500, ceoVar2))}), z, (String) null, (Function0) null, (Function0) null, x340Var, i4, 28);
            qim0 qim0VarH = u291.h(u291.v(qim0Var, f), f3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zG = x340Var.g(ven0VarR) | x340Var.g(ven0VarR3) | x340Var.g(ven0VarR2);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new ai6(ven0VarR, ven0VarR3, ven0VarR2, (byte) 0);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = i541.C(nim0Var, (iu30) objT);
            int i5 = i2 & 14;
            int i6 = i2 & 112;
            c(zyq0Var, f, f3, f4, 0.0f, qim0VarC, x340Var, 24584 | i5 | i6);
            float f6 = -f4;
            qim0 qim0VarD = eqr0.D(0.0f, f4, 1, nim0Var);
            boolean zG2 = x340Var.g(ven0VarP) | x340Var.g(ven0VarR4) | x340Var.g(ven0VarR5);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new ai6(ven0VarP, ven0VarR4, ven0VarR5, (byte) 1);
                x340Var.s0(objT2);
            }
            c(zyq0Var, f, f3, f5, f6, i541.C(qim0VarD, (iu30) objT2), x340Var, 8 | i5 | i6);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bi6(zyq0Var, f, f2, z, function0, qim0Var, i);
        }
    }

    public static final void c(zyq0 zyq0Var, float f, float f2, float f3, float f4, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1789618900);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(zyq0Var) : x340Var.i(zyq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarR = i1p1.r(u291.h(u291.v(qim0Var, f), f3));
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((57344 & i2) == 16384);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new di6(f, f2, f4);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            fho1.b(zyq0Var, (qim0) null, x340Var, (i2 & 14) | 8);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ei6(zyq0Var, f, f2, f3, f4, qim0Var, i);
        }
    }
}
