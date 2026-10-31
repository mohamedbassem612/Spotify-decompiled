package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class eey0 extends lyc implements mma0 {
    public final boolean a;

    public eey0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = (i & 2) == 2;
    }

    @Override // p.lyc
    public final qka0 compute() {
        return this.a ? this : super.compute();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.x7b0 */
    @Override // p.lyc
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final mma0 getReflected() throws x7b0 {
        if (this.a) {
            hhg1.h("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        qka0 qka0VarCompute = compute();
        if (qka0VarCompute != this) {
            return (mma0) qka0VarCompute;
        }
        throw new x7b0();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eey0) {
            eey0 eey0Var = (eey0) obj;
            return getOwner().equals(eey0Var.getOwner()) && getName().equals(eey0Var.getName()) && getSignature().equals(eey0Var.getSignature()) && u890.j(getBoundReceiver(), eey0Var.getBoundReceiver());
        }
        if (obj instanceof mma0) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        qka0 qka0VarCompute = compute();
        if (qka0VarCompute != this) {
            return qka0VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
