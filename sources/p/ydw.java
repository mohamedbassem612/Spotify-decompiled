package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ydw {
    public final String a;
    public final String b;

    public ydw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydw)) {
            return false;
        }
        ydw ydwVar = (ydw) obj;
        return u890.j(this.a, ydwVar.a) && this.b.equals(ydwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
