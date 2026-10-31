package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yfw implements bgw {
    public final String a;
    public final String b;
    public final int c;

    public yfw(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // p.bgw
    public final int a() {
        return this.c;
    }

    @Override // p.bgw
    public final String b() {
        return this.a;
    }

    @Override // p.bgw
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfw)) {
            return false;
        }
        yfw yfwVar = (yfw) obj;
        return this.a.equals(yfwVar.a) && this.b.equals(yfwVar.b) && this.c == yfwVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
