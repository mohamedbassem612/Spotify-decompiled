package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eis0 implements jis0 {
    public final String a;

    public eis0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eis0) && this.a.equals(((eis0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
