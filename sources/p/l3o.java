package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l3o {
    public final String a;
    public final boolean b;
    public final int c;

    public l3o(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3o)) {
            return false;
        }
        l3o l3oVar = (l3o) obj;
        return u890.j(this.a, l3oVar.a) && this.b == l3oVar.b && this.c == l3oVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
