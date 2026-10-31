package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class npo extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ upo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ npo(upo upoVar, byte b) {
        super(1);
        this.a = b;
        this.b = upoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        upo upoVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kd31 kd31Var = (kd31) obj;
                kd31Var.E(upoVar.a.s());
                kd31Var.b(((Boolean) upoVar.g.getValue()).booleanValue() ? 1.0f : 0.0f);
                break;
            case 1:
                int i = (int) (((yr80) obj).a & 4294967295L);
                int iD = upoVar.d();
                hrr0 hrr0Var = upoVar.g;
                if (i != iD) {
                    upoVar.c.setValue(Integer.valueOf(i));
                    if (i > 0) {
                        hrr0Var.setValue(Boolean.TRUE);
                    }
                    if (!((Boolean) upoVar.b.getValue()).booleanValue()) {
                        wy71 wy71VarC = upoVar.c();
                        upoVar.f.setValue(wy71VarC);
                        upoVar.a.t(upoVar.g(wy71VarC));
                        if (upoVar.d() > 0) {
                            hrr0Var.setValue(Boolean.TRUE);
                        }
                    }
                }
                break;
            default:
                upoVar.b(((Number) obj).floatValue());
                break;
        }
        return rih1Var;
    }
}
