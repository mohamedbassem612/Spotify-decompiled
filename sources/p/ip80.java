package p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ip80 {
    public final AdsModeModel.Format a;
    public final AdsModeModel.Product b;
    public final String c;
    public final String d;

    public ip80(AdsModeModel.Format format, AdsModeModel.Product product, String str, String str2) {
        this.a = format;
        this.b = product;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip80)) {
            return false;
        }
        ip80 ip80Var = (ip80) obj;
        return this.a == ip80Var.a && this.b == ip80Var.b && u890.j(this.c, ip80Var.c) && this.d.equals(ip80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
