package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vy6 implements ez00 {
    public final String a;
    public final String b;
    public final den c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public vy6(String str, String str2, den denVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = str;
        this.b = str2;
        this.c = denVar;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
        this.g = arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy6)) {
            return false;
        }
        vy6 vy6Var = (vy6) obj;
        return this.a.equals(vy6Var.a) && this.b.equals(vy6Var.b) && this.c.equals(vy6Var.c) && this.d.equals(vy6Var.d) && this.e.equals(vy6Var.e) && this.f.equals(vy6Var.f) && this.g.equals(vy6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + p3d1.f(this.f, p3d1.f(this.e, p3d1.f(this.d, (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31), 31);
    }
}
