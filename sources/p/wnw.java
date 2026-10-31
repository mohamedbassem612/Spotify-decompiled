package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class wnw {
    public static final vnw Companion = new vnw();
    public final String a;
    public final String b;

    public /* synthetic */ wnw(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, unw.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnw)) {
            return false;
        }
        wnw wnwVar = (wnw) obj;
        return u890.j(this.a, wnwVar.a) && u890.j(this.b, wnwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public wnw(String str) {
        this.a = "dc9ecfcb91814373acd159bbdfeca5e9";
        this.b = str;
    }
}
