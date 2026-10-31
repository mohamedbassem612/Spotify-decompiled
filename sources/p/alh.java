package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class alh implements hlh {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public alh(String str, int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alh)) {
            return false;
        }
        alh alhVar = (alh) obj;
        return this.a == alhVar.a && this.b == alhVar.b && this.c == alhVar.c && this.d.equals(alhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
