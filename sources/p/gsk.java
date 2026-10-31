package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gsk implements f2q0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ utj b;
    public final /* synthetic */ apd c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ouk0 e;

    public /* synthetic */ gsk(utj utjVar, apd apdVar, int i, ouk0 ouk0Var, byte b) {
        this.a = b;
        this.b = utjVar;
        this.c = apdVar;
        this.d = i;
        this.e = ouk0Var;
    }

    @Override // p.f2q0
    public final void onClick() {
        byte b = this.a;
        ouk0 ouk0Var = this.e;
        int i = this.d;
        apd apdVar = this.c;
        utj utjVar = this.b;
        switch (b) {
            case 0:
                utjVar.c.invoke(apdVar, Integer.valueOf(i), ouk0Var);
                break;
            default:
                utjVar.c.invoke(apdVar, Integer.valueOf(i), ouk0Var);
                break;
        }
    }
}
