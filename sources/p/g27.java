package p;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g27 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;

    public /* synthetic */ g27(ven0 ven0Var, ven0 ven0Var2, byte b) {
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                c380 c380Var = (c380) ven0Var2.getValue();
                if (iIntValue >= 0 && iIntValue < c380Var.size()) {
                    ((vu30) ven0Var.getValue()).invoke(c380Var.get(iIntValue), new Integer(iIntValue));
                }
                break;
            case 1:
                ven0Var2.setValue((Long) obj);
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 2:
                o091 o091Var = (o091) obj;
                if (u890.j(o091Var, new k091(e091.a))) {
                    AtomicLong atomicLong = bcn0.a;
                    ven0Var2.setValue(Boolean.TRUE);
                } else if (u890.j(o091Var, new k091(d091.a)) || u890.j(o091Var, new k091(g091.a))) {
                    AtomicLong atomicLong2 = bcn0.a;
                    ven0Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                ven0Var2.setValue((dbr0) obj);
                ven0Var.setValue(Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
