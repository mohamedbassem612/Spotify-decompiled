package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jvl implements dwl {
    public final String a;
    public final String b;

    public jvl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvl)) {
            return false;
        }
        jvl jvlVar = (jvl) obj;
        return u890.j(this.a, jvlVar.a) && u890.j(this.b, jvlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
