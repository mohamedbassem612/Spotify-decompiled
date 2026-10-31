package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ssn {
    public final String a;
    public final vsn b;

    public ssn(String str, vsn vsnVar) {
        this.a = str;
        this.b = vsnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssn)) {
            return false;
        }
        ssn ssnVar = (ssn) obj;
        return u890.j(this.a, ssnVar.a) && u890.j(this.b, ssnVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
