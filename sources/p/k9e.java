package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k9e {
    public final String a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final int e;

    public k9e(String str, ArrayList arrayList, int i, int i2, int i3) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9e)) {
            return false;
        }
        k9e k9eVar = (k9e) obj;
        return u890.j(this.a, k9eVar.a) && this.b.equals(k9eVar.b) && this.c == k9eVar.c && this.d == k9eVar.d && this.e == k9eVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, kaa0.f(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
}
