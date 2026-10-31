package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ufj1 {
    public final String a;

    public ufj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufj1) && this.a.equals(((ufj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
