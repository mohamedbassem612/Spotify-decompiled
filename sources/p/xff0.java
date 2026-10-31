package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class xff0 {
    public static final wff0 Companion = new wff0();
    public static final znb0[] d = {null, dm5.S(2, i0f0.Q0), null};
    public final String a;
    public final List b;
    public final boolean c;

    public /* synthetic */ xff0(int i, String str, List list, boolean z) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, vff0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xff0)) {
            return false;
        }
        xff0 xff0Var = (xff0) obj;
        return u890.j(this.a, xff0Var.a) && u890.j(this.b, xff0Var.b) && this.c == xff0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public xff0(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }
}
