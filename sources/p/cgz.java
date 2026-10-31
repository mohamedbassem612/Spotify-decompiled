package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cgz {
    public final String a;
    public final String b;

    public cgz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgz)) {
            return false;
        }
        cgz cgzVar = (cgz) obj;
        return u890.j(this.a, cgzVar.a) && u890.j(this.b, cgzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
