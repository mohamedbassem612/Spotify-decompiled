package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class riy extends viy {
    public final int a;

    public riy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof riy) && this.a == ((riy) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
