package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rz61 implements ez00 {
    public final String a;
    public final String b;
    public final byte[] c;

    public rz61(String str, String str2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz61)) {
            return false;
        }
        rz61 rz61Var = (rz61) obj;
        return this.a.equals(rz61Var.a) && this.b.equals(rz61Var.b) && Arrays.equals(this.c, rz61Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
