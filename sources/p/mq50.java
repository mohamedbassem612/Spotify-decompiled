package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mq50 {
    public final String a;

    public mq50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq50) && u890.j(this.a, ((mq50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
