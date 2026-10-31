package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bw71 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ bw71(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:143:0x0239  */
    /* JADX WARN: Code duplicated, block: B:166:0x028e  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:198:0x030e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0354  */
    /* JADX WARN: Code duplicated, block: B:243:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:258:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:273:0x0426  */
    /* JADX WARN: Code duplicated, block: B:290:0x0469  */
    /* JADX WARN: Code duplicated, block: B:307:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:326:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:343:0x052a  */
    /* JADX WARN: Code duplicated, block: B:358:0x0569  */
    /* JADX WARN: Code duplicated, block: B:375:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:390:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:405:0x0625  */
    /* JADX WARN: Code duplicated, block: B:420:0x065c  */
    /* JADX WARN: Code duplicated, block: B:442:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:457:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:480:0x075d  */
    /* JADX WARN: Code duplicated, block: B:495:0x0798  */
    /* JADX WARN: Code duplicated, block: B:514:0x07da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object emit(Object obj, lnm lnmVar) throws Throwable {
        aw71 aw71Var;
        p481 p481Var;
        g581 g581Var;
        j781 j781Var;
        g781 g781Var;
        f981 f981Var;
        j981 j981Var;
        gd81 gd81Var;
        qe81 qe81Var;
        bu81 bu81Var;
        fu81 fu81Var;
        hu81 hu81Var;
        ju81 ju81Var;
        ku81 ku81Var;
        mu81 mu81Var;
        nu81 nu81Var;
        ou81 ou81Var;
        pu81 pu81Var;
        w091 w091Var;
        l791 l791Var;
        m791 m791Var;
        n791 n791Var;
        v791 v791Var;
        i6h1 i6h1VarR;
        f891 f891Var;
        h891 h891Var;
        i891 i891Var;
        j891 j891Var;
        fa91 fa91Var;
        ta91 ta91Var;
        xb91 xb91Var;
        yb91 yb91Var;
        byte b = this.a;
        a090 a090Var = a090.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof aw71) {
                    aw71Var = (aw71) lnmVar;
                    int i = aw71Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aw71Var.b = i - Integer.MIN_VALUE;
                    } else {
                        aw71Var = new aw71(this, lnmVar);
                    }
                } else {
                    aw71Var = new aw71(this, lnmVar);
                }
                Object obj2 = aw71Var.a;
                int i2 = aw71Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                ijo ijoVar = (ijo) obj;
                kx71 kx71Var = new kx71(ijoVar.a, ijoVar.c);
                aw71Var.b = 1;
                return vr20Var.emit(kx71Var, aw71Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof p481) {
                    p481Var = (p481) lnmVar;
                    int i3 = p481Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p481Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        p481Var = new p481(this, lnmVar);
                    }
                } else {
                    p481Var = new p481(this, lnmVar);
                }
                Object obj3 = p481Var.a;
                int i4 = p481Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    l4m l4mVar = ((Boolean) obj).booleanValue() ? l4m.b : l4m.c;
                    p481Var.b = 1;
                    return vr20Var.emit(l4mVar, p481Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof g581) {
                    g581Var = (g581) lnmVar;
                    int i5 = g581Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        g581Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        g581Var = new g581(this, lnmVar);
                    }
                } else {
                    g581Var = new g581(this, lnmVar);
                }
                Object obj4 = g581Var.a;
                int i6 = g581Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    jt61 jt61VarA = h581.a((n331) obj);
                    g581Var.b = 1;
                    return vr20Var.emit(jt61VarA, g581Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof j781) {
                    j781Var = (j781) lnmVar;
                    int i7 = j781Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        j781Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        j781Var = new j781(this, lnmVar);
                    }
                } else {
                    j781Var = new j781(this, lnmVar);
                }
                Object obj5 = j781Var.a;
                int i8 = j781Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    oy21 oy21Var = (py21) obj;
                    if (oy21Var instanceof oy21) {
                        qxc0 qxc0Var = (qxc0) oy21Var.a;
                        g781Var = new g781(qxc0Var.t, qxc0Var.h, u890.j(qxc0Var.X.get("is_genpods"), "true"), true);
                    } else if (oy21Var instanceof ly21) {
                        g781Var = new g781(new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191), false, false, false);
                    } else {
                        eg.o();
                    }
                    j781Var.b = 1;
                    return vr20Var.emit(g781Var, j781Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof f981) {
                    f981Var = (f981) lnmVar;
                    int i9 = f981Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        f981Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        f981Var = new f981(this, lnmVar);
                    }
                } else {
                    f981Var = new f981(this, lnmVar);
                }
                Object obj6 = f981Var.a;
                int i10 = f981Var.b;
                if (i10 == 0) {
                    hm5.M(obj6);
                    jt61 jt61VarA2 = g981.a((n331) obj);
                    f981Var.b = 1;
                    return vr20Var.emit(jt61VarA2, f981Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i10 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof j981) {
                    j981Var = (j981) lnmVar;
                    int i11 = j981Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        j981Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        j981Var = new j981(this, lnmVar);
                    }
                } else {
                    j981Var = new j981(this, lnmVar);
                }
                Object obj7 = j981Var.a;
                int i12 = j981Var.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                Integer numC0 = nhc1.c0((String) obj);
                Boolean boolValueOf = Boolean.valueOf(((numC0 != null ? numC0.intValue() : 0) & 1) != 0);
                j981Var.b = 1;
                return vr20Var.emit(boolValueOf, j981Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof gd81) {
                    gd81Var = (gd81) lnmVar;
                    int i13 = gd81Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        gd81Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        gd81Var = new gd81(this, lnmVar);
                    }
                } else {
                    gd81Var = new gd81(this, lnmVar);
                }
                Object obj8 = gd81Var.a;
                int i14 = gd81Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    gd81Var.b = 1;
                    return vr20Var.emit((hwt) obj, gd81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof qe81) {
                    qe81Var = (qe81) lnmVar;
                    int i15 = qe81Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        qe81Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        qe81Var = new qe81(this, lnmVar);
                    }
                } else {
                    qe81Var = new qe81(this, lnmVar);
                }
                Object obj9 = qe81Var.a;
                int i16 = qe81Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf2 = Boolean.valueOf(!((Boolean) obj).booleanValue());
                    qe81Var.b = 1;
                    return vr20Var.emit(boolValueOf2, qe81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof bu81) {
                    bu81Var = (bu81) lnmVar;
                    int i17 = bu81Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        bu81Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        bu81Var = new bu81(this, lnmVar);
                    }
                } else {
                    bu81Var = new bu81(this, lnmVar);
                }
                Object obj10 = bu81Var.a;
                int i18 = bu81Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    spq0 spq0VarPlaybackId = ((PlayerState) obj).playbackId();
                    bu81Var.b = 1;
                    return vr20Var.emit(spq0VarPlaybackId, bu81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof fu81) {
                    fu81Var = (fu81) lnmVar;
                    int i19 = fu81Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        fu81Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        fu81Var = new fu81(this, lnmVar);
                    }
                } else {
                    fu81Var = new fu81(this, lnmVar);
                }
                Object obj11 = fu81Var.a;
                int i20 = fu81Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                if (!((PlayerState) obj).playbackId().c()) {
                    return rih1Var;
                }
                fu81Var.b = 1;
                return vr20Var.emit(obj, fu81Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof hu81) {
                    hu81Var = (hu81) lnmVar;
                    int i21 = hu81Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        hu81Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        hu81Var = new hu81(this, lnmVar);
                    }
                } else {
                    hu81Var = new hu81(this, lnmVar);
                }
                Object obj12 = hu81Var.a;
                int i22 = hu81Var.b;
                if (i22 == 0) {
                    hm5.M(obj12);
                    Object objH = ((PlayerState) obj).playbackId().h();
                    hu81Var.b = 1;
                    return vr20Var.emit(objH, hu81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i22 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof ju81) {
                    ju81Var = (ju81) lnmVar;
                    int i23 = ju81Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ju81Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        ju81Var = new ju81(this, lnmVar);
                    }
                } else {
                    ju81Var = new ju81(this, lnmVar);
                }
                Object obj13 = ju81Var.a;
                int i24 = ju81Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                if (!u890.j((e090) obj, c090.a)) {
                    return rih1Var;
                }
                ju81Var.b = 1;
                return vr20Var.emit(obj, ju81Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof ku81) {
                    ku81Var = (ku81) lnmVar;
                    int i25 = ku81Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ku81Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        ku81Var = new ku81(this, lnmVar);
                    }
                } else {
                    ku81Var = new ku81(this, lnmVar);
                }
                Object obj14 = ku81Var.a;
                int i26 = ku81Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                e090 e090Var = (e090) obj;
                if (!u890.j(e090Var, b090.a) && !u890.j(e090Var, a090Var)) {
                    return rih1Var;
                }
                ku81Var.b = 1;
                return vr20Var.emit(obj, ku81Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof mu81) {
                    mu81Var = (mu81) lnmVar;
                    int i27 = mu81Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        mu81Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        mu81Var = new mu81(this, lnmVar);
                    }
                } else {
                    mu81Var = new mu81(this, lnmVar);
                }
                Object obj15 = mu81Var.a;
                int i28 = mu81Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                if (!((spq0) obj).c()) {
                    return rih1Var;
                }
                mu81Var.b = 1;
                return vr20Var.emit(obj, mu81Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof nu81) {
                    nu81Var = (nu81) lnmVar;
                    int i29 = nu81Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        nu81Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        nu81Var = new nu81(this, lnmVar);
                    }
                } else {
                    nu81Var = new nu81(this, lnmVar);
                }
                Object obj16 = nu81Var.a;
                int i30 = nu81Var.b;
                if (i30 != 0) {
                    if (i30 == 1) {
                        hm5.M(obj16);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj16);
                if (!l4o1.H((ContextTrack) ((spq0) obj).b())) {
                    return rih1Var;
                }
                nu81Var.b = 1;
                return vr20Var.emit(obj, nu81Var) == d9nVar ? d9nVar : rih1Var;
            case 15:
                if (lnmVar instanceof ou81) {
                    ou81Var = (ou81) lnmVar;
                    int i31 = ou81Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ou81Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        ou81Var = new ou81(this, lnmVar);
                    }
                } else {
                    ou81Var = new ou81(this, lnmVar);
                }
                Object obj17 = ou81Var.a;
                int i32 = ou81Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    spq0 spq0VarTrack = ((PlayerState) obj).track();
                    ou81Var.b = 1;
                    return vr20Var.emit(spq0VarTrack, ou81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof pu81) {
                    pu81Var = (pu81) lnmVar;
                    int i33 = pu81Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        pu81Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        pu81Var = new pu81(this, lnmVar);
                    }
                } else {
                    pu81Var = new pu81(this, lnmVar);
                }
                Object obj18 = pu81Var.a;
                int i34 = pu81Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    pu81Var.b = 1;
                    return vr20Var.emit(a090Var, pu81Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof w091) {
                    w091Var = (w091) lnmVar;
                    int i35 = w091Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        w091Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        w091Var = new w091(this, lnmVar);
                    }
                } else {
                    w091Var = new w091(this, lnmVar);
                }
                Object obj19 = w091Var.a;
                int i36 = w091Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    kwq kwqVar = (mob1) obj;
                    if (kwqVar instanceof xa01) {
                        throw ((xa01) kwqVar).a;
                    }
                    if (kwqVar instanceof zf20) {
                        throw ((zf20) kwqVar).a;
                    }
                    if (kwqVar instanceof kwq) {
                        Object obj20 = kwqVar.a;
                        w091Var.b = 1;
                        return vr20Var.emit(obj20, w091Var) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (kwqVar instanceof eeh1) {
                        eg.m("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    } else {
                        eg.o();
                    }
                } else {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof l791) {
                    l791Var = (l791) lnmVar;
                    int i37 = l791Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        l791Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        l791Var = new l791(this, lnmVar);
                    }
                } else {
                    l791Var = new l791(this, lnmVar);
                }
                Object obj21 = l791Var.a;
                int i38 = l791Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                t8p0 t8p0Var = (t8p0) obj;
                t8p0Var.getClass();
                Boolean boolValueOf3 = Boolean.valueOf(t8p0Var.b.contains(s8p0.b));
                l791Var.b = 1;
                return vr20Var.emit(boolValueOf3, l791Var) == d9nVar ? d9nVar : rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof m791) {
                    m791Var = (m791) lnmVar;
                    int i39 = m791Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        m791Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        m791Var = new m791(this, lnmVar);
                    }
                } else {
                    m791Var = new m791(this, lnmVar);
                }
                Object obj22 = m791Var.a;
                int i40 = m791Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                if (!((PlayerState) obj).track().c()) {
                    return rih1Var;
                }
                m791Var.b = 1;
                return vr20Var.emit(obj, m791Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof n791) {
                    n791Var = (n791) lnmVar;
                    int i41 = n791Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        n791Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        n791Var = new n791(this, lnmVar);
                    }
                } else {
                    n791Var = new n791(this, lnmVar);
                }
                Object obj23 = n791Var.a;
                int i42 = n791Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    Object objB = ((PlayerState) obj).track().b();
                    n791Var.b = 1;
                    return vr20Var.emit(objB, n791Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof v791) {
                    v791Var = (v791) lnmVar;
                    int i43 = v791Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        v791Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        v791Var = new v791(this, lnmVar);
                    }
                } else {
                    v791Var = new v791(this, lnmVar);
                }
                Object obj24 = v791Var.a;
                int i44 = v791Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    v6l v6lVar = (e7l) obj;
                    if (v6lVar instanceof v6l) {
                        i6h1VarR = p2o1.q(v6lVar.a);
                    } else if (v6lVar instanceof z6l) {
                        i6h1VarR = p2o1.r(((z6l) v6lVar).b);
                    } else {
                        eg.o();
                    }
                    v791Var.b = 1;
                    return vr20Var.emit(i6h1VarR, v791Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof f891) {
                    f891Var = (f891) lnmVar;
                    int i45 = f891Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        f891Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        f891Var = new f891(this, lnmVar);
                    }
                } else {
                    f891Var = new f891(this, lnmVar);
                }
                Object obj25 = f891Var.a;
                int i46 = f891Var.b;
                if (i46 == 0) {
                    hm5.M(obj25);
                    a891 a891Var = new a891((i6h1) obj);
                    f891Var.b = 1;
                    return vr20Var.emit(a891Var, f891Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i46 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                if (lnmVar instanceof h891) {
                    h891Var = (h891) lnmVar;
                    int i47 = h891Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        h891Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        h891Var = new h891(this, lnmVar);
                    }
                } else {
                    h891Var = new h891(this, lnmVar);
                }
                Object obj26 = h891Var.a;
                int i48 = h891Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                String str = (String) ((ContextTrack) obj).metadata().get("ad.skippable_ad_delay");
                Long lD0 = str != null ? nhc1.d0(10, str) : null;
                brl1 l = lD0 != null ? new Long(lD0.longValue() * 1000) : null;
                h891Var.b = 1;
                return vr20Var.emit(l, h891Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof i891) {
                    i891Var = (i891) lnmVar;
                    int i49 = i891Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        i891Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        i891Var = new i891(this, lnmVar);
                    }
                } else {
                    i891Var = new i891(this, lnmVar);
                }
                Object obj27 = i891Var.a;
                int i50 = i891Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                Object objH2 = ((PlayerState) obj).track().h();
                if (objH2 == null) {
                    return rih1Var;
                }
                i891Var.b = 1;
                return vr20Var.emit(objH2, i891Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof j891) {
                    j891Var = (j891) lnmVar;
                    int i51 = j891Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        j891Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        j891Var = new j891(this, lnmVar);
                    }
                } else {
                    j891Var = new j891(this, lnmVar);
                }
                Object obj28 = j891Var.a;
                int i52 = j891Var.b;
                if (i52 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf4 = Boolean.valueOf(((Long) obj) != null);
                    j891Var.b = 1;
                    return vr20Var.emit(boolValueOf4, j891Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof fa91) {
                    fa91Var = (fa91) lnmVar;
                    int i53 = fa91Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        fa91Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        fa91Var = new fa91(this, lnmVar);
                    }
                } else {
                    fa91Var = new fa91(this, lnmVar);
                }
                Object obj29 = fa91Var.a;
                int i54 = fa91Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                htl1 htl1Var = (htl1) obj;
                Boolean boolValueOf5 = Boolean.valueOf(u890.j(htl1Var != null ? htl1Var.b : null, brl1.b));
                fa91Var.b = 1;
                return vr20Var.emit(boolValueOf5, fa91Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof ta91) {
                    ta91Var = (ta91) lnmVar;
                    int i55 = ta91Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ta91Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        ta91Var = new ta91(this, lnmVar);
                    }
                } else {
                    ta91Var = new ta91(this, lnmVar);
                }
                Object obj30 = ta91Var.a;
                int i56 = ta91Var.b;
                if (i56 == 0) {
                    hm5.M(obj30);
                    Restrictions restrictions = ((PlayerState) obj).restrictions();
                    ta91Var.b = 1;
                    return vr20Var.emit(restrictions, ta91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 28:
                if (lnmVar instanceof xb91) {
                    xb91Var = (xb91) lnmVar;
                    int i57 = xb91Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        xb91Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        xb91Var = new xb91(this, lnmVar);
                    }
                } else {
                    xb91Var = new xb91(this, lnmVar);
                }
                Object obj31 = xb91Var.a;
                int i58 = xb91Var.b;
                if (i58 == 0) {
                    hm5.M(obj31);
                    dc91 dc91Var = new dc91((List) obj);
                    xb91Var.b = 1;
                    return vr20Var.emit(dc91Var, xb91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof yb91) {
                    yb91Var = (yb91) lnmVar;
                    int i59 = yb91Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        yb91Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        yb91Var = new yb91(this, lnmVar);
                    }
                } else {
                    yb91Var = new yb91(this, lnmVar);
                }
                Object obj32 = yb91Var.a;
                int i60 = yb91Var.b;
                if (i60 == 0) {
                    hm5.M(obj32);
                    ec91 ec91Var = new ec91((List) obj);
                    yb91Var.b = 1;
                    return vr20Var.emit(ec91Var, yb91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj32);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ bw71(vr20 vr20Var, ov61 ov61Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
