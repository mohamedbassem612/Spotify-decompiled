package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ki21 extends si21 {
    public final String a;

    public ki21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki21) && this.a.equals(((ki21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
