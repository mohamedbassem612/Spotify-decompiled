package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fz81 implements gj90 {
    public final String a;

    public fz81(String str) {
        this.a = str;
    }

    public final List a(List list) {
        String str = this.a;
        if (list.contains(str)) {
            return Collections.singletonList(str);
        }
        return !list.isEmpty() ? Collections.singletonList(o7h.q0(list)) : z6x.a;
    }
}
