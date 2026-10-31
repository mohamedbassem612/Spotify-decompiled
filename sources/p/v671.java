package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v671 implements o5s {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public final /* synthetic */ Object c;

    public v671(ven0 ven0Var, ven0 ven0Var2) {
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final void onPause(iac0 iac0Var) {
        xab1 xab1Var;
        switch (this.a) {
            case 0:
                xab1 xab1Var2 = (xab1) this.b;
                if (xab1Var2 != null && !xab1Var2.isCancelled() && (xab1Var = (xab1) this.b) != null) {
                    xab1Var.d((CancellationException) null);
                    break;
                }
                break;
            default:
                ((ven0) this.b).setValue(Boolean.TRUE);
                break;
        }
    }

    public final void onResume(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                im0 im0Var = (im0) obj;
                this.b = fn31.T(smo1.e((q8n) im0Var.h), (o8n) null, 0, new b751(im0Var, (lnm) null, (byte) 12), 3);
                break;
            default:
                ven0 ven0Var = (ven0) this.b;
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.booleanValue();
                ((ven0) obj).setValue(bool);
                ven0Var.setValue(Boolean.FALSE);
                break;
        }
    }

    public v671(im0 im0Var) {
        this.c = im0Var;
    }
}
