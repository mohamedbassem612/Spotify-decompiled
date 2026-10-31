package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sjk {
    public final tje1 a;

    public sjk(tje1 tje1Var) {
        this.a = tje1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjk) && u890.j(this.a, ((sjk) obj).a);
    }

    public final int hashCode() {
        tje1 tje1Var = this.a;
        if (tje1Var == null) {
            return 0;
        }
        return tje1Var.hashCode();
    }
}
