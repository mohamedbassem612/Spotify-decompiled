package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m1a1 extends q1a1 {
    public final List a;

    public m1a1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1a1) && this.a.equals(((m1a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
