package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xlj0 extends zlj0 {
    public final wyo1 a;

    public xlj0(wyo1 wyo1Var) {
        this.a = wyo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlj0) && this.a.equals(((xlj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
