package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ign implements ugn {
    public final String a;

    public ign(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ign) && this.a.equals(((ign) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
