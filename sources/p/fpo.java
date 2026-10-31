package p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.address.endpoint.model.v1.proto.FieldValue;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormRequest;
import com.spotify.address.endpoint.model.v1.proto.SubmitFormResponse;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fpo extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpo(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new fpo((em31) this.c, (qb71) obj, lnmVar, (byte) 0);
            case 1:
                return new fpo((en31) this.c, (iu30) obj, lnmVar, (byte) 1);
            case 2:
                return new fpo((hur) this.c, (String) obj, lnmVar, (byte) 2);
            case 3:
                return new fpo((uus) this.c, (zus) obj, lnmVar, (byte) 3);
            case 4:
                return new fpo((mmw) this.c, (uew) obj, lnmVar, (byte) 4);
            case 5:
                return new fpo((bhf) this.c, (cwy) obj, lnmVar, (byte) 5);
            case 6:
                return new fpo((mu10) this.c, (dt10) obj, lnmVar, (byte) 6);
            case 7:
                return new fpo((mu10) this.c, (rt10) obj, lnmVar, (byte) 7);
            case 8:
                return new fpo((mu10) this.c, (et10) obj, lnmVar, (byte) 8);
            case 9:
                return new fpo((bf20) this.c, (String) obj, lnmVar, (byte) 9);
            case 10:
                return new fpo((d340) this.c, (String) obj, lnmVar, (byte) 10);
            case 11:
                return new fpo((gh40) this.c, (String) obj, lnmVar, (byte) 11);
            case 12:
                return new fpo((pn80) this.c, (String) obj, lnmVar, (byte) 12);
            case 13:
                return new fpo((e831) this.c, (aje0) obj, lnmVar, (byte) 13);
            case 14:
                return new fpo((ia90) this.c, (na90) obj, lnmVar, (byte) 14);
            case 15:
                return new fpo((wp20) this.c, (hvk) obj, lnmVar, (byte) 15);
            case 16:
                return new fpo((pob0) this.c, (lbh) obj, lnmVar, (byte) 16);
            case 17:
                return new fpo((k0d0) this.c, (String) obj, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new fpo((h3d0) obj, lnmVar);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new fpo((wj3) this.c, (Set) obj, lnmVar, (byte) 19);
            case 20:
                return new fpo((byg0) this.c, (dg30) obj, lnmVar, (byte) 20);
            case 21:
                return new fpo((ouj0) this.c, (String) obj, lnmVar, (byte) 21);
            case 22:
                return new fpo((ges) this.c, (gun0) obj, lnmVar, (byte) 22);
            case 23:
                return new fpo((NotificationHandlingQuasarWorker) this.c, (LinkedHashMap) obj, lnmVar, (byte) 23);
            case 24:
                return new fpo((NotificationHandlingQuasarWorker) this.c, (rba) obj, lnmVar, (byte) 24);
            case 25:
                return new fpo((gqo0) this.c, (String) obj, lnmVar, (byte) 25);
            case 26:
                return new fpo((hfu0) this.c, (x5p0) obj, lnmVar, (byte) 26);
            case 27:
                return new fpo((njv0) this.c, (uiv0) obj, lnmVar, (byte) 27);
            case 28:
                return new fpo((tzr0) this.c, (ogb1) obj, lnmVar, (byte) 28);
            default:
                return new fpo((xmu0) this.c, (aby0) obj, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.lnm] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Object invokeSuspend(Object obj) {
        Object objY;
        Object objC;
        Object objX;
        Object objI;
        Object next;
        Object obj2;
        r3d0 r3d0VarA;
        qxc0 qxc0Var;
        Object objJ;
        Object objP;
        Object objA;
        Object objA2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Serializable serializable = d9n.a;
        Object obj3 = this.d;
        byte b2 = 1;
        ?? r8 = 0;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                em31 em31Var = (em31) this.c;
                String str = ((qb71) obj3).a;
                this.b = true;
                Object objA3 = em31Var.a(str, this);
                return objA3 == serializable ? serializable : objA3;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                en31 en31Var = (en31) this.c;
                guo guoVar = new guo((byte) 0, (lnm) null, (iu30) obj3, en31Var);
                this.b = true;
                Object objT = en31Var.t(false, guoVar, this);
                return objT == serializable ? serializable : objT;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    objY = ((hur) this.c).y((String) obj3, this);
                    if (objY == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objY = obj;
                }
                return new huz(objY, (byte) 10);
            case 3:
                uus uusVar = (uus) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    uusVar.a.e();
                    bpb1 bpb1Var = ((zus) obj3).f;
                    eum eumVar = new eum(uusVar, (lnm) null, (byte) 26);
                    this.b = true;
                    if (b5p1.j(bpb1Var, eumVar, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.TRUE;
            case 4:
                uew uewVar = (uew) obj3;
                mmw mmwVar = (mmw) this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    i12 i12Var = mmwVar.b;
                    mmc1 mmc1VarP = SubmitFormRequest.p();
                    mmc1VarP.q(mmwVar.a());
                    Map map = uewVar.a;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        g320 g320VarN = FieldValue.n();
                        g320VarN.n((String) entry.getKey());
                        g320VarN.q((String) entry.getValue());
                        arrayList.add(g320VarN.build());
                    }
                    mmc1VarP.n(arrayList);
                    SubmitFormRequest submitFormRequestBuild = mmc1VarP.build();
                    this.b = true;
                    objC = i12Var.c(submitFormRequestBuild, this);
                    if (objC == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                return new uvz((SubmitFormResponse) objC, uewVar.a);
            case 5:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bhf bhfVar = (bhf) this.c;
                ywy ywyVar = ((cwy) obj3).b;
                this.b = true;
                Object objV = fj30.v(bhfVar, ywyVar, this);
                return objV == serializable ? serializable : objV;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m7o0 m7o0Var = ((mu10) this.c).b;
                dt10 dt10Var = (dt10) obj3;
                String str2 = dt10Var.a;
                String str3 = dt10Var.b;
                this.b = true;
                Object objA4 = m7o0Var.a(str2, str3, this);
                return objA4 == serializable ? serializable : objA4;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m7o0 m7o0Var2 = ((mu10) this.c).b;
                rt10 rt10Var = (rt10) obj3;
                String str4 = rt10Var.a;
                String str5 = rt10Var.b;
                this.b = true;
                Object objD = m7o0Var2.d(str4, str5, this);
                return objD == serializable ? serializable : objD;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m7o0 m7o0Var3 = ((mu10) this.c).b;
                String str6 = ((et10) obj3).a;
                this.b = true;
                Object objB = m7o0Var3.b(str6, this);
                return objB == serializable ? serializable : objB;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    this.b = true;
                    return bf20.a((bf20) this.c, (String) obj3, this) == serializable ? serializable : rih1Var;
                }
                if (z10) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA5 = ((d340) this.c).a((String) obj3, this);
                    return objA5 == serializable ? serializable : objA5;
                }
                if (z11) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    this.b = true;
                    Serializable serializableD = ((gh40) this.c).a.d((String) obj3, this);
                    return serializableD == serializable ? serializable : serializableD;
                }
                if (z12) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                pn80 pn80Var = (pn80) this.c;
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        Logger.g("Running referrer matching", new Object[0]);
                        this.b = true;
                        objX = pn80Var.f.x((String) obj3, this);
                        if (objX == serializable) {
                            return serializable;
                        }
                    } else {
                        if (!z13) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objX = obj;
                    }
                    v8h0 v8h0Var = (v8h0) objX;
                    bma1 bma1Var = pn80.j;
                    pn80Var.c();
                    String str7 = v8h0Var != null ? v8h0Var.b : null;
                    if (v8h0Var == null || !v8h0Var.a || str7 == null) {
                        return rih1Var;
                    }
                    Logger.g("Referrer matching: Got deep link %s: ", new Object[]{str7});
                    return rih1Var;
                } catch (IOException unused) {
                    bma1 bma1Var2 = pn80.j;
                    if (!pn80Var.d("transport")) {
                        return rih1Var;
                    }
                    pn80Var.c();
                    return rih1Var;
                }
            case 13:
                boolean z14 = this.b;
                if (z14) {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                    return (String) objI;
                }
                hm5.M(obj);
                Activity activityA = ((e831) this.c).a();
                if (activityA != null) {
                    this.b = true;
                    objI = ((aje0) obj3).i(activityA, this);
                    if (objI == serializable) {
                        return serializable;
                    }
                    return (String) objI;
                }
                return null;
            case 14:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cz30 cz30Var = ((ia90) this.c).g;
                String str8 = ((na90) obj3).d.g;
                this.b = true;
                return cz30Var.c(str8, this) == serializable ? serializable : rih1Var;
            case 15:
                wp20 wp20Var = (wp20) this.c;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    q8n q8nVar = (q8n) wp20Var.e;
                    m2a0 m2a0Var = new m2a0((hvk) obj3, wp20Var, r8, (byte) 4);
                    this.b = true;
                    if (fn31.Y(q8nVar, m2a0Var, this) == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((p681) wp20Var.d).b.a(rih1Var);
                return yvk.a;
            case 16:
                lbh lbhVar = (lbh) obj3;
                pob0 pob0Var = (pob0) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!pob0Var.d()) {
                    return rih1Var;
                }
                n511 n511VarA = pob0Var.b().a();
                float f = n511VarA.a + 0.0f;
                float f2 = n511VarA.b + 0.0f;
                float f3 = n511VarA.c - 0.0f;
                float f4 = n511VarA.d - 0.0f;
                float fD = c13.d(f3, f, 2.0f, f);
                float fD2 = c13.d(f4, f2, 2.0f, f2);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L)) >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L)) & 4294967295L));
                ArrayList arrayList2 = lbhVar.c;
                lr80 it = p7h.K(arrayList2).iterator();
                sr80 sr80Var = (sr80) it;
                if (sr80Var.c) {
                    lr80 lr80Var = it;
                    next = lr80Var.next();
                    if (sr80Var.c) {
                        r8 = next;
                        long jF = ((n511) arrayList2.get(((Number) next).intValue())).f();
                        float fPow = ((float) Math.pow(Float.intBitsToFloat((int) (jF >> 32)) - fIntBitsToFloat, 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (jF & 4294967295L)) - fIntBitsToFloat2, 2.0d));
                        Object obj4 = next;
                        while (true) {
                            Object next2 = lr80Var.next();
                            long jF2 = ((n511) arrayList2.get(((Number) next2).intValue())).f();
                            float f5 = fIntBitsToFloat2;
                            Object obj5 = obj4;
                            float fPow2 = ((float) Math.pow(Float.intBitsToFloat((int) (jF2 >> 32)) - fIntBitsToFloat, 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (jF2 & 4294967295L)) - f5, 2.0d));
                            if (Float.compare(fPow, fPow2) > 0) {
                                fPow = fPow2;
                                obj2 = next2;
                            } else {
                                obj2 = obj5;
                            }
                            if (sr80Var.c) {
                                pob0Var = pob0Var;
                                fIntBitsToFloat2 = f5;
                                obj4 = obj2;
                            } else {
                                r8 = obj2;
                            }
                        }
                    }
                }
                r8 = next;
                Integer num = (Integer) r8;
                int iIntValue = num != null ? num.intValue() : -1;
                mob0 mob0Var = new mob0(pob0Var, iIntValue, pob0Var.a(iIntValue, lbhVar), (lnm) null);
                this.b = true;
                return smo1.s(mob0Var, this) == serializable ? serializable : rih1Var;
            case 17:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                k0d0 k0d0Var = (k0d0) this.c;
                ur00 ur00Var = k0d0Var.c;
                String str9 = k0d0Var.a;
                t4u0 t4u0Var = k0d0Var.g;
                this.b = true;
                return ur00Var.w(str9, usc0.b, (String) obj3, t4u0Var, this) == serializable ? serializable : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                h3d0 h3d0Var = (h3d0) obj3;
                l3d0 l3d0Var = h3d0Var.e;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        r3d0 r3d0Var = (r3d0) this.c;
                        hm5.M(obj);
                        r3d0VarA = r3d0Var;
                        objJ = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                r3d0VarA = h3d0Var.d.a(l3d0Var.b);
                qxc0Var = l3d0Var.c;
                if (qxc0Var == null) {
                    rsc0 rsc0Var = h3d0Var.b;
                    rxc0 rxc0Var = new rxc0(l3d0Var.a);
                    this.c = r3d0VarA;
                    this.b = true;
                    objJ = rsc0Var.j(rxc0Var, this);
                    if (objJ == serializable) {
                        return serializable;
                    }
                }
                return new sia1(r3d0VarA, qxc0Var);
                oy21 oy21Var = (py21) objJ;
                oy21Var.getClass();
                if (oy21Var instanceof ly21) {
                    eg.m("Failed to load list metadata");
                } else {
                    if (oy21Var instanceof oy21) {
                        qxc0Var = (qxc0) oy21Var.a;
                        return new sia1(r3d0VarA, qxc0Var);
                    }
                    eg.o();
                }
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    this.b = true;
                    return ((wj3) this.c).q((Set) obj3, this) == serializable ? serializable : rih1Var;
                }
                if (z20) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    this.b = true;
                    return ((byg0) this.c).b((dg30) obj3, this) == serializable ? serializable : rih1Var;
                }
                if (z21) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                sii0 sii0VarF = ((ouj0) this.c).f((String) obj3);
                this.b = true;
                Object objI2 = b5p1.i(sii0VarF, this);
                return objI2 == serializable ? serializable : objI2;
            case 22:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarI = t5p1.i(((ges) this.c).getRenderedState());
                fun0 fun0Var = new fun0((gun0) obj3, (byte) 0);
                this.b = true;
                return mr20VarI.collect(fun0Var, this) == serializable ? serializable : rih1Var;
            case 23:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    ix7 ix7Var = ((NotificationHandlingQuasarWorker) this.c).s;
                    this.b = true;
                    return ix7Var.n((LinkedHashMap) obj3, this) == serializable ? serializable : rih1Var;
                }
                if (z24) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d520 d520Var = ((NotificationHandlingQuasarWorker) this.c).r;
                this.b = true;
                Object objN = d520Var.N((rba) obj3, this);
                return objN == serializable ? serializable : objN;
            case 25:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.b = true;
                    return ((zoo0) ((gqo0) this.c).d.get()).k((String) obj3, this) == serializable ? serializable : rih1Var;
                }
                if (z26) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                hfu0 hfu0Var = (hfu0) this.c;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        objP = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                long j = x5p0.g;
                q5p0 q5p0Var = new q5p0((x5p0) obj3, hfu0Var, r8, b2);
                this.b = true;
                objP = rc2.P(j, q5p0Var, this);
                if (objP == serializable) {
                    return serializable;
                }
                Boolean bool = (Boolean) objP;
                if (bool == null) {
                    return j5p0.a;
                }
                if (bool.equals(Boolean.FALSE)) {
                    return k5p0.a;
                }
                if (bool.equals(Boolean.TRUE)) {
                    return new i5p0(hfu0Var);
                }
                eg.o();
                return null;
            case 27:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                drj0 drj0Var = ((njv0) this.c).b;
                String str10 = ((uiv0) obj3).a;
                this.b = true;
                return fn31.Y((q8n) drj0Var.c, new hl0(false, drj0Var, str10, (lnm) null, (byte) 16), this) == serializable ? serializable : rih1Var;
            case 28:
                ogb1 ogb1Var = (ogb1) obj3;
                zgb1 zgb1Var = ogb1Var.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    t0c t0cVarF = lcc.F(zgb1Var.t);
                    ez61 ez61Var = zgb1Var.c;
                    this.b = true;
                    objA = bhf.a(t0cVarF, ez61Var);
                    if (objA == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                xgf xgfVar = (xgf) objA;
                Uri uri = ogb1Var.c;
                return new wgf(xgfVar, uri != null ? new fhf(uri) : null, new r771(zgb1Var.b));
            default:
                aby0 aby0Var = (aby0) obj3;
                kby0 kby0Var = aby0Var.a;
                boolean z30 = this.b;
                if (!z30) {
                    hm5.M(obj);
                    t0c t0cVarF2 = lcc.F(kby0Var.h);
                    dz61 dz61Var = dz61.d;
                    this.b = true;
                    objA2 = bhf.a(t0cVarF2, dz61Var);
                    if (objA2 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z30) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = obj;
                }
                xgf xgfVar2 = (xgf) objA2;
                Uri uri2 = aby0Var.c;
                return new wgf(xgfVar2, uri2 != null ? new fhf(uri2) : null, new r771(kby0Var.b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpo(h3d0 h3d0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = (byte) 18;
        this.d = h3d0Var;
    }
}
