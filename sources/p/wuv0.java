package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wuv0 {
    public final List a;

    public wuv0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuv0) && this.a.equals(((wuv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
