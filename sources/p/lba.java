package p;

import com.spotify.externalintegration.loggingservice.events.proto.ExternalAccessoryRemoteError;
import io.reactivex.rxjava3.functions.Consumer;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lba implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public lba(y390 y390Var, yh2 yh2Var, iac0 iac0Var, zok0 zok0Var) {
        this.a = (byte) 2;
        this.c = y390Var;
        this.d = yh2Var;
        this.e = iac0Var;
        this.f = zok0Var;
        this.b = new idd1(new qv61(this, (byte) 24));
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                nba nbaVar = (nba) obj4;
                nbaVar.i.a((fdc) obj6, 3, 1);
                ou80 ou80Var = (ou80) obj3;
                String str = ou80Var != null ? ou80Var.a : null;
                String str2 = ((r9c) obj2).b;
                u210 u210Var = nbaVar.j;
                String str3 = nbaVar.a.a().a;
                String message = th.getMessage();
                if (message == null) {
                    message = j2h1.I(th);
                }
                String strF = f4i1.f(str2, "|", message);
                if (str3.length() != 0 || (str != null && str.length() != 0)) {
                    t2j0 t2j0Var = u210Var.a;
                    s210 s210VarN = ExternalAccessoryRemoteError.n();
                    s210VarN.n("ui_navigate");
                    s210VarN.r(str3);
                    s210VarN.q(strF);
                    if (str != null) {
                        s210VarN.s(str);
                    }
                    t2j0Var.a(s210VarN.build());
                }
                ((iu30) obj5).invoke(z6x.a);
                break;
            case 1:
                s0w s0wVar = (s0w) obj;
                iu30 iu30Var = (iu30) obj6;
                l811 l811Var = (l811) obj3;
                idd1 idd1Var = (idd1) obj2;
                qzh qzhVar = (qzh) ((bey0) obj4).get();
                s0wVar.getClass();
                if (((Boolean) ((iu30) obj5).invoke(s0wVar)).booleanValue()) {
                    qzhVar.getView().setVisibility(0);
                    e1w e1wVar = (e1w) idd1Var.getValue();
                    String str4 = (String) iu30Var.invoke(s0wVar);
                    if (str4 == null) {
                        str4 = "";
                    }
                    qzhVar.f(e1w.a(e1wVar, str4));
                } else {
                    qzhVar.getView().setVisibility(8);
                }
                l811Var.a = true;
                break;
            case 2:
                h0w0 h0w0Var = (h0w0) obj;
                String str5 = h0w0Var.d;
                int i = p881.a[h0w0Var.e.ordinal()];
                if (i == 1) {
                    ((wr00) ((idd1) obj5).getValue()).a(str5);
                    break;
                } else if (i == 2) {
                    ((yh2) obj6).b(str5, (String) null);
                    break;
                }
                break;
            default:
                w3i1 w3i1Var = (w3i1) obj;
                ((rdo) ((ua91) obj4).d).a(new qdo((String) obj6, (String) obj3, w3i1Var.b, (String) obj2, w3i1Var.a, "music", "MUSIC_PLAYLIST", (String) obj5));
                break;
        }
    }

    public lba(bey0 bey0Var, iu30 iu30Var, iu30 iu30Var2, l811 l811Var, idd1 idd1Var) {
        this.a = (byte) 1;
        this.c = bey0Var;
        this.b = iu30Var;
        this.d = iu30Var2;
        this.e = l811Var;
        this.f = idd1Var;
    }

    public /* synthetic */ lba(byte b, Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = serializable;
        this.f = obj3;
        this.b = obj4;
    }
}
