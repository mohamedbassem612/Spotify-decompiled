package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0z {
    public final String a;
    public final int b;
    public final String c;

    public a0z(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0z)) {
            return false;
        }
        a0z a0zVar = (a0z) obj;
        return this.a.equals(a0zVar.a) && this.b == a0zVar.b && this.c.equals(a0zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
