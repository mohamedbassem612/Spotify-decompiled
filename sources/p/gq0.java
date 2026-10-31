package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gq0 {
    public final String a;

    public /* synthetic */ gq0(String str) {
        this.a = str;
    }

    public static final /* synthetic */ gq0 a(String str) {
        return new gq0(str);
    }

    public static final boolean b(String str, String str2) {
        return u890.j(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return f4i1.f("AdIdentifier(value=", str, ")");
    }

    public static final String e(String str) {
        return l1d.m("spotify:ad:", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gq0) {
            return u890.j(this.a, ((gq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return d(this.a);
    }
}
