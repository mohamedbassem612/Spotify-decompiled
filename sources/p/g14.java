package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class g14 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wat b;

    public /* synthetic */ g14(wat watVar, byte b) {
        this.a = b;
        this.b = watVar;
    }

    public final Object invoke() {
        float fX0;
        byte b = this.a;
        wat watVar = this.b;
        switch (b) {
            case 0:
                fX0 = watVar.X0(125.0f);
                break;
            case 1:
                fX0 = watVar.X0(56.0f);
                break;
            case 2:
                fX0 = watVar.X0(125.0f);
                break;
            default:
                fX0 = watVar.X0(125.0f);
                break;
        }
        return Float.valueOf(fX0);
    }
}
