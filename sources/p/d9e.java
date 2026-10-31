package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d9e {
    public final String a;
    public final String b;
    public final int c;

    public d9e(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9e)) {
            return false;
        }
        d9e d9eVar = (d9e) obj;
        return u890.j(this.a, d9eVar.a) && u890.j(this.b, d9eVar.b) && this.c == d9eVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
