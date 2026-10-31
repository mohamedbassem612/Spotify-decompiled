package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eem0 {
    public final boolean a;

    public eem0(int i) {
        this.a = (i & 1) != 0;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eem0) && this.a == ((eem0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xcg1.g(l1d.C(1) * 31, 29791, this.a);
    }
}
