package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class za {
    public final String a;

    public za(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za) && this.a.equals(((za) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
