package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vyo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ vyo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public static ovu b(vyo vyoVar, wxu wxuVar, List list) {
        fns fnsVar = igu.a;
        return vyoVar.a(wxuVar, list, pyf0.a);
    }

    public final ovu a(wxu wxuVar, List list, o8n o8nVar) {
        byte b = this.a;
        d7p d7pVar = this.b;
        switch (b) {
            case 0:
                ezo ezoVar = (ezo) ((fwo) d7pVar).c;
                return new ovu(wxuVar, list, o8nVar, ezoVar.z, ezoVar.A);
            case 1:
                u9p u9pVar = (u9p) d7pVar.c;
                return new ovu(wxuVar, list, o8nVar, u9pVar.T, u9pVar.U);
            case 2:
                f0a f0aVar = (f0a) d7pVar.c;
                return new ovu(wxuVar, list, o8nVar, (d7p) f0aVar.c, (d7p) f0aVar.d);
            case 3:
                nap napVar = (nap) d7pVar.c;
                return new ovu(wxuVar, list, o8nVar, napVar.M0, napVar.N0);
            case 4:
                nb3 nb3Var = (nb3) ((chp) d7pVar).c;
                return new ovu(wxuVar, list, o8nVar, (chp) nb3Var.f, (chp) nb3Var.g);
            default:
                h72 h72Var = (h72) ((ykq) d7pVar).c;
                return new ovu(wxuVar, list, o8nVar, (ykq) h72Var.g, (ykq) h72Var.h);
        }
    }
}
