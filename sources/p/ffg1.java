package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ffg1 implements hfg1 {
    public final String a;

    public ffg1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffg1) && u890.j(this.a, ((ffg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(4) * 31);
    }
}
