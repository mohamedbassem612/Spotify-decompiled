package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ga60 implements la60 {
    public final String a;
    public final d761 b;
    public final d761 c;
    public final d761 d;
    public final da60 e;

    public ga60(String str, d761 d761Var, d761 d761Var2, d761 d761Var3, da60 da60Var) {
        this.a = str;
        this.b = d761Var;
        this.c = d761Var2;
        this.d = d761Var3;
        this.e = da60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga60)) {
            return false;
        }
        ga60 ga60Var = (ga60) obj;
        return this.a.equals(ga60Var.a) && u890.j(this.b, ga60Var.b) && u890.j(this.c, ga60Var.c) && u890.j(this.d, ga60Var.d) && this.e.equals(ga60Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        d761 d761Var = this.b;
        int iHashCode2 = (iHashCode + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31;
        d761 d761Var2 = this.c;
        int iHashCode3 = (iHashCode2 + (d761Var2 == null ? 0 : Arrays.hashCode(d761Var2.a))) * 31;
        d761 d761Var3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (d761Var3 != null ? Arrays.hashCode(d761Var3.a) : 0)) * 31);
    }
}
