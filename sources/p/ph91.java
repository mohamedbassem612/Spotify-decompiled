package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ph91 implements rh91 {
    public final String a;

    public ph91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph91) && this.a.equals(((ph91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
