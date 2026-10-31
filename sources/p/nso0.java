package p;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.WorkerParameters;
import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.offline_esperanto.proto.EsOffline;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nso0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nso0(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0728  */
    /* JADX WARN: Code duplicated, block: B:222:0x0734  */
    public final Object invoke(Object obj, Object obj2) {
        i8h1 i8h1Var;
        String str;
        int i;
        int i2;
        String strC;
        String str2;
        int i3;
        long j;
        h1v k1vVar;
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                oso0 oso0Var = (oso0) this.b;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwy0 uwy0Var = oso0Var.H1;
                    if (uwy0Var != null && (i8h1Var = oso0Var.F1) != null) {
                        ich0.b(eah.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), (mx61) null, (k2h1) null, apo.r(296281569, new vbn0(uwy0Var, oso0Var, i8h1Var, (byte) 9), x340Var2), x340Var2, 3072, 6);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 1:
                f1p0 f1p0Var = (f1p0) obj;
                if (!f1p0Var.c) {
                    return null;
                }
                q5m0 q5m0Var = (q5m0) ((dx0) this.b).d;
                String str3 = f1p0Var.a;
                q5m0Var.getClass();
                x6h1 x6h1VarC = q5m0Var.b.c();
                x6h1VarC.i.add(new a7h1("hat_with_impressions", str3, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 2:
                uvk0 uvk0VarE = ((zlp0) this.b).e();
                uvk0VarE.getClass();
                x6h1 x6h1VarC2 = uvk0VarE.a.c();
                x6h1VarC2.i.add(new a7h1("request_received_view", (String) null, (Integer) null, (String) null, "off_platform"));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = uvk0VarE.b;
                return k7h1Var2.a();
            case 3:
                ((Number) obj2).intValue();
                lap1.d((hyo1) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 4:
                cop0 cop0Var = (cop0) obj;
                bop0 bop0Var = (bop0) obj2;
                lop0 lop0Var = (lop0) this.b;
                int i4 = bop0Var.a;
                return i4 == 0 ? dop0.a : new eop0(bop0Var.b, lop0Var.d.getResources().getQuantityString(2131820777, i4, Integer.valueOf(i4)), cop0Var.b, mpx.c);
            case 5:
                x6e x6eVar = (x6e) this.b;
                u9p u9pVar = (u9p) ((q9p) ((uip0) x6eVar.b).b).a.c;
                xrc0 xrc0VarF = ((i1o) u9pVar.C).f();
                c8o.l(xrc0VarF);
                gw70 gw70VarE = ((i1o) u9pVar.C).e();
                c8o.l(gw70VarE);
                lzn0 lzn0Var = (lzn0) u9pVar.G.get();
                i1o i1oVar = (i1o) u9pVar.C;
                Context contextC = i1oVar.c();
                c8o.l(contextC);
                zwz0 zwz0Var = (zwz0) i1oVar.G0.get();
                c8o.l(zwz0Var);
                return new jpg0(f6o1.A(new lop0(xrc0VarF, gw70VarE, lzn0Var, contextC, zwz0Var, (zob1) obj), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new mop0(x6eVar, (byte) 0));
            case 6:
                Boolean bool = ((sop0) obj2).a;
                if (bool == null) {
                    return null;
                }
                res resVar = (res) this.b;
                char c = bool.booleanValue() ? (char) 1 : (char) 2;
                iuk0 iuk0Var = (iuk0) ((idd1) resVar.h).getValue();
                iuk0Var.getClass();
                x6h1 x6h1VarC3 = iuk0Var.a.c();
                if (c == 1) {
                    str = "cache_empty";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    str = "offline_listening_disabled";
                }
                x6h1VarC3.i.add(new a7h1("empty_view", (String) null, (Integer) null, (String) null, str));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = iuk0Var.b;
                return k7h1Var3.a();
            case 7:
                grp0 grp0Var = (grp0) obj2;
                et90 et90Var = (et90) this.b;
                boolean z = grp0Var.a;
                boolean z2 = grp0Var.b;
                return new hrp0(((Resources) et90Var.c).getString(z ? z2 ? 2131959331 : 2131959330 : z2 ? 2131959333 : 2131959332));
            case 8:
                dbk dbkVar = (dbk) this.b;
                Resources resources = ((Context) dbkVar.b).getResources();
                p241 p241Var = (o241) dbkVar.c;
                return f6o1.A(new kpg0(new et90(resources, yoi1.g(p241Var.b("offline").map(wdu0.a1)), yoi1.g(p241Var.a.map(c710.T0))), mmp0.X0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 9:
                yrp0 yrp0Var = (yrp0) obj;
                wrp0 wrp0Var = (wrp0) obj2;
                boolean z3 = wrp0Var.c;
                boolean z4 = wrp0Var.b;
                boolean z5 = wrp0Var.d;
                boolean z6 = wrp0Var.a;
                ruc0 ruc0Var = (ruc0) ((z72) this.b).X;
                Resources resources2 = (Resources) ruc0Var.b;
                int i5 = yrp0Var.a;
                if (i5 == 4) {
                    i = 2131959356;
                } else if (ruc0.d(wrp0Var)) {
                    i = 2131959348;
                } else if (!z6 && !z6 && z3 && !z4 && !z5) {
                    i = 2131959343;
                } else if (i5 == 1) {
                    i = 2131959341;
                } else {
                    i = i5 == 3 ? 2131959349 : 2131959345;
                }
                String string = ((Resources) ruc0Var.b).getString(i);
                if (i5 == 4 && z4 && z5) {
                    i2 = 2131959353;
                } else if (i5 == 4 && z5) {
                    i2 = 2131959354;
                } else if (i5 == 4 && z4) {
                    i2 = 2131959352;
                } else if (i5 == 4) {
                    i2 = 2131959355;
                } else if (ruc0.d(wrp0Var) && z6) {
                    i2 = 2131959347;
                } else if (ruc0.d(wrp0Var)) {
                    i2 = 2131959346;
                } else if (z6 || z6 || !z3 || z4 || z5) {
                    i2 = z6 ? 2131959350 : 2131959344;
                } else {
                    i2 = 2131959342;
                }
                String string2 = resources2.getString(i2);
                hux huxVar = i5 == 4 ? null : i5 == 1 ? zjx.c : mpx.c;
                ArrayList arrayList = new ArrayList();
                if (z4) {
                    arrayList.add(new trp0(0, new rrp0(wlx.c), resources2.getString(2131959337), resources2.getString(2131959336), vrp0.a, yrp0Var.a));
                }
                if (z5) {
                    arrayList.add(new trp0(arrayList.size(), new srp0(), resources2.getString(2131959339), resources2.getString(2131959338), vrp0.b, yrp0Var.a));
                }
                if (arrayList.isEmpty() && !z6 && z3 && i5 != 4) {
                    arrayList.add(new qrp0(arrayList.size(), resources2.getString(2131959335), vrp0.c, i5));
                }
                if (i5 == 4) {
                    arrayList.add(new qrp0(arrayList.size(), resources2.getString(2131959340), vrp0.d, i5));
                }
                return new zrp0(string, string2, huxVar, mqo1.A(arrayList));
            case 10:
                hvl1 hvl1Var = ((tup0) obj).a;
                List list = ((sup0) obj2).a;
                if (list.isEmpty()) {
                    return new uup0(hvl1Var);
                }
                List<ssp0> list2 = list;
                yup0 yup0Var = (yup0) this.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (ssp0 ssp0Var : list2) {
                    cn3 cn3Var = (cn3) yup0Var.d;
                    boolean z7 = ssp0Var.l;
                    int i6 = ssp0Var.d;
                    int iC = l1d.C(i6);
                    if (iC != 0) {
                        switch (iC) {
                            case 2:
                            case 4:
                            case 6:
                            case 7:
                                strC = cn3Var.c(ssp0Var);
                                str2 = ssp0Var.f;
                                if (str2.length() > 0) {
                                    strC = f4i1.f(strC, " • ", str2);
                                }
                                break;
                            case 3:
                                strC = cn3Var.c(ssp0Var);
                                String str4 = ssp0Var.g;
                                if (str4.length() > 0) {
                                    strC = f4i1.f(strC, " • ", str4);
                                }
                                break;
                            case 5:
                                strC = cn3Var.c(ssp0Var);
                                break;
                            default:
                                strC = "";
                                break;
                        }
                    } else {
                        strC = cn3Var.c(ssp0Var);
                        str2 = ssp0Var.f;
                        if (str2.length() > 0) {
                            strC = f4i1.f(strC, " • ", str2);
                        }
                    }
                    String str5 = ssp0Var.a;
                    String str6 = ssp0Var.b;
                    List list3 = ssp0Var.c;
                    String string3 = ihc1.f1(str6 + ". " + strC).toString();
                    String str7 = ssp0Var.a;
                    int i7 = ssp0Var.d;
                    boolean z8 = ssp0Var.e;
                    fkt fktVar = (i7 == 5 && z7) ? fkt.a : null;
                    usp0 usp0Var = ssp0Var.i;
                    arrayList2.add(new fvp0(str5, str6, strC, list3, string3, str7, i7, z8, fktVar, Float.valueOf(usp0Var != null ? usp0Var.a : 0.0f), i6 == 5 && z7));
                }
                return new vup0(hvl1Var, arrayList2);
            case 11:
                jbi0 jbi0Var = (jbi0) this.b;
                return new jpg0(f6o1.A(new yup0((ivp0) jbi0Var.d, (cn3) jbi0Var.e, new pdp0(jbi0Var, (byte) 15), (kly0) jbi0Var.b), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), mmp0.e1);
            case 12:
                EsOffline.Progress progress = (EsOffline.Progress) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                poj0 poj0Var = ((OfflineSyncWorker) this.b).q;
                Context context = (Context) poj0Var.b;
                Resources resources3 = context.getResources();
                int iY = (int) progress.y();
                int iR = (int) progress.r();
                int iP = yoi1.p(jch0.U(progress.t()), 0, 100);
                dko0 dko0Var = new dko0(context, "spotify_updates_channel");
                dko0Var.j(resources3.getString(2131959205));
                dko0Var.i(resources3.getQuantityString(2131820762, iY, Integer.valueOf(iR), Integer.valueOf(iY), Integer.valueOf(iP)));
                dko0Var.s(resources3.getString(2131959205));
                dko0Var.D.icon = R.drawable.stat_sys_download;
                dko0Var.l(2, true);
                dko0Var.l(8, true);
                dko0Var.p(100, iP, false);
                dko0Var.u = context.getColor(2131102443);
                dko0Var.g = (PendingIntent) ((idd1) poj0Var.e).getValue();
                if (zBooleanValue) {
                    i3 = 0;
                    dko0Var.a(0, (PendingIntent) ((idd1) poj0Var.d).getValue(), context.getString(2131953021));
                } else {
                    i3 = 0;
                }
                Notification notificationC = dko0Var.c();
                bd30 bd30Var = Build.VERSION.SDK_INT >= 29 ? new bd30(2131430179, notificationC, 1) : new bd30(2131430179, notificationC, i3);
                exp0 exp0Var = ((OfflineSyncWorker) this.b).w;
                synchronized (exp0Var) {
                    j = exp0Var.h + 1;
                    exp0Var.h = j;
                }
                if (j <= 3 || j % 64 == 0) {
                    exp0Var.b("foreground_requested sequence=" + j + " notification_id=2131430179");
                }
                long jE = ((OfflineSyncWorker) this.b).r.a.a.e();
                OfflineSyncWorker offlineSyncWorker = (OfflineSyncWorker) this.b;
                WorkerParameters workerParameters = ((z8d0) offlineSyncWorker).b;
                tvl1 tvl1Var = workerParameters.i;
                pzc pzcVarT = upn1.t(new k65(tvl1Var.a.a, "setForegroundAsync", new qd4(tvl1Var, workerParameters.a, bd30Var, ((z8d0) offlineSyncWorker).a, (byte) 8), (byte) 14));
                pzcVarT.b(new nx30(pzcVarT, new m1d((OfflineSyncWorker) this.b, j, jE), (byte) 24), l5u.a);
                ((OfflineSyncWorker) this.b).w(progress.t());
                return rih1.a;
            case 13:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hux huxVarI = c1q0.i((e0q0) this.b, m0q0.d);
                    if (huxVarI != null) {
                        x340Var4.i0(1009999011);
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var4).g;
                        c1q0.c(huxVarI, 16.0f, x340Var4, 8);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1010082401);
                        uwr uwrVar2 = cbx.a;
                        xto1.e((qim0) null, 0, cbx.a(x340Var4).b.a, 0L, x340Var4, 0, 11);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            case 14:
                bnj0 bnj0Var = (bnj0) ((fxh) this.b).c;
                return new jpg0(new u63((rok0) bnj0Var.b, (t9q0) bnj0Var.c), cwp0.d1);
            case 15:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tbq0 tbq0Var = (xbq0) this.b;
                    if (tbq0Var.equals(vbq0.a)) {
                        k1vVar = h1v.a;
                    } else if (tbq0Var.equals(ubq0.a)) {
                        k1vVar = l1v.a;
                    } else if (tbq0Var.equals(wbq0.a)) {
                        k1vVar = n1v.a;
                    } else if (tbq0Var instanceof tbq0) {
                        k1vVar = new k1v(tbq0Var.a);
                    } else {
                        if (!tbq0Var.equals(sbq0.a)) {
                            eg.o();
                            return null;
                        }
                        k1vVar = i1v.a;
                    }
                    hqq0.g(k1vVar, (qim0) null, x340Var6, 0, 2);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
            case 16:
                rih1 rih1Var = rih1.a;
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                lfq0 lfq0Var = (lfq0) this.b;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI = x340Var8.i(lfq0Var);
                    Object objT = x340Var8.T();
                    if (zI || objT == fkj0.X) {
                        objT = new i2p0(lfq0Var, (lnm) null, (byte) 6);
                        x340Var8.s0(objT);
                    }
                    qxd0.t(rih1Var, x340Var8, (vu30) objT);
                    otw.c(lfq0Var.c, new ofq0(lfq0Var.b.a), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                cwq0 cwq0Var = (cwq0) this.b;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    zf11 zf11Var = cwq0Var.b;
                    boolean zI2 = x340Var10.i(cwq0Var);
                    Object objT2 = x340Var10.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new wvq0(cwq0Var, (byte) 1);
                        x340Var10.s0(objT2);
                    }
                    iu30 iu30Var = (iu30) objT2;
                    boolean zI3 = x340Var10.i(cwq0Var);
                    Object objT3 = x340Var10.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new pdp0(cwq0Var, (byte) 29);
                        x340Var10.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    zvq0 zvq0Var = cwq0Var.f;
                    boolean zI4 = x340Var10.i(zvq0Var);
                    Object objT4 = x340Var10.T();
                    if (zI4 || objT4 == m4cVar) {
                        mdp0 mdp0Var = new mdp0(0, zvq0Var, zvq0.class, "onBeforeFragmentUpdate", "onBeforeFragmentUpdate()V", 0, (byte) 25);
                        x340Var10.s0(mdp0Var);
                        objT4 = mdp0Var;
                    }
                    Function0 function1 = (Function0) objT4;
                    zvq0 zvq0Var2 = cwq0Var.f;
                    boolean zI5 = x340Var10.i(zvq0Var2);
                    Object objT5 = x340Var10.T();
                    if (zI5 || objT5 == m4cVar) {
                        nsm0 nsm0Var = new nsm0(2, zvq0Var2, zvq0.class, "onCurrentEntryUpdate", "onCurrentEntryUpdate(Landroidx/fragment/app/Fragment;Lcom/spotify/navigation/overlay/internal/node/OverlayTarget;)V", 0, (byte) 5);
                        x340Var10.s0(nsm0Var);
                        objT5 = nsm0Var;
                    }
                    vu30 vu30Var = (vu30) objT5;
                    zvq0 zvq0Var3 = cwq0Var.f;
                    boolean zI6 = x340Var10.i(zvq0Var3);
                    Object objT6 = x340Var10.T();
                    if (zI6 || objT6 == m4cVar) {
                        objT6 = new wao0(1, zvq0Var3, zvq0.class, "onCurrentTargetUpdate", "onCurrentTargetUpdate(Lcom/spotify/navigation/overlay/internal/node/OverlayTarget;)V", 0, (byte) 15);
                        x340Var10.s0(objT6);
                    }
                    iu30 iu30Var2 = (iu30) objT6;
                    zvq0 zvq0Var4 = cwq0Var.f;
                    boolean zI7 = x340Var10.i(zvq0Var4);
                    Object objT7 = x340Var10.T();
                    if (zI7 || objT7 == m4cVar) {
                        objT7 = new mdp0(0, zvq0Var4, zvq0.class, "onCurrentFragmentUpdated", "onCurrentFragmentUpdated()V", 0, (byte) 26);
                        x340Var10.s0(objT7);
                    }
                    mth1.h(zf11Var, iu30Var, function0, function1, vu30Var, iu30Var2, (Function0) objT7, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((l8r0) this.b).c.a();
                    x340Var12.i0(-1678543088);
                    String strO0 = cwl1.o0(x340Var12, 2131959482);
                    x340Var12.r(false);
                    eqr0.c(new af5(strO0), (qim0) null, x340Var12, 0, 2);
                } else {
                    x340Var12.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                eqn1.h((der0) this.b, (b0k) obj, czo1.p(1));
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                qur0 qur0Var = (qur0) this.b;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Context context2 = (Context) x340Var14.k(AndroidCompositionLocals_androidKt.b);
                    Object objT8 = x340Var14.T();
                    Object obj3 = fkj0.X;
                    if (objT8 == obj3) {
                        objT8 = qur0Var.c.b(qur0Var.b.a);
                        x340Var14.s0(objT8);
                    }
                    String str8 = (String) objT8;
                    boolean zI8 = x340Var14.i(qur0Var) | x340Var14.i(context2);
                    Object objT9 = x340Var14.T();
                    if (zI8 || objT9 == obj3) {
                        objT9 = new shq0(qur0Var, context2, (byte) 14);
                        x340Var14.s0(objT9);
                    }
                    ejo1.h(6, str8, (Function0) objT9, x340Var14, (qim0) null);
                } else {
                    x340Var14.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                mmr0 mmr0Var = (mmr0) obj2;
                boolean zBooleanValue2 = ((Boolean) mmr0Var.a).booleanValue();
                Boolean bool2 = (Boolean) mmr0Var.b;
                e0s0 e0s0VarE = ((r8s) this.b).e((d0s0) obj);
                return new e0s0(e0s0VarE.a, e0s0VarE.b, e0s0VarE.c, e0s0VarE.d, e0s0VarE.e, "https://support.spotify.com/us/article/jam/", e0s0VarE.g, zBooleanValue2, bool2.booleanValue());
            case 22:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String str9 = ((a7s0) this.b).c;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str9, (qim0) null, cbx.d(x340Var16).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var16, 0, 0, 2042);
                } else {
                    x340Var16.b0();
                }
                return rih1.a;
            case 23:
                ((qbs0) this.b).Z0().U(new v400((p2c0) obj, ((Boolean) obj2).booleanValue()));
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mym.c(((xbs0) this.b).g, (qim0) null, (nl3) null, x340Var18, 0, 6);
                } else {
                    x340Var18.b0();
                }
                return rih1.a;
            case 25:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    yms0 yms0Var = (yms0) this.b;
                    yxb0 yxb0Var = yms0Var.b;
                    zms0 zms0Var = yms0Var.c.a;
                    otw.c(yxb0Var, new vms0(zms0Var.a, zms0Var.b), (qim0) null, (ipb1) null, x340Var20, 0, 12);
                } else {
                    x340Var20.b0();
                }
                return rih1.a;
            case 26:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    eqr0.b(0, 2, ((txs0) this.b).a, x340Var22, (qim0) null);
                } else {
                    x340Var22.b0();
                }
                return rih1.a;
            case 27:
                if (!((vws0) obj).a) {
                    return null;
                }
                grk0 grk0Var = (grk0) ((xws0) this.b).a.invoke();
                grk0Var.getClass();
                x6h1 x6h1VarC4 = grk0Var.a.c();
                x6h1VarC4.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA4 = x6h1VarC5.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var4.e = grk0Var.b;
                return k7h1Var4.a();
            case 28:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    uwo1.e(((kxs0) this.b).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var24, 0, 0, 2046);
                } else {
                    x340Var24.b0();
                }
                return rih1.a;
            default:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    uwo1.e(((oxs0) this.b).a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2046);
                } else {
                    x340Var26.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nso0(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
