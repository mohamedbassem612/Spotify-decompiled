package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rl7 {
    public final String a;

    public rl7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl7) && u890.j(this.a, ((rl7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
