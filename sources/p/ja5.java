package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ja5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja5(float f, Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float fO = 0.0f;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        float f = this.b;
        Object obj3 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lsl lslVar = (lsl) obj;
                es41 es41Var = (es41) obj3;
                err0 err0Var = es41Var.f;
                err0 err0Var2 = es41Var.a;
                if (err0Var.s() <= 0) {
                    lslVar.s1();
                } else {
                    int iS = err0Var2.s();
                    ceo ceoVar = ka5.a;
                    float fO2 = f > 0.0f ? yoi1.o(iS / f, 0.0f, 1.0f) : 0.0f;
                    fO = f > 0.0f ? yoi1.o((es41Var.f.s() - err0Var2.s()) / f, 0.0f, 1.0f) : 0.0f;
                    flb0 layoutDirection = lslVar.getLayoutDirection();
                    flb0 flb0Var = flb0.a;
                    float f2 = layoutDirection == flb0Var ? fO2 : fO;
                    if (lslVar.getLayoutDirection() == flb0Var) {
                        fO2 = fO;
                    }
                    fid fidVarP = lslVar.a1().p();
                    try {
                        fidVarP.j(anm1.g(0L, lslVar.j()), (lw4) obj2);
                        lslVar.s1();
                        ka5.c(lslVar, true, f, f2);
                        ka5.c(lslVar, false, f, fO2);
                    } finally {
                        fidVarP.i();
                    }
                }
                return rih1Var;
            case 1:
                kd31 kd31Var = (kd31) obj;
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue() && ((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    fO = f;
                }
                kd31Var.b(fO);
                kd31Var.i(2);
                return rih1Var;
            case 2:
                float fM0 = ((wat) obj3).M0((int) (((yr80) obj).a & 4294967295L));
                if (p3v.b(fM0, f) > 0) {
                    pzm.k(fM0, (ven0) obj2);
                }
                return rih1Var;
            case 3:
                n511 n511Var = (n511) obj3;
                u84 u84VarP = ((DrawScope) obj).a1().p();
                Canvas canvas = v84.a;
                u84VarP.a.drawRect((n511Var.a - f) - 0.0f, n511Var.b - f, n511Var.c + f + 0.0f, n511Var.d + f, (Paint) obj2);
                return rih1Var;
            case 4:
                eqc eqcVar = (eqc) obj;
                float fH = eqcVar.h() * f;
                float f3 = fH / 2.0f;
                long jO = zno1.o(eqcVar.a.j());
                mmr0[] mmr0VarArr = (mmr0[]) obj3;
                mmr0[] mmr0VarArr2 = (mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length);
                ArrayList arrayList = new ArrayList(mmr0VarArr2.length);
                for (mmr0 mmr0Var : mmr0VarArr2) {
                    u7h u7hVar = (u7h) mmr0Var.b;
                    long j = u7hVar.a;
                    arrayList.add(u7hVar);
                }
                ArrayList arrayList2 = new ArrayList(mmr0VarArr2.length);
                for (mmr0 mmr0Var2 : mmr0VarArr2) {
                    arrayList2.add(Float.valueOf(((Number) mmr0Var2.a).floatValue()));
                }
                return eqcVar.a(new upw(kch0.a(), jO, (tob1) obj2, new l9d1(jO, arrayList, arrayList2), f3, fH, eqcVar.h() * (8.0f + f)));
            case 5:
                jyo1.m((rtb0) obj, (q1d0) obj3, new rz2((ven0) obj2, f, (byte) 5));
                return rih1Var;
            case 6:
                fid fidVarP2 = ((DrawScope) obj).a1().p();
                fidVarP2.q();
                fidVarP2.h(0.0f, f);
                vpb1.t(fidVarP2, (z1a1) obj3, (lw4) obj2);
                fidVarP2.i();
                return rih1Var;
            case 7:
                kd31 kd31Var2 = (kd31) obj;
                jkr0 jkr0Var = (jkr0) obj3;
                float fS = ((drr0) jkr0Var.d.d).s();
                kd31Var2.C((((err0) jkr0Var.d.c).s() + fS) * f * (((flb0) obj2) == flb0.b ? -1.0f : 1.0f));
                float fAbs = Math.abs(fS) < 0.5f ? 1.0f - ((Math.abs(fS) * 2.0f) * 0.39999998f) : (((Math.abs(fS) * 2.0f) - 1.0f) * 0.39999998f) + 0.6f;
                kd31Var2.q(fAbs);
                kd31Var2.r(fAbs);
                return rih1Var;
            case 8:
                wat watVar = (wat) obj;
                return new qr80(((long) yoi1.p((int) watVar.X0(((p3v) ((tob1) obj2).getValue()).a), 0, (int) (((gg50) ((tob1) obj3).getValue()).f - watVar.X0(f)))) & 4294967295L);
            case 9:
                rzb1 rzb1Var = (rzb1) ((tob1) obj3).getValue();
                int iS2 = ((err0) obj2).s();
                int i = rzb1Var.d;
                float fMin = (Math.min(i, rzb1Var.c) - f) - iS2;
                return new qr80(((long) yoi1.p(jch0.U((rzb1Var.a * rzb1Var.e) + fMin), jch0.U(fMin), i)) & 4294967295L);
            default:
                DrawScope drawScope = (DrawScope) obj;
                ejk1 ejk1Var = (ejk1) obj3;
                float fB = ejk1Var.b() * ejk1Var.c;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / 2.0f;
                float f4 = fIntBitsToFloat - 1.0f;
                float[] fArr = (float[]) obj2;
                float length = f / fArr.length;
                float f5 = -fB;
                ((dg8) drawScope.a1().b).z(f5, 0.0f);
                try {
                    nel1.b(drawScope, fArr, fIntBitsToFloat, f4, length, 1.0f, nel1.a);
                    nel1.b(drawScope, fArr, fIntBitsToFloat, f4, length, 0.55f, nel1.b);
                    return rih1Var;
                } finally {
                    ((dg8) drawScope.a1().b).z(-f5, -0.0f);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja5(Object obj, float f, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja5(Object obj, Object obj2, float f, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }
}
