package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mlk extends vlk {
    public final String a;

    public mlk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlk) && u890.j(this.a, ((mlk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
