package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xcm {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Collection f;

    public xcm(String str, String str2, String str3, String str4, String str5, Collection collection) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcm)) {
            return false;
        }
        xcm xcmVar = (xcm) obj;
        return u890.j(this.a, xcmVar.a) && u890.j(this.b, xcmVar.b) && u890.j(this.c, xcmVar.c) && u890.j(this.d, xcmVar.d) && u890.j(this.e, xcmVar.e) && this.f.equals(xcmVar.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
