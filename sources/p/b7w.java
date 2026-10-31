package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b7w {
    public final String a;
    public final String b;

    public b7w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7w)) {
            return false;
        }
        b7w b7wVar = (b7w) obj;
        return u890.j(this.a, b7wVar.a) && u890.j(this.b, b7wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
