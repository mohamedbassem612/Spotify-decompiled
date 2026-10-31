package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zam1 {
    public final eww0 a;

    public zam1(eww0 eww0Var) {
        this.a = eww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zam1) && u890.j(this.a, ((zam1) obj).a);
    }

    public final int hashCode() {
        eww0 eww0Var = this.a;
        if (eww0Var == null) {
            return 0;
        }
        return eww0Var.hashCode();
    }
}
