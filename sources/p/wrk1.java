package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wrk1 implements qsk1 {
    public final int a;

    public wrk1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrk1) && this.a == ((wrk1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
