package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zr1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ c380 c;

    public /* synthetic */ zr1(vr20 vr20Var, c380 c380Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = c380Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        yr1 yr1Var;
        xuy xuyVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c380 c380Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (lnmVar instanceof yr1) {
                    yr1Var = (yr1) lnmVar;
                    int i = yr1Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yr1Var.b = i - Integer.MIN_VALUE;
                    } else {
                        yr1Var = new yr1(this, lnmVar);
                    }
                } else {
                    yr1Var = new yr1(this, lnmVar);
                }
                Object obj2 = yr1Var.a;
                int i2 = yr1Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Set setM0 = z561.m0(new sgg1(im1.V0, z561.f0(new xr1(c380Var, (byte) 0), new sgg1(im1.U0, z561.T(im1.T0, new i46((List) obj, (byte) 1))))));
                    yr1Var.b = 1;
                    return vr20Var.emit(setM0, yr1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof xuy) {
                    xuyVar = (xuy) lnmVar;
                    int i3 = xuyVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xuyVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        xuyVar = new xuy(this, lnmVar);
                    }
                } else {
                    xuyVar = new xuy(this, lnmVar);
                }
                Object obj3 = xuyVar.a;
                int i4 = xuyVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                md0 md0Var = (md0) obj;
                Integer num = new Integer(c380Var.indexOf(md0Var != null ? md0Var.a() : null));
                Integer num2 = num.intValue() != -1 ? num : null;
                if (num2 == null) {
                    return rih1Var;
                }
                xuyVar.b = 1;
                return vr20Var.emit(num2, xuyVar) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
