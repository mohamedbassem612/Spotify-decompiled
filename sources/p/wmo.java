package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wmo implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ wmo(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01db  */
    /* JADX WARN: Code duplicated, block: B:140:0x0215  */
    /* JADX WARN: Code duplicated, block: B:158:0x0259  */
    /* JADX WARN: Code duplicated, block: B:173:0x028f  */
    /* JADX WARN: Code duplicated, block: B:188:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:205:0x0301  */
    /* JADX WARN: Code duplicated, block: B:241:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:256:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:286:0x0474  */
    /* JADX WARN: Code duplicated, block: B:301:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:320:0x0501  */
    /* JADX WARN: Code duplicated, block: B:339:0x053f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0577  */
    /* JADX WARN: Code duplicated, block: B:371:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:393:0x0604  */
    /* JADX WARN: Code duplicated, block: B:408:0x063f  */
    /* JADX WARN: Code duplicated, block: B:423:0x067a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:438:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:453:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:470:0x0725  */
    /* JADX WARN: Code duplicated, block: B:487:0x0760  */
    /* JADX WARN: Code duplicated, block: B:509:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:524:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:542:0x0828  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public final Object emit(Object obj, lnm lnmVar) {
        vmo vmoVar;
        rmo smoVar;
        wsc0 wsc0VarUri;
        rno rnoVar;
        uno unoVar;
        vno vnoVar;
        wno wnoVar;
        xno xnoVar;
        yno ynoVar;
        zno znoVar;
        aoo aooVar;
        boo booVar;
        goo gooVar;
        wsc0 wsc0VarUri2;
        hoo hooVar;
        ioo iooVar;
        k0r k0rVar;
        v1r v1rVar;
        s2r s2rVar;
        Object objEmit;
        q7r q7rVar;
        rbr rbrVar;
        tdr tdrVar;
        cer cerVar;
        der derVar;
        eer eerVar;
        ier ierVar;
        oer oerVar;
        per perVar;
        cgr cgrVar;
        dgr dgrVar;
        cir cirVar;
        fir firVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        wsc0 snoVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof vmo) {
                    vmoVar = (vmo) lnmVar;
                    int i = vmoVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vmoVar.b = i - Integer.MIN_VALUE;
                    } else {
                        vmoVar = new vmo(this, lnmVar);
                    }
                } else {
                    vmoVar = new vmo(this, lnmVar);
                }
                Object obj2 = vmoVar.a;
                int i2 = vmoVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() || playerState.isPaused()) {
                    String strContextUri = playerState.contextUri();
                    if (strContextUri == null || ihc1.y0(strContextUri)) {
                        strContextUri = null;
                    }
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    if (contextTrack != null && (wsc0VarUri = contextTrack.uri()) != null && !ihc1.y0(wsc0VarUri)) {
                        snoVar = wsc0VarUri;
                    }
                    smoVar = playerState.isPaused() ? new smo(strContextUri, snoVar) : new tmo(strContextUri, snoVar);
                } else {
                    smoVar = rmo.a;
                }
                vmoVar.b = 1;
                return vr20Var.emit(smoVar, vmoVar) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof rno) {
                    rnoVar = (rno) lnmVar;
                    int i3 = rnoVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rnoVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        rnoVar = new rno(this, lnmVar);
                    }
                } else {
                    rnoVar = new rno(this, lnmVar);
                }
                Object obj3 = rnoVar.a;
                int i4 = rnoVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                v5e0 v5e0Var = (w5e0) obj;
                snoVar = v5e0Var instanceof v5e0 ? v5e0Var.a : null;
                rnoVar.b = 1;
                return vr20Var.emit(snoVar, rnoVar) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof uno) {
                    unoVar = (uno) lnmVar;
                    int i5 = unoVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        unoVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        unoVar = new uno(this, lnmVar);
                    }
                } else {
                    unoVar = new uno(this, lnmVar);
                }
                Object obj4 = unoVar.a;
                int i6 = unoVar.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    String str = ((th61) obj).a;
                    unoVar.b = 1;
                    return vr20Var.emit(str, unoVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof vno) {
                    vnoVar = (vno) lnmVar;
                    int i7 = vnoVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        vnoVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        vnoVar = new vno(this, lnmVar);
                    }
                } else {
                    vnoVar = new vno(this, lnmVar);
                }
                Object obj5 = vnoVar.a;
                int i8 = vnoVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                eww0 eww0Var = (eww0) ((spq0) obj).h();
                if (eww0Var != null) {
                    String str2 = eww0Var.f;
                    if (str2 == null) {
                        str2 = (String) o7h.s0(eww0Var.e);
                    }
                    snoVar = new sno(str2, eww0Var.b);
                }
                vnoVar.b = 1;
                return vr20Var.emit(snoVar, vnoVar) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof wno) {
                    wnoVar = (wno) lnmVar;
                    int i9 = wnoVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wnoVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        wnoVar = new wno(this, lnmVar);
                    }
                } else {
                    wnoVar = new wno(this, lnmVar);
                }
                Object obj6 = wnoVar.a;
                int i10 = wnoVar.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                wnoVar.b = 1;
                return vr20Var.emit(obj, wnoVar) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof xno) {
                    xnoVar = (xno) lnmVar;
                    int i11 = xnoVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        xnoVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        xnoVar = new xno(this, lnmVar);
                    }
                } else {
                    xnoVar = new xno(this, lnmVar);
                }
                Object obj7 = xnoVar.a;
                int i12 = xnoVar.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                xnoVar.b = 1;
                return vr20Var.emit(obj, xnoVar) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof yno) {
                    ynoVar = (yno) lnmVar;
                    int i13 = ynoVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ynoVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        ynoVar = new yno(this, lnmVar);
                    }
                } else {
                    ynoVar = new yno(this, lnmVar);
                }
                Object obj8 = ynoVar.a;
                int i14 = ynoVar.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    String str3 = ((th61) obj).a;
                    ynoVar.b = 1;
                    return vr20Var.emit(str3, ynoVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof zno) {
                    znoVar = (zno) lnmVar;
                    int i15 = znoVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        znoVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        znoVar = new zno(this, lnmVar);
                    }
                } else {
                    znoVar = new zno(this, lnmVar);
                }
                Object obj9 = znoVar.a;
                int i16 = znoVar.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    String str4 = ((th61) obj).a;
                    znoVar.b = 1;
                    return vr20Var.emit(str4, znoVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof aoo) {
                    aooVar = (aoo) lnmVar;
                    int i17 = aooVar.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        aooVar.b = i17 - Integer.MIN_VALUE;
                    } else {
                        aooVar = new aoo(this, lnmVar);
                    }
                } else {
                    aooVar = new aoo(this, lnmVar);
                }
                Object obj10 = aooVar.a;
                int i18 = aooVar.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    imi1 imi1Var = new imi1((String) obj);
                    aooVar.b = 1;
                    return vr20Var.emit(imi1Var, aooVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof boo) {
                    booVar = (boo) lnmVar;
                    int i19 = booVar.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        booVar.b = i19 - Integer.MIN_VALUE;
                    } else {
                        booVar = new boo(this, lnmVar);
                    }
                } else {
                    booVar = new boo(this, lnmVar);
                }
                Object obj11 = booVar.a;
                int i20 = booVar.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    kuf kufVar = new kuf((String) obj);
                    booVar.b = 1;
                    return vr20Var.emit(kufVar, booVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof goo) {
                    gooVar = (goo) lnmVar;
                    int i21 = gooVar.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        gooVar.b = i21 - Integer.MIN_VALUE;
                    } else {
                        gooVar = new goo(this, lnmVar);
                    }
                } else {
                    gooVar = new goo(this, lnmVar);
                }
                Object obj12 = gooVar.a;
                int i22 = gooVar.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                ContextTrack contextTrack2 = (ContextTrack) playerState2.track().h();
                if (contextTrack2 != null && (wsc0VarUri2 = contextTrack2.uri()) != null && nzy.g(wsc0VarUri2)) {
                    snoVar = wsc0VarUri2;
                }
                gooVar.b = 1;
                return vr20Var.emit(snoVar, gooVar) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof hoo) {
                    hooVar = (hoo) lnmVar;
                    int i23 = hooVar.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        hooVar.b = i23 - Integer.MIN_VALUE;
                    } else {
                        hooVar = new hoo(this, lnmVar);
                    }
                } else {
                    hooVar = new hoo(this, lnmVar);
                }
                Object obj13 = hooVar.a;
                int i24 = hooVar.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                if (!((th61) obj).b) {
                    return rih1Var;
                }
                hooVar.b = 1;
                return vr20Var.emit(obj, hooVar) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof ioo) {
                    iooVar = (ioo) lnmVar;
                    int i25 = iooVar.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        iooVar.b = i25 - Integer.MIN_VALUE;
                    } else {
                        iooVar = new ioo(this, lnmVar);
                    }
                } else {
                    iooVar = new ioo(this, lnmVar);
                }
                Object obj14 = iooVar.a;
                int i26 = iooVar.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    String str5 = ((th61) obj).a;
                    iooVar.b = 1;
                    return vr20Var.emit(str5, iooVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof k0r) {
                    k0rVar = (k0r) lnmVar;
                    int i27 = k0rVar.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        k0rVar.b = i27 - Integer.MIN_VALUE;
                    } else {
                        k0rVar = new k0r(this, lnmVar);
                    }
                } else {
                    k0rVar = new k0r(this, lnmVar);
                }
                Object obj15 = k0rVar.a;
                int i28 = k0rVar.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                k1r k1rVar = (k1r) obj;
                if (!(k1rVar instanceof i1r) && !(k1rVar instanceof h1r)) {
                    return rih1Var;
                }
                k0rVar.b = 1;
                return vr20Var.emit(k1rVar, k0rVar) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof v1r) {
                    v1rVar = (v1r) lnmVar;
                    int i29 = v1rVar.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        v1rVar.b = i29 - Integer.MIN_VALUE;
                    } else {
                        v1rVar = new v1r(this, lnmVar);
                    }
                } else {
                    v1rVar = new v1r(this, lnmVar);
                }
                Object obj16 = v1rVar.a;
                int i30 = v1rVar.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    gax gaxVar = ((Boolean) obj).booleanValue() ? new gax(new Integer(2131961686), (String) null) : new gax(new Integer(2131961687), (String) null);
                    v1rVar.b = 1;
                    return vr20Var.emit(gaxVar, v1rVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof s2r) {
                    s2rVar = (s2r) lnmVar;
                    int i31 = s2rVar.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        s2rVar.b = i31 - Integer.MIN_VALUE;
                    } else {
                        s2rVar = new s2r(this, lnmVar);
                    }
                } else {
                    s2rVar = new s2r(this, lnmVar);
                }
                Object obj17 = s2rVar.a;
                int i32 = s2rVar.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    s2rVar.b = 1;
                    return vr20Var.emit((ez00) obj, s2rVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof i1r) {
                    Object obj18 = i1rVar.a;
                    return (obj18 == null || (objEmit = vr20Var.emit(obj18, lnmVar)) != d9nVar) ? rih1Var : objEmit;
                }
                if (i1rVar instanceof h1r) {
                    Logger.d("DataStatementEventSource failed: %s", new Object[]{((h1r) i1rVar).a});
                    return rih1Var;
                }
                if (i1rVar instanceof j1r) {
                    return rih1Var;
                }
                eg.o();
                return null;
            case 17:
                if (lnmVar instanceof q7r) {
                    q7rVar = (q7r) lnmVar;
                    int i33 = q7rVar.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        q7rVar.b = i33 - Integer.MIN_VALUE;
                    } else {
                        q7rVar = new q7r(this, lnmVar);
                    }
                } else {
                    q7rVar = new q7r(this, lnmVar);
                }
                Object obj19 = q7rVar.a;
                int i34 = q7rVar.b;
                if (i34 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf = Boolean.valueOf(Boolean.parseBoolean((String) ((cxc0) obj).f.q.get("daylist-eligible")));
                    q7rVar.b = 1;
                    return vr20Var.emit(boolValueOf, q7rVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof rbr) {
                    rbrVar = (rbr) lnmVar;
                    int i35 = rbrVar.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        rbrVar.b = i35 - Integer.MIN_VALUE;
                    } else {
                        rbrVar = new rbr(this, lnmVar);
                    }
                } else {
                    rbrVar = new rbr(this, lnmVar);
                }
                Object obj20 = rbrVar.a;
                int i36 = rbrVar.b;
                if (i36 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf2 = Boolean.valueOf(((p0d0) obj).a.a());
                    rbrVar.b = 1;
                    return vr20Var.emit(boolValueOf2, rbrVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof tdr) {
                    tdrVar = (tdr) lnmVar;
                    int i37 = tdrVar.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        tdrVar.b = i37 - Integer.MIN_VALUE;
                    } else {
                        tdrVar = new tdr(this, lnmVar);
                    }
                } else {
                    tdrVar = new tdr(this, lnmVar);
                }
                Object obj21 = tdrVar.a;
                int i38 = tdrVar.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (qi qiVar : (List) obj) {
                    cn70 cn70Var = qiVar.i;
                    boolean zB = cn70Var.b(ak.d);
                    boolean z = cn70Var.b(ak.c) || cn70Var.b(ak.a) || cn70Var.b(ak.b) || cn70Var.b(ak.f);
                    if (!zB || z) {
                        arrayList2.add(qiVar);
                    } else {
                        arrayList.add(qiVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Logger.d("Removed " + arrayList.size() + " stale accessories: " + arrayList + ".", new Object[0]);
                }
                tdrVar.b = 1;
                return vr20Var.emit(arrayList2, tdrVar) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof cer) {
                    cerVar = (cer) lnmVar;
                    int i39 = cerVar.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        cerVar.b = i39 - Integer.MIN_VALUE;
                    } else {
                        cerVar = new cer(this, lnmVar);
                    }
                } else {
                    cerVar = new cer(this, lnmVar);
                }
                Object obj22 = cerVar.a;
                int i40 = cerVar.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (!(obj instanceof zyc)) {
                    return rih1Var;
                }
                cerVar.b = 1;
                return vr20Var.emit(obj, cerVar) == d9nVar ? d9nVar : rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof der) {
                    derVar = (der) lnmVar;
                    int i41 = derVar.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        derVar.b = i41 - Integer.MIN_VALUE;
                    } else {
                        derVar = new der(this, lnmVar);
                    }
                } else {
                    derVar = new der(this, lnmVar);
                }
                Object obj23 = derVar.a;
                int i42 = derVar.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    Object objH = ((spq0) obj).h();
                    derVar.b = 1;
                    return vr20Var.emit(objH, derVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof eer) {
                    eerVar = (eer) lnmVar;
                    int i43 = eerVar.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        eerVar.b = i43 - Integer.MIN_VALUE;
                    } else {
                        eerVar = new eer(this, lnmVar);
                    }
                } else {
                    eerVar = new eer(this, lnmVar);
                }
                Object obj24 = eerVar.a;
                int i44 = eerVar.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    eerVar.b = 1;
                    return vr20Var.emit(rih1Var, eerVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof ier) {
                    ierVar = (ier) lnmVar;
                    int i45 = ierVar.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ierVar.b = i45 - Integer.MIN_VALUE;
                    } else {
                        ierVar = new ier(this, lnmVar);
                    }
                } else {
                    ierVar = new ier(this, lnmVar);
                }
                Object obj25 = ierVar.a;
                int i46 = ierVar.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf3 = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                ierVar.b = 1;
                return vr20Var.emit(boolValueOf3, ierVar) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof oer) {
                    oerVar = (oer) lnmVar;
                    int i47 = oerVar.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        oerVar.b = i47 - Integer.MIN_VALUE;
                    } else {
                        oerVar = new oer(this, lnmVar);
                    }
                } else {
                    oerVar = new oer(this, lnmVar);
                }
                Object obj26 = oerVar.a;
                int i48 = oerVar.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                ler lerVar = (ler) obj;
                snoVar = lerVar != null ? lerVar.b : null;
                oerVar.b = 1;
                return vr20Var.emit(snoVar, oerVar) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof per) {
                    perVar = (per) lnmVar;
                    int i49 = perVar.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        perVar.b = i49 - Integer.MIN_VALUE;
                    } else {
                        perVar = new per(this, lnmVar);
                    }
                } else {
                    perVar = new per(this, lnmVar);
                }
                Object obj27 = perVar.a;
                int i50 = perVar.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                PlayerState playerState3 = (PlayerState) obj;
                playerState3.getClass();
                ykt0 ykt0Var = (!playerState3.isPlaying() || playerState3.isPaused()) ? xkt0.a : ykt0.a;
                ContextTrack contextTrack3 = (ContextTrack) playerState3.track().h();
                if (contextTrack3 != null) {
                    String strF0 = l4o1.f0(contextTrack3);
                    if (strF0 == null) {
                        strF0 = "";
                    }
                    String strL = l4o1.l(contextTrack3);
                    if (strF0.length() != 0 || strL.length() != 0) {
                        snoVar = new y3p0(strF0, strL);
                    }
                }
                mer merVar = new mer(ykt0Var, snoVar);
                perVar.b = 1;
                return vr20Var.emit(merVar, perVar) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof cgr) {
                    cgrVar = (cgr) lnmVar;
                    int i51 = cgrVar.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        cgrVar.b = i51 - Integer.MIN_VALUE;
                    } else {
                        cgrVar = new cgr(this, lnmVar);
                    }
                } else {
                    cgrVar = new cgr(this, lnmVar);
                }
                Object obj28 = cgrVar.a;
                int i52 = cgrVar.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                List list = ((wsc0) obj).e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj29 : list) {
                    if (((zuc0) obj29).f()) {
                        arrayList3.add(obj29);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((zuc0) it.next()).c);
                }
                cgrVar.b = 1;
                return vr20Var.emit(arrayList4, cgrVar) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof dgr) {
                    dgrVar = (dgr) lnmVar;
                    int i53 = dgrVar.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        dgrVar.b = i53 - Integer.MIN_VALUE;
                    } else {
                        dgrVar = new dgr(this, lnmVar);
                    }
                } else {
                    dgrVar = new dgr(this, lnmVar);
                }
                Object obj30 = dgrVar.a;
                int i54 = dgrVar.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                oy21 oy21Var = (py21) obj;
                oy21 oy21Var2 = oy21Var instanceof oy21 ? oy21Var : null;
                snoVar = oy21Var2 != null ? (wsc0) oy21Var2.a : null;
                if (snoVar == null) {
                    return rih1Var;
                }
                dgrVar.b = 1;
                return vr20Var.emit(snoVar, dgrVar) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof cir) {
                    cirVar = (cir) lnmVar;
                    int i55 = cirVar.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        cirVar.b = i55 - Integer.MIN_VALUE;
                    } else {
                        cirVar = new cir(this, lnmVar);
                    }
                } else {
                    cirVar = new cir(this, lnmVar);
                }
                Object obj31 = cirVar.a;
                int i56 = cirVar.b;
                if (i56 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf4 = Boolean.valueOf(((Number) obj).intValue() == 4);
                    cirVar.b = 1;
                    return vr20Var.emit(boolValueOf4, cirVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof fir) {
                    firVar = (fir) lnmVar;
                    int i57 = firVar.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        firVar.b = i57 - Integer.MIN_VALUE;
                    } else {
                        firVar = new fir(this, lnmVar);
                    }
                } else {
                    firVar = new fir(this, lnmVar);
                }
                Object obj32 = firVar.a;
                int i58 = firVar.b;
                if (i58 == 0) {
                    hm5.M(obj32);
                    Object objH2 = ((spq0) obj).h();
                    firVar.b = 1;
                    return vr20Var.emit(objH2, firVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ wmo(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
