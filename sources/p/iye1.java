package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iye1 implements d6m {
    public final String a;

    public iye1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iye1) && this.a.equals(((iye1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
