package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ugc1 implements zw21 {
    public final String a;

    public ugc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugc1) && this.a.equals(((ugc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Object invoke(Object obj) {
        return this.a;
    }
}
