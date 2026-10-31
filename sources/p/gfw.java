package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gfw implements hiw {
    public final String a;

    public gfw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfw) && u890.j(this.a, ((gfw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
