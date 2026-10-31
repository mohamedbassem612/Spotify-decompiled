package p;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pz70 extends p371 {
    public final Uri a;
    public final String b;
    public final String c;
    public final dqi1 d;
    public final Map e;
    public final String f;
    public final String g;

    public /* synthetic */ pz70(Uri uri, String str, Map map, String str2, int i) {
        this(uri, str, null, null, (i & 16) != 0 ? b7x.a : map, (i & 32) != 0 ? null : str2, null);
    }

    @Override // p.p371
    public final String b() {
        return this.c;
    }

    @Override // p.p371
    public final String d() {
        return this.b;
    }

    @Override // p.p371
    public final Map e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz70)) {
            return false;
        }
        pz70 pz70Var = (pz70) obj;
        return u890.j(this.a, pz70Var.a) && u890.j(this.b, pz70Var.b) && u890.j(this.c, pz70Var.c) && u890.j(this.d, pz70Var.d) && u890.j(this.e, pz70Var.e) && u890.j(this.f, pz70Var.f) && u890.j(this.g, pz70Var.g);
    }

    @Override // p.p371
    public final dqi1 f() {
        return this.d;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iD = cy30.d((uri == null ? 0 : uri.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        dqi1 dqi1Var = this.d;
        int iE = cy30.e((iHashCode + (dqi1Var == null ? 0 : dqi1Var.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public pz70(Uri uri, String str, String str2, dqi1 dqi1Var, Map map, String str3, String str4) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = dqi1Var;
        this.e = map;
        this.f = str3;
        this.g = str4;
    }
}
