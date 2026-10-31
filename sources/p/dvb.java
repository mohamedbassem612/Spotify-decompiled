package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dvb extends lvx {
    public final String d;
    public final t7q0 e;
    public final boolean f;

    public dvb(String str, t7q0 t7q0Var, boolean z) {
        this.d = str;
        this.e = t7q0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvb)) {
            return false;
        }
        dvb dvbVar = (dvb) obj;
        return u890.j(this.d, dvbVar.d) && u890.j(this.e, dvbVar.e) && this.f == dvbVar.f;
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(true) * 31, 31, this.d);
        t7q0 t7q0Var = this.e;
        return Boolean.hashCode(this.f) + ((iD + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31);
    }
}
