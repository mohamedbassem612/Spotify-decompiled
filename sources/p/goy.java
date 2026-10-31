package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class goy extends vpb1 {
    public final String f;

    public goy(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goy) && u890.j(this.f, ((goy) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
