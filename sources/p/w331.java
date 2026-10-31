package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w331 extends x331 {
    public final String a;

    public w331(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w331) && u890.j(this.a, ((w331) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
