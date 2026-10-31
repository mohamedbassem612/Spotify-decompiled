package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e76 implements m86 {
    public final bro1 a;

    public e76(bro1 bro1Var) {
        this.a = bro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e76) && this.a.equals(((e76) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
