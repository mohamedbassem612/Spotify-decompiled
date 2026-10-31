package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetProgressResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ml21 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public ml21(vr20 vr20Var, ne neVar) {
        this.a = (byte) 13;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:131:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0289  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:181:0x031e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0361  */
    /* JADX WARN: Code duplicated, block: B:213:0x039a  */
    /* JADX WARN: Code duplicated, block: B:228:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:243:0x0413  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:258:0x044e  */
    /* JADX WARN: Code duplicated, block: B:273:0x048c  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:327:0x053a  */
    /* JADX WARN: Code duplicated, block: B:342:0x0577  */
    /* JADX WARN: Code duplicated, block: B:359:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:374:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:391:0x062f  */
    /* JADX WARN: Code duplicated, block: B:411:0x067f  */
    /* JADX WARN: Code duplicated, block: B:431:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:451:0x071b  */
    /* JADX WARN: Code duplicated, block: B:468:0x0755  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:485:0x078f  */
    /* JADX WARN: Code duplicated, block: B:502:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:519:0x080d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public final Object emit(Object obj, lnm lnmVar) {
        ll21 ll21Var;
        bs21 bs21Var;
        cs21 cs21Var;
        vt21 vt21Var;
        zt21 zt21Var;
        j831 j831Var;
        k831 k831Var;
        l831 l831Var;
        og31 og31Var;
        pg31 pg31Var;
        l641 l641Var;
        p841 p841Var;
        q841 q841Var;
        r841 r841Var;
        oi41 oi41Var;
        pi41 pi41Var;
        qi41 qi41Var;
        vl41 vl41Var;
        sp41 sp41Var;
        dq41 dq41Var;
        eq41 eq41Var;
        jr41 jr41Var;
        su41 su41Var;
        d551 d551Var;
        o651 o651Var;
        xt51 xt51Var;
        Set set;
        cu51 cu51Var;
        du51 du51Var;
        eu51 eu51Var;
        fu51 fu51Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ll21) {
                    ll21Var = (ll21) lnmVar;
                    int i = ll21Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ll21Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ll21Var = new ll21(this, lnmVar);
                    }
                } else {
                    ll21Var = new ll21(this, lnmVar);
                }
                Object obj2 = ll21Var.a;
                int i2 = ll21Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    sen senVar = new sen((String) obj);
                    ll21Var.b = 1;
                    return vr20Var.emit(senVar, ll21Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof bs21) {
                    bs21Var = (bs21) lnmVar;
                    int i3 = bs21Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bs21Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        bs21Var = new bs21(this, lnmVar);
                    }
                } else {
                    bs21Var = new bs21(this, lnmVar);
                }
                Object obj3 = bs21Var.a;
                int i4 = bs21Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                bs21Var.b = 1;
                return vr20Var.emit(obj, bs21Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof cs21) {
                    cs21Var = (cs21) lnmVar;
                    int i5 = cs21Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        cs21Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        cs21Var = new cs21(this, lnmVar);
                    }
                } else {
                    cs21Var = new cs21(this, lnmVar);
                }
                Object obj4 = cs21Var.a;
                int i6 = cs21Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                cs21Var.b = 1;
                return vr20Var.emit(obj, cs21Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof vt21) {
                    vt21Var = (vt21) lnmVar;
                    int i7 = vt21Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        vt21Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        vt21Var = new vt21(this, lnmVar);
                    }
                } else {
                    vt21Var = new vt21(this, lnmVar);
                }
                Object obj5 = vt21Var.a;
                int i8 = vt21Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                vt21Var.b = 1;
                return vr20Var.emit(obj, vt21Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof zt21) {
                    zt21Var = (zt21) lnmVar;
                    int i9 = zt21Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zt21Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        zt21Var = new zt21(this, lnmVar);
                    }
                } else {
                    zt21Var = new zt21(this, lnmVar);
                }
                Object obj6 = zt21Var.a;
                int i10 = zt21Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                zt21Var.b = 1;
                return vr20Var.emit(obj, zt21Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof j831) {
                    j831Var = (j831) lnmVar;
                    int i11 = j831Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        j831Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        j831Var = new j831(this, lnmVar);
                    }
                } else {
                    j831Var = new j831(this, lnmVar);
                }
                Object obj7 = j831Var.a;
                int i12 = j831Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    byte[] bArr = (byte[]) obj;
                    try {
                        ResumptionProgressEsperanto$GetProgressResponse resumptionProgressEsperanto$GetProgressResponseO = ResumptionProgressEsperanto$GetProgressResponse.o(bArr);
                        j831Var.b = 1;
                        return vr20Var.emit(resumptionProgressEsperanto$GetProgressResponseO, j831Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetProgressResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
                    }
                } else {
                    if (i12 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 6:
                if (lnmVar instanceof k831) {
                    k831Var = (k831) lnmVar;
                    int i13 = k831Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        k831Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        k831Var = new k831(this, lnmVar);
                    }
                } else {
                    k831Var = new k831(this, lnmVar);
                }
                Object obj8 = k831Var.a;
                int i14 = k831Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    byte[] bArr2 = (byte[]) obj;
                    try {
                        ResumptionProgressEsperanto$GetProgressResponse resumptionProgressEsperanto$GetProgressResponseO2 = ResumptionProgressEsperanto$GetProgressResponse.o(bArr2);
                        k831Var.b = 1;
                        return vr20Var.emit(resumptionProgressEsperanto$GetProgressResponseO2, k831Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e2) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetProgressResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    }
                } else {
                    if (i14 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 7:
                if (lnmVar instanceof l831) {
                    l831Var = (l831) lnmVar;
                    int i15 = l831Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        l831Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        l831Var = new l831(this, lnmVar);
                    }
                } else {
                    l831Var = new l831(this, lnmVar);
                }
                Object obj9 = l831Var.a;
                int i16 = l831Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    byte[] bArr3 = (byte[]) obj;
                    try {
                        ResumptionProgressEsperanto$GetResumePointResponse resumptionProgressEsperanto$GetResumePointResponseP = ResumptionProgressEsperanto$GetResumePointResponse.p(bArr3);
                        l831Var.b = 1;
                        return vr20Var.emit(resumptionProgressEsperanto$GetResumePointResponseP, l831Var) == d9nVar ? d9nVar : rih1Var;
                    } catch (Exception e3) {
                        bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetResumePointResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e3);
                    }
                } else {
                    if (i16 == 1) {
                        hm5.M(obj9);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                if (lnmVar instanceof og31) {
                    og31Var = (og31) lnmVar;
                    int i17 = og31Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        og31Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        og31Var = new og31(this, lnmVar);
                    }
                } else {
                    og31Var = new og31(this, lnmVar);
                }
                Object obj10 = og31Var.a;
                int i18 = og31Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                og31Var.b = 1;
                return vr20Var.emit(obj, og31Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof pg31) {
                    pg31Var = (pg31) lnmVar;
                    int i19 = pg31Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        pg31Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        pg31Var = new pg31(this, lnmVar);
                    }
                } else {
                    pg31Var = new pg31(this, lnmVar);
                }
                Object obj11 = pg31Var.a;
                int i20 = pg31Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    List listB = ((uv00) obj).b(wjf.class);
                    pg31Var.b = 1;
                    return vr20Var.emit(listB, pg31Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof l641) {
                    l641Var = (l641) lnmVar;
                    int i21 = l641Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        l641Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        l641Var = new l641(this, lnmVar);
                    }
                } else {
                    l641Var = new l641(this, lnmVar);
                }
                Object obj12 = l641Var.a;
                int i22 = l641Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                if (!(obj instanceof i1r)) {
                    return rih1Var;
                }
                l641Var.b = 1;
                return vr20Var.emit(obj, l641Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof p841) {
                    p841Var = (p841) lnmVar;
                    int i23 = p841Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        p841Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        p841Var = new p841(this, lnmVar);
                    }
                } else {
                    p841Var = new p841(this, lnmVar);
                }
                Object obj13 = p841Var.a;
                int i24 = p841Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    Object objD = ((py21) obj).d();
                    p841Var.b = 1;
                    return vr20Var.emit(objD, p841Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof q841) {
                    q841Var = (q841) lnmVar;
                    int i25 = q841Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        q841Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        q841Var = new q841(this, lnmVar);
                    }
                } else {
                    q841Var = new q841(this, lnmVar);
                }
                Object obj14 = q841Var.a;
                int i26 = q841Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    kby kbyVar = ((wsc0) obj).f;
                    q841Var.b = 1;
                    return vr20Var.emit(kbyVar, q841Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof r841) {
                    r841Var = (r841) lnmVar;
                    int i27 = r841Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        r841Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        r841Var = new r841(this, lnmVar);
                    }
                } else {
                    r841Var = new r841(this, lnmVar);
                }
                Object obj15 = r841Var.a;
                int i28 = r841Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj15);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj15);
                kby kbyVar2 = (kby) obj;
                tu00 tu00Var = kbyVar2.x;
                boolean z2 = kbyVar2.g;
                qp31 qp31VarA = tu00Var.a(qp31.class);
                boolean z3 = qp31VarA != null && qp31VarA.a;
                boolean z4 = kbyVar2.j;
                boolean z5 = !z4 || (z4 && !z2);
                if (z3 && z5 && (!kbyVar2.w.a || !z2)) {
                    z = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                r841Var.b = 1;
                return vr20Var.emit(boolValueOf, r841Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof oi41) {
                    oi41Var = (oi41) lnmVar;
                    int i29 = oi41Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        oi41Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        oi41Var = new oi41(this, lnmVar);
                    }
                } else {
                    oi41Var = new oi41(this, lnmVar);
                }
                Object obj16 = oi41Var.a;
                int i30 = oi41Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    ki41 ki41Var = new ki41((aj41) obj);
                    oi41Var.b = 1;
                    return vr20Var.emit(ki41Var, oi41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof pi41) {
                    pi41Var = (pi41) lnmVar;
                    int i31 = pi41Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        pi41Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        pi41Var = new pi41(this, lnmVar);
                    }
                } else {
                    pi41Var = new pi41(this, lnmVar);
                }
                Object obj17 = pi41Var.a;
                int i32 = pi41Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    pi41Var.b = 1;
                    return vr20Var.emit(li41.a, pi41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof qi41) {
                    qi41Var = (qi41) lnmVar;
                    int i33 = qi41Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        qi41Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        qi41Var = new qi41(this, lnmVar);
                    }
                } else {
                    qi41Var = new qi41(this, lnmVar);
                }
                Object obj18 = qi41Var.a;
                int i34 = qi41Var.b;
                if (i34 == 0) {
                    hm5.M(obj18);
                    ji41 ji41Var = ((ni41) obj).a;
                    qi41Var.b = 1;
                    return vr20Var.emit(ji41Var, qi41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i34 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 17:
                if (lnmVar instanceof vl41) {
                    vl41Var = (vl41) lnmVar;
                    int i35 = vl41Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        vl41Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        vl41Var = new vl41(this, lnmVar);
                    }
                } else {
                    vl41Var = new vl41(this, lnmVar);
                }
                Object obj19 = vl41Var.a;
                int i36 = vl41Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    rl41 rl41Var = new rl41((mvh1) obj);
                    vl41Var.b = 1;
                    return vr20Var.emit(rl41Var, vl41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof sp41) {
                    sp41Var = (sp41) lnmVar;
                    int i37 = sp41Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        sp41Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        sp41Var = new sp41(this, lnmVar);
                    }
                } else {
                    sp41Var = new sp41(this, lnmVar);
                }
                Object obj20 = sp41Var.a;
                int i38 = sp41Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    sp41Var.b = 1;
                    return vr20Var.emit(rih1Var, sp41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i38 == 1) {
                    hm5.M(obj20);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                if (lnmVar instanceof dq41) {
                    dq41Var = (dq41) lnmVar;
                    int i39 = dq41Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        dq41Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        dq41Var = new dq41(this, lnmVar);
                    }
                } else {
                    dq41Var = new dq41(this, lnmVar);
                }
                Object obj21 = dq41Var.a;
                int i40 = dq41Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                if (((Boolean) ((mmr0) obj).a).booleanValue()) {
                    return rih1Var;
                }
                dq41Var.b = 1;
                return vr20Var.emit(obj, dq41Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof eq41) {
                    eq41Var = (eq41) lnmVar;
                    int i41 = eq41Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        eq41Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        eq41Var = new eq41(this, lnmVar);
                    }
                } else {
                    eq41Var = new eq41(this, lnmVar);
                }
                Object obj22 = eq41Var.a;
                int i42 = eq41Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    tv80 tv80Var = (tv80) ((mmr0) obj).b;
                    eq41Var.b = 1;
                    return vr20Var.emit(tv80Var, eq41Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj22);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof jr41) {
                    jr41Var = (jr41) lnmVar;
                    int i43 = jr41Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        jr41Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        jr41Var = new jr41(this, lnmVar);
                    }
                } else {
                    jr41Var = new jr41(this, lnmVar);
                }
                Object obj23 = jr41Var.a;
                int i44 = jr41Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.track().c() || ((ContextTrack) playerState.track().b()).uri().length() <= 0) {
                    return rih1Var;
                }
                jr41Var.b = 1;
                return vr20Var.emit(obj, jr41Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof su41) {
                    su41Var = (su41) lnmVar;
                    int i45 = su41Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        su41Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        su41Var = new su41(this, lnmVar);
                    }
                } else {
                    su41Var = new su41(this, lnmVar);
                }
                Object obj24 = su41Var.a;
                int i46 = su41Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                i091 i091Var = (i091) obj;
                ou41 ou41Var = new ou41(new pu41(i091Var.d, i091Var.e, i091Var.c, i091Var.f), (rm51) null);
                su41Var.b = 1;
                return vr20Var.emit(ou41Var, su41Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof d551) {
                    d551Var = (d551) lnmVar;
                    int i47 = d551Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        d551Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        d551Var = new d551(this, lnmVar);
                    }
                } else {
                    d551Var = new d551(this, lnmVar);
                }
                Object obj25 = d551Var.a;
                int i48 = d551Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                List<pd51> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (pd51 pd51Var : list) {
                    arrayList.add(new h8k1(pd51Var, pd51Var.getId()));
                }
                hj50 hj50Var = new hj50(arrayList, (ioj0) null);
                d551Var.b = 1;
                return vr20Var.emit(hj50Var, d551Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof o651) {
                    o651Var = (o651) lnmVar;
                    int i49 = o651Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        o651Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        o651Var = new o651(this, lnmVar);
                    }
                } else {
                    o651Var = new o651(this, lnmVar);
                }
                Object obj26 = o651Var.a;
                int i50 = o651Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf2 = Boolean.valueOf(((m251) obj).b);
                    o651Var.b = 1;
                    return vr20Var.emit(boolValueOf2, o651Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof xt51) {
                    xt51Var = (xt51) lnmVar;
                    int i51 = xt51Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        xt51Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        xt51Var = new xt51(this, lnmVar);
                    }
                } else {
                    xt51Var = new xt51(this, lnmVar);
                }
                Object obj27 = xt51Var.a;
                int i52 = xt51Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                Set set2 = (k1r) obj;
                set = set2 instanceof i1r ? (i1r) set2 : null;
                Boolean boolValueOf3 = Boolean.valueOf(set != null ? ((Boolean) ((i1r) set).a).booleanValue() : false);
                xt51Var.b = 1;
                return vr20Var.emit(boolValueOf3, xt51Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof cu51) {
                    cu51Var = (cu51) lnmVar;
                    int i53 = cu51Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        cu51Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        cu51Var = new cu51(this, lnmVar);
                    }
                } else {
                    cu51Var = new cu51(this, lnmVar);
                }
                Object obj28 = cu51Var.a;
                int i54 = cu51Var.b;
                if (i54 == 0) {
                    hm5.M(obj28);
                    Boolean boolValueOf4 = Boolean.valueOf(((cxc0) obj).f.w.b);
                    cu51Var.b = 1;
                    return vr20Var.emit(boolValueOf4, cu51Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i54 == 1) {
                    hm5.M(obj28);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof du51) {
                    du51Var = (du51) lnmVar;
                    int i55 = du51Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        du51Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        du51Var = new du51(this, lnmVar);
                    }
                } else {
                    du51Var = new du51(this, lnmVar);
                }
                Object obj29 = du51Var.a;
                int i56 = du51Var.b;
                if (i56 == 0) {
                    hm5.M(obj29);
                    Boolean boolValueOf5 = Boolean.valueOf(Boolean.parseBoolean((String) ((cxc0) obj).f.q.get("is_video_first")));
                    du51Var.b = 1;
                    return vr20Var.emit(boolValueOf5, du51Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (lnmVar instanceof eu51) {
                    eu51Var = (eu51) lnmVar;
                    int i57 = eu51Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        eu51Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        eu51Var = new eu51(this, lnmVar);
                    }
                } else {
                    eu51Var = new eu51(this, lnmVar);
                }
                Object obj30 = eu51Var.a;
                int i58 = eu51Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                set = i1rVar2 != null ? (Set) i1rVar2.a : null;
                if (set == null) {
                    set = w7x.a;
                }
                eu51Var.b = 1;
                return vr20Var.emit(set, eu51Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof fu51) {
                    fu51Var = (fu51) lnmVar;
                    int i59 = fu51Var.b;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        fu51Var.b = i59 - Integer.MIN_VALUE;
                    } else {
                        fu51Var = new fu51(this, lnmVar);
                    }
                } else {
                    fu51Var = new fu51(this, lnmVar);
                }
                Object obj31 = fu51Var.a;
                int i60 = fu51Var.b;
                if (i60 == 0) {
                    hm5.M(obj31);
                    Boolean boolValueOf6 = Boolean.valueOf(!((cxc0) obj).a());
                    fu51Var.b = 1;
                    return vr20Var.emit(boolValueOf6, fu51Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i60 == 1) {
                    hm5.M(obj31);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ ml21(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
