package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d7a1 {
    public final String a;

    public d7a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7a1) && this.a.equals(((d7a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
