package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z411 {
    public final String a;

    public z411(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z411) && this.a.equals(((z411) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
