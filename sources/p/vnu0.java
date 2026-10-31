package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vnu0 extends wnu0 {
    public final String a;

    public vnu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vnu0) && this.a.equals(((vnu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
