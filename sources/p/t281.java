package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t281 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public t281(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t281)) {
            return false;
        }
        t281 t281Var = (t281) obj;
        return this.a.equals(t281Var.a) && this.b.equals(t281Var.b) && this.c.equals(t281Var.c) && this.d.equals(t281Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
