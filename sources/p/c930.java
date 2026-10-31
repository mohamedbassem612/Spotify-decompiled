package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c930 {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public c930(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(String str, char c, String str2) {
        return str2.hashCode() + cy30.d(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.e, this.b, this.d);
    }
}
