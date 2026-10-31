package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uge1 {
    public final List a;

    public uge1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uge1) && this.a.equals(((uge1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
