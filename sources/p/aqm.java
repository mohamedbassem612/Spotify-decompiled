package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aqm {
    public final zpm a;
    public final boolean b;
    public final String c;
    public final c380 d;

    public aqm(zpm zpmVar, boolean z, String str, c380 c380Var) {
        this.a = zpmVar;
        this.b = z;
        this.c = str;
        this.d = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqm)) {
            return false;
        }
        aqm aqmVar = (aqm) obj;
        return this.a.equals(aqmVar.a) && this.b == aqmVar.b && u890.j(this.c, aqmVar.c) && u890.j(this.d, aqmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
