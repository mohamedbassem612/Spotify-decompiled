package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fw81 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;

    public fw81(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i == 1 ? "spotify:internal:allboarding:origin:home-audiobooks-sub-feed-reentry" : null;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw81)) {
            return false;
        }
        fw81 fw81Var = (fw81) obj;
        return this.a.equals(fw81Var.a) && this.b.equals(fw81Var.b) && this.c.equals(fw81Var.c) && this.d == fw81Var.d && this.e.equals(fw81Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
