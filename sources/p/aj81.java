package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aj81 {
    public final String a;
    public final Uri b;
    public final String c;
    public final u7h d;
    public final ki81 e;
    public final li81 f;

    public /* synthetic */ aj81(String str, Uri uri, String str2, u7h u7hVar, ki81 ki81Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : u7hVar, ki81Var, (li81) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj81)) {
            return false;
        }
        aj81 aj81Var = (aj81) obj;
        return u890.j(this.a, aj81Var.a) && u890.j(this.b, aj81Var.b) && u890.j(this.c, aj81Var.c) && u890.j(this.d, aj81Var.d) && u890.j(this.e, aj81Var.e) && u890.j(this.f, aj81Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u7h u7hVar = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31)) * 31;
        li81 li81Var = this.f;
        return iHashCode4 + (li81Var != null ? li81Var.hashCode() : 0);
    }

    public aj81(String str, Uri uri, String str2, u7h u7hVar, ki81 ki81Var, li81 li81Var) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = u7hVar;
        this.e = ki81Var;
        this.f = li81Var;
    }
}
