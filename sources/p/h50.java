package p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$ListState;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$State;
import com.spotify.listuxplatformconsumers.standard.sections.bottomactions.BottomActionsVisibilityProto$UserState;
import com.spotify.pamviewservice.v1.proto.PremiumPlanRow;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h50 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public h50(ayh ayhVar, p811 p811Var, pcd pcdVar, faa0 faa0Var) {
        this.a = (byte) 15;
        this.c = ayhVar;
        this.d = p811Var;
        this.b = faa0Var;
    }

    private final Object c(Object obj, lnm lnmVar) {
        mpb0 mpb0Var;
        List list = (List) obj;
        String str = (String) this.c;
        rih1 rih1Var = rih1.a;
        if (str != null && !ihc1.y0(str) && (mpb0Var = (mpb0) o7h.C0(list)) != null && mpb0Var.a >= ((upb0) this.d).h().q - 6) {
            ((iu30) this.b).invoke(yok.a);
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(Object obj, lnm lnmVar) {
        drk drkVar;
        if (lnmVar instanceof drk) {
            drkVar = (drk) lnmVar;
            int i = drkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                drkVar.b = i - Integer.MIN_VALUE;
            } else {
                drkVar = new drk(this, lnmVar);
            }
        } else {
            drkVar = new drk(this, lnmVar);
        }
        Object obj2 = drkVar.a;
        int i2 = drkVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            c380<String> c380Var = ((krk) this.c).c;
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            for (String str : c380Var) {
                arrayList.add(new mmr0(str, x2p1.n(((erk) this.d).e(), vpk.d, new kfk(str))));
            }
            drkVar.b = 1;
            Object objEmit = vr20Var.emit(arrayList, drkVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    private final Object f(Object obj, lnm lnmVar) {
        if (u890.j((utk) obj, utk.a)) {
            fn31.T((c9n) this.c, (o8n) null, 0, new duk((bs91) this.d, (String) this.b, null, (byte) 0), 3);
            return rih1.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object g(Object obj, lnm lnmVar) {
        szk szkVar;
        qzk qzkVar;
        mq70 mq70Var;
        up70 up70VarA;
        if (lnmVar instanceof szk) {
            szkVar = (szk) lnmVar;
            int i = szkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                szkVar.b = i - Integer.MIN_VALUE;
            } else {
                szkVar = new szk(this, lnmVar);
            }
        } else {
            szkVar = new szk(this, lnmVar);
        }
        Object obj2 = szkVar.a;
        int i2 = szkVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            uv00 uv00Var = (uv00) obj;
            List<String> list = (List) this.c;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                z2h z2hVar = (z2h) this.d;
                uv00Var.getClass();
                z2hVar.getClass();
                jo70 jo70Var = uv00Var.a(jo70.class, str).b;
                String str2 = jo70Var != null ? jo70Var.a : null;
                if (str2 == null || str2.length() == 0) {
                    qzkVar = null;
                } else {
                    xkk1 xkk1Var = uv00Var.a(xkk1.class, str).b;
                    String str3 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.b)) == null) ? null : up70VarA.a.a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    qzkVar = new qzk(str, str2, str3);
                }
                if (qzkVar != null) {
                    arrayList.add(qzkVar);
                }
            }
            szkVar.b = 1;
            Object objEmit = vr20Var.emit(arrayList, szkVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object h(Object obj, lnm lnmVar) {
        yml ymlVar;
        String str;
        lzh lzhVar;
        if (lnmVar instanceof yml) {
            ymlVar = (yml) lnmVar;
            int i = ymlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ymlVar.b = i - Integer.MIN_VALUE;
            } else {
                ymlVar = new yml(this, lnmVar);
            }
        } else {
            ymlVar = new yml(this, lnmVar);
        }
        Object obj2 = ymlVar.a;
        int i2 = ymlVar.b;
        lzh lzhVar2 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            i1r i1rVar = (k1r) obj;
            if (i1rVar instanceof i1r) {
                lag lagVar = (lag) this.c;
                String str2 = ((gnl) this.d).a;
                fnl fnlVar = (fnl) i1rVar.a;
                sf4 sf4Var = (sf4) lagVar.c;
                Map map = (Map) lagVar.b;
                int i3 = fnlVar.a;
                if (i3 == 17 && sf4Var.a()) {
                    ebr0 ebr0Var = (ebr0) map.get(hwl1.class);
                    if (ebr0Var == null) {
                        eg.m("No page provider found for WorkPage");
                        return null;
                    }
                    lzhVar = new lzh(ebr0Var, new jwl1(str2));
                } else if (i3 == 16 && sf4Var.b()) {
                    ebr0 ebr0Var2 = (ebr0) map.get(kh31.class);
                    if (ebr0Var2 == null) {
                        eg.m("No page provider found for RichSeriesPage");
                        return null;
                    }
                    lzhVar = new lzh(ebr0Var2, new mh31(str2));
                } else {
                    if (i3 != 16) {
                        switch (i3) {
                            case 1:
                                str = "UNSPECIFIED";
                                break;
                            case 2:
                                str = "TRACK";
                                break;
                            case 3:
                                str = "ALBUM";
                                break;
                            case 4:
                                str = "PODCAST_EPISODE";
                                break;
                            case 5:
                                str = "PODCAST_SHOW";
                                break;
                            case 6:
                                str = "AUDIOBOOK_CHAPTER";
                                break;
                            case 7:
                                str = "AUDIOBOOK";
                                break;
                            case 8:
                                str = "USER_HIGHLIGHT";
                                break;
                            case 9:
                                str = "AUTHOR";
                                break;
                            case 10:
                                str = "ARTIST";
                                break;
                            case 11:
                                str = "PLAYLIST";
                                break;
                            case 12:
                                str = "USER";
                                break;
                            case 13:
                                str = "PODCAST_CHAPTER";
                                break;
                            case 14:
                                str = "EDITOR";
                                break;
                            case 15:
                                str = "CLASSICAL_ARTIST";
                                break;
                            case 16:
                                str = "AUDIOBOOK_SERIES";
                                break;
                            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                                str = "CLASSICAL_WORK";
                                break;
                            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                                str = "CONTRIBUTING_ARTIST";
                                break;
                            default:
                                str = "null";
                                break;
                        }
                        k220.f("Unsupported entity type: ".concat(str));
                        return null;
                    }
                    ebr0 ebr0Var3 = (ebr0) map.get(qc8.class);
                    if (ebr0Var3 == null) {
                        eg.m("No page provider found for AudiobookSeriesPage");
                        return null;
                    }
                    lzhVar = new lzh(ebr0Var3, new sc8(str2));
                }
                lzhVar2 = lzhVar;
            } else {
                if (i1rVar instanceof h1r) {
                    bhn0.B(((h1r) i1rVar).a, "Failed to resolve entity type: ");
                    return null;
                }
                if (!(i1rVar instanceof j1r)) {
                    eg.o();
                    return null;
                }
            }
            if (lzhVar2 != null) {
                ymlVar.b = 1;
                Object objEmit = vr20Var.emit(lzhVar2, ymlVar);
                d9n d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r8.b(r6, r0) == r5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.spotify.pamviewservice.v1.proto.PremiumPlanRow r7, p.lnm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.mua
            if (r0 == 0) goto L13
            r0 = r8
            p.mua r0 = (p.mua) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.mua r0 = new p.mua
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L83
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            com.spotify.pamviewservice.v1.proto.PremiumPlanRow r7 = r0.a
            p.hm5.M(r8)
            goto L49
        L37:
            p.hm5.M(r8)
            java.lang.Object r8 = r6.c
            p.xab1 r8 = (p.xab1) r8
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = p.op71.p(r8, r0)
            if (r8 != r5) goto L49
            goto L82
        L49:
            java.lang.Object r8 = r6.d
            p.ssw0 r8 = (p.ssw0) r8
            java.lang.String r1 = r7.r()
            int r1 = r1.length()
            if (r1 != 0) goto L59
            r6 = 0
            goto L74
        L59:
            p.joc1 r7 = r7.x()
            java.lang.Object r6 = r6.b
            p.oua r6 = (p.oua) r6
            p.wpv0 r6 = r6.d
            p.joc1 r1 = p.joc1.d
            if (r7 != r1) goto L6e
            p.oh4 r6 = r6.b
            boolean r6 = r6.B()
            goto L74
        L6e:
            p.oh4 r6 = r6.b
            boolean r6 = r6.A()
        L74:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L83
        L82:
            return r5
        L83:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.h50.b(com.spotify.pamviewservice.v1.proto.PremiumPlanRow, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:115:0x022b  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:175:0x0348  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:244:0x046f  */
    /* JADX WARN: Code duplicated, block: B:268:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:299:0x0562  */
    /* JADX WARN: Code duplicated, block: B:325:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:361:0x0684  */
    /* JADX WARN: Code duplicated, block: B:423:0x0841  */
    /* JADX WARN: Code duplicated, block: B:439:0x0897  */
    /* JADX WARN: Code duplicated, block: B:468:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:499:0x0967  */
    /* JADX WARN: Code duplicated, block: B:501:0x0975  */
    /* JADX WARN: Code duplicated, block: B:510:0x099f  */
    /* JADX WARN: Code duplicated, block: B:522:0x09c2  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a5d  */
    /* JADX WARN: Code duplicated, block: B:581:0x0ab7  */
    /* JADX WARN: Code duplicated, block: B:620:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:652:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public final Object emit(Object obj, lnm lnmVar) {
        z81 z81Var;
        ja1 ja1Var;
        nl1 nl1Var;
        int i;
        hm1 hm1Var;
        vr20 vr20Var;
        gm1 gm1Var;
        int i2;
        String str;
        fm1 fm1Var;
        fb2 fb2Var;
        boolean z;
        ja3 ja3Var;
        av6 av6Var;
        hx11 hx11Var;
        z6x z6xVar;
        Object obj2;
        String str2;
        zq11 uq11Var;
        bl8 bl8Var;
        Object wv21Var;
        e8b e8bVar;
        ysb ysbVar;
        Map mapO;
        BottomActionsVisibilityProto$ListState bottomActionsVisibilityProto$ListState;
        Map mapN;
        k4c k4cVar;
        kkd kkdVar;
        haf hafVar;
        tsf tsfVar;
        vsf vsfVar;
        int i3;
        int i4;
        int i5;
        lsh lshVar;
        vr20 vr20Var2;
        vr20 vr20Var3;
        int i6;
        Object obj3;
        mdk mdkVar;
        hdm hdmVar;
        vr20 vr20Var4;
        int i7;
        int i8;
        byte b = this.a;
        pu90 pu90Var = pu90.a;
        ru90 ru90Var = ru90.a;
        su90 su90Var = su90.a;
        qu90 qu90Var = qu90.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        isf f = null;
        switch (b) {
            case 0:
                rfa rfaVar = (rfa) obj4;
                ((Map) obj5).put(rfaVar.a, obj);
                Object objEmit = ((vr20) obj6).emit(Collections.singletonMap(rfaVar.a, obj), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 1:
                if (lnmVar instanceof z81) {
                    z81Var = (z81) lnmVar;
                    int i9 = z81Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        z81Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        z81Var = new z81(this, lnmVar);
                    }
                } else {
                    z81Var = new z81(this, lnmVar);
                }
                Object obj7 = z81Var.a;
                int i10 = z81Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj7);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj7);
                vr20 vr20Var5 = (vr20) obj6;
                pr91 pr91Var = (pr91) obj;
                if (u890.j(pr91Var, or91.a)) {
                    ja1Var = new ja1((String) obj5, (g4a) obj4);
                } else {
                    if (!u890.j(pr91Var, nr91.a)) {
                        eg.o();
                        return null;
                    }
                    ja1Var = null;
                }
                if (ja1Var != null) {
                    z81Var.b = 1;
                    if (vr20Var5.emit(ja1Var, z81Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            case 2:
                boolean z2 = false;
                if (lnmVar instanceof nl1) {
                    nl1Var = (nl1) lnmVar;
                    int i11 = nl1Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nl1Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        nl1Var = new nl1(this, lnmVar);
                    }
                } else {
                    nl1Var = new nl1(this, lnmVar);
                }
                Object obj8 = nl1Var.a;
                int i12 = nl1Var.b;
                if (i12 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var6 = (vr20) obj6;
                    mmr0 mmr0Var = (mmr0) obj;
                    vnb1 vnb1Var = (vnb1) mmr0Var.a;
                    qp31 qp31Var = (qp31) mmr0Var.b;
                    a42 a42Var = (a42) obj5;
                    hti0 hti0Var = (hti0) obj4;
                    boolean z3 = vnb1Var.a;
                    if (qp31Var != null) {
                        i = 1;
                        if (qp31Var.a) {
                            z2 = true;
                        }
                    } else {
                        i = 1;
                    }
                    jhm jhmVarG = a42Var.g(hti0Var, z3, z2);
                    nl1Var.b = i;
                    if (vr20Var6.emit(jhmVarG, nl1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof hm1) {
                    hm1Var = (hm1) lnmVar;
                    int i13 = hm1Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        hm1Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        hm1Var = new hm1(this, lnmVar);
                    }
                } else {
                    hm1Var = new hm1(this, lnmVar);
                }
                Object objJ = hm1Var.a;
                int i14 = hm1Var.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        i2 = hm1Var.d;
                        gm1Var = hm1Var.f;
                        vr20Var = hm1Var.c;
                        hm5.M(objJ);
                    } else {
                        if (i14 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objJ);
                    }
                    return rih1Var;
                }
                hm5.M(objJ);
                vr20Var = (vr20) obj6;
                gm1Var = (gm1) obj;
                if (!u890.j(gm1Var.b, Boolean.FALSE) || (str = ((am1) obj5).a) == null) {
                    i2 = 0;
                } else {
                    Single singleG = ((bl3) obj4).g(str);
                    hm1Var.c = vr20Var;
                    hm1Var.f = gm1Var;
                    hm1Var.d = 0;
                    hm1Var.b = 1;
                    objJ = fc11.j(singleG, hm1Var);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    i2 = 0;
                }
                fm1Var = new fm1(gm1Var.b, gm1Var.a, strD);
                hm1Var.c = null;
                hm1Var.f = null;
                hm1Var.d = i2;
                hm1Var.b = 2;
                if (vr20Var.emit(fm1Var, hm1Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                lk3 lk3Var = objJ instanceof lk3 ? (lk3) objJ : null;
                String strD = lk3Var != null ? lk3Var.d() : null;
                fm1Var = new fm1(gm1Var.b, gm1Var.a, strD);
                hm1Var.c = null;
                hm1Var.f = null;
                hm1Var.d = i2;
                hm1Var.b = 2;
                if (vr20Var.emit(fm1Var, hm1Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof fb2) {
                    fb2Var = (fb2) lnmVar;
                    int i15 = fb2Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        fb2Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        fb2Var = new fb2(this, lnmVar);
                    }
                } else {
                    fb2Var = new fb2(this, lnmVar);
                }
                Object obj9 = fb2Var.a;
                int i16 = fb2Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    vr20 vr20Var7 = (vr20) obj6;
                    qfd qfdVar = (qfd) obj;
                    u961 u961Var = (u961) obj5;
                    PlayerState playerState = (PlayerState) obj4;
                    boolean z4 = qfdVar.b;
                    ArrayList arrayList = qfdVar.e;
                    int i17 = qfdVar.c;
                    je2 ge2Var = ie2.a;
                    if (!z4 && i17 == 3) {
                        rh7 rh7Var = qfdVar.d;
                        if (rh7Var != null) {
                            ge2Var = new je2(rh7Var.a);
                        }
                    } else if (z4) {
                        if (playerState.signals().contains("switch-to-video") || !playerState.track().c()) {
                            z = false;
                        } else {
                            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                            if (u890.j(contextTrack != null ? contextTrack.uri() : null, ((vhs0) u961Var.d).a)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        ge2Var = new ge2(z);
                    } else if (i17 == 4 && !arrayList.isEmpty()) {
                        if (arrayList.isEmpty()) {
                            if (playerState.signals().contains("switch-to-video")) {
                                z = false;
                            } else {
                                z = false;
                            }
                            ge2Var = new ge2(z);
                        } else {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    l131 l131Var = (l131) it.next();
                                    if (l131Var == l131.e || l131Var == l131.d) {
                                    }
                                } else {
                                    if (playerState.signals().contains("switch-to-video")) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    ge2Var = new ge2(z);
                                }
                            }
                        }
                    }
                    fb2Var.b = 1;
                    if (vr20Var7.emit(ge2Var, fb2Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj9);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof ja3) {
                    ja3Var = (ja3) lnmVar;
                    int i18 = ja3Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        ja3Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        ja3Var = new ja3(this, lnmVar);
                    }
                } else {
                    ja3Var = new ja3(this, lnmVar);
                }
                Object obj10 = ja3Var.a;
                int i19 = ja3Var.b;
                if (i19 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var8 = (vr20) obj6;
                    ga3 ga3Var = new ga3(y7y0.A((Map) obj) && ((ha3) obj5).a && ((dp4) ((iz0) obj4).e).b() ? 2 : 1);
                    ja3Var.b = 1;
                    if (vr20Var8.emit(ga3Var, ja3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i19 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 6:
                bjg1 bjg1Var = (bjg1) obj4;
                ((nsw0) obj5).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((vu30) ((ven0) obj6).getValue()).invoke(((mhg1) bjg1Var).a.P0(), ((mhg1) bjg1Var).d.getValue())).booleanValue() : false));
                return rih1Var;
            case 7:
                p811 p811Var = (p811) obj5;
                y0r y0rVar = (y0r) obj4;
                if (lnmVar instanceof av6) {
                    av6Var = (av6) lnmVar;
                    int i20 = av6Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        av6Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        av6Var = new av6(this, lnmVar);
                    }
                } else {
                    av6Var = new av6(this, lnmVar);
                }
                Object obj11 = av6Var.a;
                int i21 = av6Var.b;
                if (i21 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var9 = (vr20) obj6;
                    i1r i1rVar = (k1r) obj;
                    boolean z5 = i1rVar instanceof i1r;
                    uu6 uu6Var = uu6.a;
                    if (z5) {
                        p811Var.a = uu6Var;
                        String str3 = y0rVar.a;
                        jx11 jx11Var = y0rVar.c;
                        boolean z6 = y0rVar.d.isEmpty() && y0rVar.e == null;
                        Object obj12 = i1rVar.a;
                        wv6 wv6Var = (wv6) obj12;
                        z6x z6xVarSingletonList = z6x.a;
                        if (wv6Var == null) {
                            z6xVar = z6xVarSingletonList;
                        } else {
                            List list = wv6Var.b;
                            if (z6) {
                                z6xVarSingletonList = wv6Var.a;
                            } else if (!list.isEmpty()) {
                                z6xVarSingletonList = Collections.singletonList(new kj90(null, list));
                            }
                            Iterable<kj90> iterable = (Iterable) z6xVarSingletonList;
                            z6x arrayList2 = new ArrayList(q7h.U(iterable, 10));
                            for (kj90 kj90Var : iterable) {
                                String str4 = kj90Var.a;
                                List list2 = kj90Var.b;
                                int size = list2.size();
                                List<pvc0> list3 = list2;
                                ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                                for (pvc0 pvc0Var : list3) {
                                    int iOrdinal = jx11Var.ordinal();
                                    if (iOrdinal != 0) {
                                        obj2 = obj12;
                                        if (iOrdinal == 1) {
                                            str2 = str3;
                                            uq11Var = new yq11(pvc0Var.c, str2, pvc0Var.a, 0, (vq11) null, mqo1.B(pvc0Var.f));
                                        } else {
                                            if (iOrdinal != 2) {
                                                eg.o();
                                                return null;
                                            }
                                            str2 = str3;
                                            uq11Var = new zq11(pvc0Var.c, str2, pvc0Var.a, 0, (vq11) null, mqo1.B(pvc0Var.f));
                                        }
                                    } else {
                                        obj2 = obj12;
                                        str2 = str3;
                                        uq11Var = new uq11(pvc0Var.c, str2, pvc0Var.a, 0, null, mqo1.B(pvc0Var.f));
                                    }
                                    zq11 zq11Var = uq11Var;
                                    arrayList3.add(new h8k1(zq11Var, zq11Var.getId()));
                                    obj12 = obj2;
                                    str3 = str2;
                                }
                                arrayList2.add(new mj90(size, str4, arrayList3));
                                obj12 = obj12;
                            }
                            z6xVar = arrayList2;
                        }
                        wv6 wv6Var2 = (wv6) obj12;
                        hx11Var = new gx11(new su6(z6xVar, wv6Var2.e, wv6Var2.f, wv6Var2.c, wv6Var2.d, wv6Var2.g, 2, y0rVar.f, 646));
                        if (hx11Var != null) {
                            av6Var.b = 1;
                            if (vr20Var9.emit(hx11Var, av6Var) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    } else {
                        if (i1rVar instanceof h1r) {
                            tu6 tu6Var = (wu6) p811Var.a;
                            if (tu6Var instanceof tu6) {
                                hx11Var = new gx11(tu6Var.a);
                            } else if (u890.j(tu6Var, vu6.a)) {
                                hx11Var = new gx11(new su6((List) null, 0, 0, (List) null, (ArrayList) null, (ArrayList) null, 3, y0rVar.f, 1023));
                            } else {
                                if (!u890.j(tu6Var, uu6Var)) {
                                    eg.o();
                                    return null;
                                }
                                hx11Var = new hx11(((h1r) i1rVar).a);
                            }
                        } else {
                            hx11Var = null;
                        }
                        if (hx11Var != null) {
                            av6Var.b = 1;
                            if (vr20Var9.emit(hx11Var, av6Var) == d9nVar) {
                                return d9nVar;
                            }
                        }
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 8:
                Set setP1 = o7h.p1((List) obj);
                ((AtomicReference) obj5).set(setP1);
                Object objB = ((ssw0) obj4).b(((AtomicReference) obj6).updateAndGet(new v87(setP1, (byte) 0)), lnmVar);
                return objB == d9nVar ? objB : rih1Var;
            case 9:
                cl8 cl8Var = (cl8) obj5;
                th61 th61Var = (th61) obj4;
                if (lnmVar instanceof bl8) {
                    bl8Var = (bl8) lnmVar;
                    int i22 = bl8Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        bl8Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        bl8Var = new bl8(this, lnmVar);
                    }
                } else {
                    bl8Var = new bl8(this, lnmVar);
                }
                Object obj13 = bl8Var.a;
                int i23 = bl8Var.b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        hm5.M(obj13);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj13);
                vr20 vr20Var10 = (vr20) obj6;
                ln41 ln41Var = (ln41) obj;
                if (ln41Var instanceof jn41) {
                    if (cl8.a(th61Var)) {
                        Iterator it2 = cl8Var.d.iterator();
                        while (it2.hasNext()) {
                            ((d8q0) it2.next()).a(th61Var);
                        }
                    }
                    wv21Var = new wv21(th61Var);
                } else {
                    if (!u890.j(ln41Var, kn41.a)) {
                        eg.o();
                        return null;
                    }
                    wv21Var = uv21.a;
                }
                bl8Var.b = 1;
                if (vr20Var10.emit(wv21Var, bl8Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 10:
                return b((PremiumPlanRow) obj, lnmVar);
            case 11:
                if (lnmVar instanceof e8b) {
                    e8bVar = (e8b) lnmVar;
                    int i24 = e8bVar.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        e8bVar.b = i24 - Integer.MIN_VALUE;
                    } else {
                        e8bVar = new e8b(this, lnmVar);
                    }
                } else {
                    e8bVar = new e8b(this, lnmVar);
                }
                Object obj14 = e8bVar.a;
                int i25 = e8bVar.b;
                if (i25 == 0) {
                    hm5.M(obj14);
                    vr20 vr20Var11 = (vr20) obj6;
                    Map map = (Map) obj;
                    List<p7b> list4 = (List) obj5;
                    int iS = zno1.s(q7h.U(list4, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                    for (p7b p7bVar : list4) {
                        String str5 = p7bVar.a;
                        map.getClass();
                        d8b d8bVar = (d8b) obj4;
                        linkedHashMap.put(str5, f8b.d(p7bVar, map, d8bVar.a, d8bVar.b));
                    }
                    e8bVar.b = 1;
                    if (vr20Var11.emit(linkedHashMap, e8bVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i25 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 12:
                md80 md80Var = (md80) ((ven0) obj6).getValue();
                if (((String) obj).length() > 0 && md80Var != null) {
                    ((iu30) obj5).invoke(new gg80((at80) obj4, md80Var, cg80.c));
                }
                return rih1Var;
            case 13:
                cab cabVar = (cab) obj5;
                if (lnmVar instanceof ysb) {
                    ysbVar = (ysb) lnmVar;
                    int i26 = ysbVar.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        ysbVar.b = i26 - Integer.MIN_VALUE;
                    } else {
                        ysbVar = new ysb(this, lnmVar);
                    }
                } else {
                    ysbVar = new ysb(this, lnmVar);
                }
                Object obj15 = ysbVar.a;
                int i27 = ysbVar.b;
                if (i27 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var12 = (vr20) obj6;
                    BottomActionsVisibilityProto$UserState bottomActionsVisibilityProto$UserState = (BottomActionsVisibilityProto$UserState) ((BottomActionsVisibilityProto$State) obj).o().get((String) cabVar.c);
                    if (bottomActionsVisibilityProto$UserState != null && (mapO = bottomActionsVisibilityProto$UserState.o()) != null && (bottomActionsVisibilityProto$ListState = (BottomActionsVisibilityProto$ListState) mapO.get((String) cabVar.b)) != null && (mapN = bottomActionsVisibilityProto$ListState.n()) != null) {
                        f = (Boolean) mapN.get((String) obj4);
                    }
                    ysbVar.b = 1;
                    if (vr20Var12.emit(f, ysbVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i27 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 14:
                View view = (View) obj5;
                if (lnmVar instanceof k4c) {
                    k4cVar = (k4c) lnmVar;
                    int i28 = k4cVar.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        k4cVar.b = i28 - Integer.MIN_VALUE;
                    } else {
                        k4cVar = new k4c(this, lnmVar);
                    }
                } else {
                    k4cVar = new k4c(this, lnmVar);
                }
                Object obj16 = k4cVar.a;
                int i29 = k4cVar.b;
                if (i29 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var13 = (vr20) obj6;
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    f = (rect.left == 0 && rect.top == 0) ? null : new Float(yap1.l(view, (ViewGroup) obj4) / 100.0f);
                    if (f != null) {
                        k4cVar.b = 1;
                        if (vr20Var13.emit(f, k4cVar) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i29 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 15:
                th61 th61Var2 = (th61) obj;
                p811 p811Var2 = (p811) obj4;
                ayh ayhVar = (ayh) obj5;
                if (ayhVar.v()) {
                    boolean z7 = th61Var2.b;
                    String str6 = th61Var2.a;
                    if (!z7 || th61Var2.d || ihc1.y0(str6) || !u890.j(str6, p811Var2.a)) {
                        ((faa0) obj6).d(new CancellationException("Reaction sender account changed"));
                    }
                } else {
                    p811Var2.a = th61Var2.a;
                    ayhVar.m0(th61Var2);
                }
                return rih1Var;
            case 16:
                if (lnmVar instanceof kkd) {
                    kkdVar = (kkd) lnmVar;
                    int i30 = kkdVar.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        kkdVar.b = i30 - Integer.MIN_VALUE;
                    } else {
                        kkdVar = new kkd(this, lnmVar);
                    }
                } else {
                    kkdVar = new kkd(this, lnmVar);
                }
                Object obj17 = kkdVar.a;
                int i31 = kkdVar.b;
                if (i31 == 0) {
                    hm5.M(obj17);
                    Boolean boolValueOf = Boolean.valueOf(((lkd) obj5).a((ContextTrack) obj4, (g390) obj));
                    kkdVar.b = 1;
                    if (((vr20) obj6).emit(boolValueOf, kkdVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i31 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj17);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                int iIntValue = ((Number) obj).intValue();
                err0 err0Var = (hdn0) obj6;
                lz20 lz20Var = (lz20) o7h.t0(iIntValue, (List) obj5);
                if (lz20Var != null) {
                    lz20.b(lz20Var);
                }
                err0 err0Var2 = err0Var;
                ((vu30) obj4).invoke(new Integer(err0Var2.s()), new Integer(iIntValue));
                err0Var2.t(iIntValue);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                String str7 = (String) obj4;
                iaf iafVar = (iaf) obj5;
                if (lnmVar instanceof haf) {
                    hafVar = (haf) lnmVar;
                    int i32 = hafVar.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        hafVar.b = i32 - Integer.MIN_VALUE;
                    } else {
                        hafVar = new haf(this, lnmVar);
                    }
                } else {
                    hafVar = new haf(this, lnmVar);
                }
                Object obj18 = hafVar.a;
                int i33 = hafVar.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                vr20 vr20Var14 = (vr20) obj6;
                tu90 tu90Var = (tu90) obj;
                if (tu90Var instanceof ou90) {
                    f = iafVar.a(str7, ((ou90) tu90Var).a);
                } else if (u890.j(tu90Var, su90Var)) {
                    f = iafVar.a(str7, null);
                } else if (!u890.j(tu90Var, qu90Var) && !u890.j(tu90Var, pu90Var)) {
                    if (!u890.j(tu90Var, ru90Var)) {
                        eg.o();
                        return null;
                    }
                    f = iafVar.a(str7, null);
                }
                hafVar.b = 1;
                if (vr20Var14.emit(f, hafVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String str8 = ((qsf) obj4).a;
                we1 we1Var = (we1) obj5;
                if (lnmVar instanceof tsf) {
                    tsfVar = (tsf) lnmVar;
                    int i34 = tsfVar.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        tsfVar.b = i34 - Integer.MIN_VALUE;
                    } else {
                        tsfVar = new tsf(this, lnmVar);
                    }
                } else {
                    tsfVar = new tsf(this, lnmVar);
                }
                Object obj19 = tsfVar.a;
                int i35 = tsfVar.b;
                if (i35 != 0) {
                    if (i35 == 1) {
                        hm5.M(obj19);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj19);
                vr20 vr20Var15 = (vr20) obj6;
                tu90 tu90Var2 = (tu90) obj;
                if (tu90Var2 instanceof ou90) {
                    f = (isf) we1Var.invoke(new msf(str8, ((ou90) tu90Var2).a));
                } else if (u890.j(tu90Var2, su90Var)) {
                    f = (isf) we1Var.invoke(new lsf(Collections.singletonList(str8)));
                } else if (u890.j(tu90Var2, ru90Var)) {
                    f = (isf) we1Var.invoke(new msf(str8, null));
                } else if (u890.j(tu90Var2, pu90Var)) {
                    f = (isf) we1Var.invoke(new lsf(Collections.singletonList(str8)));
                } else if (!u890.j(tu90Var2, qu90Var)) {
                    eg.o();
                    return null;
                }
                tsfVar.b = 1;
                if (vr20Var15.emit(f, tsfVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                List list5 = ((rsf) obj4).a;
                we1 we1Var2 = (we1) obj5;
                if (lnmVar instanceof vsf) {
                    vsfVar = (vsf) lnmVar;
                    int i36 = vsfVar.b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        vsfVar.b = i36 - Integer.MIN_VALUE;
                    } else {
                        vsfVar = new vsf(this, lnmVar);
                    }
                } else {
                    vsfVar = new vsf(this, lnmVar);
                }
                Object obj20 = vsfVar.a;
                int i37 = vsfVar.b;
                if (i37 == 0) {
                    hm5.M(obj20);
                    vr20 vr20Var16 = (vr20) obj6;
                    mmr0 mmr0Var2 = (mmr0) obj;
                    tu90 tu90Var3 = (tu90) mmr0Var2.a;
                    boolean zBooleanValue = ((Boolean) mmr0Var2.b).booleanValue();
                    if (!u890.j(tu90Var3, qu90Var)) {
                        if (tu90Var3 instanceof ru90) {
                            f = (isf) we1Var2.invoke(new nsf(list5));
                        } else if (zBooleanValue) {
                            f = (isf) we1Var2.invoke(new lsf(list5));
                        }
                    }
                    vsfVar.b = 1;
                    if (vr20Var16.emit(f, vsfVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i37 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ilr0 ilr0Var = (ilr0) obj;
                p811 p811Var3 = (p811) obj5;
                ilr0 ilr0Var2 = (ilr0) p811Var3.a;
                zph zphVar = (zph) obj4;
                boolean zBooleanValue2 = ((Boolean) zphVar.a.getValue()).booleanValue();
                int i38 = ilr0Var.d;
                int i39 = ilr0Var.c;
                if (!zBooleanValue2 ? !(i38 <= 0 || i39 + 5 < i38 - 1 || (ilr0Var2 != null && (i3 = ilr0Var2.d) > 0 && ilr0Var2.c + 5 >= i3 - 1 && i3 == i38)) : !(ilr0Var2 == null || (((i4 = ilr0Var.a) <= (i5 = ilr0Var2.a) && (i4 != i5 || ilr0Var.b <= ilr0Var2.b)) || i38 <= 0 || i39 != i38 - 1))) {
                    zphVar.a.setValue(Boolean.FALSE);
                    ((Function0) ((ven0) obj6).getValue()).invoke();
                }
                p811Var3.a = ilr0Var;
                return rih1Var;
            case 22:
                if (lnmVar instanceof lsh) {
                    lshVar = (lsh) lnmVar;
                    int i40 = lshVar.b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        lshVar.b = i40 - Integer.MIN_VALUE;
                    } else {
                        lshVar = new lsh(this, lnmVar);
                    }
                } else {
                    lshVar = new lsh(this, lnmVar);
                }
                Object obj21 = lshVar.a;
                int i41 = lshVar.b;
                if (i41 != 0) {
                    if (i41 == 1) {
                        i6 = lshVar.d;
                        vr20Var3 = lshVar.c;
                        hm5.M(obj21);
                    } else {
                        if (i41 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj21);
                    }
                    return rih1Var;
                }
                hm5.M(obj21);
                vr20Var2 = (vr20) obj6;
                String str9 = (String) obj;
                if (str9 == null) {
                    obj3 = null;
                    i6 = 0;
                } else {
                    lshVar.c = vr20Var2;
                    lshVar.d = 0;
                    lshVar.b = 1;
                    Object objO = z8p1.o((uvy) obj5, str9, (String) obj4, lshVar);
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var3 = vr20Var2;
                    obj21 = objO;
                    i6 = 0;
                }
                lshVar.c = null;
                lshVar.d = i6;
                lshVar.b = 2;
                if (vr20Var2.emit(obj3, lshVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                vr20 vr20Var17 = vr20Var3;
                obj3 = obj21;
                vr20Var2 = vr20Var17;
                lshVar.c = null;
                lshVar.d = i6;
                lshVar.b = 2;
                if (vr20Var2.emit(obj3, lshVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 23:
                if (lnmVar instanceof mdk) {
                    mdkVar = (mdk) lnmVar;
                    int i42 = mdkVar.b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        mdkVar.b = i42 - Integer.MIN_VALUE;
                    } else {
                        mdkVar = new mdk(this, lnmVar);
                    }
                } else {
                    mdkVar = new mdk(this, lnmVar);
                }
                Object obj22 = mdkVar.a;
                int i43 = mdkVar.b;
                if (i43 == 0) {
                    hm5.M(obj22);
                    edk edkVar = (edk) obj5;
                    edk edkVar2 = new edk(edkVar.a, edkVar.b, edkVar.c, edkVar.d, edkVar.e, edkVar.f, edkVar.g, edkVar.h, edkVar.i, edkVar.j, edkVar.k, edkVar.l, edkVar.m, edkVar.n, (String) obj4, ((Boolean) obj).booleanValue());
                    mdkVar.b = 1;
                    if (((vr20) obj6).emit(edkVar2, mdkVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i43 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return c(obj, lnmVar);
            case 25:
                return e(obj, lnmVar);
            case 26:
                return f(obj, lnmVar);
            case 27:
                return g(obj, lnmVar);
            case 28:
                return h(obj, lnmVar);
            default:
                if (lnmVar instanceof hdm) {
                    hdmVar = (hdm) lnmVar;
                    int i44 = hdmVar.b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        hdmVar.b = i44 - Integer.MIN_VALUE;
                    } else {
                        hdmVar = new hdm(this, lnmVar);
                    }
                } else {
                    hdmVar = new hdm(this, lnmVar);
                }
                Object objE = hdmVar.a;
                int i45 = hdmVar.b;
                if (i45 != 0) {
                    if (i45 == 1) {
                        i7 = hdmVar.f;
                        vr20 vr20Var18 = hdmVar.d;
                        hm5.M(objE);
                        vr20Var4 = vr20Var18;
                    } else if (i45 == 2) {
                        i8 = hdmVar.f;
                        vr20Var4 = hdmVar.e;
                        hm5.M(objE);
                        hdmVar.d = null;
                        hdmVar.e = null;
                        hdmVar.f = i8;
                        hdmVar.b = 3;
                        if (vr20Var4.emit(objE, hdmVar) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i45 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objE);
                    }
                    return rih1Var;
                }
                hm5.M(objE);
                vr20 vr20Var19 = (vr20) obj6;
                Boolean bool = Boolean.FALSE;
                hdmVar.d = vr20Var19;
                hdmVar.f = 0;
                hdmVar.b = 1;
                if (vr20Var19.emit(bool, hdmVar) == d9nVar) {
                    return d9nVar;
                }
                vr20Var4 = vr20Var19;
                i7 = 0;
                String str10 = ((wcm) obj4).a;
                hdmVar.d = null;
                hdmVar.e = vr20Var4;
                hdmVar.f = i7;
                hdmVar.b = 2;
                objE = ((idm) obj5).e(str10, hdmVar);
                if (objE == d9nVar) {
                    return d9nVar;
                }
                i8 = i7;
                hdmVar.d = null;
                hdmVar.e = null;
                hdmVar.f = i8;
                hdmVar.b = 3;
                if (vr20Var4.emit(objE, hdmVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }

    public /* synthetic */ h50(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ h50(byte b, Object obj, Object obj2, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
        this.c = obj;
        this.d = obj2;
    }

    public h50(vr20 vr20Var, List list, f8b f8bVar, d8b d8bVar) {
        this.a = (byte) 11;
        this.b = vr20Var;
        this.c = list;
        this.d = d8bVar;
    }

    public h50(vr20 vr20Var, m4c m4cVar, View view, ViewGroup viewGroup) {
        this.a = (byte) 14;
        this.b = vr20Var;
        this.c = view;
        this.d = viewGroup;
    }
}
