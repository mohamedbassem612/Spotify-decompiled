package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zqb implements crb {
    public final String a;
    public final String b;

    public zqb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqb)) {
            return false;
        }
        zqb zqbVar = (zqb) obj;
        return this.a.equals(zqbVar.a) && this.b.equals(zqbVar.b);
    }

    public final String getId() {
        return this.a;
    }

    public final String getLabel() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
