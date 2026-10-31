package p;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lfo0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfo0(tob1 tob1Var, float f, qim0 qim0Var) {
        super(0);
        this.a = (byte) 0;
        this.c = tob1Var;
        this.b = f;
        this.d = qim0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        float f = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tob1 tob1Var = (tob1) obj2;
                mfo0 mfo0Var = (mfo0) tob1Var.getValue();
                qim0 qim0Var = (qim0) obj;
                float f2 = mfo0Var.b;
                float f3 = mfo0Var.a;
                if (p3v.b(f2, 0.0f) <= 0) {
                    return qim0Var;
                }
                mfo0 mfo0Var2 = (mfo0) tob1Var.getValue();
                float f4 = (mfo0Var2.b + mfo0Var2.a) / f;
                return eqr0.D(0.0f, (p3v.b(f3, 0.0f) >= 0 || p3v.b(f2, f) <= 0) ? 0.0f : yoi1.t(new p3v(-f3), new p3v(0.0f), new p3v(f2 - f)).a / 2.0f, 1, d9y0.k(qim0Var, yoi1.o(f4 * f4, 0.0f, 1.0f)));
            case 1:
                return Float.valueOf(((ima1) obj2).o().getFloat(((bma1) obj).a, f));
            default:
                return Float.valueOf(((SharedPreferences) obj2).getFloat((String) obj, f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lfo0(Object obj, Object obj2, float f, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }
}
