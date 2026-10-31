package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mfh implements nfh {
    public final String a;

    public mfh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfh) && u890.j(this.a, ((mfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
