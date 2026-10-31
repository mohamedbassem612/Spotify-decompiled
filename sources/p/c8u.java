package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class c8u {
    public static final b8u Companion = new b8u();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ c8u(String str, String str2, int i, String str3) {
        if (5 != (i & 5)) {
            o6p1.t(i, 5, a8u.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8u)) {
            return false;
        }
        c8u c8uVar = (c8u) obj;
        return u890.j(this.a, c8uVar.a) && u890.j(this.b, c8uVar.b) && u890.j(this.c, c8uVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
