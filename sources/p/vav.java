package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class vav {
    public static final uav Companion = new uav();
    public final String a;
    public final String b;

    public /* synthetic */ vav(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, tav.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vav)) {
            return false;
        }
        vav vavVar = (vav) obj;
        return u890.j(this.a, vavVar.a) && u890.j(this.b, vavVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public vav(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
