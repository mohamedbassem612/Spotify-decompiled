package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class evl implements dwl {
    public final String a;
    public final String b;

    public evl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evl)) {
            return false;
        }
        evl evlVar = (evl) obj;
        return u890.j(this.a, evlVar.a) && u890.j(this.b, evlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
