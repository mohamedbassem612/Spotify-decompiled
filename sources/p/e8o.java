package p;

import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e8o {
    public CronetProvider a;
    public y7o b;

    public final boolean equals(Object obj) {
        return (obj instanceof e8o) && this.a.equals(((e8o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
