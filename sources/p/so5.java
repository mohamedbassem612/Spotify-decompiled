package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class so5 implements rij0 {
    public final int a;
    public final String b;

    public so5(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return l1d.n(this.b, ")", sb);
    }
}
