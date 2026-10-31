package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ih90 implements ai90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ih90(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih90)) {
            return false;
        }
        ih90 ih90Var = (ih90) obj;
        return this.a.equals(ih90Var.a) && this.b.equals(ih90Var.b) && this.c.equals(ih90Var.c) && this.d.equals(ih90Var.d) && u890.j(this.e, ih90Var.e);
    }

    public final String getTitle() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, false), 31, this.d);
    }
}
