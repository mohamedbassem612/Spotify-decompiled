package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ojh {
    public final String a;
    public final String b;

    public ojh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojh)) {
            return false;
        }
        ojh ojhVar = (ojh) obj;
        return this.a.equals(ojhVar.a) && u890.j(this.b, ojhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
