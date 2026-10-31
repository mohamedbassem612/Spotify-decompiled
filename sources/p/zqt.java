package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zqt {
    public final String a;
    public final long b;

    public zqt(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqt)) {
            return false;
        }
        zqt zqtVar = (zqt) obj;
        return u890.j(this.a, zqtVar.a) && this.b == zqtVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
