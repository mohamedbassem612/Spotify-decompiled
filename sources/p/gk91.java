package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gk91 extends yk91 {
    public final String a;

    public gk91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk91) && this.a.equals(((gk91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
