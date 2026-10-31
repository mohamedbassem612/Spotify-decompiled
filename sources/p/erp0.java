package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class erp0 implements qq60 {
    public final op80 a;

    public erp0(op80 op80Var) {
        this.a = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof erp0) && this.a.equals(((erp0) obj).a);
    }

    @Override // p.qq60
    public final String getId() {
        return "offline-empty-banner";
    }

    public final int hashCode() {
        return this.a.hashCode() + 1118119786;
    }
}
