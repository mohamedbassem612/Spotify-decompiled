package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gg81 extends ig81 {
    public final String a;

    public gg81(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg81) && u890.j(this.a, ((gg81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
