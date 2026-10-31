package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ryc extends syc {
    public final ily0 a;

    public ryc(ily0 ily0Var) {
        this.a = ily0Var;
    }

    public final ily0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryc) && this.a.equals(((ryc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
