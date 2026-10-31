package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class knd implements lnd {
    public final String a;
    public final String b;

    public knd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knd)) {
            return false;
        }
        knd kndVar = (knd) obj;
        return this.a.equals(kndVar.a) && this.b.equals(kndVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
