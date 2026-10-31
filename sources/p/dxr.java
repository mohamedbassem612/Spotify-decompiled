package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dxr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dxr(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxr)) {
            return false;
        }
        dxr dxrVar = (dxr) obj;
        return this.a.equals(dxrVar.a) && this.b.equals(dxrVar.b) && this.c.equals(dxrVar.c) && this.d.equals(dxrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
