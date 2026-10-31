package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.messages.ObservationEvent;
import com.spotify.messages.ObservationEventGroupNonAuth;
import com.spotify.messages.ObservationEventNonAuth;
import com.spotify.messages.OopsMetricEvent;
import com.spotify.messages.OopsMetricEventNonAuth;
import com.spotify.messages.TimeSeriesNonAuth;
import com.spotify.messages.TraceEventNonAuth;
import com.spotify.performancesdk.observationplatform.proto.ObservationPlatformProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e3p0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3p0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e3p0 e3p0Var = new e3p0((lhd) obj2, lnmVar, (byte) 0);
                e3p0Var.b = obj;
                return e3p0Var;
            case 1:
                return new e3p0((w9p0) this.b, (lz20) obj2, lnmVar, (byte) 1);
            case 2:
                return new e3p0((Set) this.b, (iu30) obj2, lnmVar, (byte) 2);
            case 3:
                return new e3p0((bb71) this.b, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new e3p0((jmp0) this.b, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                e3p0 e3p0Var2 = new e3p0((piq0) obj2, lnmVar, (byte) 5);
                e3p0Var2.b = obj;
                return e3p0Var2;
            case 6:
                e3p0 e3p0Var3 = new e3p0((tiq0) obj2, lnmVar, (byte) 6);
                e3p0Var3.b = obj;
                return e3p0Var3;
            case 7:
                return new e3p0((sjq0) this.b, (tdw) obj2, lnmVar, (byte) 7);
            case 8:
                return new e3p0((asq0) this.b, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new e3p0((urq0) this.b, (osq0) obj2, lnmVar, (byte) 9);
            case 10:
                return new e3p0((usq0) this.b, (orq0) obj2, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new e3p0((rk41) this.b, (ve8) obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new e3p0((vy71) this.b, (nwb) obj2, lnmVar, (byte) 12);
            case 13:
                return new e3p0((mwq0) this.b, (bw91) obj2, lnmVar, (byte) 13);
            case 14:
                return new e3p0((iu30) this.b, (mwq0) obj2, lnmVar, (byte) 14);
            case 15:
                return new e3p0((p410) this.b, (y6r0) obj2, lnmVar, (byte) 15);
            case 16:
                e3p0 e3p0Var4 = new e3p0((zl5) obj2, lnmVar, (byte) 16);
                e3p0Var4.b = obj;
                return e3p0Var4;
            case 17:
                return new e3p0((g5r0) this.b, (ven0) obj2, lnmVar, (byte) 17);
            case 18:
                return new e3p0((Set) this.b, (ven0) obj2, lnmVar, (byte) 18);
            case 19:
                return new e3p0((yu8) this.b, (o9r0) obj2, lnmVar, (byte) 19);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new e3p0((war0) this.b, (qpj0) obj2, lnmVar, (byte) 20);
            case 21:
                return new e3p0((war0) this.b, (rjp0) obj2, lnmVar, (byte) 21);
            case 22:
                return new e3p0((myq0) this.b, (y231) obj2, lnmVar, (byte) 22);
            case 23:
                e3p0 e3p0Var5 = new e3p0((vjr0) obj2, lnmVar, (byte) 23);
                e3p0Var5.b = obj;
                return e3p0Var5;
            case 24:
                e3p0 e3p0Var6 = new e3p0((q3s0) obj2, lnmVar, (byte) 24);
                e3p0Var6.b = obj;
                return e3p0Var6;
            case 25:
                e3p0 e3p0Var7 = new e3p0((g9r) obj2, lnmVar, (byte) 25);
                e3p0Var7.b = obj;
                return e3p0Var7;
            case 26:
                e3p0 e3p0Var8 = new e3p0((ccs0) obj2, lnmVar, (byte) 26);
                e3p0Var8.b = obj;
                return e3p0Var8;
            case 27:
                return new e3p0((vht0) this.b, (eht0) obj2, lnmVar, (byte) 27);
            case 28:
                return new e3p0((kht0) this.b, (vht0) obj2, lnmVar, (byte) 28);
            default:
                return new e3p0((yzg0) this.b, (g7t) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ccs0 */
    public final Object invoke(Object obj, Object obj2) throws ccs0 {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create((k3p0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((xny0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case grn1.d /* 12 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((uev0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                return create((nhv) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ccs0 */
    /* JADX WARN: Code duplicated, block: B:304:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:344:0x09cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Instruction removed from duplicated block: B:304:0x09a9, please report this as an issue */
    public final Object invokeSuspend(Object obj) throws ccs0 {
        Iterator it;
        OopsMetricEvent oopsMetricEventBuild;
        int iA;
        Map map;
        ObservationEvent observationEventBuild;
        qpb1 qpb1Var;
        l7h1 l7h1VarA;
        o8r0 o8r0Var;
        ixb ixbVar;
        tcs0 tcs0Var;
        byte b = this.a;
        rrq0 rrq0Var = rrq0.a;
        srq0 srq0Var = srq0.a;
        qrq0 qrq0Var = qrq0.a;
        trq0 trq0Var = trq0.a;
        boolean zEquals = false;
        ccs0 ccs0Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                k3p0 k3p0Var = (k3p0) this.b;
                hm5.M(obj);
                if (!k3p0Var.a) {
                    ((lhd) obj2).a.d((CancellationException) null);
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                if (((w9p0) this.b).d) {
                    lz20.b((lz20) obj2);
                }
                return rih1Var;
            case 2:
                hm5.M(obj);
                Set set = (Set) this.b;
                iu30 iu30Var = (iu30) obj2;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    iu30Var.invoke((s3t0) it2.next());
                }
                set.clear();
                return rih1Var;
            case 3:
                hm5.M(obj);
                ven0 ven0Var = (ven0) obj2;
                kmp0 kmp0Var = (kmp0) ven0Var.getValue();
                bb71 bb71Var = (bb71) this.b;
                ven0Var.setValue(kmp0.a(kmp0Var, !bb71Var.a.c.a.contains(((kmp0) ven0Var.getValue()).a), false, bb71Var, false, 21));
                return rih1Var;
            case 4:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) obj2;
                kmp0 kmp0Var2 = (kmp0) ven0Var2.getValue();
                jmp0 jmp0Var = (jmp0) this.b;
                ven0Var2.setValue(kmp0.a(kmp0Var2, false, jmp0Var.c, (bb71) null, jmp0Var.j, 11));
                return rih1Var;
            case 5:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                piq0 piq0Var = (piq0) obj2;
                s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new i2p0(piq0Var, (lnm) null, (byte) 7), 3);
                piq0Var.c = s2tVarQ;
                return s2tVarQ;
            case 6:
                uny0 uny0Var = (xny0) this.b;
                hm5.M(obj);
                Iterator it3 = ((tiq0) obj2).c.iterator();
                while (it3.hasNext()) {
                    ny30 ny30Var = (ny30) it3.next();
                    if (uny0Var instanceof uny0) {
                        uny0 uny0Var2 = uny0Var;
                        long j = uny0Var2.e;
                        long j2 = uny0Var2.d;
                        long j3 = uny0Var2.f;
                        Map map2 = uny0Var2.g;
                        Map map3 = uny0Var2.h;
                        UUID uuid = uny0Var2.a;
                        String str = uny0Var2.b;
                        String str2 = uny0Var2.c;
                        ny30Var.getClass();
                        it = it3;
                        if (map3.isEmpty()) {
                            n57.s("Signals list is empty, skipping publishing observation id: " + uuid + ", key: " + str + ", configName: " + str2);
                        } else {
                            boolean z = ny30Var.c;
                            String str3 = ny30Var.b;
                            if (z) {
                                ygp0 ygp0VarP = ObservationEvent.p();
                                map = map3;
                                ygp0VarP.u(uuid.toString());
                                ygp0VarP.v(str);
                                ygp0VarP.s(str2);
                                ygp0VarP.x(j3);
                                ygp0VarP.w(j2);
                                ygp0VarP.t(j - j2);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                                for (Map.Entry entry : map.entrySet()) {
                                    linkedHashMap.put(((UUID) entry.getKey()).toString(), entry.getValue());
                                }
                                ygp0VarP.q(linkedHashMap);
                                ygp0VarP.n(map2);
                                ygp0VarP.r(str3);
                                observationEventBuild = ygp0VarP.build();
                            } else {
                                map = map3;
                                chp0 chp0VarP = ObservationEventNonAuth.p();
                                chp0VarP.u(uuid.toString());
                                chp0VarP.v(str);
                                chp0VarP.s(str2);
                                chp0VarP.x(j3);
                                chp0VarP.w(j2);
                                chp0VarP.t(j - j2);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map.size()));
                                for (Map.Entry entry2 : map.entrySet()) {
                                    linkedHashMap2.put(((UUID) entry2.getKey()).toString(), entry2.getValue());
                                }
                                chp0VarP.q(linkedHashMap2);
                                chp0VarP.n(map2);
                                chp0VarP.r(str3);
                                observationEventBuild = (ObservationEventNonAuth) chp0VarP.build();
                            }
                            int iA2 = ((t2j0) ny30Var.a.get()).a(observationEventBuild);
                            if (iA2 != 1) {
                                int size = map.size();
                                int size2 = map2.size();
                                StringBuilder sb = new StringBuilder("Publishing failed. Result: ");
                                sb.append(cy30.B(iA2));
                                sb.append(". Observation id: ");
                                sb.append(uuid);
                                sb.append(", key: ");
                                bb00.j(sb, str, ", configName: ", str2, ", signals: ");
                                sb.append(size);
                                sb.append(", attributes: ");
                                sb.append(size2);
                                n57.s(sb.toString());
                            }
                        }
                    } else {
                        it = it3;
                        ccs0 ccs0Var2 = ccs0Var;
                        int i = 10;
                        if (uny0Var instanceof wny0) {
                            wny0 wny0Var = (wny0) uny0Var;
                            String str4 = wny0Var.b;
                            UUID uuid2 = wny0Var.a;
                            CopyOnWriteArrayList copyOnWriteArrayList = wny0Var.f;
                            ny30Var.getClass();
                            Iterator it4 = o7h.s1(copyOnWriteArrayList, 25, 25).iterator();
                            int i2 = 0;
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    p7h.T();
                                    throw ccs0Var2;
                                }
                                sif1 sif1VarO = TraceEventNonAuth.o();
                                sif1VarO.s(uuid2.toString());
                                sif1VarO.q(i2);
                                yhp0 yhp0VarO = ObservationPlatformProto.Spans.o();
                                List list = (List) next;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
                                ArrayList arrayList = new ArrayList(q7h.U(list, i));
                                Iterator it5 = list.iterator();
                                while (it5.hasNext()) {
                                    yma1 yma1Var = (yma1) it5.next();
                                    xhp0 xhp0VarN = ObservationPlatformProto.Span.n();
                                    xhp0VarN.q(yma1Var.b);
                                    xhp0VarN.r(yma1Var.c);
                                    xhp0VarN.n(yma1Var.d);
                                    arrayList.add(xhp0VarN.build());
                                    it5 = it5;
                                    it4 = it4;
                                }
                                Iterator it6 = it4;
                                yhp0VarO.n(arrayList);
                                sif1VarO.r(yhp0VarO.build().toByteString());
                                if (i2 == 0) {
                                    sif1VarO.n(wny0Var.e);
                                    sif1VarO.t(str4);
                                }
                                int iA3 = ((t2j0) ny30Var.a.get()).a(sif1VarO.build());
                                if (iA3 != 1) {
                                    n57.s("Failed to publish trace with result: " + cy30.B(iA3) + " for segment: " + i2 + ", traceId: " + uuid2 + ", key: " + str4 + ", spans: " + copyOnWriteArrayList2.size());
                                }
                                i2 = i3;
                                copyOnWriteArrayList = copyOnWriteArrayList2;
                                it4 = it6;
                                i = 10;
                            }
                        } else if (uny0Var instanceof vny0) {
                            ny30Var.getClass();
                            ArrayList arrayListS1 = o7h.s1(ccs0Var2, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER);
                            ArrayList arrayList2 = new ArrayList(q7h.U(arrayListS1, 10));
                            Iterator it7 = arrayListS1.iterator();
                            if (it7.hasNext()) {
                                TimeSeriesNonAuth.n();
                                throw null;
                            }
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                if (((t2j0) ny30Var.a.get()).a((TimeSeriesNonAuth) it8.next()) != 1) {
                                    throw null;
                                }
                            }
                        } else {
                            if (!(uny0Var instanceof sny0)) {
                                if (uny0Var instanceof tny0) {
                                    tny0 tny0Var = (tny0) uny0Var;
                                    long j4 = tny0Var.i;
                                    long j5 = tny0Var.h;
                                    long j6 = tny0Var.j;
                                    String str5 = tny0Var.b;
                                    UUID uuid3 = tny0Var.a;
                                    if (ny30Var.c) {
                                        viq0 viq0VarN = OopsMetricEvent.n();
                                        viq0VarN.w(uuid3.toString());
                                        viq0VarN.x(str5);
                                        viq0VarN.A(j6);
                                        viq0VarN.z(j5);
                                        viq0VarN.s(j4 - j5);
                                        viq0VarN.D(tny0Var.d);
                                        viq0VarN.v(tny0Var.c);
                                        viq0VarN.t(tny0Var.k);
                                        viq0VarN.y(tny0Var.n);
                                        String str6 = tny0Var.o;
                                        if (str6 != null) {
                                            viq0VarN.r(str6);
                                        }
                                        String str7 = tny0Var.l;
                                        if (str7 != null) {
                                            viq0VarN.q(str7);
                                        }
                                        Long l = tny0Var.m;
                                        if (l != null) {
                                            viq0VarN.B(l.longValue() * 1000);
                                        }
                                        lpj0 lpj0Var = tny0Var.f;
                                        if (lpj0Var == null) {
                                            List list2 = tny0Var.g;
                                            if (list2 != null) {
                                                if (list2.isEmpty()) {
                                                    list2 = null;
                                                }
                                                if (list2 != null) {
                                                    viq0VarN.C(mod.l(list2));
                                                }
                                            }
                                        } else if (lpj0Var instanceof lpj0) {
                                            viq0VarN.n(lpj0Var.a);
                                        } else if (lpj0Var instanceof kpj0) {
                                            viq0VarN.u(i0p1.u(((kpj0) lpj0Var).a));
                                        } else {
                                            eg.o();
                                        }
                                        oopsMetricEventBuild = viq0VarN.build();
                                        iA = ((t2j0) ny30Var.a.get()).a(oopsMetricEventBuild);
                                        if (iA != 1) {
                                            n57.s("Publishing metric failed with result: " + cy30.B(iA) + ", metricId: " + uuid3 + ", key: " + str5);
                                        }
                                    } else {
                                        xiq0 xiq0VarN = OopsMetricEventNonAuth.n();
                                        xiq0VarN.w(uuid3.toString());
                                        xiq0VarN.x(str5);
                                        xiq0VarN.A(j6);
                                        xiq0VarN.z(j5);
                                        xiq0VarN.s(j4 - j5);
                                        xiq0VarN.D(tny0Var.d);
                                        xiq0VarN.v(tny0Var.c);
                                        xiq0VarN.t(tny0Var.k);
                                        xiq0VarN.y(tny0Var.n);
                                        String str8 = tny0Var.o;
                                        if (str8 != null) {
                                            xiq0VarN.r(str8);
                                        }
                                        String str9 = tny0Var.l;
                                        if (str9 != null) {
                                            xiq0VarN.q(str9);
                                        }
                                        Long l2 = tny0Var.m;
                                        if (l2 != null) {
                                            xiq0VarN.B(l2.longValue() * 1000);
                                        }
                                        lpj0 lpj0Var2 = tny0Var.f;
                                        if (lpj0Var2 == null) {
                                            List list3 = tny0Var.g;
                                            if (list3 != null) {
                                                if (list3.isEmpty()) {
                                                    list3 = null;
                                                }
                                                if (list3 != null) {
                                                    xiq0VarN.C(mod.l(list3));
                                                }
                                            }
                                        } else if (lpj0Var2 instanceof lpj0) {
                                            xiq0VarN.n(lpj0Var2.a);
                                        } else if (lpj0Var2 instanceof kpj0) {
                                            xiq0VarN.u(i0p1.u(((kpj0) lpj0Var2).a));
                                        } else {
                                            eg.o();
                                        }
                                        oopsMetricEventBuild = (OopsMetricEventNonAuth) xiq0VarN.build();
                                        iA = ((t2j0) ny30Var.a.get()).a(oopsMetricEventBuild);
                                        if (iA != 1) {
                                            n57.s("Publishing metric failed with result: " + cy30.B(iA) + ", metricId: " + uuid3 + ", key: " + str5);
                                        }
                                    }
                                } else {
                                    eg.o();
                                }
                                return null;
                            }
                            sny0 sny0Var = (sny0) uny0Var;
                            ny30Var.getClass();
                            int i4 = 0;
                            for (Object obj3 : o7h.s1(sny0Var.c, 5, 5)) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    p7h.T();
                                    throw null;
                                }
                                List list4 = (List) obj3;
                                ahp0 ahp0VarO = ObservationEventGroupNonAuth.o();
                                ahp0VarO.n(sny0Var.a.toString());
                                ahp0VarO.r(i4);
                                uhp0 uhp0VarO = ObservationPlatformProto.EventGroup.o();
                                List<z600> list5 = list4;
                                ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
                                for (z600 z600Var : list5) {
                                    thp0 thp0VarO = ObservationPlatformProto.Event.o();
                                    thp0VarO.q(z600Var.a);
                                    thp0VarO.r(z600Var.b);
                                    thp0VarO.s(z600Var.c);
                                    thp0VarO.n(z600Var.d);
                                    arrayList3.add(thp0VarO.build());
                                    i5 = i5;
                                    list4 = list4;
                                }
                                List list6 = list4;
                                int i6 = i5;
                                uhp0VarO.n(arrayList3);
                                ahp0VarO.q(uhp0VarO.build().toByteString());
                                ObservationEventGroupNonAuth observationEventGroupNonAuthBuild = ahp0VarO.build();
                                int iA4 = ((t2j0) ny30Var.a.get()).a(observationEventGroupNonAuthBuild);
                                if (iA4 != 1) {
                                    n57.s("Publishing event failed with result: " + cy30.B(iA4) + " for group: " + observationEventGroupNonAuthBuild.n() + " segment: " + i4 + " with " + list6.size() + " events");
                                }
                                i4 = i6;
                            }
                        }
                    }
                    it3 = it;
                    ccs0Var = null;
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                g5p0.b((g5p0) ((sjq0) this.b).b, ((tdw) obj2).a, 2);
                return rih1Var;
            case 8:
                hm5.M(obj);
                asq0 asq0Var = (asq0) this.b;
                if (!asq0Var.d.a()) {
                    asq0Var.f.a(new tx60(1, (String) ((ven0) obj2).getValue(), asq0Var.e));
                }
                return rih1Var;
            case 9:
                hm5.M(obj);
                urq0 urq0Var = (urq0) this.b;
                if (urq0Var != null) {
                    osq0 osq0Var = (osq0) obj2;
                    t8r0 t8r0Var = osq0Var.O0;
                    r6h1 r6h1Var = osq0Var.R0;
                    if (urq0Var.equals(trq0Var)) {
                        qpb1Var = qpb1.a;
                    } else if (urq0Var.equals(qrq0Var)) {
                        qpb1Var = qpb1.b;
                    } else if (urq0Var.equals(rrq0Var)) {
                        qpb1Var = qpb1.d;
                    } else {
                        if (!urq0Var.equals(srq0Var)) {
                            eg.o();
                            return null;
                        }
                        qpb1Var = qpb1.c;
                    }
                    if (((LinkedHashSet) t8r0Var.b).add(qpb1Var)) {
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-page-match-outbound-scanning-state";
                        x6h1VarI.f = "1.0.0";
                        x6h1VarI.g = "22.0.0";
                        y6h1 y6h1VarA = x6h1VarI.a();
                        int iOrdinal = qpb1Var.ordinal();
                        if (iOrdinal == 0) {
                            x6h1 x6h1VarC = y6h1VarA.c();
                            x6h1VarC.i.add(new a7h1("page_matched", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = true;
                            y6h1 y6h1VarA2 = x6h1VarC.a();
                            k7h1 k7h1Var = new k7h1();
                            ((xjn) k7h1Var).a = y6h1VarA2;
                            ((xjn) k7h1Var).b = r6h1Var;
                            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                            l7h1VarA = k7h1Var.a();
                        } else if (iOrdinal == 1) {
                            x6h1 x6h1VarC2 = y6h1VarA.c();
                            x6h1VarC2.i.add(new a7h1("almost_there", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = true;
                            y6h1 y6h1VarA3 = x6h1VarC2.a();
                            k7h1 k7h1Var2 = new k7h1();
                            ((xjn) k7h1Var2).a = y6h1VarA3;
                            ((xjn) k7h1Var2).b = r6h1Var;
                            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                            l7h1VarA = (l7h1) k7h1Var2.a();
                        } else if (iOrdinal == 2) {
                            x6h1 x6h1VarC3 = y6h1VarA.c();
                            x6h1VarC3.i.add(new a7h1("flip_forward", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = true;
                            y6h1 y6h1VarA4 = x6h1VarC3.a();
                            k7h1 k7h1Var3 = new k7h1();
                            ((xjn) k7h1Var3).a = y6h1VarA4;
                            ((xjn) k7h1Var3).b = r6h1Var;
                            ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                            l7h1VarA = (l7h1) k7h1Var3.a();
                        } else {
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC4 = y6h1VarA.c();
                            x6h1VarC4.i.add(new a7h1("flip_back", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = true;
                            y6h1 y6h1VarA5 = x6h1VarC4.a();
                            k7h1 k7h1Var4 = new k7h1();
                            ((xjn) k7h1Var4).a = y6h1VarA5;
                            ((xjn) k7h1Var4).b = r6h1Var;
                            ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                            l7h1VarA = (l7h1) k7h1Var4.a();
                        }
                        ((i8h1) t8r0Var.a).f(l7h1VarA, (Set) null);
                    }
                }
                return rih1Var;
            case 10:
                hm5.M(obj);
                usq0 usq0Var = (usq0) this.b;
                if (usq0Var != null) {
                    orq0 orq0Var = (orq0) obj2;
                    sg41 sg41Var = usq0Var.a;
                    if (sg41Var instanceof sg41) {
                        Long l3 = orq0Var.c;
                        if (l3 == null || Math.abs(sg41Var.b - l3.longValue()) >= orq0Var.b) {
                            orq0Var.c = Long.valueOf(sg41Var.b);
                        }
                    } else {
                        orq0Var.getClass();
                    }
                    urq0 urq0Var2 = usq0Var.b;
                    if (urq0Var2.equals(trq0Var)) {
                        o8r0Var = o8r0.b;
                    } else {
                        if (!urq0Var2.equals(qrq0Var) && !urq0Var2.equals(srq0Var) && !urq0Var2.equals(rrq0Var)) {
                            eg.o();
                            return null;
                        }
                        o8r0Var = o8r0.a;
                    }
                    orq0Var.a.invoke(o8r0Var);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                hm5.M(obj);
                if (!((rk41) this.b).a) {
                    ((mim1) ((ve8) obj2).e).invoke();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                hm5.M(obj);
                int iOrdinal2 = ((vy71) this.b).d().ordinal();
                if (iOrdinal2 == 0) {
                    ixbVar = ixb.c;
                } else if (iOrdinal2 == 1) {
                    ixbVar = ixb.b;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    ixbVar = ixb.a;
                }
                ((nwb) obj2).c.invoke(ixbVar);
                return rih1Var;
            case 13:
                hm5.M(obj);
                bw91 bw91Var = (bw91) obj2;
                bw91Var.addAll(o7h.K0(((mwq0) this.b).b, bw91Var));
                return rih1Var;
            case 14:
                hm5.M(obj);
                ((iu30) this.b).invoke((mwq0) obj2);
                return rih1Var;
            case 15:
                hm5.M(obj);
                ((ConcurrentHashMap) ((ffe1) ((p410) this.b).b).c).keySet().removeIf(new l61(((y6r0) obj2).a, (byte) 4));
                return rih1Var;
            case 16:
                uev0 uev0Var = (uev0) this.b;
                hm5.M(obj);
                if ((uev0Var instanceof pev0) || u890.j(uev0Var, tev0.a)) {
                    ((gev0) ((zl5) obj2).n).e();
                }
                return rih1Var;
            case 17:
                hm5.M(obj);
                if (((g5r0) this.b).h.isEmpty()) {
                    ((ven0) obj2).setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 18:
                hm5.M(obj);
                ((ven0) obj2).setValue((Set) this.b);
                return rih1Var;
            case 19:
                hm5.M(obj);
                yu8 yu8Var = (yu8) this.b;
                txc0 txc0Var = (txc0) yu8Var.f;
                o9r0 o9r0Var = (o9r0) obj2;
                Set set2 = s4b1.f;
                String str10 = o9r0Var.a;
                String str11 = o9r0Var.b;
                int i7 = p9r0.a[uic.x(str10).c.ordinal()];
                Context context = (Context) yu8Var.d;
                String string = i7 == 1 ? context.getString(2131957351, str11) : context.getString(2131957352, str11);
                string.getClass();
                String str12 = o9r0Var.c;
                String strY = uic.x(o9r0Var.a).y();
                Uri uri = strY != null ? Uri.parse(strY) : Uri.EMPTY;
                uri.getClass();
                cbr0 cbr0Var = txc0Var.a;
                cbr0Var.a(new zp71(uri));
                cbr0Var.a(new yxe1(new ehc1(string)));
                u17 u17Var = u17.b;
                cbr0Var.a(kno1.y(str12));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                ((war0) this.b).d((qpj0) obj2);
                return rih1Var;
            case 21:
                hm5.M(obj);
                ((war0) this.b).c((rjp0) obj2);
                return rih1Var;
            case 22:
                hm5.M(obj);
                ((tbr0) ((myq0) this.b).c).a((y231) obj2);
                return rih1Var;
            case 23:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                vjr0 vjr0Var = (vjr0) obj2;
                fn31.T(c9nVar2, (o8n) null, 0, new ujr0(vjr0Var, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar2, (o8n) null, 0, new ujr0(vjr0Var, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 24:
                nhv nhvVar = (nhv) this.b;
                hm5.M(obj);
                return Boolean.valueOf(u890.j(nhvVar, mhv.a) || (nhvVar instanceof khv) || u890.j(nhvVar, jhv.a) || u890.j(nhvVar, jhv.b));
            case 25:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                String str13 = (String) mmr0Var.a;
                String str14 = (String) mmr0Var.b;
                rn0 rn0Var = (pn0) ((kly0) ((g9r) obj2).c).get();
                str14.getClass();
                return new ht20(o4p1.l(rn0Var.b(str13, str14)), new zio0(2, (lnm) null, (byte) 6), (byte) 3);
            case 26:
                psw0 psw0Var = (nsw0) this.b;
                hm5.M(obj);
                ccs0 ccs0Var3 = (ccs0) psw0Var.a.getValue();
                ccs0 ccs0Var4 = (ccs0) obj2;
                tcs0 tcs0Var2 = ccs0Var4.a;
                String str15 = tcs0Var2 != null ? tcs0Var2.a : null;
                String str16 = (ccs0Var3 == null || (tcs0Var = ccs0Var3.a) == null) ? null : tcs0Var.a;
                if (str15 == null) {
                    if (str16 == null) {
                        zEquals = true;
                    }
                } else if (str16 != null) {
                    zEquals = str15.equals(str16);
                }
                if (zEquals) {
                    if (ccs0Var4.b0()) {
                        ccs0Var = ccs0Var3;
                    } else {
                        ccs0Var = ccs0Var4;
                    }
                } else if (!ccs0Var4.b0()) {
                    ccs0Var = ccs0Var4;
                }
                psw0Var.setValue(ccs0Var);
                return rih1Var;
            case 27:
                hm5.M(obj);
                ((vht0) this.b).d.f(new dwn0(l1d.m("spotify:quiz:results:challenge:completion:", ((eht0) obj2).a), "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            case 28:
                hm5.M(obj);
                ((kht0) this.b).getClass();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959045});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", 2131959045, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = ((vht0) obj2).c;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1Var;
            default:
                hm5.M(obj);
                tv80 tv80Var = ((yzg0) this.b).f;
                e7p0 e7p0Var = (e7p0) ((g7t) obj2).d;
                if (tv80Var != null) {
                    e7p0.e(e7p0Var, tv80Var);
                } else {
                    e7p0Var.c();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3p0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
