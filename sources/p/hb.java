package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class hb {
    public static final gb Companion = new gb();
    public final String a;
    public final String b;

    public /* synthetic */ hb(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, fb.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return u890.j(this.a, hbVar.a) && u890.j(this.b, hbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public hb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
