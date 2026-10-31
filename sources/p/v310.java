package p;

import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v310 {
    public final String a;
    public String b;
    public String c;
    public Uri d;
    public Uri e;
    public Uri f;
    public Uri g;
    public Uri h;
    public Uri i;
    public boolean j;
    public boolean k;
    public boolean l;
    public Integer m;
    public String n;
    public Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y310 f40p;
    public String q;
    public String r;
    public Long s;
    public String t;
    public oz0 u;
    public int v = 3;
    public int w;
    public final int x;
    public int y;

    public v310(String str) {
        this.a = str;
        Uri uri = Uri.EMPTY;
        this.d = uri;
        this.e = uri;
        this.f = uri;
        this.g = uri;
        this.w = 3;
        this.x = 4;
    }

    public final u310 a() {
        String str = this.b;
        String str2 = this.c;
        Uri uri = this.d;
        Uri uri2 = this.e;
        Uri uri3 = this.f;
        Uri uri4 = this.g;
        Uri uri5 = this.h;
        Uri uri6 = this.i;
        int i = this.v;
        boolean z = this.j;
        boolean z2 = this.k;
        boolean z3 = this.l;
        int i2 = this.w;
        Integer num = this.m;
        String str3 = this.n;
        Integer num2 = this.o;
        int i3 = this.y;
        y310 y310Var = this.f40p;
        String str4 = this.q;
        String str5 = this.r;
        return new u310(this.a, (String) null, str, str2, uri, (Uri) null, uri2, uri3, uri4, uri5, uri6, i, z, z2, z3, false, i2, this.x, (Double) null, num, (Integer) null, false, str3, (String) null, num2, i3, y310Var, str4, this.s, (String) null, (Map) null, str5, this.t, this.u, 1073741856, 12);
    }

    public final void b(int i) {
        this.v = i;
    }

    public final void c(Uri uri) {
        this.d = uri;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    public final void d() {
        Uri uri = this.h;
        int i = 0;
        if (uri != null) {
            String string = uri.toString();
            if (string.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || string.equals("spotify:collection:tracks") || string.equals("spotify:internal:collection:tracks") || (nhc1.Y(string, "spotify:user:", false) && nhc1.R(string, ":collection", false))) {
                i = 2;
            } else {
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(uri.toString());
                v5b1 v5b1Var = s4b1VarX.d;
                if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                    i = 2;
                } else {
                    int iOrdinal = s4b1VarX.c.ordinal();
                    if (iOrdinal == 30) {
                        i = 3;
                    } else if (iOrdinal == 44) {
                        i = 1;
                    } else if (iOrdinal == 166 || iOrdinal == 208) {
                        i = 4;
                    } else if (iOrdinal == 659 || iOrdinal == 844 || iOrdinal == 849) {
                        i = 6;
                    } else if (iOrdinal == 856 || iOrdinal == 860) {
                        i = 4;
                    } else {
                        i = iOrdinal != 926 ? 5 : 7;
                    }
                }
            }
        }
        this.y = i;
    }

    public final void e(String str) {
        this.c = str;
    }

    public final void f(String str) {
        this.b = str;
    }
}
