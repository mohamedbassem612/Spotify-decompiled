package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pfo1 implements Serializable {
    public Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        bhn0.i("use Optional.orNull() instead of Optional.or(null)");
        return null;
    }
}
