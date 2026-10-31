package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sfn implements ugn {
    public final String a;

    public sfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfn) && this.a.equals(((sfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
