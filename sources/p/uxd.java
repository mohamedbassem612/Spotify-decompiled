package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uxd {
    public final String a;

    public uxd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxd) && this.a.equals(((uxd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
