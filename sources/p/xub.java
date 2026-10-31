package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xub extends lvx {
    public final String d;
    public final String e;

    public xub(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xub)) {
            return false;
        }
        xub xubVar = (xub) obj;
        return u890.j(this.d, xubVar.d) && u890.j(this.e, xubVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
