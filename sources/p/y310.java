package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y310 {
    public final List a;

    public y310(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y310) && this.a.equals(((y310) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
