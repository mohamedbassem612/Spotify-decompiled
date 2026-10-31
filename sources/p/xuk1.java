package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xuk1 implements yuk1 {
    public final String a;

    public xuk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuk1) && this.a.equals(((xuk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
