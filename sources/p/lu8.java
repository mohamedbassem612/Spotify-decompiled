package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lu8 {
    public final ku8 a;

    public lu8(ku8 ku8Var) {
        this.a = ku8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lu8) && this.a == ((lu8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
