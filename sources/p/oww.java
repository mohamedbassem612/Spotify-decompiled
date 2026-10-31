package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class oww {
    public static final nww Companion = new nww();
    public final String a;
    public final String b;

    public /* synthetic */ oww(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, mww.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oww)) {
            return false;
        }
        oww owwVar = (oww) obj;
        return u890.j(this.a, owwVar.a) && u890.j(this.b, owwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
