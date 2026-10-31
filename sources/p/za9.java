package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class za9 {
    public final String a;

    public za9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za9) && this.a.equals(((za9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
