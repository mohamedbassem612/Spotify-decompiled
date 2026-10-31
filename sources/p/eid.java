package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eid implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final aid f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final ArrayList l;

    public eid(String str, String str2, String str3, int i, String str4, aid aidVar, boolean z, String str5, String str6, String str7, String str8, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = aidVar;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eid)) {
            return false;
        }
        eid eidVar = (eid) obj;
        return this.a.equals(eidVar.a) && this.b.equals(eidVar.b) && this.c.equals(eidVar.c) && this.d == eidVar.d && this.e.equals(eidVar.e) && this.f.equals(eidVar.f) && this.g == eidVar.g && this.h.equals(eidVar.h) && this.i.equals(eidVar.i) && this.j.equals(eidVar.j) && this.k.equals(eidVar.k) && this.l.equals(eidVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(xcg1.g((this.f.hashCode() + cy30.d(ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
