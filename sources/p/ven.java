package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ven implements ugn {
    public final String a;

    public ven(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ven) && this.a.equals(((ven) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
