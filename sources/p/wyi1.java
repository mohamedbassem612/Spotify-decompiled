package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyi1 extends yyi1 {
    public final il81 a;
    public final cl81 b;
    public final ArrayList c;

    public wyi1(il81 il81Var, cl81 cl81Var, ArrayList arrayList) {
        this.a = il81Var;
        this.b = cl81Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyi1)) {
            return false;
        }
        wyi1 wyi1Var = (wyi1) obj;
        return this.a.equals(wyi1Var.a) && u890.j(this.b, wyi1Var.b) && this.c.equals(wyi1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        cl81 cl81Var = this.b;
        return this.c.hashCode() + ((iHashCode + (cl81Var == null ? 0 : cl81Var.hashCode())) * 31);
    }
}
