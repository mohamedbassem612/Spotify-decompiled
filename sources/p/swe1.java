package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class swe1 implements uwe1 {
    public final cqs0 a;

    public swe1(cqs0 cqs0Var) {
        this.a = cqs0Var;
    }

    public final fw21 a(int i) {
        Long l = (Long) this.a.get(Integer.valueOf(i));
        return l != null ? new dw21(new rn51(l.longValue())) : ew21.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swe1) && u890.j(this.a, ((swe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
