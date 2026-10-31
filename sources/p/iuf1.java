package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iuf1 implements o5s {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public iuf1(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
    }

    public final void onPause(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                r091 r091Var = (r091) ven0Var.getValue();
                if (r091Var != null) {
                    r091Var.d();
                }
                r091 r091Var2 = (r091) ven0Var.getValue();
                if (r091Var2 != null) {
                    r091Var2.j();
                }
                ((abu0) obj2).b((zau0) obj);
                break;
            default:
                ven0Var.setValue(Boolean.valueOf(((ven0) obj2).getValue() instanceof xqj1));
                uoa uoaVar = (uoa) ((ven0) obj).getValue();
                if (uoaVar != null) {
                    uoaVar.f();
                }
                break;
        }
    }

    public final void onResume(iac0 iac0Var) {
        uoa uoaVar;
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((abu0) this.c).a((zau0) obj);
                break;
            default:
                ven0 ven0Var = this.b;
                if (((Boolean) ven0Var.getValue()).booleanValue() && (uoaVar = (uoa) ((ven0) obj).getValue()) != null) {
                    uoaVar.l();
                }
                ven0Var.setValue(Boolean.FALSE);
                break;
        }
    }

    public iuf1(abu0 abu0Var, zau0 zau0Var, ven0 ven0Var) {
        this.c = abu0Var;
        this.d = zau0Var;
        this.b = ven0Var;
    }
}
