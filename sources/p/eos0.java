package p;

import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eos0 implements Serializable {
    public final HashMap a;

    public eos0(HashMap map) {
        this.a = map;
    }

    private final Object readResolve() {
        return new fos0(this.a);
    }
}
