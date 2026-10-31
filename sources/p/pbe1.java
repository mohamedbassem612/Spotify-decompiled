package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pbe1 {
    public final String a;

    public pbe1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbe1) && this.a.equals(((pbe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
