package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cvb extends lvx {
    public final String d;

    public cvb(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvb) && u890.j(this.d, ((cvb) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
