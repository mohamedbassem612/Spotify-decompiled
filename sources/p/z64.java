package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z64 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ z64(iu30 iu30Var, Function0 function0, byte b) {
        this.a = b;
        this.b = iu30Var;
        this.c = function0;
    }

    public final void run() {
        byte b = this.a;
        Function0 function0 = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                Logger.b("Search got disposed, onSuccess was: " + iu30Var, new Object[0]);
                function0.invoke();
                break;
            default:
                Logger.b("MBS: Search got disposed, onSuccess was: %s", new Object[]{iu30Var});
                function0.invoke();
                break;
        }
    }
}
