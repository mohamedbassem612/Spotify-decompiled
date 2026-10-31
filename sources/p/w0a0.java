package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w0a0 implements x0a0 {
    public final Set a;

    public w0a0(Set set) {
        this.a = set;
    }

    @Override // p.x0a0
    public final ko90 a() {
        return ko90.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0a0) && u890.j(this.a, ((w0a0) obj).a);
    }

    public final int hashCode() {
        return ko90.b.hashCode() + (this.a.hashCode() * 31);
    }
}
