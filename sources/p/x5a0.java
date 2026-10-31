package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x5a0 {
    public final String a;
    public final boolean b;

    public x5a0(String str, int i) {
        boolean z = (i & 8) == 0;
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 2131956930;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5a0)) {
            return false;
        }
        x5a0 x5a0Var = (x5a0) obj;
        return obj2.equals(obj2) && u890.j(this.a, x5a0Var.a) && this.b == x5a0Var.b;
    }

    public final int hashCode() {
        Integer num = 2131956930;
        int iHashCode = (num.hashCode() + (Integer.hashCode(2131956931) * 31)) * 31;
        String str = this.a;
        return Boolean.hashCode(this.b) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
