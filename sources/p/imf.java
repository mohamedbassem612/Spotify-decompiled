package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class imf extends a8d1 implements zu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imf(b431 b431Var, String str, mmf mmfVar, boolean z, dmf dmfVar, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(4, lnmVar);
        this.g = b431Var;
        this.h = str;
        this.i = mmfVar;
        this.b = z;
        this.t = dmfVar;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                imf imfVar = new imf((b431) obj8, (String) obj7, (mmf) obj6, this.b, (dmf) obj5, this.c, this.d, (lnm) obj4);
                imfVar.e = (emf) obj;
                imfVar.f = (cmf) obj2;
                imfVar.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                ven0 ven0Var = this.c;
                ven0 ven0Var2 = this.d;
                imf imfVar2 = new imf((jjm0) obj8, (fmg) obj7, ven0Var, ven0Var2, (ven0) obj6, (ven0) obj5, (lnm) obj4);
                imfVar2.e = (zlg) obj2;
                imfVar2.f = (tqw) obj3;
                return imfVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        w4i1 w4i1Var;
        Boolean m231Var;
        Object objM;
        byte b = this.a;
        Object obj2 = this.i;
        ven0 ven0Var = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.t;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                String str4 = (String) obj3;
                mmf mmfVar = (mmf) obj2;
                t6t t6tVar = mmfVar.i;
                String str5 = mmfVar.b;
                lzn0 lzn0Var = mmfVar.h;
                emf emfVar = (emf) this.e;
                cmf cmfVar = (cmf) this.f;
                hm5.M(obj);
                jwm jwmVar = (jwm) o7h.s0(emfVar.d);
                if (u890.j(cmfVar, vlf.a)) {
                    ((b431) this.g).a(new fgn0(str4), (String) null);
                    return rih1Var;
                }
                if (u890.j(cmfVar, bmf.a)) {
                    Boolean bool = Boolean.FALSE;
                    ven0 ven0Var2 = this.c;
                    ven0Var2.setValue(bool);
                    fn31.T(mmfVar.O0, (o8n) null, 0, new hff(mmfVar, str4, ven0Var2, (lnm) null, (byte) 1), 3);
                    return rih1Var;
                }
                if (u890.j(cmfVar, zlf.a)) {
                    if (z) {
                        Set set = pcf.a;
                        pcf.a(lzn0Var, f4i1.f("spotify:chat-members:", str4, ":add"), null, null);
                        return rih1Var;
                    }
                    Set set2 = s4b1.f;
                    s4b1 s4b1VarC = uic.C(str5, (String) null);
                    String strH = pcf.h(s4b1VarC);
                    if (strH == null) {
                        return rih1Var;
                    }
                    g7q0 g7q0Var = new g7q0(strH);
                    String strE = pcf.e(s4b1VarC);
                    mmr0 mmr0Var = new mmr0("OnPlatformShareData", g7q0Var);
                    if (jwmVar == null || (w4i1Var = jwmVar.a) == null) {
                        return rih1Var;
                    }
                    pcf.a(lzn0Var, strE, null, mno1.h(new mmr0[]{mmr0Var, new mmr0("preSelectedUsers", Collections.singletonList(w4i1Var))}));
                    return rih1Var;
                }
                if (u890.j(cmfVar, wlf.a)) {
                    Set set3 = pcf.a;
                    pcf.a(lzn0Var, "spotify:chat-members:".concat(str4), null, null);
                    return rih1Var;
                }
                if (u890.j(cmfVar, xlf.a)) {
                    if (jwmVar == null || (str3 = jwmVar.a.a) == null) {
                        return rih1Var;
                    }
                    pcf.a(lzn0Var, pcf.j(str3), null, null);
                    return rih1Var;
                }
                if (u890.j(cmfVar, plf.a)) {
                    pcf.a(lzn0Var, pcf.l(str4), null, null);
                    return rih1Var;
                }
                if (u890.j(cmfVar, tlf.a)) {
                    Set set4 = pcf.a;
                    pcf.a(lzn0Var, "spotify:listening-activity:group-audience-selection:".concat(str4), null, null);
                    return rih1Var;
                }
                if (cmfVar instanceof ulf) {
                    if (jwmVar == null || (str2 = jwmVar.a.a) == null) {
                        return rih1Var;
                    }
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    ven0Var.setValue(Boolean.valueOf(((ulf) cmfVar).a));
                    fn31.T(mmfVar.O0, (o8n) null, 0, new on1(mmfVar, str2, cmfVar, zBooleanValue, this.d, (lnm) null), 3);
                    return rih1Var;
                }
                if (u890.j(cmfVar, slf.a)) {
                    pcf.a(lzn0Var, pro1.t("listeningActivity"), null, null);
                    return rih1Var;
                }
                if (u890.j(cmfVar, nlf.a)) {
                    Set set5 = pcf.a;
                    pcf.a(lzn0Var, "spotify:chat-receipts:".concat(str4), null, null);
                    return rih1Var;
                }
                if (u890.j(cmfVar, ylf.a)) {
                    String strD = pcf.d(6, str4, null);
                    iu30 iu30Var = mmfVar.N0.a(strD, new lik1(strD), Collections.singletonMap("chatFlag", "true")).i.d;
                    ou80.Companion.getClass();
                    iu30Var.invoke(new tv80(new ou80(""), (y6r0) null));
                    return rih1Var;
                }
                if (u890.j(cmfVar, rlf.a)) {
                    mmfVar.t.a(str4, pcf.d(6, str4, null), str5);
                    return rih1Var;
                }
                if (u890.j(cmfVar, olf.a)) {
                    String strD2 = pcf.d(6, str4, null);
                    if (z) {
                        if (!mmfVar.f.a.i()) {
                            return rih1Var;
                        }
                        t6tVar.a(new r6t(((dmf) obj4).f), str4, strD2);
                        return rih1Var;
                    }
                    if (jwmVar == null || (str = jwmVar.a.b) == null) {
                        return rih1Var;
                    }
                    t6tVar.a(new q6t(str), str4, strD2);
                    return rih1Var;
                }
                if (u890.j(cmfVar, qlf.a)) {
                    mmfVar.X.a(str4, pcf.d(6, str4, null));
                    return rih1Var;
                }
                if (u890.j(cmfVar, mlf.a)) {
                    if (jwmVar == null) {
                        return rih1Var;
                    }
                    w4i1 w4i1Var2 = jwmVar.a;
                    mmfVar.Y.a(pcf.j(w4i1Var2.a), w4i1Var2.b, new h7b(3));
                    return rih1Var;
                }
                if (!u890.j(cmfVar, amf.a)) {
                    eg.o();
                    return null;
                }
                if (jwmVar == null) {
                    return rih1Var;
                }
                w4i1 w4i1Var3 = jwmVar.a;
                mmfVar.Z.a(pcf.j(w4i1Var3.a), w4i1Var3.b, new mgh1());
                return rih1Var;
            default:
                fmg fmgVar = (fmg) obj3;
                ven0 ven0Var3 = (ven0) obj4;
                zlg zlgVar = (zlg) this.e;
                tqw tqwVar = (tqw) this.f;
                boolean z2 = this.b;
                ven0 ven0Var4 = this.c;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        if (!u890.j(zlgVar, vlg.a)) {
                            if (u890.j(zlgVar, wlg.a)) {
                                ven0Var.setValue(Boolean.FALSE);
                                return rih1Var;
                            }
                            if (!u890.j(zlgVar, ylg.a)) {
                                if (u890.j(zlgVar, xlg.a)) {
                                    fmgVar.h.invoke();
                                    return rih1Var;
                                }
                                eg.o();
                                return null;
                            }
                            ven0Var3.setValue(Boolean.valueOf(!((Boolean) ven0Var3.getValue()).booleanValue()));
                            boolean zBooleanValue2 = ((Boolean) ven0Var3.getValue()).booleanValue();
                            hma1 hma1VarEdit = fmgVar.e.edit();
                            hma1VarEdit.a(gmg.a, zBooleanValue2);
                            hma1VarEdit.g();
                            return rih1Var;
                        }
                        if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                            return rih1Var;
                        }
                        ven0Var4.setValue(Boolean.TRUE);
                        ven0Var.setValue(Boolean.FALSE);
                        x4c x4cVar = new x4c(fmgVar, tqwVar, (ven0) obj2, (ven0) obj4, (lnm) null, (byte) 10);
                        this.e = null;
                        this.f = null;
                        this.b = true;
                        objM = rc2.M(30000L, x4cVar, this);
                        d9n d9nVar = d9n.a;
                        if (objM == d9nVar) {
                            return d9nVar;
                        }
                        m231Var = (Boolean) objM;
                        m231Var.getClass();
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objM = obj;
                        m231Var = (Boolean) objM;
                        m231Var.getClass();
                    }
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Boolean bool2 = Boolean.FALSE;
                if (m231Var instanceof m231) {
                    m231Var = bool2;
                }
                boolean zBooleanValue3 = m231Var.booleanValue();
                ven0Var4.setValue(bool2);
                if (zBooleanValue3) {
                    return rih1Var;
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imf(jjm0 jjm0Var, fmg fmgVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(4, lnmVar);
        this.g = jjm0Var;
        this.h = fmgVar;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.i = ven0Var3;
        this.t = ven0Var4;
    }
}
