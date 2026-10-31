package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class idk implements jdk {
    public final String a;
    public final int b;

    public idk(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idk)) {
            return false;
        }
        idk idkVar = (idk) obj;
        return this.a.equals(idkVar.a) && this.b == idkVar.b;
    }

    @Override // p.jdk
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
