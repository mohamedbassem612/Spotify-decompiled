package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bpf implements ez00 {
    public final apf a;
    public final String b;
    public final String c;

    public bpf(apf apfVar, String str, String str2) {
        this.a = apfVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpf)) {
            return false;
        }
        bpf bpfVar = (bpf) obj;
        return this.a.equals(bpfVar.a) && u890.j(this.b, bpfVar.b) && this.c.equals(bpfVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(false) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
