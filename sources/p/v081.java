package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v081 {
    public final x081 a;
    public final gd80 b;

    public v081(x081 x081Var, gd80 gd80Var) {
        this.a = x081Var;
        this.b = gd80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v081)) {
            return false;
        }
        v081 v081Var = (v081) obj;
        return this.a == v081Var.a && this.b.equals(v081Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
