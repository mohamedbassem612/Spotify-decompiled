package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ohf1 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public ohf1(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            hhg1.n(f4i1.f("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = strSubstring;
        this.b = str;
        this.c = xcg1.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ohf1)) {
            return false;
        }
        ohf1 ohf1Var = (ohf1) obj;
        return this.a.equals(ohf1Var.a) && this.b.equals(ohf1Var.b);
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{this.b, this.a});
    }
}
