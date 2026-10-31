package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yp60 implements cq60 {
    public final int a;

    public yp60(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yp60) && this.a == ((yp60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
