package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qmn {
    public final String a;

    public qmn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qmn) && u890.j(this.a, ((qmn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
