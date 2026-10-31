package p;

import io.reactivex.rxjava3.functions.Action;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g1o0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    public /* synthetic */ g1o0(res resVar, byte b) {
        this.a = b;
        this.b = resVar;
    }

    public final void run() {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                ((Function0) resVar.f).invoke();
                break;
            default:
                ((Function0) resVar.g).invoke();
                ((rfr) resVar.e).a();
                break;
        }
    }
}
