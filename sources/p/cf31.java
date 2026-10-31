package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cf31 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;

    public cf31(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7;
        String str8;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
        this.h = str6;
        int iC = l1d.C(i);
        if (iC == 0) {
            str7 = "spotify:internal:allboarding:origin:home-audiobooks-sub-feed";
        } else if (iC == 1) {
            str7 = nik1.N0.a;
        } else {
            if (iC != 2) {
                eg.o();
                throw null;
            }
            str7 = nik1.L0.a;
        }
        this.i = str7;
        if (str2.length() == 0) {
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                str8 = "https://nftonboarding-images.scdn.co/ao/sub-feed-img-us.png";
            } else if (iC2 == 1) {
                str8 = "https://nftonboarding-images.scdn.co/po/podcast-onboarding-sub-feed.png";
            } else {
                if (iC2 != 2) {
                    eg.o();
                    throw null;
                }
                str8 = "https://nftonboarding-images.scdn.co/delayed-to.png";
            }
            str2 = str8;
        }
        this.j = str2;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.j;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf31)) {
            return false;
        }
        cf31 cf31Var = (cf31) obj;
        return this.a.equals(cf31Var.a) && u890.j(this.b, cf31Var.b) && this.c.equals(cf31Var.c) && this.d.equals(cf31Var.d) && this.e.equals(cf31Var.e) && this.f == cf31Var.f && this.g == cf31Var.g && this.h.equals(cf31Var.h);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.c;
    }

    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(ab80.k(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
    }

    public final boolean i() {
        return this.g;
    }
}
