package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qkl {
    public final int a;
    public final int b;
    public final String c;

    public qkl(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkl)) {
            return false;
        }
        qkl qklVar = (qkl) obj;
        return this.a == qklVar.a && this.b == qklVar.b && this.c.equals(qklVar.c);
    }

    public final int hashCode() {
        return cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
