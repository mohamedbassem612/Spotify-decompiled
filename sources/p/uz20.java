package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uz20 {
    public final k030 a;

    public uz20(k030 k030Var) {
        this.a = k030Var;
    }

    public static uz20 a(k030 k030Var) {
        return new uz20(k030Var);
    }

    public final k030 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz20) && u890.j(this.a, ((uz20) obj).a);
    }

    public final int hashCode() {
        k030 k030Var = this.a;
        if (k030Var == null) {
            return 0;
        }
        return k030Var.hashCode();
    }
}
