package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xp11 implements aq11 {
    public final String a;

    public xp11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp11) && this.a.equals(((xp11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
