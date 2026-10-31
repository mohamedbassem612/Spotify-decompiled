package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ht10 implements st10 {
    public final String a;

    public ht10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht10) && this.a.equals(((ht10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
