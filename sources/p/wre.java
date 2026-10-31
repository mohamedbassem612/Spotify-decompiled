package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wre {
    public final String a;
    public final ugf b;
    public final boolean c;
    public final String d;
    public final d4f e;

    public wre(String str, String str2, d4f d4fVar, ugf ugfVar, boolean z) {
        this.a = str;
        this.b = ugfVar;
        this.c = z;
        this.d = str2;
        this.e = d4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wre)) {
            return false;
        }
        wre wreVar = (wre) obj;
        return u890.j(this.a, wreVar.a) && this.b == wreVar.b && this.c == wreVar.c && this.d.equals(wreVar.d) && this.e.equals(wreVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
