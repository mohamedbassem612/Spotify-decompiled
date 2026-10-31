package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rwh {
    public final String a;

    public rwh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwh) && this.a.equals(((rwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
