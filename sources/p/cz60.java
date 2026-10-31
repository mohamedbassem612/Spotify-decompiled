package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cz60 implements oz60 {
    public final String a;

    public cz60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz60) && u890.j(this.a, ((cz60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
