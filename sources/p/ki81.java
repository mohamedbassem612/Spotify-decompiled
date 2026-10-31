package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ki81 {
    public final ji81 a;

    public ki81(ji81 ji81Var) {
        this.a = ji81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki81) && u890.j(this.a, ((ki81) obj).a);
    }

    public final int hashCode() {
        return l1d.C(1) + (this.a.hashCode() * 31);
    }
}
