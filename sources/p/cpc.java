package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cpc {
    public final String a;

    public cpc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpc) && this.a.equals(((cpc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
