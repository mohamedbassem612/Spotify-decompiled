package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bl7 implements xpx0 {
    public final bro1 a;

    public bl7(bro1 bro1Var) {
        this.a = bro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl7) && this.a.equals(((bl7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
