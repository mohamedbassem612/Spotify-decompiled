package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pv10 implements rv10 {
    public final String a;

    public pv10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv10) && this.a.equals(((pv10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
