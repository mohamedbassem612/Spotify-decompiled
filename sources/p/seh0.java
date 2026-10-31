package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class seh0 implements teh0 {
    public final String a;

    public seh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof seh0) && this.a.equals(((seh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
