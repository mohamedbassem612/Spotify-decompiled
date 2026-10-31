package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dzv extends crn1 {
    public final lrz0 b;

    public dzv(lrz0 lrz0Var) {
        this.b = lrz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dzv) && u890.j(this.b, ((dzv) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
