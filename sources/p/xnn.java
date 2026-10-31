package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xnn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xnn(byte b, float f) {
        super(0);
        this.a = b;
        this.b = f;
    }

    public final Object invoke() {
        byte b = this.a;
        float f = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(f * 0.5f);
            case 1:
                return Float.valueOf(f);
            case 2:
                return Float.valueOf(f);
            case 3:
                return Float.valueOf(f);
            case 4:
                return Float.valueOf(f);
            case 5:
                return Float.valueOf(f);
            default:
                return Float.valueOf(f);
        }
    }
}
