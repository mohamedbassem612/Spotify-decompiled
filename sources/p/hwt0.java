package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hwt0 {
    public final String a;
    public final String b;
    public final int c;

    public hwt0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwt0)) {
            return false;
        }
        hwt0 hwt0Var = (hwt0) obj;
        return this.a.equals(hwt0Var.a) && u890.j(this.b, hwt0Var.b) && this.c == hwt0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
