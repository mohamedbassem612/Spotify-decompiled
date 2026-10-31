package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rsx0 extends ktx0 {
    public final tv80 a;

    public rsx0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rsx0) && u890.j(this.a, ((rsx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
