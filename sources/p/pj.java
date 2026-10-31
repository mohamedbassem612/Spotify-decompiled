package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pj extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj(wat watVar, byte b) {
        super(0);
        this.a = b;
        this.b = watVar;
    }

    public final Object invoke() {
        byte b = this.a;
        wat watVar = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(watVar.X0(56.0f));
            case 1:
                return Float.valueOf(watVar.X0(125.0f));
            case 2:
                return Float.valueOf(watVar.X0(56.0f));
            case 3:
                return Float.valueOf(watVar.X0(125.0f));
            case 4:
                return Float.valueOf(watVar.X0(100.0f));
            case 5:
                return Float.valueOf(watVar.X0(56.0f));
            case 6:
                return Float.valueOf(watVar.X0(125.0f));
            case 7:
                return Float.valueOf(watVar.X0(56.0f));
            default:
                return Float.valueOf(watVar.X0(125.0f));
        }
    }
}
