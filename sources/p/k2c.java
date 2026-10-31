package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k2c extends x2g0 {
    public final String e;
    public final String f;
    public final boolean g;

    public k2c(String str, String str2, boolean z) {
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    public final String C() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2c)) {
            return false;
        }
        k2c k2cVar = (k2c) obj;
        return this.e.equals(k2cVar.e) && this.f.equals(k2cVar.f) && this.g == k2cVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + cy30.d(this.e.hashCode() * 31, 31, this.f);
    }
}
