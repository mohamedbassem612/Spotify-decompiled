package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wer0 implements qfr0 {
    public final String a;
    public final String b;
    public final tfr0 c;

    public wer0(String str, String str2, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wer0)) {
            return false;
        }
        wer0 wer0Var = (wer0) obj;
        return u890.j(this.a, wer0Var.a) && this.b.equals(wer0Var.b) && this.c.equals(wer0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(cy30.d(1707172522, 31, this.a), 31, this.b);
    }
}
