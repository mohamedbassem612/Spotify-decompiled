package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rwv0 {
    public final zxf a;
    public final String b;
    public final Uri c;

    public rwv0(zxf zxfVar, String str, Uri uri) {
        this.a = zxfVar;
        this.b = str;
        this.c = uri;
        xxf xxfVar = xxf.b;
        if (zxfVar.equals(xxfVar)) {
            n57.e("CheckoutSource must not be " + xxfVar);
        }
    }

    public final zxf a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Uri c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwv0)) {
            return false;
        }
        rwv0 rwv0Var = (rwv0) obj;
        return u890.j(this.a, rwv0Var.a) && u890.j(this.b, rwv0Var.b) && u890.j(this.c, rwv0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.c;
        return iHashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public /* synthetic */ rwv0(zxf zxfVar, Uri uri) {
        this(zxfVar, null, uri);
    }
}
