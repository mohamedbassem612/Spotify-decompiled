package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class zmy0 {
    public static final ymy0 Companion = new ymy0();
    public final String a;
    public final int b;

    public /* synthetic */ zmy0(int i, int i2, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, xmy0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmy0)) {
            return false;
        }
        zmy0 zmy0Var = (zmy0) obj;
        return u890.j(this.a, zmy0Var.a) && this.b == zmy0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public zmy0(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
