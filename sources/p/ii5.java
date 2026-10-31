package p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ii5 extends am70 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public ii5(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // p.rij0
    public final void b(upq upqVar) {
        upqVar.a(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ii5.class != obj.getClass()) {
            return false;
        }
        ii5 ii5Var = (ii5) obj;
        return this.d == ii5Var.d && this.b.equals(ii5Var.b) && Objects.equals(this.c, ii5Var.c) && Arrays.equals(this.e, ii5Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
