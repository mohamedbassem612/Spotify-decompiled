package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h43 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h43(iu30 iu30Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iu30Var;
        this.b = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                return new h43(ven0Var, iu30Var, lnmVar, (byte) 0);
            case 1:
                return new h43(ven0Var, iu30Var, lnmVar, (byte) 1);
            case 2:
                return new h43(iu30Var, ven0Var, lnmVar, (byte) 2);
            case 3:
                return new h43(iu30Var, ven0Var, lnmVar, (byte) 3);
            default:
                return new h43(iu30Var, ven0Var, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                dzx0 dzx0Var = (dzx0) ven0Var.getValue();
                if (dzx0Var instanceof bzx0) {
                    bzx0 bzx0Var = (bzx0) dzx0Var;
                    iu30Var.invoke(new e43(bzx0Var.a, bzx0Var.b, bzx0Var.c));
                } else if (dzx0Var instanceof czx0) {
                    iu30Var.invoke(new e43(((czx0) dzx0Var).a, null, null));
                }
                break;
            case 1:
                hm5.M(obj);
                Uri uri = ((frn) ven0Var.getValue()).a;
                if (uri != null) {
                    iu30Var.invoke(new gwk(uri));
                }
                break;
            case 2:
                hm5.M(obj);
                iu30Var.invoke(Boolean.valueOf(((String) ven0Var.getValue()) != null));
                break;
            case 3:
                hm5.M(obj);
                iu30Var.invoke(new hsa1((Float) ven0Var.getValue()));
                break;
            default:
                hm5.M(obj);
                if (!yr80.b(((yr80) ven0Var.getValue()).a, 0L)) {
                    iu30Var.invoke(new pz((int) (((yr80) ven0Var.getValue()).a >> 32)));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h43(ven0 ven0Var, iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ven0Var;
        this.c = iu30Var;
    }
}
