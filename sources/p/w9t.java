package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w9t {
    public int a;

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.a += i;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9t) && this.a == ((w9t) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return l1d.o(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
