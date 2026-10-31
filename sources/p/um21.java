package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class um21 implements wm21 {
    public final String a;

    public um21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um21) && u890.j(this.a, ((um21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
