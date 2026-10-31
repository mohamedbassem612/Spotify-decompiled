package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zpa extends lap1 {
    public final on71 c;

    public zpa(on71 on71Var) {
        this.c = on71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zpa) && this.c.equals(((zpa) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
