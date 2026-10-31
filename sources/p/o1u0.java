package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o1u0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t1u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ o1u0(t1u0 t1u0Var, String str, String str2, byte b) {
        this.a = b;
        this.b = t1u0Var;
        this.c = str;
        this.d = str2;
    }

    public final void run() {
        jo11 jo11Var;
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        t1u0 t1u0Var = this.b;
        switch (b) {
            case 0:
                gae gaeVar = t1u0Var.d;
                String strA = t1u0Var.a();
                str.getClass();
                jo11 jo11VarE = gaeVar.e(str2);
                jo11Var = jo11VarE instanceof ias0 ? (ias0) jo11VarE : null;
                if (jo11Var != null) {
                    jo11Var.f(strA, str);
                }
                break;
            case 1:
                gae gaeVar2 = t1u0Var.d;
                String strA2 = t1u0Var.a();
                str.getClass();
                jo11 jo11VarE2 = gaeVar2.e(str2);
                jo11Var = jo11VarE2 instanceof ias0 ? (ias0) jo11VarE2 : null;
                if (jo11Var != null) {
                    jo11Var.h(strA2, str);
                }
                break;
            case 2:
                gae gaeVar3 = t1u0Var.d;
                String strA3 = t1u0Var.a();
                str.getClass();
                jo11 jo11VarE3 = gaeVar3.e(str2);
                jo11Var = jo11VarE3 instanceof jo11 ? jo11VarE3 : null;
                if (jo11Var != null) {
                    jo11Var.e(strA3);
                }
                break;
            default:
                gae gaeVar4 = t1u0Var.d;
                String strA4 = t1u0Var.a();
                str.getClass();
                rjo0 rjo0VarE = gaeVar4.e(str2);
                jo11Var = rjo0VarE instanceof jo11 ? (jo11) rjo0VarE : null;
                if (jo11Var != null) {
                    jo11Var.b(strA4);
                }
                break;
        }
    }
}
