package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class sv30 extends lyc implements jv30, nla0 {
    private final int arity;

    public sv30(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // p.lyc
    public qka0 computeReflected() {
        return rc11.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sv30) {
            sv30 sv30Var = (sv30) obj;
            return getName().equals(sv30Var.getName()) && getSignature().equals(sv30Var.getSignature()) && u890.j(getBoundReceiver(), sv30Var.getBoundReceiver()) && u890.j(getOwner(), sv30Var.getOwner());
        }
        if (obj instanceof nla0) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p.jv30
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.x7b0 */
    @Override // p.lyc
    public nla0 getReflected() throws x7b0 {
        qka0 qka0VarCompute = compute();
        if (qka0VarCompute != this) {
            return (nla0) qka0VarCompute;
        }
        throw new x7b0();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // p.nla0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p.nla0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p.nla0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p.nla0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p.lyc, p.qka0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        qka0 qka0VarCompute = compute();
        if (qka0VarCompute != this) {
            return qka0VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
