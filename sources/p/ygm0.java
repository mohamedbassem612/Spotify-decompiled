package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ygm0 implements mhm0 {
    public final String a;

    public ygm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygm0) && this.a.equals(((ygm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
