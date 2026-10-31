package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eoh implements iph {
    public final String a;
    public final String b;
    public final Throwable c;

    public eoh(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoh)) {
            return false;
        }
        eoh eohVar = (eoh) obj;
        return u890.j(this.a, eohVar.a) && u890.j(this.b, eohVar.b) && this.c.equals(eohVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
