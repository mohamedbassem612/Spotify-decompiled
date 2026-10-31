package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ykf {
    public static final xkf Companion = new xkf();
    public final String a;
    public final String b;

    public /* synthetic */ ykf(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, wkf.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykf)) {
            return false;
        }
        ykf ykfVar = (ykf) obj;
        return u890.j(this.a, ykfVar.a) && u890.j(this.b, ykfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public ykf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
