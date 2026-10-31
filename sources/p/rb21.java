package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rb21 implements ub21 {
    public final String a;

    public rb21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb21) && this.a.equals(((rb21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
