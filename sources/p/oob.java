package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oob {
    public final String a;
    public final String b;

    public oob(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oob)) {
            return false;
        }
        oob oobVar = (oob) obj;
        return u890.j(this.a, oobVar.a) && u890.j(this.b, oobVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
