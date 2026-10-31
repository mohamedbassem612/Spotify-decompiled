package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o330 {
    public final String a;

    public o330(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o330) && this.a.equals(((o330) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
