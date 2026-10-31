package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e6z {
    public final boolean a;
    public final List b;

    public e6z(List list, boolean z) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6z)) {
            return false;
        }
        e6z e6zVar = (e6z) obj;
        return this.a == e6zVar.a && u890.j(this.b, e6zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
