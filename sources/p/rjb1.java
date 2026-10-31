package p;

import com.spotify.libs.sociallistening.events.proto.JamSessionCreationResult;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rjb1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sjb1 b;
    public final /* synthetic */ pjb1 c;

    public /* synthetic */ rjb1(sjb1 sjb1Var, pjb1 pjb1Var, byte b) {
        this.a = b;
        this.b = sjb1Var;
        this.c = pjb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void accept(Object obj) {
        byte b = this.a;
        pjb1 pjb1Var = this.c;
        sjb1 sjb1Var = this.b;
        switch (b) {
            case 0:
                cpr cprVar = sjb1Var.c;
                String strA = pjb1Var.a();
                String str = ((pp90) obj).a;
                j1a0 j1a0VarN = JamSessionCreationResult.n();
                j1a0VarN.n(strA);
                j1a0VarN.r(str);
                cprVar.a.a(j1a0VarN.build());
                break;
            default:
                Throwable th = (Throwable) obj;
                cpr cprVar2 = sjb1Var.c;
                String strA2 = pjb1Var.a();
                String str2 = "UNKNOWN";
                if (th instanceof gon) {
                    gon gonVar = (gon) th;
                    if (gonVar.equals(con.a)) {
                        str2 = "OFFLINE";
                    } else if (gonVar.equals(don.a)) {
                        str2 = "TIMEOUT";
                    } else if (!gonVar.equals(eon.a)) {
                        if (!(gonVar instanceof fon)) {
                            eg.o();
                        } else {
                            fon fonVar = (fon) th;
                            str2 = fonVar.a + ":" + fonVar.b;
                        }
                    }
                } else if (th instanceof TimeoutException) {
                    str2 = "TIMEOUT";
                }
                j1a0 j1a0VarN2 = JamSessionCreationResult.n();
                j1a0VarN2.n(strA2);
                j1a0VarN2.q(str2);
                cprVar2.a.a(j1a0VarN2.build());
                break;
        }
    }
}
