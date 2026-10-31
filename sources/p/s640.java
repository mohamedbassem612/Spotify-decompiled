package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s640 {
    public final String a;
    public final String b;

    public s640(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zR;
        if (this != obj) {
            if (obj instanceof s640) {
                s640 s640Var = (s640) obj;
                if (kkn.m(this.a, s640Var.a)) {
                    String str = s640Var.b;
                    String str2 = this.b;
                    if (str2 == null) {
                        if (str == null) {
                            zR = true;
                        } else {
                            zR = false;
                        }
                    } else if (str == null) {
                        zR = false;
                    } else {
                        zR = nln.r(str2, str);
                    }
                    if (!zR) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iS = kkn.s(this.a) * 31;
        String str = this.b;
        return iS + (str == null ? 0 : nln.u(str));
    }
}
