package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u5n {
    public final eww0 a;

    public u5n(eww0 eww0Var) {
        this.a = eww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5n) && u890.j(this.a, ((u5n) obj).a);
    }

    public final int hashCode() {
        eww0 eww0Var = this.a;
        if (eww0Var == null) {
            return 0;
        }
        return eww0Var.hashCode();
    }
}
