package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class al0 {
    public static final zk0 Companion = new zk0();
    public final String a;
    public final String b;

    public /* synthetic */ al0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, yk0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al0)) {
            return false;
        }
        al0 al0Var = (al0) obj;
        return u890.j(this.a, al0Var.a) && u890.j(this.b, al0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public al0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
