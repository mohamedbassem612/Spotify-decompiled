package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xuo extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuo(zsc zscVar, float f, float f2, long j) {
        super(1);
        this.e = zscVar;
        this.c = f;
        this.d = f2;
        this.b = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        float f = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                DrawScope drawScope = (DrawScope) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & drawScope.j())) / 2.0f;
                float fE = (Size.e(drawScope.j()) / 2.0f) * 0.9f;
                zsc zscVar = (zsc) obj2;
                float fFloatValue = ((Number) ((o95) zscVar.b).e()).floatValue() * fE;
                float fFloatValue2 = ((Number) ((o95) zscVar.c).e()).floatValue() * fE;
                float fFloatValue3 = ((Number) ((o95) zscVar.d).e()).floatValue() * fE;
                float fFloatValue4 = ((Number) ((o95) zscVar.e).e()).floatValue() * fE;
                float fTan = fE * ((float) (Math.tan(0.39269908169872414d) * 1.3333333333333333d));
                tw4 tw4VarA = ww4.a();
                float f2 = fIntBitsToFloat2 - fFloatValue;
                tw4VarA.k(fIntBitsToFloat, f2);
                float f3 = fIntBitsToFloat + fTan;
                float f4 = fIntBitsToFloat + fFloatValue4;
                float f5 = fIntBitsToFloat2 - fTan;
                tw4VarA.h(f3, f2, f4, f5, f4, fIntBitsToFloat2);
                float f6 = fIntBitsToFloat2 + fTan;
                float f7 = fIntBitsToFloat2 + fFloatValue2;
                tw4VarA.h(f4, f6, f3, f7, fIntBitsToFloat, f7);
                float f8 = fIntBitsToFloat - fTan;
                float f9 = fIntBitsToFloat - fFloatValue3;
                tw4VarA.h(f8, f7, f9, f6, f9, fIntBitsToFloat2);
                tw4VarA.h(f9, f5, f8, f2, fIntBitsToFloat, f2);
                tw4VarA.g();
                float f10 = this.d;
                long j = this.b;
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    dg8 dg8Var = (dg8) cabVarA1.b;
                    dg8Var.t(f, f, zno1.o(((cab) dg8Var.b).u()));
                    long jG1 = drawScope.g1();
                    cab cabVarA2 = drawScope.a1();
                    long jU2 = cabVarA2.u();
                    cabVarA2.p().q();
                    try {
                        ((dg8) cabVarA2.b).s(f10, jG1);
                        DrawScope.w0(drawScope, tw4VarA, j, new phc1((float) Math.ceil(Size.e(drawScope.j()) * 0.06508876f), 0.0f, 0, 0, (uw4) null, 30), 52);
                        cabVarA2.p().i();
                        cabVarA2.D(jU2);
                        i3a.n(cabVarA1, jU);
                        return rih1Var;
                    } catch (Throwable th) {
                        cabVarA2.p().i();
                        cabVarA2.D(jU2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i3a.n(cabVarA1, jU);
                    throw th2;
                }
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-600.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) + 600.0f;
                DrawScope.p0(drawScope2, this.b, jFloatToRawIntBits, (Float.floatToRawIntBits(f) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat3))), this.d, 0, (uw4) obj2, 464);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuo(long j, float f, float f2, uw4 uw4Var) {
        super(1);
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = uw4Var;
    }
}
