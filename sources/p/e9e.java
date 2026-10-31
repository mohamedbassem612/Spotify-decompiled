package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e9e {
    public final String a;
    public final String b;
    public final int c;

    public e9e(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9e)) {
            return false;
        }
        e9e e9eVar = (e9e) obj;
        return u890.j(this.a, e9eVar.a) && u890.j(this.b, e9eVar.b) && this.c == e9eVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
