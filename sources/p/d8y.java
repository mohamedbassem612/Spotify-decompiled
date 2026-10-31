package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661
public final class d8y {
    public static final c8y Companion = new c8y();
    public final String a;
    public final String b;

    public /* synthetic */ d8y(int i, String str, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, b8y.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8y)) {
            return false;
        }
        d8y d8yVar = (d8y) obj;
        return u890.j(this.a, d8yVar.a) && u890.j(this.b, d8yVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public d8y(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
