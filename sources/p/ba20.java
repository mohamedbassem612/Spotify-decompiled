package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class ba20 {
    public static final aa20 Companion = new aa20();
    public final String a;
    public final String b;

    public /* synthetic */ ba20(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, z920.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba20)) {
            return false;
        }
        ba20 ba20Var = (ba20) obj;
        return u890.j(this.a, ba20Var.a) && u890.j(this.b, ba20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
