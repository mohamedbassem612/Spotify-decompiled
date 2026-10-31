package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fks0 implements Consumer {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public fks0(p811 p811Var, gks0 gks0Var, ohv0 ohv0Var, yqg yqgVar, nhc nhcVar) {
        this.b = p811Var;
        this.c = gks0Var;
        this.d = ohv0Var;
        this.e = yqgVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((gks0) obj4).getClass();
                ((p811) obj5).a = gks0.a((ohv0) obj3, (yqg) obj2, u2g1.b);
                break;
            default:
                il91 il91Var = (il91) obj5;
                il91Var.g.c(new hw9((rig) obj4, il91Var, (String) obj3, (li91) obj2, (byte) 15));
                break;
        }
    }

    public fks0(il91 il91Var, rig rigVar, String str, li91 li91Var) {
        this.b = il91Var;
        this.c = rigVar;
        this.d = str;
        this.e = li91Var;
    }
}
