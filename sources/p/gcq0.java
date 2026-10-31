package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gcq0 implements jcq0 {
    public final String a;

    public gcq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcq0) && u890.j(this.a, ((gcq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
