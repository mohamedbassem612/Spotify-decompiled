package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yxc {
    public final String a;
    public final xxc b;

    public yxc(String str, xxc xxcVar) {
        this.a = str;
        this.b = xxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxc)) {
            return false;
        }
        yxc yxcVar = (yxc) obj;
        return u890.j(this.a, yxcVar.a) && u890.j(this.b, yxcVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        xxc xxcVar = this.b;
        return iHashCode + (xxcVar != null ? xxcVar.hashCode() : 0);
    }
}
