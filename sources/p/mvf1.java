package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mvf1 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ fai0 c;
    public final /* synthetic */ l811 d;

    public /* synthetic */ mvf1(l811 l811Var, fai0 fai0Var, l811 l811Var2, byte b) {
        this.a = b;
        this.b = l811Var;
        this.c = fai0Var;
        this.d = l811Var2;
    }

    public final void b(Object obj) {
        byte b = this.a;
        lvf1 lvf1Var = ttt0.a;
        lvf1 lvf1Var2 = ttt0.b;
        lvf1 lvf1VarA = null;
        boolean z = false;
        l811 l811Var = this.d;
        fai0 fai0Var = this.c;
        l811 l811Var2 = this.b;
        switch (b) {
            case 0:
                vtt0 vtt0Var = (wtt0) obj;
                vtt0Var.getClass();
                vtt0 vtt0Var2 = vtt0Var instanceof vtt0 ? vtt0Var : null;
                lvf1VarA = vtt0Var2 != null ? vtt0Var2.a : null;
                boolean z2 = lvf1VarA == lvf1Var || lvf1VarA == lvf1Var2;
                l811Var2.a = z2;
                if (l811Var.a && z2) {
                    z = true;
                }
                fai0Var.m(Boolean.valueOf(z));
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                l811Var2.a = bool.booleanValue();
                if (bool.booleanValue() && l811Var.a) {
                    z = true;
                }
                fai0Var.m(Boolean.valueOf(z));
                break;
            case 2:
                vtt0 vtt0Var3 = (wtt0) obj;
                vtt0 vtt0Var4 = vtt0Var3 instanceof vtt0 ? vtt0Var3 : null;
                lvf1 lvf1Var3 = vtt0Var4 != null ? vtt0Var4.a : null;
                vtt0Var3.getClass();
                vtt0 vtt0Var5 = vtt0Var3 instanceof vtt0 ? vtt0Var3 : null;
                lvf1 lvf1Var4 = vtt0Var5 != null ? vtt0Var5.a : null;
                l811Var2.a = lvf1Var4 == lvf1Var || lvf1Var4 == lvf1Var2;
                lvf1 lvf1Var5 = (lvf1) fai0Var.e();
                if (lvf1Var5 != null) {
                    lvf1VarA = lvf1.a(lvf1Var5, false, vtt0Var3 instanceof utt0, lvf1Var3 == ttt0.e, lvf1Var3 == lvf1Var2, l811Var.a && l811Var2.a, 1);
                }
                fai0Var.m(lvf1VarA);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                l811Var2.a = bool2.booleanValue();
                lvf1 lvf1Var6 = (lvf1) fai0Var.e();
                if (lvf1Var6 != null) {
                    lvf1VarA = lvf1.a(lvf1Var6, false, false, false, false, bool2.booleanValue() && l811Var.a, 15);
                }
                fai0Var.m(lvf1VarA);
                break;
        }
    }
}
