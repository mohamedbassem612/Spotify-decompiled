package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class onw implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pnw b;

    public /* synthetic */ onw(pnw pnwVar, byte b) {
        this.a = b;
        this.b = pnwVar;
    }

    public final Object apply(Object obj) {
        sn21 sn21VarC;
        byte b = this.a;
        pnw pnwVar = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    return Observable.just(rnw.a);
                }
                l841 l841Var = pnwVar.c;
                return l841Var.a().flatMap(new thn(l841Var, (byte) 22)).flatMap(new onw(pnwVar, (byte) 1)).onErrorResumeNext(new n9v((byte) 7));
            default:
                j741 j741Var = (k741) obj;
                if (j741Var instanceof i741) {
                    return Observable.just(new snw(((i741) j741Var).a));
                }
                yfu yfuVar = pnwVar.b;
                jf01 jf01VarA = null;
                try {
                    String strB = ((nfa0) yfuVar.c).b(wnw.Companion.serializer(), new wnw(j741Var.a));
                    se11 se11Var = r8i0.e;
                    sn21VarC = zov0.c(strB, bmq0.w("application/json"));
                    break;
                } catch (Exception e) {
                    Logger.e(e, "Failed to make request", new Object[0]);
                    sn21VarC = null;
                }
                if (sn21VarC != null) {
                    cxc cxcVarC = ((w5b1) yfuVar.b).c.c();
                    ne neVar = new ne((byte) 9);
                    neVar.e0("https://partner-accounts.spotify.com/v0/login/user-profile");
                    ((t360) neVar.c).g("Content-Encoding", "identity");
                    neVar.L("POST", sn21VarC);
                    jf01VarA = cxcVarC.a(new ln21(neVar));
                }
                return (jf01VarA == null ? Observable.error(new Exception("Failed to create request")) : Observable.create(new mjv(jf01VarA, (byte) 2))).map(new mev(yfuVar, (byte) 2)).map(new n9v((byte) 6));
        }
    }
}
