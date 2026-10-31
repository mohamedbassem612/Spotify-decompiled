package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f5y {
    public final String a;
    public final String b;
    public final boolean c;

    public f5y(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5y)) {
            return false;
        }
        f5y f5yVar = (f5y) obj;
        return this.a.equals(f5yVar.a) && this.b.equals(f5yVar.b) && this.c == f5yVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
