package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgk0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ dgk0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:149:0x0231  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:213:0x031b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0359  */
    /* JADX WARN: Code duplicated, block: B:256:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:273:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:288:0x0427  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0463  */
    /* JADX WARN: Code duplicated, block: B:320:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:337:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:359:0x0524  */
    /* JADX WARN: Code duplicated, block: B:374:0x055f  */
    /* JADX WARN: Code duplicated, block: B:389:0x059a  */
    /* JADX WARN: Code duplicated, block: B:404:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:419:0x0610  */
    /* JADX WARN: Code duplicated, block: B:434:0x0648  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:453:0x068b  */
    /* JADX WARN: Code duplicated, block: B:492:0x0705  */
    /* JADX WARN: Code duplicated, block: B:514:0x074c  */
    /* JADX WARN: Code duplicated, block: B:531:0x0789  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x0166  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        cgk0 cgk0Var;
        djk0 djk0Var;
        ejk0 ejk0Var;
        ink0 ink0Var;
        dnk0 dnk0Var;
        nnk0 nnk0Var;
        onk0 onk0Var;
        y8m0 y8m0Var;
        i9m0 i9m0Var;
        j9m0 j9m0Var;
        wjm0 wjm0Var;
        blm0 blm0Var;
        mtm0 mtm0Var;
        otm0 otm0Var;
        ptm0 ptm0Var;
        wtm0 wtm0Var;
        cum0 cum0Var;
        eum0 eum0Var;
        gvn0 gvn0Var;
        List list;
        up70 up70Var;
        pum0 pum0Var;
        s0n0 s0n0Var;
        c1n0 c1n0Var;
        g3n0 g3n0Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        w7n0 w7n0Var;
        y7n0 y7n0Var;
        List list2;
        up70 up70Var2;
        i9n0 i9n0Var;
        m9n0 m9n0Var;
        n9n0 n9n0Var;
        w9n0 w9n0Var;
        acn0 acn0Var;
        kcn0 kcn0Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        gvn0 gvn0VarA = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof cgk0) {
                    cgk0Var = (cgk0) lnmVar;
                    int i = cgk0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cgk0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        cgk0Var = new cgk0(this, lnmVar);
                    }
                } else {
                    cgk0Var = new cgk0(this, lnmVar);
                }
                Object obj2 = cgk0Var.a;
                int i2 = cgk0Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((YourLibraryResponse) obj).n().size() >= 1);
                    cgk0Var.b = 1;
                    return vr20Var.emit(boolValueOf, cgk0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof djk0) {
                    djk0Var = (djk0) lnmVar;
                    int i3 = djk0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        djk0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        djk0Var = new djk0(this, lnmVar);
                    }
                } else {
                    djk0Var = new djk0(this, lnmVar);
                }
                Object obj3 = djk0Var.a;
                int i4 = djk0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                djk0Var.b = 1;
                return vr20Var.emit(obj, djk0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof ejk0) {
                    ejk0Var = (ejk0) lnmVar;
                    int i5 = ejk0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ejk0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ejk0Var = new ejk0(this, lnmVar);
                    }
                } else {
                    ejk0Var = new ejk0(this, lnmVar);
                }
                Object obj4 = ejk0Var.a;
                int i6 = ejk0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                gvn0VarA = i1rVar2 != null ? (g3d0) i1rVar2.a : null;
                if (gvn0VarA == null) {
                    return rih1Var;
                }
                ejk0Var.b = 1;
                return vr20Var.emit(gvn0VarA, ejk0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                Object objEmit = vr20Var.emit((dnk0) obj, lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 4:
                if (lnmVar instanceof ink0) {
                    ink0Var = (ink0) lnmVar;
                    int i7 = ink0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ink0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        ink0Var = new ink0(this, lnmVar);
                    }
                } else {
                    ink0Var = new ink0(this, lnmVar);
                }
                Object obj5 = ink0Var.a;
                int i8 = ink0Var.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    rts0 rts0Var = (tts0) obj;
                    if (rts0Var instanceof nts0) {
                        dnk0Var = fnk0.a;
                    } else if (rts0Var instanceof ots0) {
                        dnk0Var = gnk0.a;
                    } else if (rts0Var instanceof rts0) {
                        rts0 rts0Var2 = rts0Var;
                        dnk0Var = new dnk0(rts0Var2.b, rts0Var2.c, rts0Var2.d, rts0Var2.e);
                    } else {
                        boolean z2 = rts0Var instanceof sts0;
                        dnk0 dnk0Var2 = cnk0.a;
                        if (z2 || (rts0Var instanceof qts0)) {
                            dnk0Var = dnk0Var2;
                        } else if (rts0Var instanceof pts0) {
                            dnk0Var = bnk0.a;
                        } else {
                            eg.o();
                        }
                    }
                    ink0Var.b = 1;
                    return vr20Var.emit(dnk0Var, ink0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof nnk0) {
                    nnk0Var = (nnk0) lnmVar;
                    int i9 = nnk0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nnk0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        nnk0Var = new nnk0(this, lnmVar);
                    }
                } else {
                    nnk0Var = new nnk0(this, lnmVar);
                }
                Object obj6 = nnk0Var.a;
                int i10 = nnk0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                th61 th61Var = (th61) obj;
                if (!th61Var.b || th61Var.a.length() <= 0) {
                    return rih1Var;
                }
                nnk0Var.b = 1;
                return vr20Var.emit(obj, nnk0Var) == d9nVar ? d9nVar : rih1Var;
            case 6:
                if (lnmVar instanceof onk0) {
                    onk0Var = (onk0) lnmVar;
                    int i11 = onk0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        onk0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        onk0Var = new onk0(this, lnmVar);
                    }
                } else {
                    onk0Var = new onk0(this, lnmVar);
                }
                Object obj7 = onk0Var.a;
                int i12 = onk0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    String str = ((th61) obj).a;
                    onk0Var.b = 1;
                    return vr20Var.emit(str, onk0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof y8m0) {
                    y8m0Var = (y8m0) lnmVar;
                    int i13 = y8m0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        y8m0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        y8m0Var = new y8m0(this, lnmVar);
                    }
                } else {
                    y8m0Var = new y8m0(this, lnmVar);
                }
                Object obj8 = y8m0Var.a;
                int i14 = y8m0Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    lcm1 lcm1Var = new lcm1((ucm0) obj);
                    y8m0Var.b = 1;
                    return vr20Var.emit(lcm1Var, y8m0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof i9m0) {
                    i9m0Var = (i9m0) lnmVar;
                    int i15 = i9m0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        i9m0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        i9m0Var = new i9m0(this, lnmVar);
                    }
                } else {
                    i9m0Var = new i9m0(this, lnmVar);
                }
                Object obj9 = i9m0Var.a;
                int i16 = i9m0Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    muf mufVar = new muf((a5i1) obj);
                    i9m0Var.b = 1;
                    return vr20Var.emit(mufVar, i9m0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof j9m0) {
                    j9m0Var = (j9m0) lnmVar;
                    int i17 = j9m0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        j9m0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        j9m0Var = new j9m0(this, lnmVar);
                    }
                } else {
                    j9m0Var = new j9m0(this, lnmVar);
                }
                Object obj10 = j9m0Var.a;
                int i18 = j9m0Var.b;
                if (i18 == 0) {
                    hm5.M(obj10);
                    luf lufVar = new luf((a5i1) obj);
                    j9m0Var.b = 1;
                    return vr20Var.emit(lufVar, j9m0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i18 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof wjm0) {
                    wjm0Var = (wjm0) lnmVar;
                    int i19 = wjm0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        wjm0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        wjm0Var = new wjm0(this, lnmVar);
                    }
                } else {
                    wjm0Var = new wjm0(this, lnmVar);
                }
                Object obj11 = wjm0Var.a;
                int i20 = wjm0Var.b;
                if (i20 == 0) {
                    hm5.M(obj11);
                    vjm0 vjm0Var = new vjm0((a7q0) obj);
                    wjm0Var.b = 1;
                    return vr20Var.emit(vjm0Var, wjm0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i20 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof blm0) {
                    blm0Var = (blm0) lnmVar;
                    int i21 = blm0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        blm0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        blm0Var = new blm0(this, lnmVar);
                    }
                } else {
                    blm0Var = new blm0(this, lnmVar);
                }
                Object obj12 = blm0Var.a;
                int i22 = blm0Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                i1r i1rVar3 = (k1r) obj;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                gvn0VarA = i1rVar4 != null ? (Set) i1rVar4.a : null;
                if (gvn0VarA == null) {
                    return rih1Var;
                }
                blm0Var.b = 1;
                return vr20Var.emit(gvn0VarA, blm0Var) == d9nVar ? d9nVar : rih1Var;
            case 12:
                if (lnmVar instanceof mtm0) {
                    mtm0Var = (mtm0) lnmVar;
                    int i23 = mtm0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        mtm0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        mtm0Var = new mtm0(this, lnmVar);
                    }
                } else {
                    mtm0Var = new mtm0(this, lnmVar);
                }
                Object obj13 = mtm0Var.a;
                int i24 = mtm0Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                mtm0Var.b = 1;
                return vr20Var.emit(obj, mtm0Var) == d9nVar ? d9nVar : rih1Var;
            case 13:
                if (lnmVar instanceof otm0) {
                    otm0Var = (otm0) lnmVar;
                    int i25 = otm0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        otm0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        otm0Var = new otm0(this, lnmVar);
                    }
                } else {
                    otm0Var = new otm0(this, lnmVar);
                }
                Object obj14 = otm0Var.a;
                int i26 = otm0Var.b;
                if (i26 != 0) {
                    if (i26 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                if (!((Boolean) obj).booleanValue()) {
                    return rih1Var;
                }
                otm0Var.b = 1;
                return vr20Var.emit(obj, otm0Var) == d9nVar ? d9nVar : rih1Var;
            case 14:
                if (lnmVar instanceof ptm0) {
                    ptm0Var = (ptm0) lnmVar;
                    int i27 = ptm0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ptm0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        ptm0Var = new ptm0(this, lnmVar);
                    }
                } else {
                    ptm0Var = new ptm0(this, lnmVar);
                }
                Object obj15 = ptm0Var.a;
                int i28 = ptm0Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    Boolean boolValueOf2 = Boolean.valueOf(((i091) obj).g);
                    ptm0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, ptm0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof wtm0) {
                    wtm0Var = (wtm0) lnmVar;
                    int i29 = wtm0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        wtm0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        wtm0Var = new wtm0(this, lnmVar);
                    }
                } else {
                    wtm0Var = new wtm0(this, lnmVar);
                }
                Object obj16 = wtm0Var.a;
                int i30 = wtm0Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    Boolean boolValueOf3 = Boolean.valueOf(ebp1.q((i091) obj));
                    wtm0Var.b = 1;
                    return vr20Var.emit(boolValueOf3, wtm0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof cum0) {
                    cum0Var = (cum0) lnmVar;
                    int i31 = cum0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        cum0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        cum0Var = new cum0(this, lnmVar);
                    }
                } else {
                    cum0Var = new cum0(this, lnmVar);
                }
                Object obj17 = cum0Var.a;
                int i32 = cum0Var.b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                if (((tv00) obj).b == null) {
                    return rih1Var;
                }
                cum0Var.b = 1;
                return vr20Var.emit(obj, cum0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (lnmVar instanceof eum0) {
                    eum0Var = (eum0) lnmVar;
                    int i33 = eum0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eum0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        eum0Var = new eum0(this, lnmVar);
                    }
                } else {
                    eum0Var = new eum0(this, lnmVar);
                }
                Object obj18 = eum0Var.a;
                int i34 = eum0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                xkk1 xkk1Var = ((tv00) obj).b;
                xkk1Var.getClass();
                mq70 mq70Var = xkk1Var.b;
                if (mq70Var != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    gvn0VarA = up70Var.a.a;
                }
                gvn0Var = gvn0VarA != null ? gvn0VarA : "";
                eum0Var.b = 1;
                return vr20Var.emit(gvn0Var, eum0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (lnmVar instanceof pum0) {
                    pum0Var = (pum0) lnmVar;
                    int i35 = pum0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        pum0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        pum0Var = new pum0(this, lnmVar);
                    }
                } else {
                    pum0Var = new pum0(this, lnmVar);
                }
                Object obj19 = pum0Var.a;
                int i36 = pum0Var.b;
                if (i36 != 0) {
                    if (i36 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                vzh1 vzh1Var = ((mhb1) obj).c;
                gvn0VarA = vzh1Var != null ? vzh1Var.a() : null;
                pum0Var.b = 1;
                return vr20Var.emit(gvn0VarA, pum0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (lnmVar instanceof s0n0) {
                    s0n0Var = (s0n0) lnmVar;
                    int i37 = s0n0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        s0n0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        s0n0Var = new s0n0(this, lnmVar);
                    }
                } else {
                    s0n0Var = new s0n0(this, lnmVar);
                }
                Object obj20 = s0n0Var.a;
                int i38 = s0n0Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                fja fjaVar = (fja) obj;
                gvn0VarA = fjaVar != null ? fjaVar.a : null;
                s0n0Var.b = 1;
                return vr20Var.emit(gvn0VarA, s0n0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof c1n0) {
                    c1n0Var = (c1n0) lnmVar;
                    int i39 = c1n0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        c1n0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        c1n0Var = new c1n0(this, lnmVar);
                    }
                } else {
                    c1n0Var = new c1n0(this, lnmVar);
                }
                Object obj21 = c1n0Var.a;
                int i40 = c1n0Var.b;
                if (i40 == 0) {
                    hm5.M(obj21);
                    ptn0 ptn0Var = (ptn0) ((b1n0) obj).h.getValue();
                    c1n0Var.b = 1;
                    return vr20Var.emit(ptn0Var, c1n0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i40 == 1) {
                    hm5.M(obj21);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (lnmVar instanceof g3n0) {
                    g3n0Var = (g3n0) lnmVar;
                    int i41 = g3n0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        g3n0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        g3n0Var = new g3n0(this, lnmVar);
                    }
                } else {
                    g3n0Var = new g3n0(this, lnmVar);
                }
                Object obj22 = g3n0Var.a;
                int i42 = g3n0Var.b;
                if (i42 != 0) {
                    if (i42 == 1) {
                        hm5.M(obj22);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj22);
                Map map = ((cxc0) obj).f.q;
                CharSequence charSequence3 = (CharSequence) map.get("entrypoint_title");
                if (charSequence3 != null && charSequence3.length() != 0 && (charSequence = (CharSequence) map.get("entrypoint_cta_label")) != null && charSequence.length() != 0 && (charSequence2 = (CharSequence) map.get("entrypoint_redirect_uri")) != null && charSequence2.length() != 0) {
                    z = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                g3n0Var.b = 1;
                return vr20Var.emit(boolValueOf4, g3n0Var) == d9nVar ? d9nVar : rih1Var;
            case 22:
                if (lnmVar instanceof w7n0) {
                    w7n0Var = (w7n0) lnmVar;
                    int i43 = w7n0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        w7n0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        w7n0Var = new w7n0(this, lnmVar);
                    }
                } else {
                    w7n0Var = new w7n0(this, lnmVar);
                }
                Object obj23 = w7n0Var.a;
                int i44 = w7n0Var.b;
                if (i44 != 0) {
                    if (i44 == 1) {
                        hm5.M(obj23);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj23);
                if (((tv00) obj).b == null) {
                    return rih1Var;
                }
                w7n0Var.b = 1;
                return vr20Var.emit(obj, w7n0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof y7n0) {
                    y7n0Var = (y7n0) lnmVar;
                    int i45 = y7n0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        y7n0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        y7n0Var = new y7n0(this, lnmVar);
                    }
                } else {
                    y7n0Var = new y7n0(this, lnmVar);
                }
                Object obj24 = y7n0Var.a;
                int i46 = y7n0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj24);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj24);
                xkk1 xkk1Var2 = ((tv00) obj).b;
                xkk1Var2.getClass();
                mq70 mq70Var2 = xkk1Var2.b;
                if (mq70Var2 != null && (list2 = mq70Var2.a) != null && (up70Var2 = (up70) o7h.s0(list2)) != null) {
                    gvn0VarA = up70Var2.a.a;
                }
                gvn0Var = gvn0VarA != null ? gvn0VarA : "";
                y7n0Var.b = 1;
                return vr20Var.emit(gvn0Var, y7n0Var) == d9nVar ? d9nVar : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (lnmVar instanceof i9n0) {
                    i9n0Var = (i9n0) lnmVar;
                    int i47 = i9n0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        i9n0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        i9n0Var = new i9n0(this, lnmVar);
                    }
                } else {
                    i9n0Var = new i9n0(this, lnmVar);
                }
                Object obj25 = i9n0Var.a;
                int i48 = i9n0Var.b;
                if (i48 == 0) {
                    hm5.M(obj25);
                    x8n0 x8n0Var = new x8n0((y2u0) obj);
                    i9n0Var.b = 1;
                    return vr20Var.emit(x8n0Var, i9n0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i48 == 1) {
                    hm5.M(obj25);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                if (lnmVar instanceof m9n0) {
                    m9n0Var = (m9n0) lnmVar;
                    int i49 = m9n0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        m9n0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        m9n0Var = new m9n0(this, lnmVar);
                    }
                } else {
                    m9n0Var = new m9n0(this, lnmVar);
                }
                Object obj26 = m9n0Var.a;
                int i50 = m9n0Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    Boolean boolValueOf5 = Boolean.valueOf(((p0d0) obj).a.a());
                    m9n0Var.b = 1;
                    return vr20Var.emit(boolValueOf5, m9n0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i50 == 1) {
                    hm5.M(obj26);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                if (lnmVar instanceof n9n0) {
                    n9n0Var = (n9n0) lnmVar;
                    int i51 = n9n0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        n9n0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        n9n0Var = new n9n0(this, lnmVar);
                    }
                } else {
                    n9n0Var = new n9n0(this, lnmVar);
                }
                Object obj27 = n9n0Var.a;
                int i52 = n9n0Var.b;
                if (i52 == 0) {
                    hm5.M(obj27);
                    Boolean boolValueOf6 = Boolean.valueOf(((p0d0) obj).a.b());
                    n9n0Var.b = 1;
                    return vr20Var.emit(boolValueOf6, n9n0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i52 == 1) {
                    hm5.M(obj27);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 27:
                if (lnmVar instanceof w9n0) {
                    w9n0Var = (w9n0) lnmVar;
                    int i53 = w9n0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        w9n0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        w9n0Var = new w9n0(this, lnmVar);
                    }
                } else {
                    w9n0Var = new w9n0(this, lnmVar);
                }
                Object obj28 = w9n0Var.a;
                int i54 = w9n0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                k1r k1rVar = (k1r) obj;
                k1rVar.getClass();
                if (!(k1rVar instanceof i1r) && !(k1rVar instanceof h1r)) {
                    return rih1Var;
                }
                w9n0Var.b = 1;
                return vr20Var.emit(obj, w9n0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                if (lnmVar instanceof acn0) {
                    acn0Var = (acn0) lnmVar;
                    int i55 = acn0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        acn0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        acn0Var = new acn0(this, lnmVar);
                    }
                } else {
                    acn0Var = new acn0(this, lnmVar);
                }
                Object obj29 = acn0Var.a;
                int i56 = acn0Var.b;
                if (i56 == 0) {
                    hm5.M(obj29);
                    o091 o091Var = ((i091) obj).h;
                    acn0Var.b = 1;
                    return vr20Var.emit(o091Var, acn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i56 == 1) {
                    hm5.M(obj29);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof kcn0) {
                    kcn0Var = (kcn0) lnmVar;
                    int i57 = kcn0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        kcn0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        kcn0Var = new kcn0(this, lnmVar);
                    }
                } else {
                    kcn0Var = new kcn0(this, lnmVar);
                }
                Object obj30 = kcn0Var.a;
                int i58 = kcn0Var.b;
                if (i58 == 0) {
                    hm5.M(obj30);
                    Object obj31 = ((vl10) ((Map) obj).get(fcn0.c)) instanceof ul10 ? dcn0.a : ccn0.a;
                    kcn0Var.b = 1;
                    return vr20Var.emit(obj31, kcn0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i58 == 1) {
                    hm5.M(obj30);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ dgk0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
