package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q8y0 extends r8y0 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public q8y0(boolean z, String str, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8y0)) {
            return false;
        }
        q8y0 q8y0Var = (q8y0) obj;
        return this.a == q8y0Var.a && u890.j(this.b, q8y0Var.b) && this.c == q8y0Var.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
