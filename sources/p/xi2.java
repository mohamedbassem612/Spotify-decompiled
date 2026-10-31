package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xi2 extends aj2 {
    public final int a;

    public xi2(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi2) && this.a == ((xi2) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
