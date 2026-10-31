package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z10 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof z10) {
            return this.a == ((z10) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContextMenuButtonFeature(entityType=");
        int i = this.a;
        if (i == 1) {
            str = "ALBUM";
        } else if (i == 2) {
            str = "AUDIOBOOK";
        } else if (i == 3) {
            str = "PLAYLIST";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EPISODE";
        } else {
            str = "TRACK";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
