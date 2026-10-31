package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ni91 extends mod {
    public final String e;

    public ni91(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni91) && u890.j(this.e, ((ni91) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
