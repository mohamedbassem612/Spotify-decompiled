package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uc50 {
    public final String a;
    public final String b;

    public uc50(String str) {
        this.a = str;
        this.b = str.concat(":ratings");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc50) && u890.j(this.a, ((uc50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
