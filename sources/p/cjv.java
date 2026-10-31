package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cjv implements osi1 {
    public final hrr0 a;

    public cjv(hrr0 hrr0Var) {
        this.a = hrr0Var;
    }

    @Override // p.osi1
    public final Object a(xos0 xos0Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjv) && this.a == ((cjv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
