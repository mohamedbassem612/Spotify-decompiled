package p;

import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import com.spotify.hovercraftasr.v1.a;
import com.spotify.player.model.ContextTrack;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wem implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wem(byte b, Object obj, Object obj2, vr20 vr20Var) {
        this.a = b;
        this.c = obj;
        this.b = vr20Var;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0263  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0270  */
    /* JADX WARN: Code duplicated, block: B:109:0x0274  */
    /* JADX WARN: Code duplicated, block: B:111:0x0278  */
    /* JADX WARN: Code duplicated, block: B:112:0x0280  */
    /* JADX WARN: Code duplicated, block: B:113:0x0284 A[PHI: r21 r22
      0x0284: PHI (r21v4 p.mmr0) = (r21v0 p.mmr0), (r21v6 p.mmr0) binds: [B:157:0x0341, B:112:0x0280] A[DONT_GENERATE, DONT_INLINE]
      0x0284: PHI (r22v5 p.mmr0) = (r22v1 p.mmr0), (r22v8 p.mmr0) binds: [B:157:0x0341, B:112:0x0280] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x0288  */
    /* JADX WARN: Code duplicated, block: B:116:0x028c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:146:0x0309  */
    /* JADX WARN: Code duplicated, block: B:147:0x030c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0317  */
    /* JADX WARN: Code duplicated, block: B:155:0x0336 A[LOOP:1: B:140:0x02e8->B:155:0x0336, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x036a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0398  */
    /* JADX WARN: Code duplicated, block: B:169:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:178:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:180:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:187:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0301 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x020a  */
    /* JADX WARN: Code duplicated, block: B:94:0x020d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0252  */
    private final Object c(Object obj, lnm lnmVar) {
        qc20 qc20Var;
        String str;
        String strY0;
        String str2;
        String strY1;
        String strValueOf;
        String str3;
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        String strY2;
        List list;
        List list2;
        mmr0 mmr0Var3;
        Iterator it;
        Iterator it2;
        mmr0 mmr0Var4;
        String str4;
        String strA;
        ArrayList arrayList;
        Object objEmit;
        d9n d9nVar;
        String str5;
        String str6;
        String mmr0Var5;
        to20 to20Var;
        int iC;
        List listSingletonList;
        pc20 pc20Var = (pc20) this.c;
        mc20 mc20Var = pc20Var.c;
        uu0 uu0Var = (uu0) this.d;
        di4 di4Var = (di4) uu0Var.d;
        if (lnmVar instanceof qc20) {
            qc20Var = (qc20) lnmVar;
            int i = qc20Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qc20Var.b = i - Integer.MIN_VALUE;
            } else {
                qc20Var = new qc20(this, lnmVar);
            }
        } else {
            qc20Var = new qc20(this, lnmVar);
        }
        Object obj2 = qc20Var.a;
        int i2 = qc20Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            String str7 = (String) obj;
            String str8 = pc20Var.a;
            if (di4Var.K()) {
                str8 = null;
            }
            mmr0 mmr0Var6 = new mmr0("request_id", str8);
            mmr0 mmr0Var7 = new mmr0("query", pc20Var.b);
            mmr0 mmr0Var8 = new mmr0("locale", (String) uu0Var.b);
            if (mc20Var instanceof mc20) {
                lmw lmwVar = (lmw) uu0Var.e;
                xo20 xo20Var = mc20Var.a;
                di4 di4Var2 = (di4) lmwVar.b;
                to20 to20Var2 = xo20Var.b;
                boolean z = to20Var2 instanceof to20;
                str = null;
                mo21 mo21Var = mo21.g;
                mo21 mo21Var2 = mo21.Z;
                mo21 mo21Var3 = mo21.i;
                if (z) {
                    int iC2 = l1d.C(to20Var2.a);
                    if (iC2 == 0) {
                        smc0 smc0VarN = k4p1.n();
                        smc0VarN.add(mo21Var3);
                        smc0VarN.add(mo21Var);
                        if (di4Var2.h0() || di4Var2.Q()) {
                            smc0VarN.add(mo21Var2);
                        }
                        listSingletonList = k4p1.k(smc0VarN);
                    } else if (iC2 == 1) {
                        smc0 smc0VarN2 = k4p1.n();
                        smc0VarN2.add(mo21Var3);
                        smc0VarN2.add(mo21.h);
                        smc0VarN2.add(mo21Var2);
                        listSingletonList = k4p1.k(smc0VarN2);
                    } else {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        listSingletonList = Collections.singletonList(mo21.N0);
                    }
                } else if (to20Var2 instanceof vo20) {
                    listSingletonList = Collections.singletonList(mo21Var3);
                } else {
                    if (!(to20Var2 instanceof uo20)) {
                        eg.o();
                        return null;
                    }
                    switch (l1d.C(((uo20) to20Var2).a)) {
                        case 0:
                            listSingletonList = Collections.singletonList(mo21.b);
                            break;
                        case 1:
                            listSingletonList = Collections.singletonList(mo21.c);
                            break;
                        case 2:
                            listSingletonList = p7h.M(new mo21[]{mo21.t, mo21.X});
                            break;
                        case 3:
                            listSingletonList = Collections.singletonList(mo21.d);
                            break;
                        case 4:
                            listSingletonList = Collections.singletonList(mo21.e);
                            break;
                        case 5:
                            listSingletonList = Collections.singletonList(mo21.f);
                            break;
                        case 6:
                            smc0 smc0VarN3 = k4p1.n();
                            smc0VarN3.add(mo21Var);
                            if (di4Var2.h0() || di4Var2.Q()) {
                                smc0VarN3.add(mo21Var2);
                            }
                            if (di4Var2.h0()) {
                                smc0VarN3.add(mo21Var3);
                            }
                            if (di4Var2.M()) {
                                smc0VarN3.add(mo21.Y);
                            }
                            listSingletonList = k4p1.k(smc0VarN3);
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                }
                strY0 = o7h.y0(listSingletonList, ",", (String) null, (String) null, (iu30) null, 62);
            } else {
                str = null;
                if (!(mc20Var instanceof nc20)) {
                    eg.o();
                    return null;
                }
                strY0 = o7h.y0(((o551) uu0Var.f).b(pc20Var.g, di4Var.n0(), di4Var.M()), ",", (String) null, (String) null, (iu30) null, 62);
            }
            mmr0 mmr0Var9 = new mmr0("entity_types", strY0);
            if (mc20Var instanceof mc20) {
                str2 = mc20Var.a.a;
                if (str2.length() <= 0) {
                }
                mmr0 mmr0Var10 = new mmr0("filters", str2);
                if (!(mc20Var instanceof mc20)) {
                    strY1 = str;
                } else {
                    if (mc20Var instanceof nc20) {
                        eg.o();
                        return str;
                    }
                    strY1 = o7h.y0(((nc20) mc20Var).a, ",", (String) null, (String) null, (iu30) null, 62);
                    if (strY1.length() <= 0) {
                        strY1 = str;
                    }
                }
                mmr0 mmr0Var11 = new mmr0("filter_ids", strY1);
                strValueOf = String.valueOf(((yqg) uu0Var.c).b());
                if (di4Var.K()) {
                    strValueOf = str;
                }
                mmr0 mmr0Var12 = new mmr0("timestamp", strValueOf);
                if (uu0Var.a) {
                    str3 = AndroidServicebasedrouterProperties$TestHelper.TRUE;
                } else {
                    str3 = str;
                }
                mmr0 mmr0Var13 = new mmr0("on_demand_sets_enabled", str3);
                mmr0 mmr0Var14 = new mmr0("limit", String.valueOf(pc20Var.d));
                mmr0 mmr0Var15 = new mmr0("page_token", pc20Var.e);
                mmr0Var = new mmr0("query_complete", pob.f(pc20Var.f));
                mmr0Var2 = new mmr0("features", str7);
                strY2 = "music";
                if (mc20Var instanceof mc20) {
                    to20Var = mc20Var.a.b;
                    if (di4Var.Q()) {
                        if (to20Var instanceof to20) {
                            iC = l1d.C(to20Var.a);
                            if (iC != 0) {
                                mmr0Var3 = mmr0Var2;
                                mmr0Var4 = mmr0Var;
                                strY2 = "talk,music";
                            } else if (iC != 1) {
                                mmr0Var3 = mmr0Var2;
                                mmr0Var4 = mmr0Var;
                                strY2 = "talk";
                            } else if (iC != 2) {
                                eg.o();
                                return str;
                            }
                        } else if (to20Var instanceof uo20) {
                            if (x2v0.a[l1d.C(((uo20) to20Var).a)] != 1) {
                            }
                            mmr0Var3 = mmr0Var2;
                            mmr0Var4 = mmr0Var;
                        } else if (!(to20Var instanceof vo20)) {
                            eg.o();
                            return str;
                        }
                        strY2 = str;
                        mmr0Var3 = mmr0Var2;
                        mmr0Var4 = mmr0Var;
                    } else {
                        strY2 = str;
                        mmr0Var3 = mmr0Var2;
                        mmr0Var4 = mmr0Var;
                    }
                } else {
                    if (mc20Var instanceof nc20) {
                        eg.o();
                        return str;
                    }
                    list = ((nc20) mc20Var).a;
                    if (list.isEmpty()) {
                        if (di4Var.Q()) {
                            strY2 = "talk,music";
                        } else {
                            strY2 = str;
                        }
                        mmr0Var3 = mmr0Var2;
                        mmr0Var4 = mmr0Var;
                    } else {
                        if (di4Var.Q()) {
                            list2 = list;
                            mmr0Var3 = mmr0Var2;
                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        it2 = it;
                                        mmr0Var4 = mmr0Var;
                                        if (nhc1.Y((String) it.next(), "content_type:", false)) {
                                            if (list.contains("content_type:podcast")) {
                                                str4 = "talk";
                                            } else {
                                                str4 = str;
                                            }
                                            strY2 = o7h.y0(f46.i0(new String[]{str4, list.contains("content_type:song") ? "music" : str}), ",", (String) null, (String) null, (iu30) null, 62);
                                            if (strY2.length() == 0) {
                                            }
                                        } else {
                                            it = it2;
                                            mmr0Var = mmr0Var4;
                                        }
                                    } else {
                                        mmr0Var4 = mmr0Var;
                                        if (list.contains("media:video")) {
                                            strY2 = "talk,music";
                                        }
                                    }
                                }
                            } else {
                                mmr0Var4 = mmr0Var;
                                if (list.contains("media:video")) {
                                    strY2 = "talk,music";
                                }
                            }
                        } else {
                            mmr0Var3 = mmr0Var2;
                            mmr0Var4 = mmr0Var;
                        }
                        strY2 = str;
                    }
                }
                mmr0 mmr0Var16 = new mmr0("podcast_chapter_types", strY2);
                mmr0 mmr0Var17 = new mmr0("experience", bzn1.x(pc20Var.h));
                strA = ((psc) uu0Var.h).a();
                if (!di4Var.K()) {
                    strA = str;
                }
                List<mmr0> listM = p7h.M(new mmr0[]{mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, mmr0Var13, mmr0Var14, mmr0Var15, mmr0Var4, mmr0Var3, mmr0Var16, mmr0Var17, new mmr0("_t", strA)});
                arrayList = new ArrayList();
                for (mmr0 mmr0Var18 : listM) {
                    str5 = (String) mmr0Var18.a;
                    str6 = (String) mmr0Var18.b;
                    if (str6 != null) {
                        mmr0Var5 = new mmr0(str5, str6);
                    } else {
                        mmr0Var5 = str;
                    }
                    if (mmr0Var5 != null) {
                        arrayList.add(mmr0Var5);
                    }
                }
                Map mapT = sqg0.T(arrayList);
                qc20Var.b = 1;
                objEmit = vr20Var.emit(mapT, qc20Var);
                d9nVar = d9n.a;
                if (objEmit == d9nVar) {
                    return d9nVar;
                }
            } else if (!(mc20Var instanceof nc20)) {
                eg.o();
                return str;
            }
            str2 = str;
            mmr0 mmr0Var19 = new mmr0("filters", str2);
            if (!(mc20Var instanceof mc20)) {
                strY1 = str;
            } else {
                if (mc20Var instanceof nc20) {
                    eg.o();
                    return str;
                }
                strY1 = o7h.y0(((nc20) mc20Var).a, ",", (String) null, (String) null, (iu30) null, 62);
                if (strY1.length() <= 0) {
                    strY1 = str;
                }
            }
            mmr0 mmr0Var110 = new mmr0("filter_ids", strY1);
            strValueOf = String.valueOf(((yqg) uu0Var.c).b());
            if (di4Var.K()) {
                strValueOf = str;
            }
            mmr0 mmr0Var111 = new mmr0("timestamp", strValueOf);
            if (uu0Var.a) {
                str3 = AndroidServicebasedrouterProperties$TestHelper.TRUE;
            } else {
                str3 = str;
            }
            mmr0 mmr0Var112 = new mmr0("on_demand_sets_enabled", str3);
            mmr0 mmr0Var113 = new mmr0("limit", String.valueOf(pc20Var.d));
            mmr0 mmr0Var114 = new mmr0("page_token", pc20Var.e);
            mmr0Var = new mmr0("query_complete", pob.f(pc20Var.f));
            mmr0Var2 = new mmr0("features", str7);
            strY2 = "music";
            if (mc20Var instanceof mc20) {
                to20Var = mc20Var.a.b;
                if (di4Var.Q()) {
                    if (to20Var instanceof to20) {
                        iC = l1d.C(to20Var.a);
                        if (iC != 0) {
                            mmr0Var3 = mmr0Var2;
                            mmr0Var4 = mmr0Var;
                            strY2 = "talk,music";
                        } else if (iC != 1) {
                            mmr0Var3 = mmr0Var2;
                            mmr0Var4 = mmr0Var;
                            strY2 = "talk";
                        } else if (iC != 2) {
                            eg.o();
                            return str;
                        }
                    } else if (to20Var instanceof uo20) {
                        if (x2v0.a[l1d.C(((uo20) to20Var).a)] != 1) {
                        }
                        mmr0Var3 = mmr0Var2;
                        mmr0Var4 = mmr0Var;
                    } else if (!(to20Var instanceof vo20)) {
                        eg.o();
                        return str;
                    }
                    strY2 = str;
                    mmr0Var3 = mmr0Var2;
                    mmr0Var4 = mmr0Var;
                } else {
                    strY2 = str;
                    mmr0Var3 = mmr0Var2;
                    mmr0Var4 = mmr0Var;
                }
            } else {
                if (mc20Var instanceof nc20) {
                    eg.o();
                    return str;
                }
                list = ((nc20) mc20Var).a;
                if (list.isEmpty()) {
                    if (di4Var.Q()) {
                        strY2 = "talk,music";
                    } else {
                        strY2 = str;
                    }
                    mmr0Var3 = mmr0Var2;
                    mmr0Var4 = mmr0Var;
                } else {
                    if (di4Var.Q()) {
                        mmr0Var3 = mmr0Var2;
                        mmr0Var4 = mmr0Var;
                    } else {
                        list2 = list;
                        mmr0Var3 = mmr0Var2;
                        if (list2 instanceof Collection) {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    it2 = it;
                                    mmr0Var4 = mmr0Var;
                                    if (nhc1.Y((String) it.next(), "content_type:", false)) {
                                        if (list.contains("content_type:podcast")) {
                                            str4 = "talk";
                                        } else {
                                            str4 = str;
                                        }
                                        strY2 = o7h.y0(f46.i0(new String[]{str4, list.contains("content_type:song") ? "music" : str}), ",", (String) null, (String) null, (iu30) null, 62);
                                        if (strY2.length() == 0) {
                                        }
                                    } else {
                                        it = it2;
                                        mmr0Var = mmr0Var4;
                                    }
                                } else {
                                    mmr0Var4 = mmr0Var;
                                    if (list.contains("media:video")) {
                                        strY2 = "talk,music";
                                    }
                                }
                            }
                        } else {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    it2 = it;
                                    mmr0Var4 = mmr0Var;
                                    if (nhc1.Y((String) it.next(), "content_type:", false)) {
                                        if (list.contains("content_type:podcast")) {
                                            str4 = "talk";
                                        } else {
                                            str4 = str;
                                        }
                                        strY2 = o7h.y0(f46.i0(new String[]{str4, list.contains("content_type:song") ? "music" : str}), ",", (String) null, (String) null, (iu30) null, 62);
                                        if (strY2.length() == 0) {
                                        }
                                    } else {
                                        it = it2;
                                        mmr0Var = mmr0Var4;
                                    }
                                } else {
                                    mmr0Var4 = mmr0Var;
                                    if (list.contains("media:video")) {
                                        strY2 = "talk,music";
                                    }
                                }
                            }
                        }
                    }
                    strY2 = str;
                }
            }
            mmr0 mmr0Var115 = new mmr0("podcast_chapter_types", strY2);
            mmr0 mmr0Var116 = new mmr0("experience", bzn1.x(pc20Var.h));
            strA = ((psc) uu0Var.h).a();
            if (!di4Var.K()) {
                strA = str;
            }
            List<mmr0> listM2 = p7h.M(new mmr0[]{mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var19, mmr0Var110, mmr0Var111, mmr0Var112, mmr0Var113, mmr0Var114, mmr0Var4, mmr0Var3, mmr0Var115, mmr0Var116, new mmr0("_t", strA)});
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                str5 = (String) mmr0Var18.a;
                str6 = (String) mmr0Var18.b;
                if (str6 != null) {
                    mmr0Var5 = new mmr0(str5, str6);
                } else {
                    mmr0Var5 = str;
                }
                if (mmr0Var5 != null) {
                    arrayList.add(mmr0Var5);
                }
            }
            Map mapT2 = sqg0.T(arrayList);
            qc20Var.b = 1;
            objEmit = vr20Var.emit(mapT2, qc20Var);
            d9nVar = d9n.a;
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

    private final Object e(Object obj, lnm lnmVar) {
        if (((AtomicBoolean) this.c).compareAndSet(false, true)) {
            ((xab1) this.d).d((CancellationException) null);
        }
        Object objEmit = ((vr20) this.b).emit(obj, lnmVar);
        return objEmit == d9n.a ? objEmit : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    private final Object f(Object obj, lnm lnmVar) {
        tt20 tt20Var;
        vr20 vr20Var = (vr20) this.b;
        l811 l811Var = (l811) this.c;
        if (lnmVar instanceof tt20) {
            tt20Var = (tt20) lnmVar;
            int i = tt20Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tt20Var.d = i - Integer.MIN_VALUE;
            } else {
                tt20Var = new tt20(this, lnmVar);
            }
        } else {
            tt20Var = new tt20(this, lnmVar);
        }
        Object objInvoke = tt20Var.b;
        int i2 = tt20Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objInvoke);
            if (l811Var.a) {
                tt20Var.a = null;
                tt20Var.d = 1;
                if (vr20Var.emit(obj, tt20Var) != d9nVar) {
                    return rih1Var;
                }
            } else {
                vu30 vu30Var = (vu30) this.d;
                tt20Var.a = obj;
                tt20Var.d = 2;
                objInvoke = vu30Var.invoke(obj, tt20Var);
                if (objInvoke != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objInvoke);
            return rih1Var;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(objInvoke);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj = tt20Var.a;
        hm5.M(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            l811Var.a = true;
            tt20Var.a = null;
            tt20Var.d = 3;
            if (vr20Var.emit(obj, tt20Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    private final Object g(Object obj, lnm lnmVar) {
        p811 p811Var = (p811) this.b;
        bpb1 bpb1Var = (wen0) p811Var.a;
        if (bpb1Var != null) {
            bpb1Var.l(obj);
        } else {
            c9n c9nVar = (c9n) this.c;
            ayh ayhVar = (ayh) this.d;
            bpb1 bpb1VarB = gio1.b(obj);
            ayhVar.m0(new e331(new xe01(bpb1VarB, op71.z(c9nVar.J()))));
            p811Var.a = bpb1VarB;
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r8 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r7.emit(r8, r1) == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r8, p.lnm r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.p811 r0 = (p.p811) r0
            boolean r1 = r9 instanceof p.xu20
            if (r1 == 0) goto L17
            r1 = r9
            p.xu20 r1 = (p.xu20) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            p.xu20 r1 = new p.xu20
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.b
            int r2 = r1.d
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            p.hm5.M(r9)
            goto L69
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L35:
            p.p811 r8 = r1.a
            p.hm5.M(r9)
            goto L56
        L3b:
            p.hm5.M(r9)
            java.lang.Object r9 = r0.a
            p.jm r2 = p.wqn1.a
            if (r9 != r2) goto L47
        L44:
            r9 = r8
            r8 = r0
            goto L56
        L47:
            java.lang.Object r2 = r7.d
            p.xu30 r2 = (p.xu30) r2
            r1.a = r0
            r1.d = r4
            java.lang.Object r8 = r2.invoke(r9, r8, r1)
            if (r8 != r6) goto L44
            goto L68
        L56:
            r8.a = r9
            java.lang.Object r7 = r7.b
            p.vr20 r7 = (p.vr20) r7
            java.lang.Object r8 = r0.a
            r1.a = r5
            r1.d = r3
            java.lang.Object r7 = r7.emit(r8, r1)
            if (r7 != r6) goto L69
        L68:
            return r6
        L69:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wem.h(java.lang.Object, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object i(Object obj, lnm lnmVar) {
        ir30 ir30Var;
        if (lnmVar instanceof ir30) {
            ir30Var = (ir30) lnmVar;
            int i = ir30Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ir30Var.b = i - Integer.MIN_VALUE;
            } else {
                ir30Var = new ir30(this, lnmVar);
            }
        } else {
            ir30Var = new ir30(this, lnmVar);
        }
        Object obj2 = ir30Var.a;
        int i2 = ir30Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            Long lA = ((jr30) this.c).a((String) this.d);
            ir30Var.b = 1;
            Object objEmit = vr20Var.emit(lA, ir30Var);
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
    private final Object j(Object obj, lnm lnmVar) {
        v140 v140Var;
        if (lnmVar instanceof v140) {
            v140Var = (v140) lnmVar;
            int i = v140Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v140Var.b = i - Integer.MIN_VALUE;
            } else {
                v140Var = new v140(this, lnmVar);
            }
        } else {
            v140Var = new v140(this, lnmVar);
        }
        Object obj2 = v140Var.a;
        int i2 = v140Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            List list = (List) obj;
            list.getClass();
            List list2 = list;
            int iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : list2) {
                linkedHashMap.put(((eww0) obj3).a, obj3);
            }
            s140 s140VarE = ((w140) this.c).e((n140) this.d, linkedHashMap);
            v140Var.b = 1;
            Object objEmit = vr20Var.emit(s140VarE, v140Var);
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
    private final Object k(Object obj, lnm lnmVar) {
        nm40 nm40Var;
        if (lnmVar instanceof nm40) {
            nm40Var = (nm40) lnmVar;
            int i = nm40Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm40Var.b = i - Integer.MIN_VALUE;
            } else {
                nm40Var = new nm40(this, lnmVar);
            }
        } else {
            nm40Var = new nm40(this, lnmVar);
        }
        Object obj2 = nm40Var.a;
        int i2 = nm40Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            om40 om40Var = (om40) this.c;
            ContextTrack contextTrack = (ContextTrack) this.d;
            om40Var.getClass();
            iko ikoVarB = om40.b(contextTrack, (f7h) obj);
            nm40Var.b = 1;
            Object objEmit = vr20Var.emit(ikoVarB, nm40Var);
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

    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0099 A[RETURN] */
    private final Object l(Object obj, lnm lnmVar) {
        Object objEmit;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        l811 l811Var = (l811) this.c;
        vr20 vr20Var = (vr20) this.b;
        Object obj2 = ((e331) obj).a;
        boolean z = obj2 instanceof m231;
        d9n d9nVar = d9n.a;
        if (!z) {
            hm5.M(obj2);
            for (ucd0 ucd0Var : (List) obj2) {
                tcd0 tcd0Var = ucd0Var.b;
                String str = ucd0Var.a;
                eji0 eji0Var = tcd0Var == null ? null : new eji0(tcd0Var.d, str, tcd0Var.a, tcd0Var.b, tcd0Var.c);
                if (eji0Var != null) {
                    linkedHashMap.put(str, eji0Var);
                } else {
                    linkedHashMap.remove(str);
                }
            }
            List listL1 = o7h.l1(linkedHashMap.values());
            if (l811Var.a) {
                objEmit = vr20Var.emit(new hk50(listL1), lnmVar);
                if (objEmit == d9nVar) {
                    return objEmit;
                }
            } else {
                l811Var.a = true;
                if (listL1.size() == 1) {
                    Object objEmit2 = vr20Var.emit(new jk50((eji0) listL1.get(0)), lnmVar);
                    if (objEmit2 == d9nVar) {
                        return objEmit2;
                    }
                } else {
                    objEmit = vr20Var.emit(new hk50(listL1), lnmVar);
                    if (objEmit == d9nVar) {
                        return objEmit;
                    }
                }
            }
        } else if (!l811Var.a) {
            l811Var.a = true;
            Throwable thA = e331.a(obj2);
            thA.getClass();
            Object objEmit3 = vr20Var.emit(new gk50(thA), lnmVar);
            if (objEmit3 == d9nVar) {
                return objEmit3;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object m(Object obj, lnm lnmVar) {
        io50 io50Var;
        if (lnmVar instanceof io50) {
            io50Var = (io50) lnmVar;
            int i = io50Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                io50Var.b = i - Integer.MIN_VALUE;
            } else {
                io50Var = new io50(this, lnmVar);
            }
        } else {
            io50Var = new io50(this, lnmVar);
        }
        Object obj2 = io50Var.a;
        int i2 = io50Var.b;
        rih1 rih1Var = rih1.a;
        vyo0 vyo0Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        vr20 vr20Var = (vr20) this.b;
        ho50 ho50Var = (ho50) obj;
        if (u890.j(ho50Var, eo50.a)) {
            vyo0Var = new vyo0(rih1Var, (xpw) ((kly0) this.c).get());
        } else if (ho50Var instanceof go50) {
            vyo0Var = new vyo0(((go50) ho50Var).a, (xpw) ((kly0) this.d).get());
        } else if (!u890.j(ho50Var, fo50.a)) {
            eg.o();
            return null;
        }
        io50Var.b = 1;
        Object objEmit = vr20Var.emit(vyo0Var, io50Var);
        d9n d9nVar = d9n.a;
        return objEmit == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object n(Object obj, lnm lnmVar) {
        v860 v860Var;
        if (lnmVar instanceof v860) {
            v860Var = (v860) lnmVar;
            int i = v860Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v860Var.b = i - Integer.MIN_VALUE;
            } else {
                v860Var = new v860(this, lnmVar);
            }
        } else {
            v860Var = new v860(this, lnmVar);
        }
        Object obj2 = v860Var.a;
        int i2 = v860Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            jhm jhmVarA = ((YourLibraryDecorateResponse) obj).o().isEmpty() ? ((w860) this.c).f.a(((hti0) this.d).a) : null;
            v860Var.b = 1;
            Object objEmit = vr20Var.emit(jhmVarA, v860Var);
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
    private final Object o(Object obj, lnm lnmVar) {
        xw60 xw60Var;
        if (lnmVar instanceof xw60) {
            xw60Var = (xw60) lnmVar;
            int i = xw60Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw60Var.b = i - Integer.MIN_VALUE;
            } else {
                xw60Var = new xw60(this, lnmVar);
            }
        } else {
            xw60Var = new xw60(this, lnmVar);
        }
        Object obj2 = xw60Var.a;
        int i2 = xw60Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            ww60 ww60VarM = ((cm0) this.c).m((os60) obj, ((vw60) this.d).a);
            xw60Var.b = 1;
            Object objEmit = vr20Var.emit(ww60VarM, xw60Var);
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

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object b(my60 my60Var, lnm lnmVar) {
        ry60 ry60Var;
        rhc rhcVarC;
        ig01 ig01Var;
        ty60 ty60Var = (ty60) this.d;
        l811 l811Var = (l811) this.b;
        if (lnmVar instanceof ry60) {
            ry60Var = (ry60) lnmVar;
            int i = ry60Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry60Var.d = i - Integer.MIN_VALUE;
            } else {
                ry60Var = new ry60(this, lnmVar);
            }
        } else {
            ry60Var = new ry60(this, lnmVar);
        }
        Object obj = ry60Var.b;
        int i2 = ry60Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            if (!l811Var.a) {
                ry50 ry50Var = new ry50((at71) this.c, (byte) 5);
                ry60Var.a = my60Var;
                ry60Var.d = 1;
                Object objI = b5p1.i(ry50Var, ry60Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            if (my60Var instanceof ky60) {
                ev81 ev81Var = ty60Var.i;
                ByteBuffer byteBuffer = ((ky60) my60Var).a;
                a aVarB = ev81Var.b();
                aVarB.n(phc.f(byteBuffer.asReadOnlyBuffer().order(byteBuffer.order())));
                rhcVarC = fap1.c(aVarB);
                ig01Var = ev81Var.f;
                if (ig01Var != null) {
                    u890.C("webSocket");
                    throw null;
                }
                ig01Var.f(2, rhcVarC);
            } else {
                if (my60Var instanceof ly60) {
                    eg.o();
                    return null;
                }
                WeakHashMap weakHashMap = ty60.q;
                ty60Var.d(k57.b);
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        my60Var = ry60Var.a;
        hm5.M(obj);
        l811Var.a = true;
        if (my60Var instanceof ky60) {
            ev81 ev81Var2 = ty60Var.i;
            ByteBuffer byteBuffer2 = ((ky60) my60Var).a;
            a aVarB2 = ev81Var2.b();
            aVarB2.n(phc.f(byteBuffer2.asReadOnlyBuffer().order(byteBuffer2.order())));
            rhcVarC = fap1.c(aVarB2);
            ig01Var = ev81Var2.f;
            if (ig01Var != null) {
                u890.C("webSocket");
                throw null;
            }
            ig01Var.f(2, rhcVarC);
        } else {
            if (my60Var instanceof ly60) {
                eg.o();
                return null;
            }
            WeakHashMap weakHashMap2 = ty60.q;
            ty60Var.d(k57.b);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:150:0x0254  */
    /* JADX WARN: Code duplicated, block: B:175:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:237:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:258:0x04af  */
    /* JADX WARN: Code duplicated, block: B:309:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:329:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:33:0x0072  */
    /* JADX WARN: Code duplicated, block: B:358:0x064d  */
    /* JADX WARN: Code duplicated, block: B:391:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:411:0x072b  */
    /* JADX WARN: Code duplicated, block: B:428:0x075c  */
    /* JADX WARN: Code duplicated, block: B:460:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:491:0x084b  */
    /* JADX WARN: Code duplicated, block: B:520:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:638:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:661:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x015b  */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0b76, code lost:
    
        if (r6.emit(r7, r4) == r12) goto L609;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r41, p.lnm r42) {
        /*
            Method dump skipped, instruction units count: 3004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wem.emit(java.lang.Object, p.lnm):java.lang.Object");
    }

    public /* synthetic */ wem(Serializable serializable, Object obj, vr20 vr20Var, byte b) {
        this.a = b;
        this.c = serializable;
        this.d = obj;
        this.b = vr20Var;
    }

    public /* synthetic */ wem(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
