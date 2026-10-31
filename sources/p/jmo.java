package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jmo implements kmo {
    public final Integer a;
    public final int b;
    public final String c;

    public jmo(int i, Integer num, String str) {
        this.a = num;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmo)) {
            return false;
        }
        jmo jmoVar = (jmo) obj;
        return this.a.equals(jmoVar.a) && this.b == jmoVar.b && u890.j(this.c, jmoVar.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(0, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.c;
        return iF + (str != null ? str.hashCode() : 0);
    }
}
