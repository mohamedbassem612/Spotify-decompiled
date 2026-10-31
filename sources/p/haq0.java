package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class haq0 extends jaq0 {
    public final String a;
    public final boolean b;

    public haq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haq0)) {
            return false;
        }
        haq0 haq0Var = (haq0) obj;
        return this.a.equals(haq0Var.a) && this.b == haq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
