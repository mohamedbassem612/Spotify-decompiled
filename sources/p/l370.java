package p;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l370 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public l370(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(ihc1.v0(str, ':', length, 4) + 1, ihc1.v0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iV0 = ihc1.v0(str, '/', length, 4);
        return str.substring(iV0, w4n1.d(iV0, str, str.length(), "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iV0 = ihc1.v0(str, '/', length, 4);
        int iD = w4n1.d(iV0, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iV0 < iD) {
            int i = iV0 + 1;
            int iE = w4n1.e(str, '/', i, iD);
            arrayList.add(str.substring(i, iE));
            iV0 = iE;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iV0 = ihc1.v0(str, '?', 0, 6) + 1;
        return str.substring(iV0, w4n1.e(str, '#', iV0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, w4n1.d(length, str, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l370) && ((l370) obj).i.equals(this.i);
    }

    public final boolean f() {
        return u890.j(this.a, m3i1.b);
    }

    public final k370 g() {
        int i;
        String strSubstring;
        k370 k370Var = new k370();
        String str = this.a;
        k370Var.a = str;
        k370Var.b = e();
        k370Var.c = a();
        k370Var.d = this.d;
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals(m3i1.b) ? 443 : -1;
        }
        int i2 = this.e;
        k370Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = k370Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        k370Var.d(d());
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.i;
            strSubstring = str2.substring(ihc1.v0(str2, '#', 0, 6) + 1);
        }
        k370Var.h = strSubstring;
        return k370Var;
    }

    public final String h() {
        k370 k370Var;
        try {
            k370Var = new k370();
            k370Var.f(this, "/...");
        } catch (IllegalArgumentException unused) {
            k370Var = null;
        }
        k370Var.getClass();
        k370Var.b = mno1.i(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
        k370Var.c = mno1.i(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
        return k370Var.b().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        k370 k370VarG = g();
        ArrayList arrayList = k370VarG.f;
        String str = k370VarG.d;
        k370VarG.d = str != null ? cy30.o("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, mno1.i(0, 0, 99, (String) arrayList.get(i), "[]", true));
        }
        ArrayList arrayList2 = k370VarG.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? mno1.i(0, 0, 67, str2, "\\^`{|}", true) : null);
            }
        }
        String str3 = k370VarG.h;
        k370VarG.h = str3 != null ? mno1.i(0, 0, 35, str3, " \"#<>\\^`{|}", true) : null;
        String string = k370VarG.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                eg.j(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
