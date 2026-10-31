package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class oha {
    public static final nha Companion = new nha();
    public static final znb0[] c = {null, dm5.S(2, cu9.f)};
    public final fsh a;
    public final List b;

    public /* synthetic */ oha(int i, fsh fshVar, List list) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, mha.a.getDescriptor());
            throw null;
        }
        this.a = fshVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oha)) {
            return false;
        }
        oha ohaVar = (oha) obj;
        return u890.j(this.a, ohaVar.a) && u890.j(this.b, ohaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public oha(fsh fshVar, List list) {
        this.a = fshVar;
        this.b = list;
    }
}
