package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class maq0 implements paq0, kaq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final String i;

    public maq0(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = arrayList;
        this.i = str8;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maq0)) {
            return false;
        }
        maq0 maq0Var = (maq0) obj;
        return this.a.equals(maq0Var.a) && this.b.equals(maq0Var.b) && this.c.equals(maq0Var.c) && this.d.equals(maq0Var.d) && this.e.equals(maq0Var.e) && this.f.equals(maq0Var.f) && this.g.equals(maq0Var.g) && this.h.equals(maq0Var.h) && this.i.equals(maq0Var.i);
    }

    public final String getArtist() {
        return this.c;
    }

    public final String getArtwork() {
        return this.b;
    }

    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.i.hashCode() + p3d1.f(this.h, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }
}
