package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class baq0 extends jaq0 {
    public final String a;
    public final boolean b;

    public baq0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baq0)) {
            return false;
        }
        baq0 baq0Var = (baq0) obj;
        return this.a.equals(baq0Var.a) && this.b == baq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
