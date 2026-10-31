package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ufw {
    public final v850 a;

    public ufw(v850 v850Var) {
        this.a = v850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufw) && this.a == ((ufw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
