package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rud0 {
    public final String a;

    public rud0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rud0) && this.a.equals(((rud0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
