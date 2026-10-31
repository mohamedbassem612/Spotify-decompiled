package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zai1 implements abi1 {
    public final String a;

    public zai1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zai1) && this.a.equals(((zai1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
