package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sry {
    public final String a;
    public final String b;

    public sry(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sry)) {
            return false;
        }
        sry sryVar = (sry) obj;
        return u890.j(this.a, sryVar.a) && u890.j(this.b, sryVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
