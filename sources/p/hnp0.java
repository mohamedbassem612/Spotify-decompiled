package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hnp0 implements knp0 {
    public final String a;

    public hnp0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnp0) && this.a.equals(((hnp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
