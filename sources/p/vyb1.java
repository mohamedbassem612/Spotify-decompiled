package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vyb1 {
    public final List a;

    public vyb1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyb1) && u890.j(this.a, ((vyb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
