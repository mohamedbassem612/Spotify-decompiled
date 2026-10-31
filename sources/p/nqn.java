package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class nqn {
    public static final mqn Companion = new mqn();
    public static final znb0[] d = {dm5.S(2, lmm.Q0), null, null};
    public final List a;
    public final String b;
    public final String c;

    public /* synthetic */ nqn(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, lqn.a.getDescriptor());
            throw null;
        }
        this.a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqn)) {
            return false;
        }
        nqn nqnVar = (nqn) obj;
        return u890.j(this.a, nqnVar.a) && u890.j(this.b, nqnVar.b) && u890.j(this.c, nqnVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
