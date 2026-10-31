package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class t47 {
    public static final s47 Companion = new s47();
    public final String a;
    public final String b;

    public /* synthetic */ t47(int i, String str, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, r47.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t47)) {
            return false;
        }
        t47 t47Var = (t47) obj;
        return u890.j(this.a, t47Var.a) && u890.j(this.b, t47Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public t47(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
