package p;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class h510 {
    public static final mga0 a = w0h1.d(k8b0.b);

    public static final String a(k510 k510Var) {
        return ihc1.e1(new String(Base64.encode(a.b(k510.Companion.serializer(), k510Var).getBytes(StandardCharsets.UTF_8), 10), nne.a)).toString();
    }
}
