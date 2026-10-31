package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class t9a {
    public static final s9a Companion = new s9a();
    public final String a;
    public final String b;

    public /* synthetic */ t9a(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, r9a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9a)) {
            return false;
        }
        t9a t9aVar = (t9a) obj;
        return u890.j(this.a, t9aVar.a) && u890.j(this.b, t9aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public t9a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
