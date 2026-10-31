package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sey0 implements ruh0 {
    public final /* synthetic */ byte a;
    public final ruh0 b;
    public final iu30 c;

    public /* synthetic */ sey0(ruh0 ruh0Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = ruh0Var;
        this.c = iu30Var;
    }

    public final yrw a(Object obj, Object obj2) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        ruh0 ruh0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ruh0Var.a(iu30Var.invoke(obj), obj2);
    }

    public final f4r b() {
        byte b = this.a;
        iu30 iu30Var = this.c;
        ruh0 ruh0Var = this.b;
        switch (b) {
            case 0:
                f4r f4rVarB = ruh0Var.b();
                if (f4rVarB != null) {
                    return new i4r(f4rVarB, iu30Var);
                }
                return null;
            default:
                f4r f4rVarB2 = ruh0Var.b();
                if (f4rVarB2 != null) {
                    return new h4r(f4rVarB2, iu30Var);
                }
                return null;
        }
    }
}
