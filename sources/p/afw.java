package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class afw extends iiw {
    public final String a;

    public afw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afw) && u890.j(this.a, ((afw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
