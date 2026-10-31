package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ecq0 implements jcq0 {
    public final String a;

    public ecq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecq0) && u890.j(this.a, ((ecq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
