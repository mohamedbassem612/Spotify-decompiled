package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lvt0 {
    public final String a;
    public final String b;
    public final boolean c;

    public lvt0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvt0)) {
            return false;
        }
        lvt0 lvt0Var = (lvt0) obj;
        return this.a.equals(lvt0Var.a) && this.b.equals(lvt0Var.b) && this.c == lvt0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
