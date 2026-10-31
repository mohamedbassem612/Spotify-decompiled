package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ll60 {
    public final ie30 a;
    public final String b;
    public final String c;

    public ll60(ie30 ie30Var, String str, String str2) {
        ge30 ge30VarA = ie30Var.a();
        ge30VarA.a = null;
        ge30VarA.l = null;
        this.a = new ie30(ge30VarA);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll60)) {
            return false;
        }
        ll60 ll60Var = (ll60) obj;
        return this.a.equals(ll60Var.a) && Objects.equals(this.b, ll60Var.b) && Objects.equals(this.c, ll60Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
