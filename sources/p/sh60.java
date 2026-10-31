package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sh60 implements vh60 {
    public final String a;

    public sh60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh60) && this.a.equals(((sh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
