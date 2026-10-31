package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gg90 implements jg90 {
    public final String a;

    public gg90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg90) && this.a.equals(((gg90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
