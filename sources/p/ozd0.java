package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ozd0 implements qzd0 {
    public final String a;

    public ozd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozd0) && this.a.equals(((ozd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
