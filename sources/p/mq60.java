package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mq60 implements nq60 {
    public final String a;

    public mq60(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mq60) && this.a.equals(((mq60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
