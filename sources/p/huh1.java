package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class huh1 implements juh1 {
    public final List a;

    public huh1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof huh1) && this.a.equals(((huh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
