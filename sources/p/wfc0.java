package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wfc0 implements xfc0 {
    public final List a;

    public wfc0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfc0) && this.a.equals(((wfc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
