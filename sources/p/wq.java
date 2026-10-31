package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wq {
    public final String a;
    public final String b;
    public final boolean c;

    public wq(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj;
        return u890.j(this.a, wqVar.a) && u890.j(this.b, wqVar.b) && this.c == wqVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
