package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ar2 implements dr2 {
    public final String a;

    public ar2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ar2) && this.a.equals(((ar2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
