package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class l7w {
    public static final k7w Companion = new k7w();
    public final String a;
    public final long b;

    public /* synthetic */ l7w(long j, int i, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, j7w.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7w)) {
            return false;
        }
        l7w l7wVar = (l7w) obj;
        return u890.j(this.a, l7wVar.a) && this.b == l7wVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public l7w(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
