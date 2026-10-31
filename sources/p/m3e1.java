package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m3e1 extends e3e1 {
    public final String b;
    public final int c;
    public final iu30 d;

    public m3e1(Object obj, String str, int i, iu30 iu30Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = iu30Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return gvg.j(sb, this.c, ")");
    }
}
