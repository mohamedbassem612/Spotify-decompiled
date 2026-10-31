package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nc91 implements pc91 {
    public final String a;

    public nc91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc91) && this.a.equals(((nc91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
