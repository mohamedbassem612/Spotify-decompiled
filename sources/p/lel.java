package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lel implements qel {
    public final List a;

    public lel(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lel) && u890.j(this.a, ((lel) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
