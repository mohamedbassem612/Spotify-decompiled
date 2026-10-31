package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d500 implements x600 {
    public final String a;

    public d500(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d500) && this.a.equals(((d500) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
