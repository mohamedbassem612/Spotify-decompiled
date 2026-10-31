package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vfe1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vfe1(byte b, long j) {
        super(1);
        this.a = b;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = -1;
        rih1 rih1Var = rih1.a;
        long j = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(8.0f);
                float fX1 = drawScope.X0(10.0f);
                float fX2 = drawScope.X0(2.0f);
                tw4 tw4VarA = ww4.a();
                tw4VarA.k(0.0f, 0.0f);
                tw4VarA.j(0.0f, fX1 - fX2);
                tw4VarA.m(0.0f, fX1, fX2, fX1);
                tw4VarA.j(fX0, fX1);
                DrawScope.w0(drawScope, tw4VarA, this.b, new phc1(drawScope.X0(1.0f), 0.0f, 1, 1, (uw4) null, 18), 52);
                return rih1Var;
            case 1:
                return new uvg1(j, ((Number) obj).longValue());
            case 2:
                Long l = (Long) obj;
                if (l == null) {
                    eg.m("Start the timer with startTimer before calling addTime");
                    return null;
                }
                if (jfv.o(j)) {
                    return Long.valueOf(jfv.h(j) + l.longValue());
                }
                hhg1.n("Cannot call addTime with a negative duration");
                return null;
            case 3:
                return new qr80(j);
            case 4:
                return new qr80(j);
            case 5:
                n5f0 n5f0Var = ((iyv0) obj).c;
                if (j < Long.valueOf(n5f0Var.a).longValue()) {
                    i = 1;
                } else if (j <= Long.valueOf(n5f0Var.b).longValue()) {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 6:
                n5f0 n5f0Var2 = ((iyv0) obj).c;
                if (j < Long.valueOf(n5f0Var2.a).longValue()) {
                    i = 1;
                } else if (j <= Long.valueOf(n5f0Var2.b).longValue()) {
                    i = 0;
                }
                return Integer.valueOf(i);
            case 7:
                DrawScope drawScope2 = (DrawScope) obj;
                float fX3 = drawScope2.X0(32.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) - fX3) / 2.0f)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fX3)) & 4294967295L);
                float f = fX3 / 2.0f;
                DrawScope.g0(drawScope2, this.b, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 240);
                return rih1Var;
            case 8:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.d0(lslVar, this.b, 0L, 0L, 0.7f, (phc1) null, (ColorFilter) null, 118);
                return rih1Var;
            case 9:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                DrawScope.d0(lslVar2, this.b, 0L, 0L, 0.7f, (phc1) null, (ColorFilter) null, 118);
                return rih1Var;
            case 10:
                lsl lslVar3 = (lsl) obj;
                lslVar3.s1();
                DrawScope.d0(lslVar3, this.b, 0L, 0L, 0.7f, (phc1) null, (ColorFilter) null, 118);
                return rih1Var;
            default:
                eqc eqcVar = (eqc) obj;
                return eqcVar.a(new xuo(this.b, (eqcVar.h() * 24.0f) / 2.0f, eqcVar.h() * 4.0f, cgj1.t(0.0f, new float[]{eqcVar.h() * 1.0f, eqcVar.h() * 3.0f})));
        }
    }
}
