package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zw7 {
    public static final zw7 d = new yw7().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public zw7(yw7 yw7Var) {
        this.a = yw7Var.a;
        this.b = yw7Var.b;
        this.c = yw7Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zw7.class != obj.getClass()) {
            return false;
        }
        zw7 zw7Var = (zw7) obj;
        return this.a == zw7Var.a && this.b == zw7Var.b && this.c == zw7Var.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }
}
