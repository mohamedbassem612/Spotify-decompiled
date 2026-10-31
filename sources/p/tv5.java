package p;

import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$StateResponse;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlSnapshot;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tv5 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ tv5(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0208  */
    /* JADX WARN: Code duplicated, block: B:147:0x0247  */
    /* JADX WARN: Code duplicated, block: B:182:0x0302  */
    /* JADX WARN: Code duplicated, block: B:197:0x033b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0374  */
    /* JADX WARN: Code duplicated, block: B:238:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:265:0x0426  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0466  */
    /* JADX WARN: Code duplicated, block: B:295:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:310:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:340:0x056e  */
    /* JADX WARN: Code duplicated, block: B:355:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:370:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:385:0x062c  */
    /* JADX WARN: Code duplicated, block: B:400:0x066d  */
    /* JADX WARN: Code duplicated, block: B:415:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:430:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:445:0x0730  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:460:0x0769  */
    /* JADX WARN: Code duplicated, block: B:480:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:495:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:515:0x083d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:535:0x0889  */
    /* JADX WARN: Code duplicated, block: B:552:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:595:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x0153  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) {
        sv5 sv5Var;
        vv5 vv5Var;
        pw5 pw5Var;
        sw5 sw5Var;
        h16 h16Var;
        ta6 ta6Var;
        uk6 uk6Var;
        fp6 fp6Var;
        gp6 gp6Var;
        hp6 hp6Var;
        ip6 ip6Var;
        jp6 jp6Var;
        kp6 kp6Var;
        qp6 qp6Var;
        kr6 kr6Var;
        es6 es6Var;
        fs6 fs6Var;
        gs6 gs6Var;
        xu6 xu6Var;
        xkk1 xkk1Var;
        mq70 mq70Var;
        pp70 pp70Var;
        zu6 zu6Var;
        hw6 hw6Var;
        iw6 iw6Var;
        u87 u87Var;
        ab7 ab7Var;
        zb7 zb7Var;
        nd7 nd7Var;
        hn7 hn7Var;
        mp7 mp7Var;
        rv7 rv7Var;
        nv7 nv7Var;
        Locale locale;
        gx7 gx7Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        ArrayList arrayList = null;
        Object obj2 = null;
        uje1 uje1Var = null;
        u7hVar = null;
        u7hVar = null;
        u7hVar = null;
        u7h u7hVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof sv5) {
                    sv5Var = (sv5) lnmVar;
                    int i = sv5Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sv5Var.b = i - Integer.MIN_VALUE;
                    } else {
                        sv5Var = new sv5(this, lnmVar);
                    }
                } else {
                    sv5Var = new sv5(this, lnmVar);
                }
                Object obj3 = sv5Var.a;
                int i2 = sv5Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                spq0 spq0Var = (spq0) obj;
                String strUri = spq0Var.c() ? ((ContextTrack) spq0Var.b()).uri() : "";
                sv5Var.b = 1;
                return vr20Var.emit(strUri, sv5Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof vv5) {
                    vv5Var = (vv5) lnmVar;
                    int i3 = vv5Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vv5Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        vv5Var = new vv5(this, lnmVar);
                    }
                } else {
                    vv5Var = new vv5(this, lnmVar);
                }
                Object obj4 = vv5Var.a;
                int i4 = vv5Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                vv5Var.b = 1;
                return vr20Var.emit(obj, vv5Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof pw5) {
                    pw5Var = (pw5) lnmVar;
                    int i5 = pw5Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        pw5Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        pw5Var = new pw5(this, lnmVar);
                    }
                } else {
                    pw5Var = new pw5(this, lnmVar);
                }
                Object obj5 = pw5Var.a;
                int i6 = pw5Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                mmr0 mmr0Var = (mmr0) obj;
                h06 h06Var = (h06) mmr0Var.a;
                h06 h06Var2 = (h06) mmr0Var.b;
                if (h06Var == h06.b && h06Var2 == h06.a) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                pw5Var.b = 1;
                return vr20Var.emit(boolValueOf, pw5Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof sw5) {
                    sw5Var = (sw5) lnmVar;
                    int i7 = sw5Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        sw5Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        sw5Var = new sw5(this, lnmVar);
                    }
                } else {
                    sw5Var = new sw5(this, lnmVar);
                }
                Object obj6 = sw5Var.a;
                int i8 = sw5Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                sw5Var.b = 1;
                return vr20Var.emit(boolValueOf2, sw5Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof h16) {
                    h16Var = (h16) lnmVar;
                    int i9 = h16Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        h16Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        h16Var = new h16(this, lnmVar);
                    }
                } else {
                    h16Var = new h16(this, lnmVar);
                }
                Object obj7 = h16Var.a;
                int i10 = h16Var.b;
                if (i10 == 0) {
                    hm5.M(obj7);
                    guf gufVar = new guf(((c16) obj).a);
                    h16Var.b = 1;
                    return vr20Var.emit(gufVar, h16Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof ta6) {
                    ta6Var = (ta6) lnmVar;
                    int i11 = ta6Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ta6Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        ta6Var = new ta6(this, lnmVar);
                    }
                } else {
                    ta6Var = new ta6(this, lnmVar);
                }
                Object obj8 = ta6Var.a;
                int i12 = ta6Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    byte[] bArr = (byte[]) obj;
                    try {
                        ArtisanalCastGroupControlSnapshot artisanalCastGroupControlSnapshotR = ArtisanalCastGroupControlSnapshot.r(bArr);
                        ta6Var.b = 1;
                        return vr20Var.emit(artisanalCastGroupControlSnapshotR, ta6Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.artisanalcastgroupcontrolesperanto.proto.ArtisanalCastGroupControlSnapshot: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i12 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 6:
                if (lnmVar instanceof uk6) {
                    uk6Var = (uk6) lnmVar;
                    int i13 = uk6Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        uk6Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        uk6Var = new uk6(this, lnmVar);
                    }
                } else {
                    uk6Var = new uk6(this, lnmVar);
                }
                Object obj9 = uk6Var.a;
                int i14 = uk6Var.b;
                if (i14 == 0) {
                    hm5.M(obj9);
                    jx11 jx11Var = ((vfm0) obj).a;
                    uk6Var.b = 1;
                    return vr20Var.emit(jx11Var, uk6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof fp6) {
                    fp6Var = (fp6) lnmVar;
                    int i15 = fp6Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        fp6Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        fp6Var = new fp6(this, lnmVar);
                    }
                } else {
                    fp6Var = new fp6(this, lnmVar);
                }
                Object obj10 = fp6Var.a;
                int i16 = fp6Var.b;
                if (i16 == 0) {
                    hm5.M(obj10);
                    Boolean boolValueOf3 = Boolean.valueOf(((p0d0) obj).a.a());
                    fp6Var.b = 1;
                    return vr20Var.emit(boolValueOf3, fp6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof gp6) {
                    gp6Var = (gp6) lnmVar;
                    int i17 = gp6Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        gp6Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        gp6Var = new gp6(this, lnmVar);
                    }
                } else {
                    gp6Var = new gp6(this, lnmVar);
                }
                Object obj11 = gp6Var.a;
                int i18 = gp6Var.b;
                if (i18 == 0) {
                    hm5.M(obj11);
                    Boolean boolValueOf4 = Boolean.valueOf(((p0d0) obj).a.a());
                    gp6Var.b = 1;
                    return vr20Var.emit(boolValueOf4, gp6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof hp6) {
                    hp6Var = (hp6) lnmVar;
                    int i19 = hp6Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        hp6Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        hp6Var = new hp6(this, lnmVar);
                    }
                } else {
                    hp6Var = new hp6(this, lnmVar);
                }
                Object obj12 = hp6Var.a;
                int i20 = hp6Var.b;
                if (i20 == 0) {
                    hm5.M(obj12);
                    Boolean boolValueOf5 = Boolean.valueOf(((p0d0) obj).a.a());
                    hp6Var.b = 1;
                    return vr20Var.emit(boolValueOf5, hp6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof ip6) {
                    ip6Var = (ip6) lnmVar;
                    int i21 = ip6Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ip6Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        ip6Var = new ip6(this, lnmVar);
                    }
                } else {
                    ip6Var = new ip6(this, lnmVar);
                }
                Object obj13 = ip6Var.a;
                int i22 = ip6Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf6 = Boolean.valueOf(((p0d0) obj).a.a());
                    ip6Var.b = 1;
                    return vr20Var.emit(boolValueOf6, ip6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof jp6) {
                    jp6Var = (jp6) lnmVar;
                    int i23 = jp6Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        jp6Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        jp6Var = new jp6(this, lnmVar);
                    }
                } else {
                    jp6Var = new jp6(this, lnmVar);
                }
                Object obj14 = jp6Var.a;
                int i24 = jp6Var.b;
                if (i24 == 0) {
                    hm5.M(obj14);
                    Boolean boolValueOf7 = Boolean.valueOf(((p0d0) obj).a.a());
                    jp6Var.b = 1;
                    return vr20Var.emit(boolValueOf7, jp6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof kp6) {
                    kp6Var = (kp6) lnmVar;
                    int i25 = kp6Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        kp6Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        kp6Var = new kp6(this, lnmVar);
                    }
                } else {
                    kp6Var = new kp6(this, lnmVar);
                }
                Object obj15 = kp6Var.a;
                int i26 = kp6Var.b;
                if (i26 == 0) {
                    hm5.M(obj15);
                    Boolean boolValueOf8 = Boolean.valueOf(((p0d0) obj).a.a());
                    kp6Var.b = 1;
                    return vr20Var.emit(boolValueOf8, kp6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof qp6) {
                    qp6Var = (qp6) lnmVar;
                    int i27 = qp6Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        qp6Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        qp6Var = new qp6(this, lnmVar);
                    }
                } else {
                    qp6Var = new qp6(this, lnmVar);
                }
                Object obj16 = qp6Var.a;
                int i28 = qp6Var.b;
                if (i28 == 0) {
                    hm5.M(obj16);
                    pp6 pp6Var = new pp6((iq6) obj);
                    qp6Var.b = 1;
                    return vr20Var.emit(pp6Var, qp6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof kr6) {
                    kr6Var = (kr6) lnmVar;
                    int i29 = kr6Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        kr6Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        kr6Var = new kr6(this, lnmVar);
                    }
                } else {
                    kr6Var = new kr6(this, lnmVar);
                }
                Object obj17 = kr6Var.a;
                int i30 = kr6Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                String str = (String) ((cxc0) obj).f.q.get("artistUris");
                List listQ0 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : null;
                if (listQ0 != null) {
                    arrayList = new ArrayList();
                    for (Object obj18 : listQ0) {
                        if (!u890.j((String) obj18, "spotify:artist:0LyfQWJT6nXafLPZqxe9Of")) {
                            arrayList.add(obj18);
                        }
                    }
                }
                Boolean boolValueOf9 = Boolean.valueOf(!(arrayList == null || arrayList.isEmpty()));
                kr6Var.b = 1;
                return vr20Var.emit(boolValueOf9, kr6Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof es6) {
                    es6Var = (es6) lnmVar;
                    int i31 = es6Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        es6Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        es6Var = new es6(this, lnmVar);
                    }
                } else {
                    es6Var = new es6(this, lnmVar);
                }
                Object obj19 = es6Var.a;
                int i32 = es6Var.b;
                if (i32 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf10 = Boolean.valueOf(u890.j((String) obj, "1"));
                    es6Var.b = 1;
                    return vr20Var.emit(boolValueOf10, es6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof fs6) {
                    fs6Var = (fs6) lnmVar;
                    int i33 = fs6Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        fs6Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        fs6Var = new fs6(this, lnmVar);
                    }
                } else {
                    fs6Var = new fs6(this, lnmVar);
                }
                Object obj20 = fs6Var.a;
                int i34 = fs6Var.b;
                if (i34 == 0) {
                    hm5.M(obj20);
                    Boolean boolValueOf11 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    fs6Var.b = 1;
                    return vr20Var.emit(boolValueOf11, fs6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof gs6) {
                    gs6Var = (gs6) lnmVar;
                    int i35 = gs6Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        gs6Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        gs6Var = new gs6(this, lnmVar);
                    }
                } else {
                    gs6Var = new gs6(this, lnmVar);
                }
                Object obj21 = gs6Var.a;
                int i36 = gs6Var.b;
                if (i36 == 0) {
                    hm5.M(obj21);
                    Boolean boolValueOf12 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    gs6Var.b = 1;
                    return vr20Var.emit(boolValueOf12, gs6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof xu6) {
                    xu6Var = (xu6) lnmVar;
                    int i37 = xu6Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        xu6Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        xu6Var = new xu6(this, lnmVar);
                    }
                } else {
                    xu6Var = new xu6(this, lnmVar);
                }
                Object obj22 = xu6Var.a;
                int i38 = xu6Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null && (xkk1Var = (xkk1) i1rVar2.a) != null && (mq70Var = xkk1Var.a) != null && (pp70Var = mq70Var.b) != null) {
                    u7hVar = new u7h(pp70Var.b.a.c);
                }
                xu6Var.b = 1;
                return vr20Var.emit(u7hVar, xu6Var) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof zu6) {
                    zu6Var = (zu6) lnmVar;
                    int i39 = zu6Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        zu6Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        zu6Var = new zu6(this, lnmVar);
                    }
                } else {
                    zu6Var = new zu6(this, lnmVar);
                }
                Object obj23 = zu6Var.a;
                int i40 = zu6Var.b;
                if (i40 == 0) {
                    hm5.M(obj23);
                    i1r i1rVar3 = (k1r) obj;
                    if (i1rVar3 instanceof i1r) {
                        uje1Var = (uje1) i1rVar3.a;
                    } else if (i1rVar3 instanceof h1r) {
                        uje1Var = new uje1(false, false, false);
                    } else if (!(i1rVar3 instanceof j1r)) {
                        eg.o();
                    }
                    if (uje1Var == null) {
                        return rih1Var;
                    }
                    zu6Var.b = 1;
                    return vr20Var.emit(uje1Var, zu6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                if (lnmVar instanceof hw6) {
                    hw6Var = (hw6) lnmVar;
                    int i41 = hw6Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hw6Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        hw6Var = new hw6(this, lnmVar);
                    }
                } else {
                    hw6Var = new hw6(this, lnmVar);
                }
                Object obj24 = hw6Var.a;
                int i42 = hw6Var.b;
                if (i42 == 0) {
                    hm5.M(obj24);
                    Set set = ((vfm0) obj).b;
                    hw6Var.b = 1;
                    return vr20Var.emit(set, hw6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof iw6) {
                    iw6Var = (iw6) lnmVar;
                    int i43 = iw6Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        iw6Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        iw6Var = new iw6(this, lnmVar);
                    }
                } else {
                    iw6Var = new iw6(this, lnmVar);
                }
                Object obj25 = iw6Var.a;
                int i44 = iw6Var.b;
                if (i44 == 0) {
                    hm5.M(obj25);
                    g3d0 g3d0Var = ((vfm0) obj).c;
                    iw6Var.b = 1;
                    return vr20Var.emit(g3d0Var, iw6Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof u87) {
                    u87Var = (u87) lnmVar;
                    int i45 = u87Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        u87Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        u87Var = new u87(this, lnmVar);
                    }
                } else {
                    u87Var = new u87(this, lnmVar);
                }
                Object obj26 = u87Var.a;
                int i46 = u87Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                fwq fwqVar = (fwq) obj;
                fwqVar.getClass();
                List list = fwqVar.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r7h.W(((yrd) it.next()).b(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj27 : arrayList2) {
                    if (obj27 instanceof g) {
                        arrayList3.add(obj27);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj28 : arrayList3) {
                    if (((g) obj28).f) {
                        arrayList4.add(obj28);
                    }
                }
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((g) it2.next()).a);
                }
                List listJ0 = o7h.j0(arrayList5);
                u87Var.b = 1;
                return vr20Var.emit(listJ0, u87Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof ab7) {
                    ab7Var = (ab7) lnmVar;
                    int i47 = ab7Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ab7Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        ab7Var = new ab7(this, lnmVar);
                    }
                } else {
                    ab7Var = new ab7(this, lnmVar);
                }
                Object obj29 = ab7Var.a;
                int i48 = ab7Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                fwq fwqVar2 = (fwq) obj;
                fwqVar2.getClass();
                la7 la7Var = new la7(fwqVar2);
                ab7Var.b = 1;
                return vr20Var.emit(la7Var, ab7Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof zb7) {
                    zb7Var = (zb7) lnmVar;
                    int i49 = zb7Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        zb7Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        zb7Var = new zb7(this, lnmVar);
                    }
                } else {
                    zb7Var = new zb7(this, lnmVar);
                }
                Object obj30 = zb7Var.a;
                int i50 = zb7Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                i091 i091Var = (i091) obj;
                lsm0 lsm0Var = i091Var.a;
                Object lfu0Var = ofu0.a;
                if (lsm0Var != null) {
                    String str2 = lsm0Var.a;
                    o091 o091Var = i091Var.h;
                    if (o091Var instanceof j091) {
                        long j = i091Var.e;
                        if (j > 0) {
                            lfu0Var = new kfu0(str2, j);
                        }
                    } else if (o091Var instanceof n091) {
                        long j2 = i091Var.e;
                        lfu0Var = new rfu0(j2, i091Var.c, str2, i091Var.d / j2);
                    } else if ((o091Var instanceof k091) && (((k091) o091Var).a instanceof d091)) {
                        lfu0Var = new lfu0(str2);
                    }
                }
                zb7Var.b = 1;
                return vr20Var.emit(lfu0Var, zb7Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof nd7) {
                    nd7Var = (nd7) lnmVar;
                    int i51 = nd7Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        nd7Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        nd7Var = new nd7(this, lnmVar);
                    }
                } else {
                    nd7Var = new nd7(this, lnmVar);
                }
                Object obj31 = nd7Var.a;
                int i52 = nd7Var.b;
                if (i52 == 0) {
                    hm5.M(obj31);
                    nd7Var.b = 1;
                    return vr20Var.emit(id7.a, nd7Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof hn7) {
                    hn7Var = (hn7) lnmVar;
                    int i53 = hn7Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        hn7Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        hn7Var = new hn7(this, lnmVar);
                    }
                } else {
                    hn7Var = new hn7(this, lnmVar);
                }
                Object obj32 = hn7Var.a;
                int i54 = hn7Var.b;
                if (i54 == 0) {
                    hm5.M(obj32);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        AtvRemoteServiceOuterClass$StateResponse atvRemoteServiceOuterClass$StateResponseO = AtvRemoteServiceOuterClass$StateResponse.o(bArr2);
                        hn7Var.b = 1;
                        return vr20Var.emit(atvRemoteServiceOuterClass$StateResponseO, hn7Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass.StateResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i54 == 1) {
                        hm5.M(obj32);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 27:
                if (lnmVar instanceof mp7) {
                    mp7Var = (mp7) lnmVar;
                    int i55 = mp7Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        mp7Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        mp7Var = new mp7(this, lnmVar);
                    }
                } else {
                    mp7Var = new mp7(this, lnmVar);
                }
                Object obj33 = mp7Var.a;
                int i56 = mp7Var.b;
                if (i56 == 0) {
                    hm5.M(obj33);
                    Boolean boolValueOf13 = Boolean.valueOf(((k78) obj).a);
                    mp7Var.b = 1;
                    return vr20Var.emit(boolValueOf13, mp7Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj33);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof rv7) {
                    rv7Var = (rv7) lnmVar;
                    int i57 = rv7Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        rv7Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        rv7Var = new rv7(this, lnmVar);
                    }
                } else {
                    rv7Var = new rv7(this, lnmVar);
                }
                Object obj34 = rv7Var.a;
                int i58 = rv7Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj34);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj34);
                List list2 = (List) obj;
                list2.getClass();
                for (Object obj35 : list2) {
                    if (((nv7) obj35).b) {
                        obj2 = obj35;
                        nv7Var = (nv7) obj2;
                        if (nv7Var != null) {
                            locale = nv7Var.a;
                        } else {
                            locale = Locale.ROOT;
                        }
                        rv7Var.b = 1;
                        if (vr20Var.emit(locale, rv7Var) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                }
                nv7Var = (nv7) obj2;
                if (nv7Var != null) {
                    locale = nv7Var.a;
                } else {
                    locale = Locale.ROOT;
                }
                rv7Var.b = 1;
                if (vr20Var.emit(locale, rv7Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                if (lnmVar instanceof gx7) {
                    gx7Var = (gx7) lnmVar;
                    int i59 = gx7Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        gx7Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        gx7Var = new gx7(this, lnmVar);
                    }
                } else {
                    gx7Var = new gx7(this, lnmVar);
                }
                Object obj36 = gx7Var.a;
                int i60 = gx7Var.b;
                if (i60 == 0) {
                    hm5.M(obj36);
                    Boolean boolValueOf14 = Boolean.valueOf(((Number) obj).intValue() != 1);
                    gx7Var.b = 1;
                    return vr20Var.emit(boolValueOf14, gx7Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj36);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ tv5(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
