package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l97 {
    public final String a;

    public l97(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l97) && u890.j(this.a, ((l97) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
