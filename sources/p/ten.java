package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ten implements ugn {
    public final String a;

    public ten(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ten) && this.a.equals(((ten) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
