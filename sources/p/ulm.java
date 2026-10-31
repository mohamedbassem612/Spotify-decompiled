package p;

import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$StreamSettingChange;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService$UserSettingChange;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ItemResumePoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ulm implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ ulm(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:139:0x022f  */
    /* JADX WARN: Code duplicated, block: B:154:0x026e  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:197:0x0313  */
    /* JADX WARN: Code duplicated, block: B:212:0x0357  */
    /* JADX WARN: Code duplicated, block: B:233:0x039d  */
    /* JADX WARN: Code duplicated, block: B:256:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:277:0x042f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0467  */
    /* JADX WARN: Code duplicated, block: B:307:0x049f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:322:0x04da  */
    /* JADX WARN: Code duplicated, block: B:344:0x0521  */
    /* JADX WARN: Code duplicated, block: B:371:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:390:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:405:0x063d  */
    /* JADX WARN: Code duplicated, block: B:428:0x0695  */
    /* JADX WARN: Code duplicated, block: B:446:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:475:0x0764  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:483:0x077c  */
    /* JADX WARN: Code duplicated, block: B:501:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:520:0x0835  */
    /* JADX WARN: Code duplicated, block: B:539:0x087b  */
    /* JADX WARN: Code duplicated, block: B:561:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:579:0x0914  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:681:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x017b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        tlm tlmVar;
        ksm ksmVar;
        ysm ysmVar;
        kpm kpmVar;
        cum cumVar;
        x5n x5nVar;
        ndn ndnVar;
        kjn kjnVar;
        gax gaxVar;
        ljn ljnVar;
        i0o i0oVar;
        e0o d0oVar;
        j0o j0oVar;
        r3o r3oVar;
        s3o s3oVar;
        t3o t3oVar;
        w3o w3oVar;
        g4o g4oVar;
        k4o k4oVar;
        l4o l4oVar;
        v4o v4oVar;
        w6o w6oVar;
        String str;
        aao aaoVar;
        bao baoVar;
        cao caoVar;
        nio nioVar;
        pko pkoVar;
        wko wkoVar;
        alo aloVar;
        blo bloVar;
        jlo jloVar;
        bmo bmoVar;
        pmo pmoVar;
        byte b = this.a;
        z = false;
        z = false;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        ep90 w9oVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof tlm) {
                    tlmVar = (tlm) lnmVar;
                    int i = tlmVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tlmVar.b = i - Integer.MIN_VALUE;
                    } else {
                        tlmVar = new tlm(this, lnmVar);
                    }
                } else {
                    tlmVar = new tlm(this, lnmVar);
                }
                Object obj2 = tlmVar.a;
                int i2 = tlmVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Object objH = ((spq0) obj).h();
                if (objH == null) {
                    return rih1Var;
                }
                tlmVar.b = 1;
                return vr20Var.emit(objH, tlmVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof ksm) {
                    ksmVar = (ksm) lnmVar;
                    int i3 = ksmVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ksmVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        ksmVar = new ksm(this, lnmVar);
                    }
                } else {
                    ksmVar = new ksm(this, lnmVar);
                }
                Object obj3 = ksmVar.a;
                int i4 = ksmVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                i1r i1rVar = (k1r) obj;
                Boolean boolValueOf = Boolean.valueOf(i1rVar instanceof i1r ? u890.j(((pt50) i1rVar.a).a, Boolean.TRUE) : false);
                ksmVar.b = 1;
                return vr20Var.emit(boolValueOf, ksmVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof ysm) {
                    ysmVar = (ysm) lnmVar;
                    int i5 = ysmVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ysmVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ysmVar = new ysm(this, lnmVar);
                    }
                } else {
                    ysmVar = new ysm(this, lnmVar);
                }
                Object obj4 = ysmVar.a;
                int i6 = ysmVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                i1r i1rVar2 = (k1r) obj;
                if ((i1rVar2 instanceof i1r) && (kpmVar = ((nqm) i1rVar2.a).a) != null && kpmVar.b) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                ysmVar.b = 1;
                return vr20Var.emit(boolValueOf2, ysmVar) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof cum) {
                    cumVar = (cum) lnmVar;
                    int i7 = cumVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        cumVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        cumVar = new cum(this, lnmVar);
                    }
                } else {
                    cumVar = new cum(this, lnmVar);
                }
                Object obj5 = cumVar.a;
                int i8 = cumVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                i1r i1rVar3 = (k1r) obj;
                qt50 qt50Var = i1rVar3 instanceof i1r ? (qt50) i1rVar3.a : new qt50((Boolean) null);
                cumVar.b = 1;
                return vr20Var.emit(qt50Var, cumVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof x5n) {
                    x5nVar = (x5n) lnmVar;
                    int i9 = x5nVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x5nVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        x5nVar = new x5n(this, lnmVar);
                    }
                } else {
                    x5nVar = new x5n(this, lnmVar);
                }
                Object obj6 = x5nVar.a;
                int i10 = x5nVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                Map mapO = ((ResumptionProgressEsperanto$GetResumePointResponse) obj).o();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapO.size()));
                for (Map.Entry entry : mapO.entrySet()) {
                    linkedHashMap.put(entry.getKey(), new Long(((ResumptionProgressEsperanto$ItemResumePoint) entry.getValue()).p().o().p()));
                }
                x5nVar.b = 1;
                return vr20Var.emit(linkedHashMap, x5nVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof ndn) {
                    ndnVar = (ndn) lnmVar;
                    int i11 = ndnVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ndnVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        ndnVar = new ndn(this, lnmVar);
                    }
                } else {
                    ndnVar = new ndn(this, lnmVar);
                }
                Object obj7 = ndnVar.a;
                int i12 = ndnVar.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    Boolean boolValueOf3 = Boolean.valueOf(((dlb) obj) != null);
                    ndnVar.b = 1;
                    return vr20Var.emit(boolValueOf3, ndnVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof kjn) {
                    kjnVar = (kjn) lnmVar;
                    int i13 = kjnVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        kjnVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        kjnVar = new kjn(this, lnmVar);
                    }
                } else {
                    kjnVar = new kjn(this, lnmVar);
                }
                Object obj8 = kjnVar.a;
                int i14 = kjnVar.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    fzr0 fzr0Var = (gzr0) obj;
                    if (fzr0Var instanceof fzr0) {
                        int iC = l1d.C(fzr0Var.b);
                        if (iC == 0) {
                            gaxVar = iax.a;
                        } else if (iC == 1) {
                            gaxVar = new gax(new Integer(2131961783), (String) null);
                        } else if (iC == 2) {
                            gaxVar = new gax(new Integer(2131961784), (String) null);
                        } else if (iC == 3) {
                            gaxVar = new gax(new Integer(2131961785), (String) null);
                        } else if (iC == 4) {
                            gaxVar = new gax(new Integer(2131961782), (String) null);
                        } else {
                            eg.o();
                        }
                        kjnVar.b = 1;
                        if (vr20Var.emit(gaxVar, kjnVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    if (fzr0Var instanceof ezr0) {
                        gaxVar = new gax(new Integer(2131961783), (String) null);
                        kjnVar.b = 1;
                        if (vr20Var.emit(gaxVar, kjnVar) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 7:
                if (lnmVar instanceof ljn) {
                    ljnVar = (ljn) lnmVar;
                    int i15 = ljnVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ljnVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        ljnVar = new ljn(this, lnmVar);
                    }
                } else {
                    ljnVar = new ljn(this, lnmVar);
                }
                Object obj9 = ljnVar.a;
                int i16 = ljnVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                Boolean bool = (Boolean) ((cma1) obj).a;
                Boolean boolValueOf4 = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                ljnVar.b = 1;
                return vr20Var.emit(boolValueOf4, ljnVar) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof i0o) {
                    i0oVar = (i0o) lnmVar;
                    int i17 = i0oVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        i0oVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        i0oVar = new i0o(this, lnmVar);
                    }
                } else {
                    i0oVar = new i0o(this, lnmVar);
                }
                Object obj10 = i0oVar.a;
                int i18 = i0oVar.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    c1o c1oVar = (c1o) obj;
                    if (c1oVar instanceof b1o) {
                        d0oVar = new e0o(((b1o) c1oVar).a);
                    } else if (c1oVar instanceof a1o) {
                        a1o a1oVar = (a1o) c1oVar;
                        d0oVar = new d0o(a1oVar.a, a1oVar.b);
                    } else {
                        eg.o();
                    }
                    i0oVar.b = 1;
                    return vr20Var.emit(d0oVar, i0oVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof j0o) {
                    j0oVar = (j0o) lnmVar;
                    int i19 = j0oVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        j0oVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        j0oVar = new j0o(this, lnmVar);
                    }
                } else {
                    j0oVar = new j0o(this, lnmVar);
                }
                Object obj11 = j0oVar.a;
                int i20 = j0oVar.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf5 = Boolean.valueOf(((ibk0) obj).b());
                    j0oVar.b = 1;
                    return vr20Var.emit(boolValueOf5, j0oVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof r3o) {
                    r3oVar = (r3o) lnmVar;
                    int i21 = r3oVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        r3oVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        r3oVar = new r3o(this, lnmVar);
                    }
                } else {
                    r3oVar = new r3o(this, lnmVar);
                }
                Object obj12 = r3oVar.a;
                int i22 = r3oVar.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                List list = ((oqc0) obj).c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(xgc.w(((nqc0) it.next()).a));
                }
                r3oVar.b = 1;
                return vr20Var.emit(arrayList, r3oVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof s3o) {
                    s3oVar = (s3o) lnmVar;
                    int i23 = s3oVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        s3oVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        s3oVar = new s3o(this, lnmVar);
                    }
                } else {
                    s3oVar = new s3o(this, lnmVar);
                }
                Object obj13 = s3oVar.a;
                int i24 = s3oVar.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                List list2 = ((owc0) obj).b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj14 : list2) {
                    fji0 fji0Var = (fji0) obj14;
                    if (fji0Var.c || fji0Var.f != wls0.d) {
                        arrayList2.add(obj14);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(xgc.w(((fji0) it2.next()).a));
                }
                s3oVar.b = 1;
                return vr20Var.emit(arrayList3, s3oVar) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof t3o) {
                    t3oVar = (t3o) lnmVar;
                    int i25 = t3oVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        t3oVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        t3oVar = new t3o(this, lnmVar);
                    }
                } else {
                    t3oVar = new t3o(this, lnmVar);
                }
                Object obj15 = t3oVar.a;
                int i26 = t3oVar.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                i1r i1rVar4 = (k1r) obj;
                i1r i1rVar5 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                w9oVar = i1rVar5 != null ? (owc0) i1rVar5.a : null;
                if (w9oVar == null) {
                    return rih1Var;
                }
                t3oVar.b = 1;
                return vr20Var.emit(w9oVar, t3oVar) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof w3o) {
                    w3oVar = (w3o) lnmVar;
                    int i27 = w3oVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        w3oVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        w3oVar = new w3o(this, lnmVar);
                    }
                } else {
                    w3oVar = new w3o(this, lnmVar);
                }
                Object obj16 = w3oVar.a;
                int i28 = w3oVar.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    b1o b1oVar = new b1o((List) obj);
                    w3oVar.b = 1;
                    return vr20Var.emit(b1oVar, w3oVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof g4o) {
                    g4oVar = (g4o) lnmVar;
                    int i29 = g4oVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        g4oVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        g4oVar = new g4o(this, lnmVar);
                    }
                } else {
                    g4oVar = new g4o(this, lnmVar);
                }
                Object obj17 = g4oVar.a;
                int i30 = g4oVar.b;
                if (i30 == 0) {
                    hm5.M(obj17);
                    String str2 = ((th61) obj).a;
                    g4oVar.b = 1;
                    return vr20Var.emit(str2, g4oVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof k4o) {
                    k4oVar = (k4o) lnmVar;
                    int i31 = k4oVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        k4oVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        k4oVar = new k4o(this, lnmVar);
                    }
                } else {
                    k4oVar = new k4o(this, lnmVar);
                }
                Object obj18 = k4oVar.a;
                int i32 = k4oVar.b;
                if (i32 == 0) {
                    hm5.M(obj18);
                    String str3 = ((th61) obj).a;
                    k4oVar.b = 1;
                    return vr20Var.emit(str3, k4oVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof l4o) {
                    l4oVar = (l4o) lnmVar;
                    int i33 = l4oVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        l4oVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        l4oVar = new l4o(this, lnmVar);
                    }
                } else {
                    l4oVar = new l4o(this, lnmVar);
                }
                Object obj19 = l4oVar.a;
                int i34 = l4oVar.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                ep90 ep90Var = (z7d) obj;
                w9oVar = ep90Var instanceof x7d ? (x7d) ep90Var : null;
                ArrayList arrayList4 = w9oVar != null ? ((x7d) w9oVar).a : z6x.a;
                l4oVar.b = 1;
                return vr20Var.emit(arrayList4, l4oVar) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof v4o) {
                    v4oVar = (v4o) lnmVar;
                    int i35 = v4oVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        v4oVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        v4oVar = new v4o(this, lnmVar);
                    }
                } else {
                    v4oVar = new v4o(this, lnmVar);
                }
                Object obj20 = v4oVar.a;
                int i36 = v4oVar.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                i1r i1rVar6 = (k1r) obj;
                i1r i1rVar7 = i1rVar6 instanceof i1r ? i1rVar6 : null;
                w9oVar = i1rVar7 != null ? (Map) i1rVar7.a : null;
                if (w9oVar == null) {
                    w9oVar = b7x.a;
                }
                u4o u4oVar = new u4o(w9oVar);
                v4oVar.b = 1;
                return vr20Var.emit(u4oVar, v4oVar) == d9nVar ? d9nVar : rih1Var;
            case 18:
                if (lnmVar instanceof w6o) {
                    w6oVar = (w6o) lnmVar;
                    int i37 = w6oVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        w6oVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        w6oVar = new w6o(this, lnmVar);
                    }
                } else {
                    w6oVar = new w6o(this, lnmVar);
                }
                Object obj21 = w6oVar.a;
                int i38 = w6oVar.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                i1r i1rVar8 = (k1r) obj;
                String str4 = "";
                if ((i1rVar8 instanceof i1r) && (str = (String) i1rVar8.a) != null) {
                    str4 = str;
                }
                w6oVar.b = 1;
                return vr20Var.emit(str4, w6oVar) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof aao) {
                    aaoVar = (aao) lnmVar;
                    int i39 = aaoVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        aaoVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        aaoVar = new aao(this, lnmVar);
                    }
                } else {
                    aaoVar = new aao(this, lnmVar);
                }
                Object obj22 = aaoVar.a;
                int i40 = aaoVar.b;
                if (i40 == 0) {
                    hm5.M(obj22);
                    it61 it61Var = new it61(new Integer(((Number) obj).intValue()));
                    aaoVar.b = 1;
                    return vr20Var.emit(it61Var, aaoVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof bao) {
                    baoVar = (bao) lnmVar;
                    int i41 = baoVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        baoVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        baoVar = new bao(this, lnmVar);
                    }
                } else {
                    baoVar = new bao(this, lnmVar);
                }
                Object obj23 = baoVar.a;
                int i42 = baoVar.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                y9o y9oVar = (y9o) obj;
                Integer num = new Integer(y9oVar.a ? y9oVar.b / 1000 : 0);
                baoVar.b = 1;
                return vr20Var.emit(num, baoVar) == d9nVar ? d9nVar : rih1Var;
            case 21:
                if (lnmVar instanceof cao) {
                    caoVar = (cao) lnmVar;
                    int i43 = caoVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        caoVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        caoVar = new cao(this, lnmVar);
                    }
                } else {
                    caoVar = new cao(this, lnmVar);
                }
                Object obj24 = caoVar.a;
                int i44 = caoVar.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                PlaybackSettingsEsperantoService$StreamSettingChange playbackSettingsEsperantoService$StreamSettingChange = (PlaybackSettingsEsperantoService$StreamSettingChange) obj;
                if (playbackSettingsEsperantoService$StreamSettingChange.p()) {
                    PlaybackSettingsEsperantoService$UserSettingChange playbackSettingsEsperantoService$UserSettingChangeO = playbackSettingsEsperantoService$StreamSettingChange.o();
                    if (playbackSettingsEsperantoService$UserSettingChangeO.s()) {
                        w9oVar = new v9o(playbackSettingsEsperantoService$UserSettingChangeO.n());
                    } else if (playbackSettingsEsperantoService$UserSettingChangeO.t()) {
                        w9oVar = new w9o(playbackSettingsEsperantoService$UserSettingChangeO.o());
                    }
                }
                if (w9oVar == null) {
                    return rih1Var;
                }
                caoVar.b = 1;
                return vr20Var.emit(w9oVar, caoVar) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof nio) {
                    nioVar = (nio) lnmVar;
                    int i45 = nioVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        nioVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        nioVar = new nio(this, lnmVar);
                    }
                } else {
                    nioVar = new nio(this, lnmVar);
                }
                Object obj25 = nioVar.a;
                int i46 = nioVar.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    mio mioVar = new mio(((Boolean) obj).booleanValue());
                    nioVar.b = 1;
                    return vr20Var.emit(mioVar, nioVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof pko) {
                    pkoVar = (pko) lnmVar;
                    int i47 = pkoVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        pkoVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        pkoVar = new pko(this, lnmVar);
                    }
                } else {
                    pkoVar = new pko(this, lnmVar);
                }
                Object obj26 = pkoVar.a;
                int i48 = pkoVar.b;
                if (i48 == 0) {
                    hm5.M(obj26);
                    y450 y450Var = new y450((Set) obj);
                    pkoVar.b = 1;
                    return vr20Var.emit(y450Var, pkoVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                if (lnmVar instanceof wko) {
                    wkoVar = (wko) lnmVar;
                    int i49 = wkoVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        wkoVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        wkoVar = new wko(this, lnmVar);
                    }
                } else {
                    wkoVar = new wko(this, lnmVar);
                }
                Object obj27 = wkoVar.a;
                int i50 = wkoVar.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                wkoVar.b = 1;
                return vr20Var.emit(objG, wkoVar) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof alo) {
                    aloVar = (alo) lnmVar;
                    int i51 = aloVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        aloVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        aloVar = new alo(this, lnmVar);
                    }
                } else {
                    aloVar = new alo(this, lnmVar);
                }
                Object obj28 = aloVar.a;
                int i52 = aloVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                if (((Map) obj).isEmpty()) {
                    return rih1Var;
                }
                aloVar.b = 1;
                return vr20Var.emit(obj, aloVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof blo) {
                    bloVar = (blo) lnmVar;
                    int i53 = bloVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        bloVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        bloVar = new blo(this, lnmVar);
                    }
                } else {
                    bloVar = new blo(this, lnmVar);
                }
                Object obj29 = bloVar.a;
                int i54 = bloVar.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                ijo ijoVar = (ijo) obj;
                Set set = ijoVar.c;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj30 : set) {
                    if (ijoVar.d.contains((String) obj30)) {
                        arrayList5.add(obj30);
                    }
                }
                int iS = zno1.s(q7h.U(arrayList5, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (Object obj31 : arrayList5) {
                    String str5 = (String) obj31;
                    linkedHashMap2.put(obj31, new j3r(new vnb1(ijoVar.a.contains(str5), ijoVar.b.contains(str5))));
                }
                bloVar.b = 1;
                return vr20Var.emit(linkedHashMap2, bloVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof jlo) {
                    jloVar = (jlo) lnmVar;
                    int i55 = jloVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        jloVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        jloVar = new jlo(this, lnmVar);
                    }
                } else {
                    jloVar = new jlo(this, lnmVar);
                }
                Object obj32 = jloVar.a;
                int i56 = jloVar.b;
                if (i56 == 0) {
                    hm5.M(obj32);
                    y450 y450Var2 = new y450((Set) obj);
                    jloVar.b = 1;
                    return vr20Var.emit(y450Var2, jloVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (lnmVar instanceof bmo) {
                    bmoVar = (bmo) lnmVar;
                    int i57 = bmoVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bmoVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        bmoVar = new bmo(this, lnmVar);
                    }
                } else {
                    bmoVar = new bmo(this, lnmVar);
                }
                Object obj33 = bmoVar.a;
                int i58 = bmoVar.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj33);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj33);
                if (((String) obj).length() <= 0) {
                    return rih1Var;
                }
                bmoVar.b = 1;
                return vr20Var.emit(obj, bmoVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof pmo) {
                    pmoVar = (pmo) lnmVar;
                    int i59 = pmoVar.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        pmoVar.b = i59 - Integer.MIN_VALUE;
                    } else {
                        pmoVar = new pmo(this, lnmVar);
                    }
                } else {
                    pmoVar = new pmo(this, lnmVar);
                }
                Object obj34 = pmoVar.a;
                int i60 = pmoVar.b;
                if (i60 != 0) {
                    if (i60 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                pp90 pp90Var = (pp90) obj;
                String str6 = pp90Var != null ? pp90Var.a : null;
                w9oVar = str6 != null ? new ep90(str6) : null;
                pmoVar.b = 1;
                return vr20Var.emit(w9oVar, pmoVar) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ ulm(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
