package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ctx0 extends ktx0 {
    public final String a;

    public ctx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctx0) && this.a.equals(((ctx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
