package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rek0 {
    public final String a;

    public rek0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rek0) && this.a.equals(((rek0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
