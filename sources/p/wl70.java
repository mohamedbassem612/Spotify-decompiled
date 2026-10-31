package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wl70 implements rij0 {
    public final byte[] a;
    public final String b;
    public final String c;

    public wl70(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // p.rij0
    public final void b(upq upqVar) {
        String str = this.b;
        if (str != null) {
            upqVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wl70.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((wl70) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return gvg.j(gvg.n("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
