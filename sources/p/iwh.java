package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iwh {
    public final String a;
    public final boolean b;
    public final boolean c;

    public iwh(String str, int i, boolean z) {
        boolean z2 = (i & 8) == 0;
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwh)) {
            return false;
        }
        iwh iwhVar = (iwh) obj;
        return u890.j(this.a, iwhVar.a) && this.b == iwhVar.b && this.c == iwhVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(16, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
