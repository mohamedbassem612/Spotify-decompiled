package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b8b {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public b8b(int i, int i2, ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8b)) {
            return false;
        }
        b8b b8bVar = (b8b) obj;
        return this.a == b8bVar.a && this.b == b8bVar.b && this.c == b8bVar.c && this.d.equals(b8bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }
}
