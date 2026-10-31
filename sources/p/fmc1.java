package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fmc1 implements gmc1 {
    public final String a;

    public fmc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmc1) && this.a.equals(((fmc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
