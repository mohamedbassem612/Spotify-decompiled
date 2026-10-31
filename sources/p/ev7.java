package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ev7 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public ev7(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev7)) {
            return false;
        }
        ev7 ev7Var = (ev7) obj;
        return this.a == ev7Var.a && this.b == ev7Var.b && u890.j(this.c, ev7Var.c) && u890.j(this.d, ev7Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
