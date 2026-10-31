package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dsf implements gsf {
    public final String a;
    public final String b;

    public dsf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsf)) {
            return false;
        }
        dsf dsfVar = (dsf) obj;
        return this.a.equals(dsfVar.a) && u890.j(this.b, dsfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
