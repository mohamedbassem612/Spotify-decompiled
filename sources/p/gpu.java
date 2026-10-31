package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gpu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final h290 f;
    public final String g;

    public gpu(String str, String str2, String str3, String str4, String str5, h290 h290Var, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = h290Var;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpu)) {
            return false;
        }
        gpu gpuVar = (gpu) obj;
        return this.a.equals(gpuVar.a) && this.b.equals(gpuVar.b) && this.c.equals(gpuVar.c) && this.d.equals(gpuVar.d) && u890.j(this.e, gpuVar.e) && this.f.equals(gpuVar.f) && this.g.equals(gpuVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + kk0.g(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
