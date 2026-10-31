package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qik extends vik {
    public final String a;

    public qik(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qik) && this.a.equals(((qik) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
