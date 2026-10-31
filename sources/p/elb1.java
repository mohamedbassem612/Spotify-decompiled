package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class elb1 extends flb1 {
    public final k2l1 a;

    public elb1(k2l1 k2l1Var) {
        this.a = k2l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elb1) && this.a.equals(((elb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
