package p;

import com.spotify.player.model.command.options.TimerType;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ddu0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fdu0 b;

    public /* synthetic */ ddu0(fdu0 fdu0Var, byte b) {
        this.a = b;
        this.b = fdu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fdu0 fdu0Var = this.b;
        switch (b) {
            case 0:
                g991 g991Var = fdu0Var.l;
                if (g991Var == null) {
                    u890.C("statusHandler");
                    throw null;
                }
                g991Var.a(new wa91());
                faa0 faa0Var = fdu0Var.i;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                fdu0Var.i = fn31.T(fdu0Var.g, (o8n) null, 0, new edu0(fdu0Var, null), 3);
                return;
            default:
                TimerType.Clear clear = TimerType.clear();
                ocu0 ocu0Var = fdu0Var.a;
                faa0 faa0Var2 = ocu0Var.c;
                if (faa0Var2 != null) {
                    faa0Var2.d((CancellationException) null);
                }
                ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, clear, null), 3);
                fdu0Var.k = null;
                faa0 faa0Var3 = fdu0Var.i;
                if (faa0Var3 != null) {
                    faa0Var3.d((CancellationException) null);
                }
                g991 g991Var2 = fdu0Var.l;
                if (g991Var2 != null) {
                    g991Var2.a(va91.e);
                    return;
                } else {
                    u890.C("statusHandler");
                    throw null;
                }
        }
    }
}
