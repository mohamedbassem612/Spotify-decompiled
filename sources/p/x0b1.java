package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x0b1 {
    public final String a;
    public final String b;
    public final String c;

    public x0b1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof x0b1) {
                x0b1 x0b1Var = (x0b1) obj;
                String str = x0b1Var.a;
                String str2 = this.a;
                if (str2 == null) {
                    if (str == null) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (str == null) {
                    zEquals = false;
                } else {
                    zEquals = str2.equals(str);
                }
                if (zEquals && this.b.equals(x0b1Var.b) && this.c.equals(x0b1Var.c)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }
}
