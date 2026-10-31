package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ynh1 implements zo50 {
    public final hj50 a;

    public ynh1(hj50 hj50Var) {
        this.a = hj50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynh1) && u890.j(this.a, ((ynh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
