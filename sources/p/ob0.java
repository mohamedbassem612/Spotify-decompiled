package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ob0 extends tb0 implements rb0 {
    public final k560 a;
    public final boolean b;

    public ob0(k560 k560Var, boolean z) {
        this.a = k560Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0Var = (ob0) obj;
        return this.a.equals(ob0Var.a) && this.b == ob0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
