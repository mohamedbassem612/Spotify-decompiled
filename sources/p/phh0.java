package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class phh0 {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final Bundle f;
    public final int g;

    public phh0(String str, String str2, String str3, Uri uri, Uri uri2, Bundle bundle, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = uri2;
        this.f = bundle;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phh0)) {
            return false;
        }
        phh0 phh0Var = (phh0) obj;
        return u890.j(this.a, phh0Var.a) && u890.j(this.b, phh0Var.b) && u890.j(this.c, phh0Var.c) && u890.j(this.d, phh0Var.d) && u890.j(this.e, phh0Var.e) && u890.j(this.f, phh0Var.f) && this.g == phh0Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.d;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.e;
        int iHashCode5 = (iHashCode4 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Bundle bundle = this.f;
        return Integer.hashCode(this.g) + ((iHashCode5 + (bundle != null ? bundle.hashCode() : 0)) * 31);
    }
}
