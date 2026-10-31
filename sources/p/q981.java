package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q981 extends s981 {
    public final int a;

    public q981(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q981) && this.a == ((q981) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
