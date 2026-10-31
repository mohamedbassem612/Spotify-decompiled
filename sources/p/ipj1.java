package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ipj1 implements lpj1 {
    public final String a;

    public ipj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipj1) && this.a.equals(((ipj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
