package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ctc {
    public final Set a;
    public final Set b;
    public final long c;

    public ctc(Set set, Set set2, long j) {
        this.a = set;
        this.b = set2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctc)) {
            return false;
        }
        ctc ctcVar = (ctc) obj;
        return u890.j(this.a, ctcVar.a) && u890.j(this.b, ctcVar.b) && this.c == ctcVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + gvg.c(this.a.hashCode() * 31, 31, this.b);
    }
}
