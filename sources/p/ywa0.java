package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ywa0 {
    public final String a;

    public ywa0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywa0) && this.a.equals(((ywa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
