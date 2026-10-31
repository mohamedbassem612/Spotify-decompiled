package p;

import android.view.ViewGroup;
import com.spotify.messages.PushPermissionRequestStatus;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromPublisher;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hso0 implements byf0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public hso0(on01 on01Var) {
        this.a = (byte) 1;
        this.b = on01Var;
        this.c = new rku();
    }

    public final void c() {
        switch (this.a) {
            case 0:
                jms0 jms0Var = (jms0) this.c;
                jms0Var.b.m((Object) null, jms0Var.a.m());
                nto0 nto0Var = (nto0) this.b;
                dma1 dma1Var = nto0Var.a.a;
                bma1 bma1Var = ims0.b;
                boolean zH = dma1Var.h(bma1Var, false);
                bma1 bma1Var2 = ims0.c;
                boolean zH2 = dma1Var.h(bma1Var2, false);
                bma1 bma1Var3 = ims0.d;
                String strK = dma1Var.k(bma1Var3);
                bma1 bma1Var4 = ims0.e;
                String strK2 = dma1Var.k(bma1Var4);
                bma1 bma1Var5 = ims0.f;
                String strK3 = dma1Var.k(bma1Var5);
                bma1 bma1Var6 = ims0.g;
                String strK4 = dma1Var.k(bma1Var6);
                bma1 bma1Var7 = ims0.h;
                String strK5 = dma1Var.k(bma1Var7);
                if (zH2 && zH) {
                    dma1 dma1Var2 = nto0Var.d;
                    xxy0.a.getClass();
                    String strE = dma1Var2.e(wxy0.b, "");
                    if (strE == null) {
                        strE = "";
                    }
                    String string = strE.length() == 0 ? "" : UUID.nameUUIDFromBytes(strE.getBytes(StandardCharsets.UTF_8)).toString();
                    by40 by40Var = nto0Var.b;
                    Locale locale = Locale.ROOT;
                    String lowerCase = strK3.toLowerCase(locale);
                    String lowerCase2 = strK.toLowerCase(locale);
                    String lowerCase3 = nto0Var.c.m().a.toLowerCase(locale);
                    String lowerCase4 = strK4.toLowerCase(locale);
                    String lowerCase5 = strK5.toLowerCase(locale);
                    t2j0 t2j0Var = by40Var.a;
                    ixy0 ixy0VarN = PushPermissionRequestStatus.n();
                    ixy0VarN.s(strK2);
                    ixy0VarN.r(lowerCase);
                    ixy0VarN.u(lowerCase2);
                    ixy0VarN.t(lowerCase3);
                    ixy0VarN.v(lowerCase4);
                    ixy0VarN.q(lowerCase5);
                    ixy0VarN.n(string);
                    t2j0Var.a(ixy0VarN.build());
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.a(bma1Var, false);
                    hma1VarEdit.a(bma1Var2, false);
                    hma1VarEdit.d(bma1Var3, "");
                    hma1VarEdit.d(bma1Var4, "");
                    hma1VarEdit.d(bma1Var5, "");
                    hma1VarEdit.d(bma1Var6, "");
                    hma1VarEdit.d(bma1Var7, "");
                    hma1VarEdit.g();
                    break;
                }
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                hma1 hma1VarEdit = ((nto0) this.b).a.a.edit();
                hma1VarEdit.a(ims0.b, true);
                hma1VarEdit.g();
                break;
            default:
                ((rku) this.c).a();
                break;
        }
    }

    public final void g(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                break;
            default:
                rku rkuVar = (rku) this.c;
                on01 on01Var = (on01) this.b;
                on01Var.getClass();
                Flowable flowableV = j2h1.D(o6x.a, new vse0(on01Var, (lnm) null, (byte) 15)).v();
                Predicate predicate = Functions.h;
                rkuVar.b(new CompletableFromPublisher(flowableV.R(1L, predicate)).o(predicate).subscribe());
                break;
        }
    }

    public hso0(nto0 nto0Var, jms0 jms0Var) {
        this.a = (byte) 0;
        this.b = nto0Var;
        this.c = jms0Var;
    }

    private final void b() {
    }

    private final void a(ViewGroup viewGroup) {
    }
}
