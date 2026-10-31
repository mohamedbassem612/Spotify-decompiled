package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y96 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y96(boolean z, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = z;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    function0.invoke();
                }
                break;
            case 1:
                if (z) {
                    function0.invoke();
                }
                break;
            case 2:
                if (!z) {
                    function0.invoke();
                }
                break;
            case 3:
                if (z) {
                    function0.invoke();
                }
                break;
            case 4:
                if (!z) {
                    function0.invoke();
                }
                break;
            case 5:
                if (z) {
                    function0.invoke();
                }
                break;
            case 6:
                if (!z) {
                    function0.invoke();
                }
                break;
            case 7:
                if (!z) {
                    function0.invoke();
                }
                break;
            case 8:
                if (!z) {
                    function0.invoke();
                }
                break;
            default:
                if (z) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
