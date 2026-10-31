package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cv80 extends lm5 {
    public final p5k d;
    public final int e;

    public cv80(p5k p5kVar, int i) {
        this.d = p5kVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv80)) {
            return false;
        }
        cv80 cv80Var = (cv80) obj;
        return this.d.equals(cv80Var.d) && this.e == cv80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
