package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class los0 {
    public static final kos0 Companion = new kos0();
    public final String a;
    public final long b;

    public /* synthetic */ los0(long j, int i, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, jos0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof los0)) {
            return false;
        }
        los0 los0Var = (los0) obj;
        return u890.j(this.a, los0Var.a) && this.b == los0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public los0(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
