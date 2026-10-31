package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class uh60 implements vh60 {
    public final String a;

    public uh60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh60) && this.a.equals(((uh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
