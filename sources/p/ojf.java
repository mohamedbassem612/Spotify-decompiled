package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ojf implements qjf {
    public final String a;

    public ojf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojf) && this.a.equals(((ojf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
