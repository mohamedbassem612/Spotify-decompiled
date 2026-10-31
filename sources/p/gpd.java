package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gpd implements f2q0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ apd c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ouk0 e;

    public /* synthetic */ gpd(xu30 xu30Var, apd apdVar, int i, ouk0 ouk0Var, byte b) {
        this.a = b;
        this.b = xu30Var;
        this.c = apdVar;
        this.d = i;
        this.e = ouk0Var;
    }

    public final void onClick() {
        byte b = this.a;
        ouk0 ouk0Var = this.e;
        int i = this.d;
        apd apdVar = this.c;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                xu30Var.invoke(apdVar, Integer.valueOf(i), ouk0Var);
                break;
            default:
                xu30Var.invoke(apdVar, Integer.valueOf(i), ouk0Var);
                break;
        }
    }
}
