package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zqp0 {
    public final boolean a;
    public final Object b;

    public zqp0(Object obj, boolean z) {
        this.a = z;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqp0)) {
            return false;
        }
        zqp0 zqp0Var = (zqp0) obj;
        return this.a == zqp0Var.a && this.b.equals(zqp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
