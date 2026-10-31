package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jnd implements lnd {
    public final String a;
    public final String b;

    public jnd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnd)) {
            return false;
        }
        jnd jndVar = (jnd) obj;
        return this.a.equals(jndVar.a) && this.b.equals(jndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
