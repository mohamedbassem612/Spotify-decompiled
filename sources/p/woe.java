package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class woe extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ y7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woe(y7e1 y7e1Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.c = y7e1Var;
        this.b = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        y7e1 y7e1Var = this.c;
        String str = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new woe(str, y7e1Var, lnmVar, (byte) 0);
            case 1:
                return new woe(str, y7e1Var, lnmVar, (byte) 1);
            case 2:
                return new woe(str, y7e1Var, lnmVar, (byte) 2);
            case 3:
                return new woe(y7e1Var, str, lnmVar);
            default:
                return new woe(str, y7e1Var, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
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
        y7e1 y7e1Var = this.c;
        String str = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                if (!u890.j(str, y7e1Var.d().d.toString())) {
                    c4p1.E(str, y7e1Var);
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                if (str != null && str.length() != 0 && y7e1Var.d().d.length() == 0) {
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        h4e1VarH.k(0, h4e1VarH.c.length(), str);
                        y7e1Var.a(h4e1VarH);
                    } finally {
                        y7e1Var.c();
                    }
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                if (str.length() == 0 && y7e1Var.d().d.length() > 0) {
                    c4p1.E("", y7e1Var);
                } else if (y7e1Var.d().d.length() == 0 && str.length() > 0) {
                    c4p1.E(str, y7e1Var);
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                if (!u890.j(y7e1Var.d().d.toString(), str)) {
                    h4e1 h4e1VarH2 = y7e1Var.h();
                    try {
                        h4e1VarH2.k(0, h4e1VarH2.c.length(), str);
                        y7e1Var.a(h4e1VarH2);
                    } finally {
                        y7e1Var.c();
                    }
                }
                return rih1Var;
            default:
                hm5.M(obj);
                if (!u890.j(str, y7e1Var.d().d.toString())) {
                    c4p1.E(str, y7e1Var);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ woe(String str, y7e1 y7e1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = str;
        this.c = y7e1Var;
    }
}
