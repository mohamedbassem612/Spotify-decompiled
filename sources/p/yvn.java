package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yvn implements awn {
    public final String a;

    public yvn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvn) && this.a.equals(((yvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
