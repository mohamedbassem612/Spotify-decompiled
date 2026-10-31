package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class puw0 implements quw0 {
    public final List a;

    public puw0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puw0) && this.a.equals(((puw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
