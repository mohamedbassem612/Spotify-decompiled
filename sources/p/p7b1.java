package p;

import android.webkit.JavascriptInterface;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p7b1 {
    public final f2g1 a;
    public final ajg b;
    public final PublishSubject c = new PublishSubject();

    public p7b1(f2g1 f2g1Var, ajg ajgVar) {
        this.a = f2g1Var;
        this.b = ajgVar;
    }

    @JavascriptInterface
    public final String getVersion() {
        return this.b.a();
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        l4l1 m231Var;
        try {
            try {
                m231Var = (l4l1) ((nfa0) this.a.b).a(str, l4l1.Companion.serializer());
            } catch (SerializationException | IllegalArgumentException unused) {
                m231Var = null;
            }
            m231Var.getClass();
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to parse incoming web message:\n ".concat(str), new Object[0]);
        } else {
            this.c.onNext(new i2l1(m231Var));
        }
    }
}
