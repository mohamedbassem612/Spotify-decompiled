package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ipa1 implements jpa1 {
    public final String a;

    public ipa1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipa1) && this.a.equals(((ipa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
