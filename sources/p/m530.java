package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m530 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m530(byte b, Object obj, String str, boolean z) {
        this.a = b;
        this.d = obj;
        this.b = str;
        this.c = z;
    }

    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        String str = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                r630 r630Var = (r630) ((zsc) obj).c;
                i430 i430VarC = r630Var.c(str);
                if (i430VarC == null) {
                    r630Var.a(new i430(0, 0, this.b, this.c, false));
                } else if (i430VarC.b != z) {
                    r630Var.k(str, z);
                }
                break;
            default:
                ((pf81) obj).e.onNext(new mmr0(str, Boolean.valueOf(z)));
                break;
        }
    }
}
