package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bt2 {
    public final String a;

    public bt2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt2) && this.a.equals(((bt2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
