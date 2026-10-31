package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ecm {
    public final String a;
    public final String b;

    public ecm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecm)) {
            return false;
        }
        ecm ecmVar = (ecm) obj;
        return this.a.equals(ecmVar.a) && this.b.equals(ecmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
