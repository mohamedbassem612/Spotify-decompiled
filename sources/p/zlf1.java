package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zlf1 implements z0i {
    public final cjm a;
    public final dcm b;
    public final ArrayList c;
    public final String d;
    public final String e;

    public zlf1(cjm cjmVar, dcm dcmVar, ArrayList arrayList, String str, String str2) {
        this.a = cjmVar;
        this.b = dcmVar;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlf1)) {
            return false;
        }
        zlf1 zlf1Var = (zlf1) obj;
        return this.a.equals(zlf1Var.a) && this.b.equals(zlf1Var.b) && this.c.equals(zlf1Var.c) && this.d.equals(zlf1Var.d) && this.e.equals(zlf1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(p3d1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
