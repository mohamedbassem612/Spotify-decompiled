package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zxs implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ zxs(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke() {
        float f;
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(ti5.c.a(((Number) function0.invoke()).floatValue()));
            case 1:
                return Float.valueOf(1.0f - ((Number) function0.invoke()).floatValue());
            case 2:
                return Boolean.valueOf(((Number) function0.invoke()).floatValue() < 0.5f);
            case 3:
                function0.invoke();
                return Boolean.TRUE;
            case 4:
                function0.invoke();
                return Boolean.TRUE;
            case 5:
                function0.invoke();
                return rih1.a;
            case 6:
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
            default:
                float fFloatValue2 = ((Number) function0.invoke()).floatValue();
                f = fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f;
                return Float.valueOf(f <= 1.0f ? f : 1.0f);
        }
    }
}
