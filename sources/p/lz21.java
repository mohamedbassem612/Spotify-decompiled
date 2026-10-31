package p;

import j$.time.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lz21 implements rz21 {
    public final Duration a;
    public final String b;
    public final String c;

    public lz21(String str, String str2, Duration duration) {
        this.a = duration;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz21)) {
            return false;
        }
        lz21 lz21Var = (lz21) obj;
        return this.a.equals(lz21Var.a) && this.b.equals(lz21Var.b) && u890.j(this.c, lz21Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
