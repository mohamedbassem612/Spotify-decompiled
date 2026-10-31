package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ykk extends vlk {
    public final String a;

    public ykk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykk) && u890.j(this.a, ((ykk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
