package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class guf implements puf {
    public final String a;

    public guf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guf) && u890.j(this.a, ((guf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
