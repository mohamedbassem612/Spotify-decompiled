package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kp3 extends hr3 {
    public final tv80 a;

    public kp3(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp3) && u890.j(this.a, ((kp3) obj).a);
    }

    public final int hashCode() {
        tv80 tv80Var = this.a;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
