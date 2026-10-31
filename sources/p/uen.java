package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uen implements ugn {
    public final String a;

    public uen(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uen) && this.a.equals(((uen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
