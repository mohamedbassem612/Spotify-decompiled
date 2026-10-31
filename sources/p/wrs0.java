package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wrs0 implements xrs0 {
    public final List a;

    public wrs0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrs0) && this.a.equals(((wrs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
