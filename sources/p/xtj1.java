package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xtj1 implements cuj1 {
    public final String a;

    public xtj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtj1) && this.a.equals(((xtj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
