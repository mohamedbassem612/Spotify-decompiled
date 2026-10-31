package p;

import android.text.style.URLSpan;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ff5 implements rjc0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cv30 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ff5(byte b, Object obj, cv30 cv30Var) {
        this.a = b;
        this.b = cv30Var;
        this.c = obj;
    }

    public final void a(mjc0 mjc0Var) {
        byte b = this.a;
        Object obj = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((iu30) function0).invoke(((URLSpan) obj).getURL());
                break;
            default:
                if (mjc0Var instanceof ljc0) {
                    String str = ((ljc0) mjc0Var).a;
                    if (!u890.j(str, "REQUEST_FULL_PRICE_OFFER")) {
                        ((f65) obj).a(str);
                    } else {
                        function0.invoke();
                    }
                }
                break;
        }
    }
}
