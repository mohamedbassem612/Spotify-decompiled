package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r3i1 extends am70 {
    public final String b;
    public final String c;

    public r3i1(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r3i1.class != obj.getClass()) {
            return false;
        }
        r3i1 r3i1Var = (r3i1) obj;
        return this.a.equals(r3i1Var.a) && Objects.equals(this.b, r3i1Var.b) && this.c.equals(r3i1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
