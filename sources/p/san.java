package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class san {
    public final String a;
    public final String b;
    public final idd1 c = new idd1(new j3m((Object) this, (byte) 19));

    public san(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof san)) {
            return false;
        }
        san sanVar = (san) obj;
        return this.a.equals(sanVar.a) && this.b.equals(sanVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
