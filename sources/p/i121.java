package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i121 implements q121 {
    public final x221 a;

    public i121(x221 x221Var) {
        this.a = x221Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i121) && u890.j(this.a, ((i121) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
