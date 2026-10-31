package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kac0 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ kac0(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final void dispose() {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
