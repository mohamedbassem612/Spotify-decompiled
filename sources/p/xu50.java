package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xu50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final q8c f;

    public xu50(String str, String str2, String str3, String str4, ArrayList arrayList, q8c q8cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = q8cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu50)) {
            return false;
        }
        xu50 xu50Var = (xu50) obj;
        return u890.j(this.a, xu50Var.a) && this.b.equals(xu50Var.b) && this.c.equals(xu50Var.c) && this.d.equals(xu50Var.d) && this.e.equals(xu50Var.e) && this.f == xu50Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + p3d1.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
