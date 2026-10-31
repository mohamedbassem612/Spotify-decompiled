package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x00 implements k10 {
    public final k030 a;

    public x00(k030 k030Var) {
        this.a = k030Var;
    }

    public final k030 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x00) && this.a.equals(((x00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
