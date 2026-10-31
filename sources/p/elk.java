package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class elk extends vlk {
    public final String a;

    public elk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elk) && u890.j(this.a, ((elk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
