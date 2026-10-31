package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i32 implements k32 {
    public final String a;
    public final int b;

    public i32(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i32)) {
            return false;
        }
        i32 i32Var = (i32) obj;
        return u890.j(this.a, i32Var.a) && this.b == i32Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
