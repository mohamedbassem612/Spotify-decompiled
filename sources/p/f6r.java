package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f6r {
    public final String a;
    public final boolean b;

    public f6r(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6r)) {
            return false;
        }
        f6r f6rVar = (f6r) obj;
        return this.a.equals(f6rVar.a) && this.b == f6rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
