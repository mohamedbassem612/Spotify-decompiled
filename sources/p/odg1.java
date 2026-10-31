package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class odg1 implements sdg1 {
    public final String a;

    public odg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odg1) && this.a.equals(((odg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
