package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class gb20 {
    public static final fb20 Companion = new fb20();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ gb20(int i, String str, String str2, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, eb20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb20)) {
            return false;
        }
        gb20 gb20Var = (gb20) obj;
        return u890.j(this.a, gb20Var.a) && u890.j(this.b, gb20Var.b) && this.c == gb20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
