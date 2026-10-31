package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class euq0 {
    public static final duq0 Companion = new duq0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ euq0(String str, String str2, int i, String str3) {
        if (2 != (i & 2)) {
            o6p1.t(i, 2, cuq0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euq0)) {
            return false;
        }
        euq0 euq0Var = (euq0) obj;
        return u890.j(this.a, euq0Var.a) && u890.j(this.b, euq0Var.b) && u890.j(this.c, euq0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public euq0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
