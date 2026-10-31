package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w970 implements e670 {
    public static final rm5 a = new rm5(gb70.class, z470.getId());
    public static final rm5 b = new rm5(k970.class, z470.getId());
    public static final rm5 c = new rm5(bc70.class, z470.getId());
    public static final rm5 d = new rm5(u970.class, z470.getId());

    public final int h(y570 y570Var) {
        y570Var.getClass();
        String strA = y570Var.h().a();
        spq0 spq0VarG = a.G(strA);
        if (spq0VarG.c()) {
            return ((gb70) spq0VarG.b()).h(y570Var);
        }
        spq0 spq0VarG2 = b.G(strA);
        if (spq0VarG2.c()) {
            return ((k970) spq0VarG2.b()).h(y570Var);
        }
        spq0 spq0VarG3 = c.G(strA);
        if (spq0VarG3.c()) {
            return ((bc70) spq0VarG3.b()).h(y570Var);
        }
        spq0 spq0VarG4 = d.G(strA);
        if (spq0VarG4.c()) {
            return ((u970) spq0VarG4.b()).h(y570Var);
        }
        return 0;
    }
}
