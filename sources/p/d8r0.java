package p;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d8r0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public d8r0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        String strM = "spotify:search";
        if (str3.length() != 0) {
            try {
                strM = URLEncoder.encode(str3, "utf8");
            } catch (UnsupportedEncodingException unused) {
            }
            strM = l1d.m("spotify:search:", strM);
        }
        this.e = strM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8r0)) {
            return false;
        }
        d8r0 d8r0Var = (d8r0) obj;
        return u890.j(this.a, d8r0Var.a) && u890.j(this.b, d8r0Var.b) && u890.j(this.c, d8r0Var.c) && u890.j(this.d, d8r0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public /* synthetic */ d8r0() {
        this("", "search", "", "");
    }
}
