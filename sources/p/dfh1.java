package p;

import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class dfh1 {
    public static final cfh1 Companion = new cfh1();
    public final String a;
    public final String b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ dfh1(int i, String str, String str2) throws MissingFieldException {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, bfh1.a.getDescriptor());
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
        if (!(obj instanceof dfh1)) {
            return false;
        }
        dfh1 dfh1Var = (dfh1) obj;
        return u890.j(this.a, dfh1Var.a) && u890.j(this.b, dfh1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
