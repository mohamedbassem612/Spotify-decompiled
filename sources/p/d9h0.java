package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d9h0 {
    public final String a;

    public d9h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9h0) && this.a.equals(((d9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
