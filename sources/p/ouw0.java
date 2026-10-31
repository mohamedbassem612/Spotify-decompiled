package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ouw0 implements quw0 {
    public final List a;

    public ouw0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouw0) && this.a.equals(((ouw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
