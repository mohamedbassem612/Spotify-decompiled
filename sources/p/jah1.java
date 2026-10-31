package p;

import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jah1 {
    public final String a;
    public final rxe1 b;
    public final boolean c;
    public final jtc1 d;
    public final ResultReceiver e;

    public jah1(String str, rxe1 rxe1Var, boolean z, jtc1 jtc1Var, ResultReceiver resultReceiver) {
        this.a = str;
        this.b = rxe1Var;
        this.c = z;
        this.d = jtc1Var;
        this.e = resultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jah1)) {
            return false;
        }
        jah1 jah1Var = (jah1) obj;
        return u890.j(this.a, jah1Var.a) && u890.j(this.b, jah1Var.b) && this.c == jah1Var.c && this.d.equals(jah1Var.d) && u890.j(this.e, jah1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rxe1 rxe1Var = this.b;
        int iHashCode2 = (this.d.hashCode() + xcg1.g((iHashCode + (rxe1Var == null ? 0 : rxe1Var.hashCode())) * 31, 31, this.c)) * 31;
        ResultReceiver resultReceiver = this.e;
        return iHashCode2 + (resultReceiver != null ? resultReceiver.hashCode() : 0);
    }
}
