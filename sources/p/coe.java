package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class coe {
    public final String a;

    public coe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coe) && this.a.equals(((coe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
