package p;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.view.ViewGroup;
import com.spotify.address.endpoint.model.v1.proto.AddressCollection;
import com.spotify.address.endpoint.model.v1.proto.AddressForm;
import com.spotify.address.endpoint.model.v1.proto.GetFormRequest;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.address.endpoint.model.v1.proto.SavedAddress;
import com.spotify.automix.esperanto.proto.EsAutomix;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wkk0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkk0(boolean z, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final Object e(Object obj) {
        ajq0 ajq0Var = (ajq0) this.e;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                mr20 mr20Var = (ezc) this.c;
                mr20 mr20Var2 = (mr20) this.d;
                ziq0 ziq0Var = ziq0.h;
                vi viVar = new vi(ajq0Var, (byte) 10);
                this.b = true;
                Object objS = fc11.s(vrl.c, this, viVar, new ekv(ziq0Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                d9n d9nVar = d9n.a;
                if (objS != d9nVar) {
                    objS = rih1Var;
                }
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            ajq0Var.N(false);
            return rih1Var;
        } catch (Throwable th) {
            ajq0Var.N(false);
            throw th;
        }
    }

    private final Object g(Object obj) {
        boolean z = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                gmq0 gmq0Var = ((jmq0) this.c).c;
                String str = (String) this.d;
                HashMap map = (HashMap) this.e;
                Map mapU = map != null ? sqg0.U(map) : null;
                this.b = true;
                Object objA = ((imq0) gmq0Var).a(str, mapU, this, false);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (IllegalStateException unused) {
        }
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                wkk0 wkk0Var = new wkk0(obj2, lnmVar, (byte) 0);
                wkk0Var.d = obj;
                return wkk0Var;
            case 1:
                return new wkk0((w17) this.c, (kbf0) this.d, (ncf0) obj2, lnmVar, (byte) 1);
            case 2:
                return new wkk0((iu30) this.c, (rmk0) this.d, (res) obj2, lnmVar, (byte) 2);
            case 3:
                return new wkk0((n8m0) this.c, (mr20) this.d, (iu30) obj2, lnmVar, (byte) 3);
            case 4:
                return new wkk0((iu30) this.c, (GetFormRequest) this.d, (iu30) obj2, lnmVar, (byte) 4);
            case 5:
                return new wkk0((kjm0) this.c, this.d, (tqw) obj2, lnmVar, (byte) 5);
            case 6:
                return new wkk0((p311) this.c, (h4k) this.d, (p811) obj2, lnmVar, (byte) 6);
            case 7:
                return new wkk0((mrm0) this.c, (wrm0) this.d, (iu30) obj2, lnmVar, (byte) 7);
            case 8:
                return new wkk0((r091) this.c, (rtm0) this.d, (poj0) obj2, lnmVar, (byte) 8);
            case 9:
                return new wkk0((hdn0) this.c, (ven0) this.d, (ven0) obj2, lnmVar, (byte) 9);
            case 10:
                return new wkk0(this.b, (b9l1) this.c, (ven0) this.d, (lsm0) obj2, lnmVar, (byte) 10);
            case 11:
                return new wkk0((o0i) this.c, (ven0) this.d, (gij1) obj2, lnmVar, (byte) 11);
            case 12:
                return new wkk0((m0t) this.c, (o0i) this.d, (ven0) obj2, lnmVar, (byte) 12);
            case 13:
                return new wkk0((ven0) this.d, (iu30) obj2, lnmVar);
            case 14:
                return new wkk0(obj2, lnmVar, (byte) 14);
            case 15:
                return new wkk0(this.b, (ttm0) this.c, (zau0) this.d, (Function0) obj2, lnmVar, (byte) 15);
            case 16:
                return new wkk0((dt71) this.c, (ven0) this.d, (ven0) obj2, lnmVar, (byte) 16);
            case 17:
                return new wkk0((jo51) this.c, (ven0) this.d, (drr0) obj2, lnmVar, (byte) 17);
            case 18:
                wkk0 wkk0Var2 = new wkk0((gjl) this.c, (f8o0) obj2, lnmVar, (byte) 18);
                wkk0Var2.d = obj;
                return wkk0Var2;
            case 19:
                wkk0 wkk0Var3 = new wkk0((List) this.c, (gqo0) obj2, lnmVar, (byte) 19);
                wkk0Var3.d = obj;
                return wkk0Var3;
            case 20:
                return new wkk0((o0p0) this.c, (ViewGroup) this.d, (m1p0) obj2, lnmVar, (byte) 20);
            case 21:
                return new wkk0((e6p0) this.c, (wqn0) this.d, (ou80) obj2, lnmVar, (byte) 21);
            case 22:
                wkk0 wkk0Var4 = new wkk0((k6e0) this.c, lnmVar, (yfc0) obj2);
                wkk0Var4.d = obj;
                return wkk0Var4;
            case 23:
                return new wkk0((mr20) this.c, (d7v) this.d, (rtm0) obj2, lnmVar, (byte) 23);
            case 24:
                return new wkk0((rnc0) this.c, (iu30) this.d, (xtb0) obj2, lnmVar, (byte) 24);
            case 25:
                wkk0 wkk0Var5 = new wkk0((List) this.c, (mbq0) obj2, lnmVar, (byte) 25);
                wkk0Var5.d = obj;
                return wkk0Var5;
            case 26:
                return new wkk0((ezc) this.c, (mr20) this.d, (ajq0) obj2, lnmVar, (byte) 26);
            case 27:
                return new wkk0((jmq0) this.c, (String) this.d, (HashMap) obj2, lnmVar, (byte) 27);
            case 28:
                return new wkk0((jmq0) this.c, (String) this.d, (HashMap) obj2, lnmVar, (byte) 28);
            default:
                return new wkk0((osq0) this.c, (ven0) this.d, (ven0) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((Set) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objG;
        List list;
        w17 w17Var;
        AddressForm addressFormQ;
        SavedAddress savedAddressQ;
        Object objI;
        bpb1 bpb1Var;
        wx wxVar;
        p410 p410Var;
        xgn0 xgn0Var;
        qga0 uc9Var;
        Object objU;
        Object objI2;
        byte b = 12;
        byte b2 = 6;
        byte b3 = 13;
        byte b4 = 1;
        lnm lnmVarValueOf = null;
        switch (this.a) {
            case 0:
                Set set = (Set) this.d;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    List listL1 = o7h.l1(o7h.p1(q7h.V(set)));
                    jn7 jn7Var = (jn7) this.e;
                    llz llzVarO = EsAutomix.GetStylesForPresetIdRequest.o();
                    List list2 = listL1;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((b8w0) it.next()).a));
                    }
                    llzVarO.n(arrayList);
                    EsAutomix.GetStylesForPresetIdRequest getStylesForPresetIdRequestBuild = llzVarO.build();
                    this.d = set;
                    this.c = listL1;
                    this.b = true;
                    objG = jn7Var.G(getStylesForPresetIdRequestBuild, this);
                    if (objG == d9nVar) {
                        return d9nVar;
                    }
                    list = listL1;
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) this.c;
                    hm5.M(obj);
                    objG = obj;
                }
                List list3 = list;
                h290<EsAutomix.PresetIdStyle> h290VarN = ((EsAutomix.GetStylesForPresetIdResponse) objG).n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                for (EsAutomix.PresetIdStyle presetIdStyle : h290VarN) {
                    arrayList2.add(new w8w0(dem1.T(presetIdStyle.s()), dem1.E(presetIdStyle.n()), dem1.G(presetIdStyle.o()), dem1.I(presetIdStyle.p()), dem1.J(presetIdStyle.q()), dem1.K(presetIdStyle.r())));
                }
                Map mapT = sqg0.T(o7h.v1(list3, arrayList2));
                Set set2 = set;
                int iS = zno1.s(q7h.U(set2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : set2) {
                    ArrayList arrayList3 = new ArrayList();
                    for (b8w0 b8w0Var : (List) obj2) {
                        w8w0 w8w0Var = (w8w0) mapT.get(b8w0Var);
                        mmr0 mmr0Var = w8w0Var != null ? new mmr0(b8w0Var, w8w0Var) : null;
                        if (mmr0Var != null) {
                            arrayList3.add(mmr0Var);
                        }
                    }
                    linkedHashMap.put(obj2, sqg0.T(arrayList3));
                }
                return linkedHashMap;
            case 1:
                rih1 rih1Var = rih1.a;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    fcf0 fcf0VarC = ((ncf0) this.e).c();
                    if (fcf0VarC != null && (w17Var = (w17) this.c) != null) {
                        kbf0 kbf0Var = (kbf0) this.d;
                        this.b = true;
                        Object objE = lvx.e(kbf0Var, fcf0VarC, 0, false, 0.0f, w17Var.a, 0.0f, false, this, 2014);
                        if (objE != d9nVar2) {
                            objE = rih1Var;
                        }
                        if (objE == d9nVar2) {
                            return d9nVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 2:
                rmk0 rmk0Var = (rmk0) this.d;
                iu30 iu30Var = (iu30) this.c;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                try {
                    try {
                        if (!z3) {
                            hm5.M(obj);
                            vmk0 vmk0Var = new vmk0((res) this.e, (lnm) null, (byte) 1);
                            this.b = true;
                            if (rc2.O(2000L, vmk0Var, this) == d9nVar3) {
                                return d9nVar3;
                            }
                        } else {
                            if (!z3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                    } catch (Throwable th) {
                        iu30Var.invoke(rmk0Var);
                        throw th;
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                }
                iu30Var.invoke(rmk0Var);
                return rih1.a;
            case 3:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    mr20 mr20Var = ((m8m0) ((n8m0) this.c)).c;
                    mr20 mr20Var2 = (mr20) this.d;
                    dwf0 dwf0Var = new dwf0((iu30) this.e, (lnm) null, (byte) 7);
                    this.b = true;
                    Object objS = fc11.s(vrl.c, this, kfo0.a, new ekv(dwf0Var, (lnm) null), new mr20[]{mr20Var, mr20Var2});
                    if (objS != d9nVar4) {
                        objS = rih1Var2;
                    }
                    if (objS != d9nVar4) {
                        objS = rih1Var2;
                    }
                    if (objS == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 4:
                GetFormRequest getFormRequest = (GetFormRequest) this.d;
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(1000L, this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ln40 ln40VarO = GetFormResponse.o();
                w02 w02VarT = AddressCollection.t();
                iu30 iu30Var2 = (iu30) this.c;
                if (iu30Var2 == null || (addressFormQ = (AddressForm) iu30Var2.invoke(getFormRequest)) == null) {
                    addressFormQ = AddressForm.q();
                }
                w02VarT.n(addressFormQ);
                iu30 iu30Var3 = (iu30) this.e;
                if (iu30Var3 == null || (savedAddressQ = (SavedAddress) iu30Var3.invoke(getFormRequest)) == null) {
                    savedAddressQ = SavedAddress.q();
                }
                w02VarT.q(savedAddressQ);
                ln40VarO.n(w02VarT);
                return ln40VarO.build();
            case 5:
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    bbc bbcVar = ((kjm0) this.c).c;
                    mmr0 mmr0Var2 = new mmr0(this.d, (tqw) this.e);
                    this.b = true;
                    if (bbcVar.b(mmr0Var2, this) == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                p811 p811Var = (p811) this.e;
                h4k h4kVar = (h4k) this.d;
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        p311 p311Var = (p311) this.c;
                        this.b = true;
                        if (p311Var.R(this) == d9nVar7) {
                            return d9nVar7;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    h4kVar.dispose();
                    iv91 iv91Var = (iv91) p811Var.a;
                    if (iv91Var != null) {
                        iv91Var.a();
                    }
                    return rih1.a;
                } catch (Throwable th2) {
                    h4kVar.dispose();
                    iv91 iv91Var2 = (iv91) p811Var.a;
                    if (iv91Var2 != null) {
                        iv91Var2.a();
                    }
                    throw th2;
                }
            case 7:
                iu30 iu30Var4 = (iu30) this.e;
                wrm0 wrm0Var = (wrm0) this.d;
                hrj0 hrj0Var = wrm0Var.d;
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    int iOrdinal = ((mrm0) this.c).b.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            hrj0Var.a();
                            wrm0Var.O0.invoke();
                            iu30Var4.invoke(grm0.a);
                            a1r0.j(wrm0Var.c, nik1.D4.a, (String) null, l0p1.q(brj0.b), true, 2);
                        } else {
                            if (iOrdinal != 2) {
                                eg.o();
                                return null;
                            }
                            hrj0Var.getClass();
                            m441 m441Var = new m441(new d7i0(hrj0Var, lnmVarValueOf, b));
                            this.b = true;
                            objI = b5p1.i(m441Var, this);
                            if (objI == d9nVar8) {
                                return d9nVar8;
                            }
                        }
                    }
                    return rih1.a;
                }
                if (!z8) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objI = obj;
                iu30Var4.invoke(new frm0(((grj0) objI).a));
                wrm0Var.P0.invoke();
                return rih1.a;
            case 8:
                r091 r091Var = (r091) this.c;
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(new r6k0(r091Var.g, (byte) 5));
                    nw5 nw5Var = new nw5(2, (lnm) null, (byte) 16);
                    ap70 ap70Var = new ap70(r091Var, (rtm0) this.d, (poj0) this.e, (byte) 18);
                    this.b = true;
                    Object objCollect = mr20VarU.collect(new wem((byte) 19, new l811(), nw5Var, new dgk0(ap70Var, (byte) 13)), this);
                    if (objCollect != d9nVar9) {
                        objCollect = rih1Var3;
                    }
                    if (objCollect != d9nVar9) {
                        objCollect = rih1Var3;
                    }
                    if (objCollect == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
            case 9:
                err0 err0Var = (hdn0) this.c;
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(600L, this) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                err0 err0Var2 = err0Var;
                if (err0Var2.s() < 3) {
                    int iS2 = err0Var2.s();
                    if (iS2 == 1) {
                        ((Function0) ((ven0) this.d).getValue()).invoke();
                    } else if (iS2 == 2) {
                        ((Function0) ((ven0) this.e).getValue()).invoke();
                    }
                }
                err0Var2.t(0);
                return rih1.a;
            case 10:
                hm5.M(obj);
                if (this.b) {
                    ven0 ven0Var = (ven0) this.d;
                    lnm lnmVarA = ((b9l1) this.c).a((r091) ven0Var.getValue());
                    if (lnmVarA != null) {
                        lsm0 lsm0Var = (lsm0) this.e;
                        if (!u890.j(ebp1.n(lnmVarA), lsm0Var)) {
                            lnmVarA.b(lsm0Var);
                        }
                        lnmVarValueOf = lnmVarA;
                    }
                    ven0Var.setValue(lnmVarValueOf);
                }
                return rih1.a;
            case 11:
                o0i o0iVar = (o0i) this.c;
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                try {
                    if (z11) {
                        if (!z11) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    }
                    hm5.M(obj);
                    r091 r091Var2 = (r091) ((ven0) this.d).getValue();
                    if (r091Var2 == null || (bpb1Var = r091Var2.g) == null) {
                        n2u0 n2u0Var = o0iVar.c.b;
                        if (n2u0Var != null) {
                            n2u0Var.b((l2u0) null);
                        }
                        return rih1.a;
                    }
                    ygi0 ygi0Var = new ygi0(o0iVar, (gij1) this.e, (byte) 7);
                    this.b = true;
                    bpb1Var.collect(ygi0Var, this);
                    return d9nVar11;
                } catch (Throwable th3) {
                    n2u0 n2u0Var2 = o0iVar.c.b;
                    if (n2u0Var2 != null) {
                        n2u0Var2.b((l2u0) null);
                    }
                    throw th3;
                }
            case 12:
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(((m0t) this.c).f);
                    ygi0 ygi0Var2 = new ygi0((o0i) this.d, (ven0) this.e, (byte) 8);
                    this.b = true;
                    if (ezcVarG.collect(ygi0Var2, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 13:
                ven0 ven0Var2 = (ven0) this.d;
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    wx wxVar2 = (wx) ven0Var2.getValue();
                    if (wxVar2 instanceof ux) {
                        long j = vpd1.a;
                        this.c = (ux) wxVar2;
                        this.b = true;
                        if (hap1.j(j, this) == d9nVar13) {
                            return d9nVar13;
                        }
                        wxVar = wxVar2;
                    }
                    return rih1.a;
                }
                if (!z13) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wxVar = (ux) this.c;
                hm5.M(obj);
                int i = vpd1.b;
                vx vxVar = vx.a;
                if (!wxVar.equals(vxVar)) {
                    if (!(wxVar instanceof ux)) {
                        eg.o();
                        return null;
                    }
                    ux uxVar = (ux) wxVar;
                    int i2 = uxVar.b;
                    if (i2 >= 2) {
                        int i3 = (i2 - 1) * 15000;
                        if (uxVar.a != 2) {
                            i3 = -i3;
                        }
                        lnmVarValueOf = Integer.valueOf(i3);
                    }
                }
                if (lnmVarValueOf != null) {
                    iu30 iu30Var5 = (iu30) this.e;
                    int iIntValue = lnmVarValueOf.intValue();
                    iu30Var5.invoke(iIntValue >= 0 ? new oym0(iIntValue) : new nym0(-iIntValue));
                }
                ven0Var2.setValue(vxVar);
                return rih1.a;
            case 14:
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    p410 p410Var2 = (p410) this.e;
                    xgn0 xgn0Var2 = (xgn0) p410Var2.h;
                    this.c = xgn0Var2;
                    this.d = p410Var2;
                    this.b = true;
                    if (xgn0Var2.a(this) == d9nVar14) {
                        return d9nVar14;
                    }
                    p410Var = p410Var2;
                    xgn0Var = xgn0Var2;
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p410Var = (p410) this.d;
                    xgn0Var = (xgn0) this.c;
                    hm5.M(obj);
                }
                try {
                    ((bpb1) p410Var.f).l((Object) null);
                    r091 r091Var3 = (r091) ((bpb1) p410Var.e).getValue();
                    if (r091Var3 != null) {
                        r091Var3.j();
                        break;
                    }
                    return rih1.a;
                } finally {
                    xgn0Var.c((Object) null);
                }
            case 15:
                hm5.M(obj);
                if (this.b) {
                    ((ttm0) this.c).a((zau0) this.d);
                } else {
                    ((Function0) this.e).invoke();
                }
                return rih1.a;
            case 16:
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                dt71 dt71Var = (dt71) this.c;
                mib mibVar = new mib((ven0) this.d, (ven0) this.e, (byte) 14);
                this.b = true;
                dt71Var.collect(mibVar, this);
                return d9nVar15;
            case 17:
                ven0 ven0Var3 = (ven0) this.d;
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    hnn0 hnn0Var = (hnn0) ((List) ven0Var3.getValue()).get(((List) ven0Var3.getValue()).size() - 2);
                    jo51 jo51Var = (jo51) this.c;
                    float fS = ((drr0) this.e).s();
                    this.b = true;
                    if (jo51Var.A1(fS, hnn0Var, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 18:
                d9n d9nVar17 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    ssw0 ssw0Var = (ssw0) this.d;
                    NetworkRequest networkRequestA = ((gjl) this.c).a();
                    if (networkRequestA == null) {
                        int i4 = ((gjl) this.c).a;
                        if (i4 == 1) {
                            networkRequestA = null;
                        } else {
                            NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (Build.VERSION.SDK_INT < 30 || i4 != 6) {
                                int iC = l1d.C(i4);
                                if (iC == 2) {
                                    builderRemoveCapability = builderRemoveCapability.addCapability(11);
                                } else if (iC == 3) {
                                    builderRemoveCapability = builderRemoveCapability.addCapability(18);
                                } else if (iC == 4) {
                                    builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                                }
                                networkRequestA = builderRemoveCapability.build();
                            } else {
                                networkRequestA = builderRemoveCapability.addCapability(25).build();
                            }
                        }
                    }
                    if (networkRequestA == null) {
                        ssw0Var.c().H((Throwable) null);
                        return rih1.a;
                    }
                    gub0 gub0Var = new gub0(fn31.T(ssw0Var, (o8n) null, 0, new m3n0(this.e, (Object) ssw0Var, lnmVarValueOf, (byte) 17), 3), ssw0Var, (byte) 6);
                    if (Build.VERSION.SDK_INT >= 30) {
                        ConnectivityManager.NetworkCallback networkCallback = gt71.a;
                        ConnectivityManager connectivityManager = ((f8o0) this.e).a;
                        networkCallback.getClass();
                        synchronized (gt71.b) {
                            try {
                                LinkedHashMap linkedHashMap2 = gt71.c;
                                boolean zIsEmpty = linkedHashMap2.isEmpty();
                                linkedHashMap2.put(gub0Var, networkRequestA);
                                if (zIsEmpty) {
                                    qs10 qs10VarA = qs10.a();
                                    int i5 = mvl1.a;
                                    qs10VarA.getClass();
                                    connectivityManager.registerDefaultNetworkCallback(networkCallback);
                                } else if (gt71.e && gt71.f != null) {
                                    qs10 qs10VarA2 = qs10.a();
                                    int i6 = mvl1.a;
                                    qs10VarA2.getClass();
                                    gub0Var.invoke(gt71.a(networkRequestA, gt71.d) ? mjl.a : new njl(7));
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        uc9Var = new qga0(gub0Var, connectivityManager, (byte) 13);
                    } else {
                        int i7 = lu4.c;
                        ConnectivityManager connectivityManager2 = ((f8o0) this.e).a;
                        lu4 lu4Var = new lu4(gub0Var, (byte) 2);
                        l811 l811Var = new l811();
                        try {
                            qs10 qs10VarA3 = qs10.a();
                            int i8 = mvl1.a;
                            qs10VarA3.getClass();
                            connectivityManager2.registerNetworkCallback(networkRequestA, (ConnectivityManager.NetworkCallback) lu4Var);
                            l811Var.a = true;
                        } catch (RuntimeException e2) {
                            if (!nhc1.R(e2.getClass().getName(), "TooManyRequestsException", false)) {
                                throw e2;
                            }
                            qs10 qs10VarA4 = qs10.a();
                            int i9 = mvl1.a;
                            qs10VarA4.getClass();
                            gub0Var.invoke(new njl(7));
                        }
                        uc9Var = new uc9(l811Var, connectivityManager2, lu4Var, (byte) 4);
                    }
                    zxs zxsVar = new zxs(uc9Var, (byte) 5);
                    this.b = true;
                    if (jch0.s(ssw0Var, zxsVar, this) == d9nVar17) {
                        return d9nVar17;
                    }
                    break;
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                c9n c9nVar = (c9n) this.d;
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list4 = (List) this.c;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list4) {
                    if (((y781) obj3).e) {
                        arrayList4.add(obj3);
                    }
                }
                gqo0 gqo0Var = (gqo0) this.e;
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(fn31.q(c9nVar, (o8n) null, 0, new m3n0((Object) gqo0Var, it2.next(), lnmVarValueOf, (byte) 28), 3));
                }
                this.d = null;
                this.b = true;
                Object objU2 = o1p1.u(arrayList5, this);
                return objU2 == d9nVar18 ? d9nVar18 : objU2;
            case 20:
                d9n d9nVar19 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    iac0 iac0VarN0 = ((o0p0) this.c).n0();
                    w8c0 w8c0Var = w8c0.d;
                    cto0 cto0Var = new cto0((ViewGroup) this.d, (m1p0) this.e, lnmVarValueOf, b4);
                    this.b = true;
                    if (z8p1.u(iac0VarN0, w8c0Var, cto0Var, this) == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 21:
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    qzn0 qzn0Var = ((e6p0) this.c).X;
                    wqn0 wqn0Var = (wqn0) this.d;
                    ezn0 ezn0Var = new ezn0((ou80) this.e);
                    this.b = true;
                    if (qzn0Var.f(wqn0Var, ezn0Var, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                vr20 vr20Var = (vr20) this.d;
                d9n d9nVar21 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    k6e0 k6e0Var = (k6e0) this.c;
                    j4p0 j4p0Var = new j4p0(vr20Var, (yfc0) this.e);
                    this.d = null;
                    this.b = true;
                    if (k6e0Var.collect(j4p0Var, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 23:
                dtm0 dtm0Var = dtm0.a;
                rtm0 rtm0Var = (rtm0) this.e;
                d7v d7vVar = (d7v) this.d;
                d9n d9nVar22 = d9n.a;
                boolean z22 = this.b;
                try {
                    if (!z22) {
                        hm5.M(obj);
                        mr20 mr20Var3 = (mr20) this.c;
                        ygi0 ygi0Var3 = new ygi0(d7vVar, rtm0Var, (byte) 24);
                        this.b = true;
                        if (mr20Var3.collect(ygi0Var3, this) == d9nVar22) {
                            return d9nVar22;
                        }
                    } else {
                        if (!z22) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    d7vVar.invoke(Boolean.FALSE);
                    rtm0Var.a(dtm0Var);
                    return rih1.a;
                } catch (Throwable th5) {
                    d7vVar.invoke(Boolean.FALSE);
                    rtm0Var.a(dtm0Var);
                    throw th5;
                }
            case 24:
                rnc0 rnc0Var = (rnc0) this.c;
                d9n d9nVar23 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    List list5 = rnc0Var.b;
                    int iS3 = zno1.s(q7h.U(list5, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                    for (Object obj4 : list5) {
                        linkedHashMap3.put(((h8k1) obj4).b, obj4);
                    }
                    mr20 mr20VarU2 = rqt0.u(new tf2(hu20.c(rwq.q(new nxb0((xtb0) this.e, (byte) 18)), new rwm0(rnc0Var, linkedHashMap3, lnmVarValueOf, b2)), (byte) 21));
                    nsm0 nsm0Var = new nsm0(2, (iu30) this.d, t890.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 4);
                    this.b = true;
                    if (l4p1.q(mr20VarU2, nsm0Var, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 25:
                c9n c9nVar2 = (c9n) this.d;
                d9n d9nVar24 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    List list6 = (List) this.c;
                    mbq0 mbq0Var = (mbq0) this.e;
                    ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(fn31.q(c9nVar2, (o8n) null, 0, new cto0(mbq0Var, (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity) it3.next(), lnmVarValueOf, b3), 3));
                    }
                    this.d = null;
                    this.b = true;
                    objU = o1p1.u(arrayList6, this);
                    if (objU == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return o7h.o0((Iterable) objU);
            case 26:
                return e(obj);
            case 27:
                d9n d9nVar25 = d9n.a;
                boolean z25 = this.b;
                try {
                    if (!z25) {
                        hm5.M(obj);
                        gmq0 gmq0Var = ((jmq0) this.c).c;
                        String str = (String) this.d;
                        HashMap map = (HashMap) this.e;
                        lnmVarValueOf = map != null ? sqg0.U(map) : null;
                        this.b = true;
                        if (((imq0) gmq0Var).a(str, lnmVarValueOf, this, true) == d9nVar25) {
                            return d9nVar25;
                        }
                    } else {
                        if (!z25) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                } catch (IllegalStateException unused2) {
                }
                return rih1.a;
            case 28:
                return g(obj);
            default:
                d9n d9nVar26 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    mr20 mr20VarU3 = rqt0.u(hu20.e(((osq0) this.c).N0.e, new i64(3, (lnm) null, (byte) 19)));
                    this.b = true;
                    objI2 = b5p1.i(mr20VarU3, this);
                    if (objI2 == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI2 = obj;
                }
                if (((Boolean) objI2).booleanValue()) {
                    ((ven0) this.d).setValue(Boolean.FALSE);
                }
                ((ven0) this.e).setValue(Boolean.TRUE);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkk0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkk0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkk0(k6e0 k6e0Var, lnm lnmVar, yfc0 yfc0Var) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.c = k6e0Var;
        this.e = yfc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkk0(ven0 ven0Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.d = ven0Var;
        this.e = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wkk0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
