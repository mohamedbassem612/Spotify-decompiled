package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class im70 implements jm70 {
    public final String a;

    public im70(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof im70) && this.a.equals(((im70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
