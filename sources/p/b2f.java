package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b2f implements q3f {
    public final List a;
    public final long b;

    public b2f(long j, List list) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2f)) {
            return false;
        }
        b2f b2fVar = (b2f) obj;
        return u890.j(this.a, b2fVar.a) && this.b == b2fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
