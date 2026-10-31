package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tzd1 {
    public final String a;

    public tzd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzd1) && u890.j(this.a, ((tzd1) obj).a);
    }

    public final int hashCode() {
        return l1d.C(3) + (this.a.hashCode() * 31);
    }
}
