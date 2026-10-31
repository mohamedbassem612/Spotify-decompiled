package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d860 {
    public static final d860 d;
    public static final d860 e;
    public final boolean a;
    public final b860 b;
    public final c860 c;

    static {
        b860 b860Var = b860.d;
        c860 c860Var = c860.b;
        d = new d860(false, b860Var, c860Var);
        e = new d860(true, b860Var, c860Var);
    }

    public d860(boolean z, b860 b860Var, c860 c860Var) {
        this.a = z;
        this.b = b860Var;
        this.c = c860Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
