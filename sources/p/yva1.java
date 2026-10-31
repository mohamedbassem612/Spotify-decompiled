package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yva1 implements zva1 {
    public final dwu0 a;

    public yva1(dwu0 dwu0Var) {
        this.a = dwu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yva1) && this.a == ((yva1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
