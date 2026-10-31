package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e161 {
    public final wyz0 a;

    public e161(wyz0 wyz0Var) {
        this.a = wyz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e161) && u890.j(this.a, ((e161) obj).a);
    }

    public final int hashCode() {
        wyz0 wyz0Var = this.a;
        if (wyz0Var == null) {
            return 0;
        }
        return wyz0Var.hashCode();
    }
}
