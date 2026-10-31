package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hag1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final m8h f;
    public final int g;
    public final boolean h;

    public hag1(String str, String str2, String str3, String str4, ArrayList arrayList, m8h m8hVar, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = m8hVar;
        this.g = i;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hag1)) {
            return false;
        }
        hag1 hag1Var = (hag1) obj;
        return u890.j(this.a, hag1Var.a) && this.b.equals(hag1Var.b) && this.c.equals(hag1Var.c) && this.d.equals(hag1Var.d) && this.e.equals(hag1Var.e) && this.f.equals(hag1Var.f) && this.g == hag1Var.g && this.h == hag1Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + kaa0.f(this.g, (this.f.hashCode() + p3d1.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31, 31);
    }
}
