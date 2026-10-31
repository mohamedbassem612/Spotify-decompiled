package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e8h {
    public final List a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public e8h(int i, int i2, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8h)) {
            return false;
        }
        e8h e8hVar = (e8h) obj;
        return this.a.equals(e8hVar.a) && this.b == e8hVar.b && this.c == e8hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
