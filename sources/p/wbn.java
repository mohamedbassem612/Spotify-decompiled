package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wbn implements acn {
    public final List a;

    public wbn(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wbn) && this.a.equals(((wbn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
