package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kwh1 {
    public final bro1 a;

    public kwh1(bro1 bro1Var) {
        this.a = bro1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kwh1) && this.a.equals(((kwh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
