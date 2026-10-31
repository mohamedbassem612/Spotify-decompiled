package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r981 extends s981 {
    public final String a;

    public r981(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r981) && u890.j(this.a, ((r981) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
