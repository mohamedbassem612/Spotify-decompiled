package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cyy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dyy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cyy(dyy dyyVar, byte b) {
        super(0);
        this.a = b;
        this.b = dyyVar;
    }

    public final Object invoke() {
        Function0 function0;
        Function0 function1;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dyy dyyVar = this.b;
        switch (b) {
            case 0:
                if (dyyVar.e == null && (function0 = dyyVar.f) != null) {
                    function0.invoke();
                }
                break;
            default:
                if (dyyVar.e != null && (function1 = dyyVar.f) != null) {
                    function1.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
