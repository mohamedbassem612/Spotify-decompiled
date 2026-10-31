package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t3a1 implements h4a1 {
    public final ga61 a;

    public t3a1(ga61 ga61Var) {
        this.a = ga61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3a1) && u890.j(this.a, ((t3a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
