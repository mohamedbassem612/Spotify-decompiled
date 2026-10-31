package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wm80 implements an80 {
    public final List a;

    public wm80(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm80) && u890.j(this.a, ((wm80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
