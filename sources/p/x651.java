package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x651 implements mp80 {
    public static final eoc b = new eoc((byte) 23);
    public final d8r0 a;

    public x651(d8r0 d8r0Var) {
        this.a = d8r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x651) && this.a.equals(((x651) obj).a);
    }

    @Override // p.mp80
    public final np80 getKey() {
        return b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
