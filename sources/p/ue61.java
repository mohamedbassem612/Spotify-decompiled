package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ue61 implements cf61 {
    public final j4e a;
    public final boolean b;

    public ue61(j4e j4eVar, boolean z) {
        this.a = j4eVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue61)) {
            return false;
        }
        ue61 ue61Var = (ue61) obj;
        return this.a.equals(ue61Var.a) && this.b == ue61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
