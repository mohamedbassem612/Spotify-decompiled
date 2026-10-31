package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z7u0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ a8u0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7u0(Object obj, a8u0 a8u0Var, byte b) {
        super(obj);
        this.b = b;
        this.c = a8u0Var;
    }

    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        byte b = this.b;
        a8u0 a8u0Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                y7u0 y7u0Var = (y7u0) obj2;
                y7u0 y7u0Var2 = (y7u0) obj;
                if (!u890.j(y7u0Var2, y7u0Var)) {
                    boolean z = y7u0Var2.a;
                    int i = y7u0Var2.b;
                    if (!z && i > 0 && y7u0Var.a) {
                        a8u0Var.Y("player_volume_change", co0.MUTED);
                        break;
                    } else if (!z && i > 0 && y7u0Var.b <= 0) {
                        a8u0Var.Y("system_volume_change", co0.MUTED);
                        break;
                    } else {
                        if (!((i > 0) ^ z) && z && !y7u0Var.a) {
                            a8u0Var.Y("player_volume_change", co0.UNMUTED);
                            break;
                        } else {
                            if (!(z ^ (i > 0)) && i <= 0 && y7u0Var.b > 0) {
                                a8u0Var.Y("system_volume_change", co0.UNMUTED);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                z7u0 z7u0Var = a8u0Var.z1;
                int iIntValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != iIntValue) {
                    a8u0Var.Y("system_volume_change", co0.VOLUME_CHANGE);
                }
                mma0[] mma0VarArr = a8u0.B1;
                mma0 mma0Var2 = mma0VarArr[0];
                y7u0 y7u0Var3 = (y7u0) ((sgp0) z7u0Var).a;
                boolean z2 = y7u0Var3.a;
                y7u0Var3.getClass();
                z7u0Var.c(mma0VarArr[0], a8u0Var, new y7u0(iIntValue, z2));
                break;
        }
    }
}
