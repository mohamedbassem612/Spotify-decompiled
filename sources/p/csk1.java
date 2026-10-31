package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class csk1 implements qsk1 {
    public final h06 a;

    public csk1(h06 h06Var) {
        this.a = h06Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csk1) && this.a == ((csk1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
