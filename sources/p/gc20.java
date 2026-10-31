package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gc20 implements ic20 {
    public final List a;

    public gc20(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc20) && this.a.equals(((gc20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
