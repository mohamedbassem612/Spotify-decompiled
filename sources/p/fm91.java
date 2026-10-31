package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fm91 {
    public final String a;

    public fm91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm91) && u890.j(this.a, ((fm91) obj).a);
    }

    public final int hashCode() {
        return l1d.C(1) + (this.a.hashCode() * 31);
    }
}
