package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vsi0 extends fuo1 {
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final String f;

    public vsi0(String str, String str2, Uri uri, Uri uri2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsi0)) {
            return false;
        }
        vsi0 vsi0Var = (vsi0) obj;
        return this.b.equals(vsi0Var.b) && u890.j(this.c, vsi0Var.c) && this.d.equals(vsi0Var.d) && this.e.equals(vsi0Var.e) && u890.j(this.f, vsi0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.f.hashCode() + hrt.h(this.e, hrt.h(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }
}
