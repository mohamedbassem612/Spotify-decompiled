package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o8u extends d9u {
    public final List a;

    public o8u(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8u) && this.a.equals(((o8u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
