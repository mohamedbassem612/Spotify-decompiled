package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wgh implements ygh {
    public final String a;
    public final String b;

    public wgh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgh)) {
            return false;
        }
        wgh wghVar = (wgh) obj;
        return u890.j(this.a, wghVar.a) && u890.j(this.b, wghVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
