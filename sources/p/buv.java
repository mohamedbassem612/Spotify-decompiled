package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class buv {
    public final List a;

    public buv(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof buv) && this.a.equals(((buv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
