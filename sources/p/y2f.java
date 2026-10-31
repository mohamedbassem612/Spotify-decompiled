package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y2f implements q3f {
    public final String a;
    public final List b;

    public y2f(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2f)) {
            return false;
        }
        y2f y2fVar = (y2f) obj;
        return u890.j(this.a, y2fVar.a) && u890.j(this.b, y2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
