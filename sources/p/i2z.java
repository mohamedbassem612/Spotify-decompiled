package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i2z extends lnn1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final long h;

    public i2z(String str, String str2, String str3, String str4, boolean z, long j) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2z)) {
            return false;
        }
        i2z i2zVar = (i2z) obj;
        return this.c.equals(i2zVar.c) && this.d.equals(i2zVar.d) && this.e.equals(i2zVar.e) && this.f.equals(i2zVar.f) && this.g == i2zVar.g && this.h == i2zVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + xcg1.g(cy30.d(cy30.d(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
