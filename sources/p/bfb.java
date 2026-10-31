package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bfb implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ bfb(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                if (((String) obj).length() > 0) {
                    function0.invoke();
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                break;
            default:
                if (((qt80) obj) instanceof o5v) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
