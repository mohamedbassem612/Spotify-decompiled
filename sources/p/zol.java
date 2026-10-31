package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zol implements tpl {
    public final xu50 a;
    public final ArrayList b;
    public final String c;
    public final q8c d;

    public zol(xu50 xu50Var, ArrayList arrayList, String str, q8c q8cVar) {
        this.a = xu50Var;
        this.b = arrayList;
        this.c = str;
        this.d = q8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zol)) {
            return false;
        }
        zol zolVar = (zol) obj;
        return this.a.equals(zolVar.a) && this.b.equals(zolVar.b) && this.c.equals(zolVar.c) && this.d == zolVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
