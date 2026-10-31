package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pm10 {
    public final String a;
    public final String b;
    public final c380 c;

    public pm10(String str, String str2, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm10)) {
            return false;
        }
        pm10 pm10Var = (pm10) obj;
        return this.a.equals(pm10Var.a) && this.b.equals(pm10Var.b) && u890.j(this.c, pm10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
