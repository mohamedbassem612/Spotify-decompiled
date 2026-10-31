package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class caw implements niw {
    public final String a;

    public caw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof caw) && u890.j(this.a, ((caw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
