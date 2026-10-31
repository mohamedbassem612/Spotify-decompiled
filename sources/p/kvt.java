package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kvt {
    public final hux a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final f0u f;
    public final boolean g;

    public kvt(hux huxVar, String str, String str2, String str3, String str4, f0u f0uVar, boolean z) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = f0uVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvt)) {
            return false;
        }
        kvt kvtVar = (kvt) obj;
        return u890.j(this.a, kvtVar.a) && this.b.equals(kvtVar.b) && this.c.equals(kvtVar.c) && this.d.equals(kvtVar.d) && this.e.equals(kvtVar.e) && this.f == kvtVar.f && this.g == kvtVar.g;
    }

    public final int hashCode() {
        hux huxVar = this.a;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d((huxVar == null ? 0 : huxVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }
}
