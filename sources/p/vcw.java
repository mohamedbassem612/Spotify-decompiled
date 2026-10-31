package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vcw extends rzn1 {
    public final tv80 f;

    public vcw(tv80 tv80Var) {
        this.f = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vcw) && u890.j(this.f, ((vcw) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
