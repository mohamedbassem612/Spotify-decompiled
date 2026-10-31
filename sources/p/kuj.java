package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kuj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kuj(long j, tob1 tob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.b;
        tob1 tob1Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                eqc eqcVar = (eqc) obj;
                return eqcVar.b(new gjd(new mic0(0, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * ((Number) tob1Var.getValue()).floatValue()) - (Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f) + (Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * ((Number) tob1Var.getValue()).floatValue()))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(this.b, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)}), (List) null), (byte) 1));
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                u7h u7hVar = new u7h(j);
                u7h u7hVar2 = (u7h) tob1Var.getValue();
                long j2 = u7hVar2.a;
                List listM = p7h.M(new u7h[]{u7hVar, u7hVar2});
                DrawScope.S0(drawScope, new mic0(0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (drawScope.j() & 4294967295L))) * 0.5f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.15f)) & 4294967295L), listM, (List) null), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 2:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.d0(lslVar, u7h.b(this.b, ((Number) tob1Var.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
            case 3:
                DrawScope drawScope2 = (DrawScope) obj;
                float fX0 = drawScope2.X0(2.0f);
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue() * 360.0f;
                float f = fX0 / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.j() >> 32)) - fX0;
                DrawScope.i1(drawScope2, this.b, -90.0f, fFloatValue, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) - fX0)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), new phc1(fX0, 0.0f, 1, 0, (uw4) null, 26), 832);
                return rih1Var;
            default:
                eqc eqcVar2 = (eqc) obj;
                return eqcVar2.b(new gjd(new mic0(0, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) * ((Number) tob1Var.getValue()).floatValue()) - (Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) / 2.0f) + (Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) * ((Number) tob1Var.getValue()).floatValue()))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), p7h.M(new u7h[]{new u7h(j), new u7h(u7h.f), new u7h(j)}), (List) null), (byte) 4));
        }
    }
}
