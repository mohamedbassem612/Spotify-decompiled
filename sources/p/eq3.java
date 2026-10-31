package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eq3 extends hr3 {
    public final htc0 a;

    public eq3(htc0 htc0Var) {
        this.a = htc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq3) && this.a.equals(((eq3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
