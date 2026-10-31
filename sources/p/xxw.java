package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class xxw {
    public static final wxw Companion = new wxw();
    public static final znb0[] c = {dm5.S(2, xzu.W0), null};
    public final List a;
    public final boolean b;

    public /* synthetic */ xxw(int i, List list, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, vxw.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxw)) {
            return false;
        }
        xxw xxwVar = (xxw) obj;
        return u890.j(this.a, xxwVar.a) && this.b == xxwVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
