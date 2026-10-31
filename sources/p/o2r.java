package p;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface o2r extends z0r {
    void a(yeg1 yeg1Var);

    void close();

    default Map e() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    long t(n3r n3rVar);
}
