package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jce {
    public final String a;
    public final String b;

    public jce(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jce)) {
            return false;
        }
        jce jceVar = (jce) obj;
        return this.a.equals(jceVar.a) && this.b.equals(jceVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
