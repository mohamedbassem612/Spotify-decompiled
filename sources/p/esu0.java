package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class esu0 implements gsu0 {
    public final yru0 a;

    public esu0(yru0 yru0Var) {
        this.a = yru0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esu0) && u890.j(this.a, ((esu0) obj).a);
    }

    public final int hashCode() {
        yru0 yru0Var = this.a;
        if (yru0Var == null) {
            return 0;
        }
        return yru0Var.hashCode();
    }
}
