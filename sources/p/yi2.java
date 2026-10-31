package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yi2 extends aj2 {
    public final int a;

    public yi2(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi2) && this.a == ((yi2) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
