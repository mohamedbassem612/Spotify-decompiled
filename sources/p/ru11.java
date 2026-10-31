package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ru11 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;

    public ru11(vr20 vr20Var, String str, le71 le71Var) {
        this.a = (byte) 16;
        this.b = vr20Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x017b  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x021a  */
    /* JADX WARN: Code duplicated, block: B:164:0x026e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:174:0x028e  */
    /* JADX WARN: Code duplicated, block: B:199:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:217:0x0329  */
    /* JADX WARN: Code duplicated, block: B:227:0x0349  */
    /* JADX WARN: Code duplicated, block: B:242:0x038a  */
    /* JADX WARN: Code duplicated, block: B:261:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:287:0x0433  */
    /* JADX WARN: Code duplicated, block: B:313:0x0499  */
    /* JADX WARN: Code duplicated, block: B:332:0x04da  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:352:0x051b  */
    /* JADX WARN: Code duplicated, block: B:371:0x0563  */
    /* JADX WARN: Code duplicated, block: B:390:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:412:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:441:0x065f  */
    /* JADX WARN: Code duplicated, block: B:467:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:490:0x0711  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:515:0x077a  */
    /* JADX WARN: Code duplicated, block: B:535:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    public final Object emit(Object obj, lnm lnmVar) {
        qu11 qu11Var;
        ke2 ke2Var;
        d521 d521Var;
        gr21 gr21Var;
        wt21 wt21Var;
        au21 au21Var;
        String str;
        aq41 aq41Var;
        ContextTrack contextTrack;
        cu81 cu81Var;
        du81 du81Var;
        o0b1 o0b1Var;
        qjb1 qjb1Var;
        l1c1 l1c1Var;
        nsc1 nsc1Var;
        bmd1 bmd1Var;
        gre1 gre1Var;
        lze1 lze1Var;
        mef1 mef1Var;
        qjf1 qjf1Var;
        auf1 auf1Var;
        xtf1 ytf1Var;
        mq70 mq70Var;
        up70 up70VarA;
        nvf1 nvf1Var;
        ovf1 ovf1Var;
        z6x z6xVarP;
        rag1 rag1Var;
        uhg1 uhg1Var;
        y9h1 y9h1Var;
        mpl1 mpl1Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        vr20 vr20Var = this.b;
        String str2 = this.c;
        z6x i1rVar = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof qu11) {
                    qu11Var = (qu11) lnmVar;
                    int i = qu11Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qu11Var.b = i - Integer.MIN_VALUE;
                    } else {
                        qu11Var = new qu11(this, lnmVar);
                    }
                } else {
                    qu11Var = new qu11(this, lnmVar);
                }
                Object obj2 = qu11Var.a;
                int i2 = qu11Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    gd2 gd2Var = (id2) ((ad2) obj).a.get(str2);
                    if (gd2Var == null || (gd2Var instanceof fd2)) {
                        ke2Var = he2.a;
                    } else if (gd2Var instanceof gd2) {
                        gd2 gd2Var2 = gd2Var;
                        ke2Var = new ke2(gd2Var2.b, gd2Var2.a);
                    } else if (gd2Var instanceof hd2) {
                        ke2Var = le2.a;
                    } else {
                        eg.o();
                    }
                    qu11Var.b = 1;
                    return vr20Var.emit(ke2Var, qu11Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof d521) {
                    d521Var = (d521) lnmVar;
                    int i3 = d521Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        d521Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        d521Var = new d521(this, lnmVar);
                    }
                } else {
                    d521Var = new d521(this, lnmVar);
                }
                Object obj3 = d521Var.a;
                int i4 = d521Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                Object obj4 = ((e331) obj).a;
                if (!(obj4 instanceof m231) && (obj4 = (aol) ((b521) obj4).a.get(str2)) == null) {
                    obj4 = ynl.a;
                }
                e331 e331Var = new e331(obj4);
                d521Var.b = 1;
                return vr20Var.emit(e331Var, d521Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof gr21) {
                    gr21Var = (gr21) lnmVar;
                    int i5 = gr21Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        gr21Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        gr21Var = new gr21(this, lnmVar);
                    }
                } else {
                    gr21Var = new gr21(this, lnmVar);
                }
                Object obj5 = gr21Var.a;
                int i6 = gr21Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                wv00 wv00Var = (uv00) obj;
                m6k m6kVar = wv00Var.a(m6k.class, str2).b;
                jek jekVar = wv00Var.a(jek.class, str2).b;
                if (!wv00Var.f || (m6kVar != null && jekVar != null)) {
                    i1rVar = (m6kVar == null || jekVar == null) ? j1r.a : new i1r(new er21(m6kVar, jekVar), (Integer) null);
                }
                if (i1rVar == null) {
                    return rih1Var;
                }
                gr21Var.b = 1;
                return vr20Var.emit(i1rVar, gr21Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof wt21) {
                    wt21Var = (wt21) lnmVar;
                    int i7 = wt21Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        wt21Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        wt21Var = new wt21(this, lnmVar);
                    }
                } else {
                    wt21Var = new wt21(this, lnmVar);
                }
                Object obj6 = wt21Var.a;
                int i8 = wt21Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                g8i1 g8i1Var = (g8i1) ((i1r) obj).a;
                o3r o3rVar = yt21.a;
                String str3 = g8i1Var.a;
                Object p4i1Var = ((str3 == null || ihc1.y0(str3)) && g8i1Var.b == null) ? new p4i1(str2) : new r4i1(str2, g8i1Var);
                wt21Var.b = 1;
                return vr20Var.emit(p4i1Var, wt21Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof au21) {
                    au21Var = (au21) lnmVar;
                    int i9 = au21Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        au21Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        au21Var = new au21(this, lnmVar);
                    }
                } else {
                    au21Var = new au21(this, lnmVar);
                }
                Object obj7 = au21Var.a;
                int i10 = au21Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                f8i1 f8i1Var = (f8i1) ((i1r) obj).a;
                o3r o3rVar2 = bu21.a;
                String str4 = f8i1Var.a;
                q4i1 o4i1Var = ((str4 == null || ihc1.y0(str4)) && ((str = f8i1Var.b) == null || ihc1.y0(str))) ? new o4i1(str2) : new q4i1(str2, f8i1Var);
                au21Var.b = 1;
                return vr20Var.emit(o4i1Var, au21Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof aq41) {
                    aq41Var = (aq41) lnmVar;
                    int i11 = aq41Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aq41Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        aq41Var = new aq41(this, lnmVar);
                    }
                } else {
                    aq41Var = new aq41(this, lnmVar);
                }
                Object obj8 = aq41Var.a;
                int i12 = aq41Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                spq0 spq0VarTrack = ((PlayerState) obj).track();
                if (spq0VarTrack != null && (contextTrack = (ContextTrack) spq0VarTrack.h()) != null) {
                    String strA0 = (l4o1.G(contextTrack) || l4o1.O(contextTrack)) ? l4o1.a0(contextTrack, "context_uri") : contextTrack.uri();
                    if (strA0 != null) {
                        str2 = strA0;
                    }
                }
                aq41Var.b = 1;
                return vr20Var.emit(str2, aq41Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof cu81) {
                    cu81Var = (cu81) lnmVar;
                    int i13 = cu81Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        cu81Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        cu81Var = new cu81(this, lnmVar);
                    }
                } else {
                    cu81Var = new cu81(this, lnmVar);
                }
                Object obj9 = cu81Var.a;
                int i14 = cu81Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj9);
                spq0 spq0Var = (spq0) obj;
                if (!spq0Var.c()) {
                    i1rVar = d090.a;
                } else if (!u890.j(spq0Var.b(), str2)) {
                    i1rVar = b090.a;
                }
                if (i1rVar == null) {
                    return rih1Var;
                }
                cu81Var.b = 1;
                return vr20Var.emit(i1rVar, cu81Var) == d9nVar ? d9nVar : rih1Var;
            case 7:
                if (lnmVar instanceof du81) {
                    du81Var = (du81) lnmVar;
                    int i15 = du81Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        du81Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        du81Var = new du81(this, lnmVar);
                    }
                } else {
                    du81Var = new du81(this, lnmVar);
                }
                Object obj10 = du81Var.a;
                int i16 = du81Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.playbackId().c() || u890.j(playerState.playbackId().b(), str2)) {
                    return rih1Var;
                }
                du81Var.b = 1;
                return vr20Var.emit(obj, du81Var) == d9nVar ? d9nVar : rih1Var;
            case 8:
                if (lnmVar instanceof o0b1) {
                    o0b1Var = (o0b1) lnmVar;
                    int i17 = o0b1Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        o0b1Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        o0b1Var = new o0b1(this, lnmVar);
                    }
                } else {
                    o0b1Var = new o0b1(this, lnmVar);
                }
                Object obj11 = o0b1Var.a;
                int i18 = o0b1Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                Boolean bool = (Boolean) ((Map) obj).get(str2);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                o0b1Var.b = 1;
                return vr20Var.emit(boolValueOf, o0b1Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof qjb1) {
                    qjb1Var = (qjb1) lnmVar;
                    int i19 = qjb1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        qjb1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        qjb1Var = new qjb1(this, lnmVar);
                    }
                } else {
                    qjb1Var = new qjb1(this, lnmVar);
                }
                Object obj12 = qjb1Var.a;
                int i20 = qjb1Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                pp90 pp90Var = (pp90) obj;
                if (!u890.j(str2, pp90Var != null ? pp90Var.a : null)) {
                    return rih1Var;
                }
                qjb1Var.b = 1;
                return vr20Var.emit(obj, qjb1Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof l1c1) {
                    l1c1Var = (l1c1) lnmVar;
                    int i21 = l1c1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        l1c1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        l1c1Var = new l1c1(this, lnmVar);
                    }
                } else {
                    l1c1Var = new l1c1(this, lnmVar);
                }
                Object obj13 = l1c1Var.a;
                int i22 = l1c1Var.b;
                if (i22 == 0) {
                    hm5.M(obj13);
                    Boolean boolValueOf2 = Boolean.valueOf((((epm0) obj) == epm0.a && str2 == null) ? false : true);
                    l1c1Var.b = 1;
                    return vr20Var.emit(boolValueOf2, l1c1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof nsc1) {
                    nsc1Var = (nsc1) lnmVar;
                    int i23 = nsc1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        nsc1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        nsc1Var = new nsc1(this, lnmVar);
                    }
                } else {
                    nsc1Var = new nsc1(this, lnmVar);
                }
                Object obj14 = nsc1Var.a;
                int i24 = nsc1Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                h290<YourLibraryContainsResponseEntity> h290VarO = ((YourLibraryContainsResponse) obj).o();
                if (!h290VarO.isEmpty()) {
                    for (YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity : h290VarO) {
                        if (yourLibraryContainsResponseEntity.o() && u890.j(yourLibraryContainsResponseEntity.getUri(), str2)) {
                            z = true;
                        }
                    }
                }
                Boolean boolValueOf3 = Boolean.valueOf(z);
                nsc1Var.b = 1;
                return vr20Var.emit(boolValueOf3, nsc1Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof bmd1) {
                    bmd1Var = (bmd1) lnmVar;
                    int i25 = bmd1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        bmd1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        bmd1Var = new bmd1(this, lnmVar);
                    }
                } else {
                    bmd1Var = new bmd1(this, lnmVar);
                }
                Object obj15 = bmd1Var.a;
                int i26 = bmd1Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj16 : list) {
                    h8k1 h8k1Var = (h8k1) obj16;
                    if ((str2 != null && !ihc1.y0(str2)) || !u890.j(h8k1Var.a, qjd1.a)) {
                        arrayList.add(obj16);
                    }
                }
                bmd1Var.b = 1;
                return vr20Var.emit(arrayList, bmd1Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof gre1) {
                    gre1Var = (gre1) lnmVar;
                    int i27 = gre1Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        gre1Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        gre1Var = new gre1(this, lnmVar);
                    }
                } else {
                    gre1Var = new gre1(this, lnmVar);
                }
                Object obj17 = gre1Var.a;
                int i28 = gre1Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                PlayerState playerState2 = (PlayerState) obj;
                playerState2.getClass();
                z6x z6xVarD = hre1.d(playerState2, str2);
                z6x z6xVar = z6xVarD != null ? z6xVarD : "";
                gre1Var.b = 1;
                return vr20Var.emit(z6xVar, gre1Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof lze1) {
                    lze1Var = (lze1) lnmVar;
                    int i29 = lze1Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        lze1Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        lze1Var = new lze1(this, lnmVar);
                    }
                } else {
                    lze1Var = new lze1(this, lnmVar);
                }
                Object obj18 = lze1Var.a;
                int i30 = lze1Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                ez00 ez00Var = ((uv00) obj).a(mdz.class, str2).b;
                ez00Var.getClass();
                lze1Var.b = 1;
                return vr20Var.emit(ez00Var, lze1Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof mef1) {
                    mef1Var = (mef1) lnmVar;
                    int i31 = mef1Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        mef1Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        mef1Var = new mef1(this, lnmVar);
                    }
                } else {
                    mef1Var = new mef1(this, lnmVar);
                }
                Object obj19 = mef1Var.a;
                int i32 = mef1Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                PlayerState playerState3 = (PlayerState) obj;
                if (str2 != null && playerState3.isPlaying()) {
                    if (u890.j(playerState3.contextUri(), str2)) {
                        z = true;
                    } else {
                        ContextTrack contextTrack2 = (ContextTrack) playerState3.track().h();
                        if (u890.j(contextTrack2 != null ? contextTrack2.uri() : null, str2)) {
                            z = true;
                        }
                    }
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                mef1Var.b = 1;
                return vr20Var.emit(boolValueOf4, mef1Var) == d9nVar ? d9nVar : rih1Var;
            case 16:
                if (lnmVar instanceof qjf1) {
                    qjf1Var = (qjf1) lnmVar;
                    int i33 = qjf1Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        qjf1Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        qjf1Var = new qjf1(this, lnmVar);
                    }
                } else {
                    qjf1Var = new qjf1(this, lnmVar);
                }
                Object obj20 = qjf1Var.a;
                int i34 = qjf1Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                xkk1 xkk1Var = ((uv00) obj).a(xkk1.class, str2).b;
                if (xkk1Var != null) {
                    up70 up70Var = (up70) o7h.s0(xkk1Var.a.a);
                    i1rVar = up70Var != null ? up70Var.a.a : null;
                    i1rVar = i1rVar != null ? i1rVar : "";
                }
                if (i1rVar == null) {
                    return rih1Var;
                }
                qjf1Var.b = 1;
                return vr20Var.emit(i1rVar, qjf1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof auf1) {
                    auf1Var = (auf1) lnmVar;
                    int i35 = auf1Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        auf1Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        auf1Var = new auf1(this, lnmVar);
                    }
                } else {
                    auf1Var = new auf1(this, lnmVar);
                }
                Object obj21 = auf1Var.a;
                int i36 = auf1Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                uv00 uv00Var = (uv00) obj;
                uv00Var.getClass();
                xkk1 xkk1Var2 = uv00Var.a(xkk1.class, str2).b;
                if (xkk1Var2 != null && (mq70Var = xkk1Var2.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    i1rVar = up70VarA.a.a;
                }
                yo60 yo60Var = uv00Var.a(yo60.class, str2).b;
                if (yo60Var != null) {
                    String str5 = yo60Var.a;
                    if (ihc1.y0(str5)) {
                        ytf1Var = new ytf1(i1rVar);
                    } else {
                        ytf1Var = new xtf1(yo60Var.i, str5, i1rVar);
                    }
                } else {
                    ytf1Var = new ytf1(i1rVar);
                }
                auf1Var.b = 1;
                return vr20Var.emit(ytf1Var, auf1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof nvf1) {
                    nvf1Var = (nvf1) lnmVar;
                    int i37 = nvf1Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        nvf1Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        nvf1Var = new nvf1(this, lnmVar);
                    }
                } else {
                    nvf1Var = new nvf1(this, lnmVar);
                }
                Object obj22 = nvf1Var.a;
                int i38 = nvf1Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                hwn hwnVar = (jwn) obj;
                boolean z2 = hwnVar instanceof gwn;
                rrt0 rrt0Var = rrt0.b;
                if (!z2) {
                    if ((hwnVar instanceof hwn) && u890.j(hwnVar.a, str2)) {
                        rrt0Var = rrt0.c;
                    } else if ((hwnVar instanceof iwn) && u890.j(((iwn) hwnVar).a, str2)) {
                        rrt0Var = rrt0.a;
                    }
                }
                nvf1Var.b = 1;
                return vr20Var.emit(rrt0Var, nvf1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof ovf1) {
                    ovf1Var = (ovf1) lnmVar;
                    int i39 = ovf1Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        ovf1Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        ovf1Var = new ovf1(this, lnmVar);
                    }
                } else {
                    ovf1Var = new ovf1(this, lnmVar);
                }
                Object obj23 = ovf1Var.a;
                int i40 = ovf1Var.b;
                if (i40 == 0) {
                    hm5.M(obj23);
                    Boolean boolValueOf5 = Boolean.valueOf(((ijo) obj).b.contains(str2));
                    ovf1Var.b = 1;
                    return vr20Var.emit(boolValueOf5, ovf1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                PlaybackSettingsEsperantoService.StreamSettingChange streamSettingChange = (PlaybackSettingsEsperantoService.StreamSettingChange) obj;
                PlaybackSettingsEsperantoService.ContentSettingChange contentSettingChangeN = streamSettingChange.n();
                if (!u890.j(contentSettingChangeN != null ? contentSettingChangeN.n() : null, str2)) {
                    return rih1Var;
                }
                PlaybackSettingsEsperantoService.ContentSettingChange contentSettingChangeN2 = streamSettingChange.n();
                if (contentSettingChangeN2 != null && (z6xVarP = contentSettingChangeN2.p()) != null && z6xVarP.length() != 0) {
                    i1rVar = z6xVarP;
                }
                Object objEmit = vr20Var.emit(i1rVar, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof rag1) {
                    rag1Var = (rag1) lnmVar;
                    int i41 = rag1Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        rag1Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        rag1Var = new rag1(this, lnmVar);
                    }
                } else {
                    rag1Var = new rag1(this, lnmVar);
                }
                Object obj24 = rag1Var.a;
                int i42 = rag1Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                ddz ddzVar = ((uv00) obj).a(ddz.class, str2).b;
                i1rVar = ddzVar != null ? ddzVar.b : null;
                if (i1rVar == null) {
                    i1rVar = z6x.a;
                }
                rag1Var.b = 1;
                return vr20Var.emit(i1rVar, rag1Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof uhg1) {
                    uhg1Var = (uhg1) lnmVar;
                    int i43 = uhg1Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        uhg1Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        uhg1Var = new uhg1(this, lnmVar);
                    }
                } else {
                    uhg1Var = new uhg1(this, lnmVar);
                }
                Object obj25 = uhg1Var.a;
                int i44 = uhg1Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                mmr0 mmr0Var = new mmr0(str2, bool2);
                uhg1Var.b = 1;
                return vr20Var.emit(mmr0Var, uhg1Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof y9h1) {
                    y9h1Var = (y9h1) lnmVar;
                    int i45 = y9h1Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        y9h1Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        y9h1Var = new y9h1(this, lnmVar);
                    }
                } else {
                    y9h1Var = new y9h1(this, lnmVar);
                }
                Object obj26 = y9h1Var.a;
                int i46 = y9h1Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                if (!u890.j(((w9h1) obj).a, str2)) {
                    return rih1Var;
                }
                y9h1Var.b = 1;
                return vr20Var.emit(obj, y9h1Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof mpl1) {
                    mpl1Var = (mpl1) lnmVar;
                    int i47 = mpl1Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        mpl1Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        mpl1Var = new mpl1(this, lnmVar);
                    }
                } else {
                    mpl1Var = new mpl1(this, lnmVar);
                }
                Object obj27 = mpl1Var.a;
                int i48 = mpl1Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                if (u890.j(((PlayerState) obj).contextUri(), str2)) {
                    return rih1Var;
                }
                mpl1Var.b = 1;
                return vr20Var.emit(obj, mpl1Var) == d9nVar ? d9nVar : rih1Var;
            default:
                cj31 cj31Var = (cj31) obj;
                if (cj31Var instanceof zi31) {
                    Logger.l(((zi31) cj31Var).a, "Failed to load Wrapped banner Rive asset: %s", new Object[]{str2});
                }
                Object objEmit2 = vr20Var.emit(cj31Var, lnmVar);
                return objEmit2 == d9nVar ? objEmit2 : rih1Var;
        }
    }

    public /* synthetic */ ru11(vr20 vr20Var, Object obj, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }

    public /* synthetic */ ru11(vr20 vr20Var, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
    }

    public /* synthetic */ ru11(String str, vr20 vr20Var, byte b) {
        this.a = b;
        this.c = str;
        this.b = vr20Var;
    }
}
