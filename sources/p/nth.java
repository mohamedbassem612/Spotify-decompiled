package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class nth {
    public static final mth Companion = new mth();
    public final String a;
    public final String b;

    public /* synthetic */ nth(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, lth.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nth)) {
            return false;
        }
        nth nthVar = (nth) obj;
        return u890.j(this.a, nthVar.a) && u890.j(this.b, nthVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
