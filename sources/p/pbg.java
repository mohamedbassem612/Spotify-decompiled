package p;

import android.content.SharedPreferences;
import com.spotify.address.endpoint.model.v1.proto.GetFormRequest;
import com.spotify.address.endpoint.model.v1.proto.GetFormResponse;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pbg extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbg(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new pbg((sbg) obj, lnmVar, (byte) 0);
            case 1:
                return new pbg((ldg) obj, lnmVar, (byte) 1);
            case 2:
                return new pbg((lak) obj, lnmVar, (byte) 2);
            case 3:
                return new pbg((hjk) obj, lnmVar, (byte) 3);
            case 4:
                return new pbg((jpk) obj, lnmVar, (byte) 4);
            case 5:
                return new pbg((qll) obj, lnmVar, (byte) 5);
            case 6:
                return new pbg((Single) obj, lnmVar, (byte) 6);
            case 7:
                return new pbg((cdn) obj, lnmVar, (byte) 7);
            case 8:
                return new pbg((hto) obj, lnmVar, (byte) 8);
            case 9:
                return new pbg((cyq) obj, lnmVar, (byte) 9);
            case 10:
                return new pbg((bu71) obj, lnmVar, (byte) 10);
            case 11:
                return new pbg((e8t) obj, lnmVar, (byte) 11);
            case 12:
                return new pbg((lat) obj, lnmVar, (byte) 12);
            case 13:
                return new pbg((rau) obj, lnmVar, (byte) 13);
            case 14:
                return new pbg((tnv) obj, lnmVar, (byte) 14);
            case 15:
                return new pbg((zeu) obj, lnmVar, (byte) 15);
            case 16:
                return new pbg((mtv) obj, lnmVar, (byte) 16);
            case 17:
                return new pbg((yzu) obj, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new pbg((uwv) obj, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new pbg((iyv) obj, lnmVar, (byte) 19);
            case 20:
                return new pbg((t3w) obj, lnmVar, (byte) 20);
            case 21:
                return new pbg((mmw) obj, lnmVar, (byte) 21);
            case 22:
                return new pbg((g810) obj, lnmVar, (byte) 22);
            case 23:
                return new pbg((zm10) obj, lnmVar, (byte) 23);
            case 24:
                return new pbg((d140) obj, lnmVar, (byte) 24);
            case 25:
                return new pbg((zb40) obj, lnmVar, (byte) 25);
            case 26:
                return new pbg((xb60) obj, lnmVar, (byte) 26);
            case 27:
                return new pbg((z9) obj, lnmVar, (byte) 27);
            case 28:
                return new pbg((b890) obj, lnmVar, (byte) 28);
            default:
                return new pbg((cwa0) obj, lnmVar, (byte) 29);
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

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Serializable serializable = d9n.a;
        lnm lnmVar = null;
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
                xid xidVar = ((sbg) obj2).b;
                this.b = true;
                Object objO = xidVar.o(this);
                return objO == serializable ? serializable : objO;
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
                cce cceVar = ((ldg) obj2).b;
                this.b = true;
                Object objQ = cceVar.q(this);
                return objQ == serializable ? serializable : objQ;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS = smo1.s(new og5((lak) obj2, lnmVar, (byte) 9), this);
                    return objS == serializable ? serializable : objS;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hjk hjkVar = (hjk) obj2;
                this.b = true;
                Object objY = fn31.Y(hjkVar.j, new fjk(hjkVar, (lnm) null), this);
                return objY == serializable ? serializable : objY;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jpk jpkVar = (jpk) obj2;
                ps7 ps7Var = jpkVar.d;
                String str = jpkVar.b.a;
                this.b = true;
                Object objC = ps7Var.c(str, (String) null, this);
                return objC == serializable ? serializable : objC;
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
                qll qllVar = (qll) obj2;
                q59 q59Var = qllVar.c;
                sll sllVar = qllVar.d;
                String str2 = sllVar.b;
                boolean z7 = sllVar.c;
                this.b = true;
                Object objH = q59Var.h(str2, this, z7);
                return objH == serializable ? serializable : objH;
            case 6:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    obj = fc11.j((Single) obj2, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
            case 7:
                cdn cdnVar = (cdn) obj2;
                edn ednVar = cdnVar.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    gal galVar = cdnVar.d;
                    Set set = s4b1.f;
                    String strH = uic.x(ednVar.a).h();
                    this.b = true;
                    obj = galVar.g(strH, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ycn ycnVar = cdnVar.e;
                int iL = ycnVar.b.b(ycnVar.a, ednVar.b).l(ycn.c, 0);
                Set set2 = s4b1.f;
                return new zcn(iL, uic.x(ednVar.a).h(), ednVar.b, (List) obj);
            case 8:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    Single singleZ = ((hto) obj2).j.J(zp8.U0).z();
                    this.b = true;
                    obj = fc11.j(singleZ, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return obj;
            case 9:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                p5 p5Var = ((cyq) obj2).d;
                this.b = true;
                Object objD = p5Var.d(this);
                return objD == serializable ? serializable : objD;
            case 10:
                boolean z12 = this.b;
                Serializable serializable2 = rih1.a;
                if (!z12) {
                    hm5.M(obj);
                    bu71 bu71Var = (bu71) obj2;
                    this.b = true;
                    LinkedHashSet linkedHashSet = bu71Var.c;
                    if (!linkedHashSet.isEmpty()) {
                        SharedPreferences.Editor editorEdit = bu71Var.b.edit();
                        editorEdit.getClass();
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                        editorEdit.apply();
                        linkedHashSet.clear();
                    }
                    if (serializable2 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return serializable2;
            case 11:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e8t e8tVar = (e8t) obj2;
                k2b0 k2b0Var = e8tVar.d;
                String str3 = e8tVar.b.a;
                this.b = true;
                Object objB = k2b0Var.b(str3, this);
                return objB == serializable ? serializable : objB;
            case 12:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lat latVar = (lat) obj2;
                dv9 dv9Var = latVar.c;
                nat natVar = latVar.b;
                String str4 = natVar.a;
                String str5 = natVar.b;
                boolean z15 = natVar.c;
                this.b = true;
                Object objB2 = dv9Var.b(str4, str5, this, z15);
                return objB2 == serializable ? serializable : objB2;
            case 13:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rau rauVar = (rau) obj2;
                ytp0 ytp0Var = rauVar.b;
                abu abuVar = rauVar.d;
                String strA = abuVar.a();
                this.b = true;
                Object objW = ytp0Var.w(abuVar, strA, this);
                return objW == serializable ? serializable : objW;
            case 14:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kba kbaVar = ((tnv) obj2).e;
                this.b = true;
                Object objB3 = kbaVar.b(this);
                return objB3 == serializable ? serializable : objB3;
            case 15:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.b = true;
                    Object objL = ((zeu) obj2).l(this);
                    return objL == serializable ? serializable : objL;
                }
                if (z18) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    ve01 ve01Var = ((mtv) obj2).b.b;
                    this.b = true;
                    obj = b5p1.i(ve01Var, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                wqv wqvVar = (wqv) obj;
                return new f8e0((wsc0) wqvVar.a.d(), wqvVar.b, wqvVar.c, wqvVar.d);
            case 17:
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA = ((yzu) obj2).A(this);
                    return objA == serializable ? serializable : objA;
                }
                if (z20) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ve01 ve01Var2 = ((uwv) obj2).b.a;
                this.b = true;
                Object objI = b5p1.i(ve01Var2, this);
                return objI == serializable ? serializable : objI;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
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
                cxv cxvVar = ((iyv) obj2).c;
                x010 x010Var = new x010(cxvVar.a, cxvVar.b, new al3(3, (lnm) null, (byte) 5), (byte) 1);
                this.b = true;
                Object objI2 = b5p1.i(x010Var, this);
                return objI2 == serializable ? serializable : objI2;
            case 20:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC2 = ((t3w) obj2).c(this);
                    return objC2 == serializable ? serializable : objC2;
                }
                if (z23) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                mmw mmwVar = (mmw) obj2;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    i12 i12Var = mmwVar.b;
                    kn40 kn40VarO = GetFormRequest.o();
                    kn40VarO.n(mmwVar.a());
                    GetFormRequest getFormRequestBuild = kn40VarO.build();
                    this.b = true;
                    obj = i12Var.a(getFormRequestBuild, this);
                    if (obj == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new byz((GetFormResponse) obj);
            case 22:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA2 = ((g810) obj2).a(this);
                    return objA2 == serializable ? serializable : objA2;
                }
                if (z25) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zm10 zm10Var = (zm10) obj2;
                kp00 kp00Var = zm10Var.e;
                bn10 bn10Var = zm10Var.b;
                String str6 = bn10Var.b;
                boolean z27 = bn10Var.c;
                this.b = true;
                Object objG = kp00Var.g(str6, this, z27);
                return objG == serializable ? serializable : objG;
            case 24:
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS2 = smo1.s(new ae1((d140) obj2, null), this);
                    return objS2 == serializable ? serializable : objS2;
                }
                if (z28) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zb40 zb40Var = (zb40) obj2;
                va40 va40Var = zb40Var.d;
                String str7 = zb40Var.c.d;
                this.b = true;
                Serializable serializableB = va40Var.b(str7, this);
                return serializableB == serializable ? serializable : serializableB;
            case 26:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                og5 og5Var = new og5((xb60) obj2, lnmVar, (byte) 19);
                this.b = true;
                Object objS3 = smo1.s(og5Var, this);
                return objS3 == serializable ? serializable : objS3;
            case 27:
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    this.b = true;
                    Object objD2 = s110.h(getContext()).D((z9) obj2, this);
                    return objD2 == serializable ? serializable : objD2;
                }
                if (z31) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC3 = ((b890) obj2).c(this);
                    return objC3 == serializable ? serializable : objC3;
                }
                if (z32) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z33 = this.b;
                if (z33) {
                    if (z33) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bza0 bza0Var = ((cwa0) obj2).b;
                this.b = true;
                Object objE = bza0Var.e(this);
                return objE == serializable ? serializable : objE;
        }
    }
}
