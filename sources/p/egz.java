package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class egz {
    public final String a;

    public egz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egz) && u890.j(this.a, ((egz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
