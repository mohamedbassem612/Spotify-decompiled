package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class grm1 {
    public final ArrayList a;
    public final tka0 b;
    public final a1i c;
    public final f38 d;
    public final mrm1 e;

    public grm1(ArrayList arrayList, tka0 tka0Var, a1i a1iVar, f38 f38Var, mrm1 mrm1Var) {
        this.a = arrayList;
        this.b = tka0Var;
        this.c = a1iVar;
        this.d = f38Var;
        this.e = mrm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof grm1) {
            grm1 grm1Var = (grm1) obj;
            return this.a.equals(grm1Var.a) && u890.j(this.b, grm1Var.b) && this.c.equals(grm1Var.c) && this.d == grm1Var.d && this.e == grm1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
