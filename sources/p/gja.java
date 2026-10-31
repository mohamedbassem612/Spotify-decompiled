package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gja {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;

    public gja(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gja)) {
            return false;
        }
        gja gjaVar = (gja) obj;
        return this.a.equals(gjaVar.a) && this.b.equals(gjaVar.b) && this.c.equals(gjaVar.c) && this.d.equals(gjaVar.d) && this.e == gjaVar.e && this.f.equals(gjaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
