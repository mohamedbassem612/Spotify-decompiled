package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class doh implements iph {
    public final Exception a;
    public final String b;

    public doh(String str, Exception exc) {
        this.a = exc;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doh)) {
            return false;
        }
        doh dohVar = (doh) obj;
        return this.a.equals(dohVar.a) && u890.j(this.b, dohVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
