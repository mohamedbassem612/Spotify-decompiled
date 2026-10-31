package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j4p0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public j4p0(vr20 vr20Var, yfc0 yfc0Var) {
        this.a = (byte) 14;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x019e  */
    /* JADX WARN: Code duplicated, block: B:132:0x020c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0248  */
    /* JADX WARN: Code duplicated, block: B:165:0x0290  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:202:0x0315  */
    /* JADX WARN: Code duplicated, block: B:222:0x0360  */
    /* JADX WARN: Code duplicated, block: B:237:0x039f  */
    /* JADX WARN: Code duplicated, block: B:252:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:269:0x041a  */
    /* JADX WARN: Code duplicated, block: B:292:0x0472  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:334:0x051b  */
    /* JADX WARN: Code duplicated, block: B:354:0x055b  */
    /* JADX WARN: Code duplicated, block: B:369:0x0596  */
    /* JADX WARN: Code duplicated, block: B:393:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:414:0x0646  */
    /* JADX WARN: Code duplicated, block: B:434:0x0686  */
    /* JADX WARN: Code duplicated, block: B:451:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:468:0x0704  */
    /* JADX WARN: Code duplicated, block: B:485:0x0741  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:512:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:537:0x0807  */
    /* JADX WARN: Code duplicated, block: B:552:0x0848  */
    /* JADX WARN: Code duplicated, block: B:567:0x0887  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0156  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        i4p0 i4p0Var;
        k4p0 k4p0Var;
        c5p0 c5p0Var;
        a7p0 a7p0Var;
        q7p0 q7p0Var;
        f9p0 f9p0Var;
        p9p0 p9p0Var;
        q9p0 q9p0Var;
        ohp0 ohp0Var;
        n6r0 n6r0Var;
        iip0 iip0Var;
        jip0 jip0Var;
        mip0 mip0Var;
        nip0 nip0Var;
        oip0 oip0Var;
        Iterator it;
        ubq0 tbq0Var;
        rip0 rip0Var;
        Object objInvoke;
        hjp0 hjp0Var;
        ukp0 ukp0Var;
        amp0 amp0Var;
        hop0 hop0Var;
        List list;
        top0 top0Var;
        wop0 wop0Var;
        zop0 zop0Var;
        jpp0 jpp0Var;
        kpp0 kpp0Var;
        lpp0 lpp0Var;
        spp0 spp0Var;
        lqp0 lqp0Var;
        mqp0 mqp0Var;
        nqp0 nqp0Var;
        byte b = this.a;
        boolean z = false;
        size = 0;
        int size = 0;
        int i = 0;
        z = false;
        boolean z2 = false;
        z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object objPath = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof i4p0) {
                    i4p0Var = (i4p0) lnmVar;
                    int i2 = i4p0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        i4p0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        i4p0Var = new i4p0(this, lnmVar);
                    }
                } else {
                    i4p0Var = new i4p0(this, lnmVar);
                }
                Object obj2 = i4p0Var.a;
                int i3 = i4p0Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    j3p0 j3p0Var = new j3p0((String) obj);
                    i4p0Var.b = 1;
                    return vr20Var.emit(j3p0Var, i4p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof k4p0) {
                    k4p0Var = (k4p0) lnmVar;
                    int i4 = k4p0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        k4p0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        k4p0Var = new k4p0(this, lnmVar);
                    }
                } else {
                    k4p0Var = new k4p0(this, lnmVar);
                }
                Object obj3 = k4p0Var.a;
                int i5 = k4p0Var.b;
                if (i5 == 0) {
                    hm5.M(obj3);
                    n3p0 n3p0Var = new n3p0(((Boolean) obj).booleanValue());
                    k4p0Var.b = 1;
                    return vr20Var.emit(n3p0Var, k4p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof c5p0) {
                    c5p0Var = (c5p0) lnmVar;
                    int i6 = c5p0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c5p0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        c5p0Var = new c5p0(this, lnmVar);
                    }
                } else {
                    c5p0Var = new c5p0(this, lnmVar);
                }
                Object obj4 = c5p0Var.a;
                int i7 = c5p0Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    Boolean boolValueOf = Boolean.valueOf(!u890.j((hnk0) obj, fnk0.a));
                    c5p0Var.b = 1;
                    return vr20Var.emit(boolValueOf, c5p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof a7p0) {
                    a7p0Var = (a7p0) lnmVar;
                    int i8 = a7p0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        a7p0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        a7p0Var = new a7p0(this, lnmVar);
                    }
                } else {
                    a7p0Var = new a7p0(this, lnmVar);
                }
                Object obj5 = a7p0Var.a;
                int i9 = a7p0Var.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    v0g0 v0g0Var = (v0g0) obj;
                    if (u890.j(v0g0Var, s0g0.b)) {
                        z = true;
                    } else if (!u890.j(v0g0Var, t0g0.b) && !u890.j(v0g0Var, u0g0.b)) {
                        eg.o();
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    a7p0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, a7p0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i9 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof q7p0) {
                    q7p0Var = (q7p0) lnmVar;
                    int i10 = q7p0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        q7p0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        q7p0Var = new q7p0(this, lnmVar);
                    }
                } else {
                    q7p0Var = new q7p0(this, lnmVar);
                }
                Object obj6 = q7p0Var.a;
                int i11 = q7p0Var.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                boolean zContains = hzg0.a.contains(playerState.playOrigin().featureIdentifier());
                boolean z3 = (contextTrack == null || !l4o1.P(contextTrack) || l4o1.G(contextTrack)) ? false : true;
                if (contextTrack != null && l4o1.G(contextTrack)) {
                    z2 = true;
                }
                p7p0 p7p0Var = new p7p0(zContains, z3, z2);
                q7p0Var.b = 1;
                return vr20Var.emit(p7p0Var, q7p0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof f9p0) {
                    f9p0Var = (f9p0) lnmVar;
                    int i12 = f9p0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        f9p0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        f9p0Var = new f9p0(this, lnmVar);
                    }
                } else {
                    f9p0Var = new f9p0(this, lnmVar);
                }
                Object obj7 = f9p0Var.a;
                int i13 = f9p0Var.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                if (!((PlayerState) obj).isPlaying()) {
                    return rih1Var;
                }
                f9p0Var.b = 1;
                return vr20Var.emit(obj, f9p0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof p9p0) {
                    p9p0Var = (p9p0) lnmVar;
                    int i14 = p9p0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        p9p0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        p9p0Var = new p9p0(this, lnmVar);
                    }
                } else {
                    p9p0Var = new p9p0(this, lnmVar);
                }
                Object obj8 = p9p0Var.a;
                int i15 = p9p0Var.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                p9p0Var.b = 1;
                return vr20Var.emit(obj, p9p0Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof q9p0) {
                    q9p0Var = (q9p0) lnmVar;
                    int i16 = q9p0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        q9p0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        q9p0Var = new q9p0(this, lnmVar);
                    }
                } else {
                    q9p0Var = new q9p0(this, lnmVar);
                }
                Object obj9 = q9p0Var.a;
                int i17 = q9p0Var.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                if (((ju0) ((yvg1) obj).b) == null) {
                    return rih1Var;
                }
                q9p0Var.b = 1;
                return vr20Var.emit(obj, q9p0Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof ohp0) {
                    ohp0Var = (ohp0) lnmVar;
                    int i18 = ohp0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ohp0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        ohp0Var = new ohp0(this, lnmVar);
                    }
                } else {
                    ohp0Var = new ohp0(this, lnmVar);
                }
                Object obj10 = ohp0Var.a;
                int i19 = ohp0Var.b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                bn70 bn70Var = (bn70) obj;
                if (bn70Var != null && (n6r0Var = bn70Var.a) != null) {
                    objPath = n6r0Var.path();
                }
                ohp0Var.b = 1;
                return vr20Var.emit(objPath, ohp0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                Object objEmit = vr20Var.emit((ole0) obj, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 10:
                if (lnmVar instanceof iip0) {
                    iip0Var = (iip0) lnmVar;
                    int i20 = iip0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        iip0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        iip0Var = new iip0(this, lnmVar);
                    }
                } else {
                    iip0Var = new iip0(this, lnmVar);
                }
                Object obj11 = iip0Var.a;
                int i21 = iip0Var.b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                iip0Var.b = 1;
                return vr20Var.emit(obj, iip0Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof jip0) {
                    jip0Var = (jip0) lnmVar;
                    int i22 = jip0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        jip0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        jip0Var = new jip0(this, lnmVar);
                    }
                } else {
                    jip0Var = new jip0(this, lnmVar);
                }
                Object obj12 = jip0Var.a;
                int i23 = jip0Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                int i24 = lip0.b;
                h1g1 h1g1Var = (o4p1.C(playerState2) && nhc1.Y(((ContextTrack) playerState2.track().b()).uri(), "spotify:media:", false)) ? o4p1.x(playerState2) ? l1g1.a : k1g1.a : h1g1.a;
                jip0Var.b = 1;
                return vr20Var.emit(h1g1Var, jip0Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof mip0) {
                    mip0Var = (mip0) lnmVar;
                    int i25 = mip0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        mip0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        mip0Var = new mip0(this, lnmVar);
                    }
                } else {
                    mip0Var = new mip0(this, lnmVar);
                }
                Object obj13 = mip0Var.a;
                int i26 = mip0Var.b;
                if (i26 == 0) {
                    hm5.M(obj13);
                    t2h0 t2h0Var = new t2h0((lpu) obj);
                    mip0Var.b = 1;
                    return vr20Var.emit(t2h0Var, mip0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof nip0) {
                    nip0Var = (nip0) lnmVar;
                    int i27 = nip0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        nip0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        nip0Var = new nip0(this, lnmVar);
                    }
                } else {
                    nip0Var = new nip0(this, lnmVar);
                }
                Object obj14 = nip0Var.a;
                int i28 = nip0Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                Object obj15 = ((e331) obj).a;
                objPath = obj15 instanceof m231 ? null : obj15;
                if (objPath == null) {
                    return rih1Var;
                }
                nip0Var.b = 1;
                return vr20Var.emit(objPath, nip0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof oip0) {
                    oip0Var = (oip0) lnmVar;
                    int i29 = oip0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        oip0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        oip0Var = new oip0(this, lnmVar);
                    }
                } else {
                    oip0Var = new oip0(this, lnmVar);
                }
                Object obj16 = oip0Var.a;
                int i30 = oip0Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        int i31 = oip0Var.f;
                        it = oip0Var.e;
                        vr20 vr20Var2 = oip0Var.d;
                        hm5.M(obj16);
                        i = i31;
                        vr20Var = vr20Var2;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj16);
                it = ((Map) obj).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    rw21 rw21Var = (rw21) entry.getValue();
                    int iC = l1d.C(rw21Var.b);
                    if (iC == 0) {
                        tbq0Var = null;
                    } else if (iC == 1 || iC == 2) {
                        tbq0Var = wbq0.a;
                    } else if (iC == 3) {
                        float f = rw21Var.a / 100.0f;
                        Float fValueOf = Float.valueOf(f);
                        if (f <= 0.0f) {
                            fValueOf = null;
                        }
                        tbq0Var = new tbq0(fValueOf);
                    } else if (iC == 4) {
                        tbq0Var = sbq0.a;
                    } else {
                        if (iC != 5) {
                            eg.o();
                            return null;
                        }
                        tbq0Var = ubq0.a;
                    }
                    if (tbq0Var != null) {
                        ydq0 ydq0Var = new ydq0(str, tbq0Var);
                        oip0Var.d = vr20Var;
                        oip0Var.e = it;
                        oip0Var.f = i;
                        oip0Var.b = 1;
                        if (vr20Var.emit(ydq0Var, oip0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            case 15:
                if (lnmVar instanceof rip0) {
                    rip0Var = (rip0) lnmVar;
                    int i32 = rip0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        rip0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        rip0Var = new rip0(this, lnmVar);
                    }
                } else {
                    rip0Var = new rip0(this, lnmVar);
                }
                Object obj17 = rip0Var.a;
                int i33 = rip0Var.b;
                if (i33 == 0) {
                    hm5.M(obj17);
                    oy21 oy21Var = (py21) obj;
                    pzo0 pzo0Var = pzo0.b1;
                    oy21Var.getClass();
                    if (oy21Var instanceof ly21) {
                        objInvoke = new pip0(z6x.a, (String) null);
                    } else if (oy21Var instanceof oy21) {
                        objInvoke = pzo0Var.invoke(oy21Var.a);
                    } else {
                        eg.o();
                    }
                    rip0Var.b = 1;
                    return vr20Var.emit(objInvoke, rip0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i33 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof hjp0) {
                    hjp0Var = (hjp0) lnmVar;
                    int i34 = hjp0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hjp0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        hjp0Var = new hjp0(this, lnmVar);
                    }
                } else {
                    hjp0Var = new hjp0(this, lnmVar);
                }
                Object obj18 = hjp0Var.a;
                int i35 = hjp0Var.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                if (((qnc0) obj).b.isEmpty()) {
                    return rih1Var;
                }
                hjp0Var.b = 1;
                return vr20Var.emit(obj, hjp0Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof ukp0) {
                    ukp0Var = (ukp0) lnmVar;
                    int i36 = ukp0Var.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ukp0Var.b = i36 - Integer.MIN_VALUE;
                    } else {
                        ukp0Var = new ukp0(this, lnmVar);
                    }
                } else {
                    ukp0Var = new ukp0(this, lnmVar);
                }
                Object obj19 = ukp0Var.a;
                int i37 = ukp0Var.b;
                if (i37 == 0) {
                    hm5.M(obj19);
                    spq0 spq0VarA = spq0.a((pp90) obj);
                    ukp0Var.b = 1;
                    return vr20Var.emit(spq0VarA, ukp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i37 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof amp0) {
                    amp0Var = (amp0) lnmVar;
                    int i38 = amp0Var.b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        amp0Var.b = i38 - Integer.MIN_VALUE;
                    } else {
                        amp0Var = new amp0(this, lnmVar);
                    }
                } else {
                    amp0Var = new amp0(this, lnmVar);
                }
                Object obj20 = amp0Var.a;
                int i39 = amp0Var.b;
                if (i39 == 0) {
                    hm5.M(obj20);
                    plp0 plp0Var = new plp0(((Boolean) obj).booleanValue());
                    amp0Var.b = 1;
                    return vr20Var.emit(plp0Var, amp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i39 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof hop0) {
                    hop0Var = (hop0) lnmVar;
                    int i40 = hop0Var.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        hop0Var.b = i40 - Integer.MIN_VALUE;
                    } else {
                        hop0Var = new hop0(this, lnmVar);
                    }
                } else {
                    hop0Var = new hop0(this, lnmVar);
                }
                Object obj21 = hop0Var.a;
                int i41 = hop0Var.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                wsc0 wsc0Var = (wsc0) ((py21) obj).c();
                if (wsc0Var != null && (list = wsc0Var.e) != null) {
                    size = list.size();
                }
                Integer num = new Integer(size);
                hop0Var.b = 1;
                return vr20Var.emit(num, hop0Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof top0) {
                    top0Var = (top0) lnmVar;
                    int i42 = top0Var.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        top0Var.b = i42 - Integer.MIN_VALUE;
                    } else {
                        top0Var = new top0(this, lnmVar);
                    }
                } else {
                    top0Var = new top0(this, lnmVar);
                }
                Object obj22 = top0Var.a;
                int i43 = top0Var.b;
                if (i43 == 0) {
                    hm5.M(obj22);
                    Boolean boolValueOf3 = Boolean.valueOf(((EsOffline.GetOfflinePlaybackStatusResponse) obj).n());
                    top0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, top0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i43 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof wop0) {
                    wop0Var = (wop0) lnmVar;
                    int i44 = wop0Var.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        wop0Var.b = i44 - Integer.MIN_VALUE;
                    } else {
                        wop0Var = new wop0(this, lnmVar);
                    }
                } else {
                    wop0Var = new wop0(this, lnmVar);
                }
                Object obj23 = wop0Var.a;
                int i45 = wop0Var.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                objPath = i1rVar2 != null ? (Set) i1rVar2.a : null;
                if (objPath == null) {
                    return rih1Var;
                }
                wop0Var.b = 1;
                return vr20Var.emit(objPath, wop0Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof zop0) {
                    zop0Var = (zop0) lnmVar;
                    int i46 = zop0Var.b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        zop0Var.b = i46 - Integer.MIN_VALUE;
                    } else {
                        zop0Var = new zop0(this, lnmVar);
                    }
                } else {
                    zop0Var = new zop0(this, lnmVar);
                }
                Object obj24 = zop0Var.a;
                int i47 = zop0Var.b;
                if (i47 == 0) {
                    hm5.M(obj24);
                    Boolean boolValueOf4 = Boolean.valueOf(((cxc0) obj).f.G.isEmpty() ^ true);
                    zop0Var.b = 1;
                    return vr20Var.emit(boolValueOf4, zop0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i47 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (lnmVar instanceof jpp0) {
                    jpp0Var = (jpp0) lnmVar;
                    int i48 = jpp0Var.b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        jpp0Var.b = i48 - Integer.MIN_VALUE;
                    } else {
                        jpp0Var = new jpp0(this, lnmVar);
                    }
                } else {
                    jpp0Var = new jpp0(this, lnmVar);
                }
                Object obj25 = jpp0Var.a;
                int i49 = jpp0Var.b;
                if (i49 == 0) {
                    hm5.M(obj25);
                    Object objS0 = o7h.s0(((ztc) obj).c);
                    jpp0Var.b = 1;
                    return vr20Var.emit(objS0, jpp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i49 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof kpp0) {
                    kpp0Var = (kpp0) lnmVar;
                    int i50 = kpp0Var.b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        kpp0Var.b = i50 - Integer.MIN_VALUE;
                    } else {
                        kpp0Var = new kpp0(this, lnmVar);
                    }
                } else {
                    kpp0Var = new kpp0(this, lnmVar);
                }
                Object obj26 = kpp0Var.a;
                int i51 = kpp0Var.b;
                if (i51 != 0) {
                    if (i51 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                List list2 = ((cxc0) obj).f.G;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                int i52 = 0;
                for (Object obj27 : list2) {
                    int i53 = i52 + 1;
                    if (i52 < 0) {
                        p7h.T();
                        throw null;
                    }
                    o5k o5kVar = (o5k) obj27;
                    arrayList.add(new l820(i52, o5kVar.b, o5kVar.a, false));
                    i52 = i53;
                }
                kpp0Var.b = 1;
                return vr20Var.emit(arrayList, kpp0Var) == d9nVar ? d9nVar : rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (lnmVar instanceof lpp0) {
                    lpp0Var = (lpp0) lnmVar;
                    int i54 = lpp0Var.b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        lpp0Var.b = i54 - Integer.MIN_VALUE;
                    } else {
                        lpp0Var = new lpp0(this, lnmVar);
                    }
                } else {
                    lpp0Var = new lpp0(this, lnmVar);
                }
                Object obj28 = lpp0Var.a;
                int i55 = lpp0Var.b;
                if (i55 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf5 = Boolean.valueOf(((cxc0) obj).f.G.isEmpty() ^ true);
                    lpp0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, lpp0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i55 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof spp0) {
                    spp0Var = (spp0) lnmVar;
                    int i56 = spp0Var.b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        spp0Var.b = i56 - Integer.MIN_VALUE;
                    } else {
                        spp0Var = new spp0(this, lnmVar);
                    }
                } else {
                    spp0Var = new spp0(this, lnmVar);
                }
                Object obj29 = spp0Var.a;
                int i57 = spp0Var.b;
                if (i57 != 0) {
                    if (i57 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                objPath = i1rVar4 != null ? (g3d0) i1rVar4.a : null;
                if (objPath == null) {
                    return rih1Var;
                }
                spp0Var.b = 1;
                return vr20Var.emit(objPath, spp0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof lqp0) {
                    lqp0Var = (lqp0) lnmVar;
                    int i58 = lqp0Var.b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        lqp0Var.b = i58 - Integer.MIN_VALUE;
                    } else {
                        lqp0Var = new lqp0(this, lnmVar);
                    }
                } else {
                    lqp0Var = new lqp0(this, lnmVar);
                }
                Object obj30 = lqp0Var.a;
                int i59 = lqp0Var.b;
                if (i59 == 0) {
                    hm5.M(obj30);
                    byte[] bArr = (byte[]) obj;
                    try {
                        EsOffline.GetContextsResponse getContextsResponseR = EsOffline.GetContextsResponse.r(bArr);
                        lqp0Var.b = 1;
                        return vr20Var.emit(getContextsResponseR, lqp0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetContextsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i59 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 28:
                if (lnmVar instanceof mqp0) {
                    mqp0Var = (mqp0) lnmVar;
                    int i60 = mqp0Var.b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        mqp0Var.b = i60 - Integer.MIN_VALUE;
                    } else {
                        mqp0Var = new mqp0(this, lnmVar);
                    }
                } else {
                    mqp0Var = new mqp0(this, lnmVar);
                }
                Object obj31 = mqp0Var.a;
                int i61 = mqp0Var.b;
                if (i61 == 0) {
                    hm5.M(obj31);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        EsOffline.ContextsProgressResponse contextsProgressResponseP = EsOffline.ContextsProgressResponse.p(bArr2);
                        mqp0Var.b = 1;
                        return vr20Var.emit(contextsProgressResponseP, mqp0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.ContextsProgressResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i61 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                if (lnmVar instanceof nqp0) {
                    nqp0Var = (nqp0) lnmVar;
                    int i62 = nqp0Var.b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        nqp0Var.b = i62 - Integer.MIN_VALUE;
                    } else {
                        nqp0Var = new nqp0(this, lnmVar);
                    }
                } else {
                    nqp0Var = new nqp0(this, lnmVar);
                }
                Object obj32 = nqp0Var.a;
                int i63 = nqp0Var.b;
                if (i63 == 0) {
                    hm5.M(obj32);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        EsOffline.TotalProgressResponse totalProgressResponseP = EsOffline.TotalProgressResponse.p(bArr3);
                        nqp0Var.b = 1;
                        return vr20Var.emit(totalProgressResponseP, nqp0Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e3) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.TotalProgressResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i63 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ j4p0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
