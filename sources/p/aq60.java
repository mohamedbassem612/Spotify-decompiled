package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aq60 implements cq60 {
    public final int a;

    public aq60(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq60) && this.a == ((aq60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
