package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cxu {
    public final String a;
    public final int b;
    public final int c;

    public cxu(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxu)) {
            return false;
        }
        cxu cxuVar = (cxu) obj;
        return u890.j(this.a, cxuVar.a) && this.b == cxuVar.b && this.c == cxuVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
