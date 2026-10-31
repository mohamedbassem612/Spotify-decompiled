package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gq21 extends iq21 {
    public final String a;

    public gq21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq21) && this.a.equals(((gq21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
