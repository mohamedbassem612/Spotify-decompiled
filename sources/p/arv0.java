package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class arv0 implements brv0 {
    public final String a;

    public arv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arv0) && this.a.equals(((arv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
