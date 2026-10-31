package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ss1 implements bt1 {
    public final ot1 a;

    public ss1(ot1 ot1Var) {
        this.a = ot1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss1) && u890.j(this.a, ((ss1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
