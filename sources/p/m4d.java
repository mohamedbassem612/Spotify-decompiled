package p;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.notifications.permissions.uiusecases.permissionscard.PermissionsCard$Events;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m4d extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4d(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    public final Object invoke(Object obj) {
        String str;
        String str2;
        t7q0 f7q0Var;
        vub1 sub1Var;
        wuf wufVar;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((qtr) obj).b(new lu((qj0) obj2, (lnm) null, (byte) 12));
                return rih1Var;
            case 1:
                b261.n((e261) obj, ((x5d) obj2).e);
                return rih1Var;
            case 2:
                elb0 elb0Var = (elb0) obj;
                n511 n511VarM = nho1.v(elb0Var).M(elb0Var, true);
                float f = n511VarM.b;
                ((kjd) obj2).a.setValue(new ejd(f, n511VarM.d - f));
                return rih1Var;
            case 3:
                Boolean boolL = yto.l((String) obj);
                if (boolL != null) {
                    return new huz(Boolean.valueOf(!boolL.booleanValue()), (byte) 10);
                }
                xzb0 xzb0Var = (xzb0) ((cab) obj2).c;
                return rqt0.u(u4p1.b0(new zx60(xzb0Var.a.q(xzb0.b), (byte) 11), new ss90(xzb0Var, (lnm) null, (byte) 14)));
            case 4:
                d441 d441VarG1 = ((y341) obj).g1("SELECT * FROM message_id_and_capping");
                try {
                    int iW = y7y0.w(d441VarG1, "messageKey");
                    int iW2 = y7y0.w(d441VarG1, "capping");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG1.f1()) {
                        arrayList.add(new k0j0(d441VarG1.P0(iW), ((kmd) ((nmd) obj2).c.getValue()).a(d441VarG1.isNull(iW2) ? null : d441VarG1.getBlob(iW2))));
                        break;
                    }
                    return arrayList;
                } finally {
                    d441VarG1.close();
                }
            case 5:
                e261 e261Var = (e261) obj;
                etd etdVar = (etd) obj2;
                String str3 = etdVar.f;
                if (str3.length() == 0) {
                    str3 = etdVar.b;
                }
                b261.n(e261Var, str3);
                return rih1Var;
            case 6:
                ((gk31) obj2).a.invoke((fvj1) obj);
                return rih1Var;
            case 7:
                ((jen0) obj).a((RecyclerView) obj2);
                return rih1Var;
            case 8:
                ihv ihvVar = (ihv) obj;
                ((d3e) obj2).k(ihvVar.a, ihvVar.b);
                return rih1Var;
            case 9:
                return ((r5e) obj2).c;
            case 10:
                if (q5e.a[((PermissionsCard$Events) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                s5e s5eVar = (s5e) obj2;
                i8h1 i8h1Var = s5eVar.X;
                x6h1 x6h1VarC = s5eVar.Z.b.c();
                x6h1VarC.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 11:
                String str4 = ((ner0) obj).c;
                return new s6e(new r6e(str4 != null ? new h6e(((Context) ((x6e) obj2).b).getString(2131954712), str4) : null));
            case 12:
                return ((o7e) obj2).c;
            case 13:
                g8e g8eVar = (g8e) obj2;
                if (f8e.a[((PermissionsCard$Events) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                i8h1 i8h1Var2 = (i8h1) g8eVar.i.get();
                x6h1 x6h1VarC2 = g8eVar.t.b.c();
                x6h1VarC2.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 14:
                b261.k((e261) obj, new d4h(((w8e) obj2).c.size(), 1));
                return rih1Var;
            case 15:
                b261.l((e261) obj, new f4h(((e9e) obj2).c, 0));
                return rih1Var;
            case 16:
                return ((mee) obj2).c;
            case 17:
                rwq0.z((qtr) obj, new zee((bfe) obj2, b2));
                return rih1Var;
            case 18:
                MobiusLoop mobiusLoop = ((sie) obj2).V0;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 19:
                return ((o3m0) obj).a(((khe) obj2).a);
            case 20:
                kp5 kp5Var = (kp5) obj2;
                i1r i1rVarN = x2p1.n((d0r) kp5Var.a, (o3r) kp5Var.g, (String) obj);
                i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
                if (i1rVar != null) {
                    return (iix0) i1rVar.a;
                }
                return null;
            case 21:
                cas casVar = (a7m0) obj;
                casVar.a = new cka((ele) obj2, (byte) 26);
                casVar.d = xrc.U0;
                casVar.e = xrc.V0;
                return rih1Var;
            case 22:
                return new rm((znb0) obj2, (byte) 18);
            case 23:
                cas casVar2 = (a7m0) obj;
                casVar2.a = eqe.t;
                xif xifVar = (xif) obj2;
                casVar2.d = new wif(xifVar, (byte) 0);
                casVar2.e = new wif(xifVar, (byte) 1);
                zif zifVar = xifVar.d;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = zifVar.b;
                mr20[] mr20VarArr = {new ek(zifVar.a.c, (byte) 1)};
                companion.getClass();
                casVar2.b = new b(q8nVar, mr20VarArr);
                return rih1Var;
            case 24:
                e261 e261Var2 = (e261) obj;
                jwm jwmVar = (jwm) obj2;
                if (jwmVar == null || (str2 = jwmVar.a.b) == null) {
                    str = jwmVar != null ? jwmVar.a.a : null;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                } else {
                    if (ihc1.y0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        if (jwmVar != null) {
                        }
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                    }
                }
                b261.n(e261Var2, str2);
                b261.x(e261Var2, 0);
                return rih1Var;
            case 25:
                ((qtr) obj).b(new gz0((inf) obj2, (lnm) null, (byte) 4));
                return rih1Var;
            case 26:
                Bundle bundle = (Bundle) obj;
                oof oofVar = (pof) ((fta) obj2).c;
                String viewUri = oofVar.getViewUri();
                boolean z = oofVar instanceof oof;
                if (z) {
                    f7q0Var = oofVar.b;
                } else if (oofVar instanceof nof) {
                    f7q0Var = ((nof) oofVar).b;
                } else {
                    if (!(oofVar instanceof mof)) {
                        eg.o();
                        return null;
                    }
                    f7q0Var = new f7q0(pcf.d(6, ((mof) oofVar).b, (String) null), (String) null, (String) null, (String) null, (s7q0) null, 120);
                }
                if (bundle == null || (sub1Var = (vub1) jhc1.t(bundle, "chat_share_step", vub1.class)) == null) {
                    if (z) {
                        sub1Var = uub1.a;
                    } else if (oofVar instanceof nof) {
                        sub1Var = new tub1((String) null, ((nof) oofVar).c, 1);
                    } else {
                        if (!(oofVar instanceof mof)) {
                            eg.o();
                            return null;
                        }
                        mof mofVar = (mof) oofVar;
                        sub1Var = new sub1(mofVar.b, mofVar.c);
                    }
                }
                return new eof(viewUri, f7q0Var, sub1Var);
            case 27:
                cas casVar3 = (a7m0) obj;
                casVar3.a = aqf.a;
                rwj rwjVar = (rwj) obj2;
                casVar3.d = new bqf(rwjVar, (byte) 0);
                casVar3.e = new bqf(rwjVar, (byte) 1);
                casVar3.a(rmf.X, rmf.Y);
                return rih1Var;
            case 28:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ev51) obj2).f.invoke(bool);
                return rih1Var;
            default:
                Bundle bundle2 = (Bundle) obj;
                t4i1 t4i1Var = new t4i1(((ttf) obj2).e.b);
                wuf wufVar2 = vuf.a;
                if (bundle2 != null) {
                    String string = bundle2.getString("check_in_state");
                    if (string == null) {
                        wufVar = null;
                    } else {
                        int iHashCode = string.hashCode();
                        if (iHashCode != -1281977283) {
                            if (iHashCode != 719001872) {
                                if (iHashCode == 1744368808 && string.equals("ask_to_join")) {
                                    wufVar = wufVar2;
                                } else {
                                    wufVar = null;
                                }
                            } else if (string.equals("waiting_for_host")) {
                                wufVar = xuf.a;
                            } else {
                                wufVar = null;
                            }
                        } else if (string.equals("failed")) {
                            wufVar = wuf.a;
                        } else {
                            wufVar = null;
                        }
                    }
                    if (wufVar != null) {
                        wufVar2 = wufVar;
                    }
                }
                return new quf(t4i1Var, (a5i1) null, wufVar2);
        }
    }
}
