package p;

import android.os.Build;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.performancesdk.observationplatform.integrations.cpp.NucleusCppOopsForwarderDaemonInstallerKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hj8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj8(jma jmaVar, px9 px9Var, uv40 uv40Var, l3n1 l3n1Var) {
        super(2);
        this.a = (byte) 8;
        this.b = px9Var;
        this.c = l3n1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strK;
        String strK2;
        Object obj3;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                c42 c42Var = (c42) this.b;
                return Collections.singletonList(((wn41) obj).a.a("EventSenderAuthDaemon", new kbp0(new sap0((ui8) obj2, (byte) 0), new tap0(0, c42Var.i, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new tap0(0, c42Var.h, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new uap0(c42Var, (byte) 0), new vap0((nx9) this.c, (byte) 0), (byte) 2)));
            case 1:
                return new sma1(new jpg0(((lb6) this.b).b.a(new hyn(1, 1, 12, false, false), (kko) ((tcr0) this.c).a(kcr0.a), new epb1((zob1) obj)), oc8.O0), new rma1(2131165600, (Integer) null, 2131165600, 10));
            case 2:
                ((Number) obj2).intValue();
                syo1.b((cnc0) this.b, (itk0) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w460 w460Var = (w460) ((el9) this.b).h;
                    jl9 jl9Var = (jl9) this.c;
                    boolean z = jl9Var.a.size() > 3;
                    String str = jl9Var.c;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    if (jl9Var.d) {
                        strK = x0d.k(x340Var2, -2078530618, 2131953053, x340Var2, false);
                    } else {
                        x340Var2.i0(-2078440253);
                        x340Var2.r(false);
                        strK = null;
                    }
                    if (z) {
                        strK2 = x0d.k(x340Var2, -2078366349, 2131953054, x340Var2, false);
                    } else {
                        x340Var2.i0(-2078288477);
                        x340Var2.r(false);
                        strK2 = null;
                    }
                    otw.c(w460Var, new s460(4, 544, str2, strK, strK2, z ? "spotify:internal:byom-chapters" : null, false), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            case 4:
                ((Number) obj2).intValue();
                i2p1.d((ar9) this.b, (iu30) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 5:
                ((Number) obj2).intValue();
                ((ro9) this.b).a(czo1.p(7), (j2i) this.c, (b0k) obj);
                return rih1.a;
            case 6:
                float fFloatValue = ((Number) obj2).floatValue();
                eyo1.h((tui1) this.b, (hav0) obj);
                ((or9) this.c).b(fFloatValue);
                return rih1.a;
            case 7:
                ((Number) obj2).intValue();
                x3p1.b((r1q0) this.b, (Function0) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 8:
                px9 px9Var = (px9) this.b;
                l3n1 l3n1Var = (l3n1) this.c;
                klm klmVar = ((wn41) obj).a;
                zap0 zap0Var = new zap0(l3n1Var, (byte) 0);
                kly0 kly0Var = px9Var.d0;
                go80 go80VarA = klmVar.a("AnrWatchdogReporterDaemon", new iyo0(zap0Var, new tap0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), new ry9(px9Var, (byte) 1), (byte) 6));
                kly0 kly0Var2 = px9Var.b;
                go80 go80VarA2 = klmVar.a("DiagnosticReportDaemon", new dy7(new abp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), new ry9(px9Var, (byte) 2), new ry9(px9Var, (byte) 3), new ry9(px9Var, (byte) 4), new ry9(px9Var, (byte) 5), new ry9(px9Var, (byte) 6), (byte) 18));
                go80 go80VarA3 = klmVar.a("AppExitReasonReporterDaemon", new vt1(new tap0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), new tap0(0, px9Var.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new tap0(0, px9Var.r, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20), new tap0(0, px9Var.e, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21), new tap0(0, px9Var.g, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), (byte) 26));
                go80 go80VarA4 = klmVar.a("ProcessLoadMonitorDaemon", new pcp0(new abp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16), new abp0(0, px9Var.w, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), new abp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), (byte) 1));
                go80 go80VarA5 = klmVar.a("CrashMetadataDaemon", new nap0(new abp0(0, px9Var.O, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), (byte) 24));
                go80 go80VarA6 = klmVar.a("UnauthenticatedLocksManagerDaemon", new pcp0(new abp0(0, px9Var.H, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), new abp0(0, px9Var.y, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), new abp0(0, px9Var.z, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), (byte) 5));
                kly0 kly0Var3 = px9Var.o0;
                go80 go80VarInstallCppOopsForwarderDaemon = NucleusCppOopsForwarderDaemonInstallerKt.installCppOopsForwarderDaemon(klmVar, new abp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1));
                tap0 tap0Var = new tap0(0, px9Var.n0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29);
                kly0 kly0Var4 = px9Var.e0;
                return p7h.M(new go80[]{go80VarA, go80VarA2, go80VarA3, go80VarA4, go80VarA5, go80VarA6, go80VarInstallCppOopsForwarderDaemon, klmVar.a("ConnectionQualityEventDaemon", new rap0(tap0Var, new abp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), (byte) 11)), klmVar.a("OopsStutterDaemon", new kbp0(new ry9(px9Var, (byte) 8), new ry9(px9Var, (byte) 9), new abp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), new abp0(0, px9Var.o, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), new abp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), (byte) 9)), klmVar.a("NetworkReporterDaemon", new k7h0(new abp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), new abp0(0, px9Var.k0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new abp0(0, px9Var.a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), new abp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), (byte) 18)), klmVar.a("ReachabilityEventDaemon", new k7h0(new ry9(px9Var, (byte) 10), new abp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new abp0(0, px9Var.b0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20), new abp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21), (byte) 24)), klmVar.a("BluetoothA2dpConnectionsDaemon", new vt1(new tap0(0, px9Var.B, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), new tap0(0, px9Var.C, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), new tap0(0, px9Var.f, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), new tap0(0, px9Var.D, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26), new tap0(0, px9Var.E, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), (byte) 28)), klmVar.a("CarDetectionDaemon", new rap0(new y52(0, px9Var.F, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new tap0(0, px9Var.G, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), (byte) 5)), klmVar.a("HttpLifecycleListenerUnauthenticatedDaemon", new dy7(new abp0(0, px9Var.Y, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new abp0(0, px9Var.Z, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new ry9(px9Var, (byte) 7), new abp0(0, px9Var.a0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), new abp0(0, px9Var.N, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), new abp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), (byte) 22))});
            case 9:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nz9 nz9Var = (nz9) this.b;
                    b5p1.b(nz9Var.a, nz9Var.b, nz9Var.c, (g2z) ((c0a) this.c).d, (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1.a;
            case 10:
                b0k b0kVar = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((aqw) this.b).a((c7a) this.c, null, b0kVar2, 0, 2);
                } else {
                    b0kVar2.b0();
                }
                return rih1.a;
            case 11:
                Set set = (Set) obj;
                Throwable th = (Throwable) obj2;
                iha ihaVar = (iha) this.b;
                Long l = (Long) this.c;
                synchronized (ihaVar.b) {
                    try {
                        if (!ihaVar.c) {
                            h3r h3rVar = new h3r(new d3r(th.toString()));
                            Set set2 = set;
                            int iS = zno1.s(q7h.U(set2, 10));
                            if (iS < 16) {
                                iS = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                            for (Object obj4 : set2) {
                                linkedHashMap.put(obj4, h3rVar);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                jh5 jh5Var = (jh5) entry.getKey();
                                h3r h3rVar2 = (h3r) entry.getValue();
                                if (ihaVar.d(jh5Var, l) && !u890.j(ihaVar.g.get(jh5Var), h3rVar2)) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!linkedHashMap2.isEmpty()) {
                                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                    ihaVar.g.put((jh5) entry2.getKey(), (h3r) entry2.getValue());
                                }
                                Set<Map.Entry> setEntrySet = linkedHashMap2.entrySet();
                                arrayList = new ArrayList(q7h.U(setEntrySet, 10));
                                for (Map.Entry entry3 : setEntrySet) {
                                    arrayList.add(new mmr0(entry3.getKey(), entry3.getValue()));
                                }
                            }
                            if (arrayList != null) {
                                ihaVar.a.invoke(arrayList);
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return rih1.a;
            case 12:
                ((Number) obj2).intValue();
                ((l1b) this.b).e((k1b) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 13:
                String str3 = (String) obj;
                gzx0 gzx0Var = (gzx0) obj2;
                b6t b6tVar = (k6a1) this.b;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((vu30) this.c).invoke(str3, gzx0Var);
                return rih1.a;
            case 14:
                String str4 = (String) obj;
                gzx0 gzx0Var2 = (gzx0) obj2;
                fzx0 fzx0Var = gzx0Var2 instanceof fzx0 ? (fzx0) gzx0Var2 : null;
                ((tbr0) this.b).a(new y231(new c3b(str4, fzx0Var != null ? fzx0Var.a : null, ((y2b) this.c).b.b)));
                return rih1.a;
            case 15:
                ((Number) obj2).intValue();
                brl.a((nkb) this.b, (qim0) this.c, (b0k) obj, czo1.p(7));
                return rih1.a;
            case 16:
                ((Number) obj2).intValue();
                cxm.a((okb) this.b, (qim0) this.c, (b0k) obj, czo1.p(7));
                return rih1.a;
            case 17:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l90 l90Var = l90.a;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
                    nim0 nim0Var = nim0.a;
                    WeakHashMap weakHashMap = osl1.x;
                    hdh hdhVarC = hqq0.C(lhc.g(x340Var6).g, x340Var6);
                    if (Build.VERSION.SDK_INT < 30) {
                        x340Var6.i0(-1395916448);
                        cvx cvxVar2 = cbx.b(x340Var6).b;
                        hdhVarC = lnn1.n(hdhVarC, uyn1.j(0.0f, 0.0f, 0.0f, 12.0f, 7));
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-1395913821);
                        x340Var6.r(false);
                    }
                    m0p1.b((c380) this.b, uyn1.w(nim0Var, hdhVarC), l90Var, (xtb0) this.c, zzq0Var, 0, x340Var6, 384, 32);
                } else {
                    x340Var6.b0();
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                hr80.a((nxb) this.b, (j2i) this.c, (b0k) obj, czo1.p(49));
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                vby0.b((bac) this.b, (qim0) this.c, (b0k) obj, czo1.p(9));
                return rih1.a;
            case 20:
                ((Number) obj2).intValue();
                ((cab) this.b).i((qim0) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 21:
                ((Number) obj2).intValue();
                ((cab) this.b).l((c380) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 22:
                ((Number) obj2).intValue();
                j1e1.b((iu30) this.b, (eyh0) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 23:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    o4p1.g((String) this.b, (gt40) null, (kee1) this.c, 1, x340Var8, 3072, 2);
                } else {
                    x340Var8.b0();
                }
                return rih1.a;
            case 24:
                ((Number) obj2).intValue();
                cgj1.r((qim0) this.b, (hs20) this.c, (b0k) obj, czo1.p(7));
                return rih1.a;
            case 25:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String strK3 = (String) this.b;
                    if (strK3 == null) {
                        strK3 = x0d.k(x340Var10, -13187486, 2131954910, x340Var10, false);
                    } else {
                        x340Var10.i0(-13187858);
                        x340Var10.r(false);
                    }
                    uwo1.e(strK3, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, (djc0) this.c, 0, (qx8) null, x340Var10, 0, 0, 1726);
                } else {
                    x340Var10.b0();
                }
                return rih1.a;
            case 26:
                ((Number) obj2).intValue();
                ((a4d) this.b).e((Function0) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            case 27:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) this.c;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    etd etdVar = (etd) this.b;
                    boolean zG = x340Var12.g(iu30Var);
                    Object objT = x340Var12.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        gob gobVar = new gob(iu30Var, (byte) 9);
                        x340Var12.s0(gobVar);
                        obj3 = gobVar;
                    }
                    obj3 = objT;
                    y3o1.b(etdVar, (Function0) obj3, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1.a;
            case 28:
                ((Number) obj2).intValue();
                y3o1.b((etd) this.b, (Function0) this.c, (b0k) obj, czo1.p(1));
                return rih1.a;
            default:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    byd bydVar = (byd) this.b;
                    c380<oo41> c380Var = (c380) this.c;
                    ArrayList arrayList2 = new ArrayList(q7h.U(c380Var, 10));
                    for (oo41 oo41Var : c380Var) {
                        arrayList2.add(new gwd(oo41Var.a, oo41Var.b, oo41Var.c, oo41Var.e, oo41Var.f, oo41Var.g, false));
                    }
                    vxd vxdVar = new vxd(arrayList2);
                    if (!(((double) 1.0f) > 0.0d)) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    otw.c(bydVar, vxdVar, u291.f(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), (ipb1) null, x340Var14, 8, 8);
                } else {
                    x340Var14.b0();
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj8(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj8(c42 c42Var, nx9 nx9Var, vuk vukVar) {
        super(2);
        this.a = (byte) 0;
        this.b = c42Var;
        this.c = nx9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj8(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
