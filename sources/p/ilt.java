package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ilt {
    public final String a;
    public final String b;

    public ilt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilt)) {
            return false;
        }
        ilt iltVar = (ilt) obj;
        return u890.j(this.a, iltVar.a) && u890.j(this.b, iltVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
