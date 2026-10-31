package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ mjl0 c;

    public lvl0(mjl0 mjl0Var, String str, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = mjl0Var;
                x6h1 x6h1VarC = mjl0Var.b.c();
                x6h1VarC.i.add(new a7h1("online_results", (String) null, (Integer) null, (String) null, str));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 4:
                this.c = mjl0Var;
                x6h1 x6h1VarC2 = mjl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("podcasts_and_episodes", (String) null, (Integer) null, (String) null, str));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = mjl0Var;
                x6h1 x6h1VarC3 = mjl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("autocomplete_results", (String) null, (Integer) null, (String) null, str));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                break;
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                break;
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var5 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public lvl0(mjl0 mjl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.c = mjl0Var;
                x6h1 x6h1VarC = mjl0Var.b.c();
                x6h1VarC.i.add(new a7h1("offline_results", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = mjl0Var;
                x6h1 x6h1VarC2 = mjl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("initial_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }
}
