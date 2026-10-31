package p;

import android.view.View;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredProceedResult;
import io.reactivex.rxjava3.functions.Function;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q04 implements sh, Function {
    public final /* synthetic */ Function0 a;

    public q04(Function0 function0) {
        this.a = function0;
    }

    public Object apply(Object obj) {
        this.a.invoke();
        return xf8.c[((EsCodeRequired$CodeRequiredProceedResult) obj).n().o().ordinal()] == 1 ? new bww(new ug8(400, "Esperanto failure: unknown context")) : new bww(new ug8(400, "Esperanto failure: incomplete response"));
    }

    public boolean r(View view) {
        this.a.invoke();
        return true;
    }

    public q04(Function0 function0, fg8 fg8Var) {
        this.a = function0;
    }
}
