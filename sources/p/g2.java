package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g2 implements gfh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;
    public final /* synthetic */ hdn0 c;

    public /* synthetic */ g2(hdn0 hdn0Var, hdn0 hdn0Var2, byte b) {
        this.a = b;
        this.b = hdn0Var;
        this.c = hdn0Var2;
    }

    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((afh0) list.get(1)).d(i);
    }

    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((afh0) list.get(1)).C(i);
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m132measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        err0 err0Var = this.b;
        err0 err0Var2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                q5t0 q5t0VarH = ((afh0) list.get(0)).H(jjl.b(0, 0, 0, 0, 15));
                err0 err0Var3 = err0Var;
                if (q5t0VarH.a != err0Var3.s()) {
                    err0Var3.t(q5t0VarH.a);
                }
                err0 err0Var4 = err0Var2;
                if (q5t0VarH.b != err0Var4.s()) {
                    err0Var4.t(q5t0VarH.b);
                }
                q5t0 q5t0VarH2 = ((afh0) list.get(1)).H(j);
                return ifh0Var.S(q5t0VarH2.a, q5t0VarH2.b, b7xVar, new f2(q5t0VarH2, (byte) 0));
            case 1:
                q5t0 q5t0VarH3 = ((afh0) list.get(0)).H(jjl.b(0, 0, 0, 0, 15));
                err0 err0Var5 = err0Var;
                if (q5t0VarH3.a != err0Var5.s()) {
                    err0Var5.t(q5t0VarH3.a);
                }
                err0 err0Var6 = err0Var2;
                if (q5t0VarH3.b != err0Var6.s()) {
                    err0Var6.t(q5t0VarH3.b);
                }
                q5t0 q5t0VarH4 = ((afh0) list.get(1)).H(j);
                return ifh0Var.S(q5t0VarH4.a, q5t0VarH4.b, b7xVar, new f2(q5t0VarH4, (byte) 3));
            case 2:
                q5t0 q5t0VarH5 = ((afh0) list.get(0)).H(jjl.b(0, 0, 0, 0, 15));
                err0 err0Var7 = err0Var;
                if (q5t0VarH5.a != err0Var7.s()) {
                    err0Var7.t(q5t0VarH5.a);
                }
                err0 err0Var8 = err0Var2;
                if (q5t0VarH5.b != err0Var8.s()) {
                    err0Var8.t(q5t0VarH5.b);
                }
                q5t0 q5t0VarH6 = ((afh0) list.get(1)).H(j);
                return ifh0Var.S(q5t0VarH6.a, q5t0VarH6.b, b7xVar, new f2(q5t0VarH6, (byte) 13));
            default:
                q5t0 q5t0VarH7 = ((afh0) list.get(0)).H(jjl.b(0, 0, 0, 0, 15));
                err0 err0Var9 = err0Var;
                if (q5t0VarH7.a != err0Var9.s()) {
                    err0Var9.t(q5t0VarH7.a);
                }
                err0 err0Var10 = err0Var2;
                if (q5t0VarH7.b != err0Var10.s()) {
                    err0Var10.t(q5t0VarH7.b);
                }
                q5t0 q5t0VarH8 = ((afh0) list.get(1)).H(j);
                return ifh0Var.S(q5t0VarH8.a, q5t0VarH8.b, b7xVar, new f2(q5t0VarH8, (byte) 14));
        }
    }

    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((afh0) list.get(1)).n(i);
    }

    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((afh0) list.get(1)).w(i);
    }
}
