package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tox0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sox0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tox0(sox0 sox0Var, byte b) {
        super(1);
        this.a = b;
        this.b = sox0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        sox0 sox0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                bpb1 bpb1Var = sox0Var.a;
                wox0 wox0Var = wox0.f;
                if (iIntValue != 0 && iIntValue != 1) {
                    if (iIntValue == 2) {
                        wox0Var = wox0.c;
                    } else if (iIntValue != 3) {
                        wox0 wox0Var2 = wox0.e;
                        if (iIntValue != 4) {
                            n57.e("Unknown dismiss event: " + iIntValue);
                        }
                        wox0Var = wox0Var2;
                    } else {
                        wox0Var = wox0.d;
                    }
                }
                bpb1Var.m((Object) null, wox0Var);
                break;
            default:
                sox0Var.a.m((Object) null, ((Boolean) obj).booleanValue() ? wox0.b : wox0.g);
                break;
        }
        return rih1Var;
    }
}
