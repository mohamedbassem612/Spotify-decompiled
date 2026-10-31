package p;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.libs.connect.events.proto.BLECharacteristicState;
import com.spotify.player.model.ContextTrack;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ContentResumedEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fdd implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fdd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object b(qdm qdmVar, lnm lnmVar) {
        rdm rdmVar;
        d520 d520Var = (d520) this.b;
        kdn0 kdn0Var = (kdn0) d520Var.g;
        if (lnmVar instanceof rdm) {
            rdmVar = (rdm) lnmVar;
            int i = rdmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdmVar.c = i - Integer.MIN_VALUE;
            } else {
                rdmVar = new rdm(this, lnmVar);
            }
        } else {
            rdmVar = new rdm(this, lnmVar);
        }
        Object obj = rdmVar.a;
        int i2 = rdmVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            dt71 dt71Var = (dt71) d520Var.e;
            rdmVar.c = 1;
            Object objEmit = dt71Var.emit(qdmVar, rdmVar);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        Object objE = kdn0Var.e();
        l3r l3rVar = l3r.c;
        if (objE != l3rVar) {
            kdn0Var.m(l3rVar);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r5.C(r6, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p.svm r6, p.lnm r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.edd
            if (r0 == 0) goto L13
            r0 = r7
            p.edd r0 = (p.edd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.edd r0 = new p.edd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            p.rih1 r2 = p.rih1.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L26
            if (r1 != r3) goto L2c
        L26:
            p.hm5.M(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5e
        L2a:
            r5 = move-exception
            goto L66
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            r5 = 0
            return r5
        L33:
            p.hm5.M(r7)
            java.lang.Object r5 = r5.b
            p.bfd r5 = (p.bfd) r5
            p.qvm r7 = p.qvm.a     // Catch: java.lang.Throwable -> L2a
            boolean r7 = p.u890.j(r6, r7)     // Catch: java.lang.Throwable -> L2a
            p.d9n r1 = p.d9n.a
            if (r7 == 0) goto L4d
            r0.c = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r5.D(r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L5e
            goto L5d
        L4d:
            boolean r7 = r6 instanceof p.rvm     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L60
            p.rvm r6 = (p.rvm) r6     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r6.a     // Catch: java.lang.Throwable -> L2a
            r0.c = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r5.C(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r6 = r2
            goto L6b
        L60:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2a
            r5.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r5     // Catch: java.lang.Throwable -> L2a
        L66:
            p.m231 r6 = new p.m231
            r6.<init>(r5)
        L6b:
            java.lang.Throwable r5 = p.e331.a(r6)
            if (r5 == 0) goto L80
            p.o8n r6 = r0.getContext()
            p.op71.x(r6)
            java.lang.String r6 = "Failed to refresh chat"
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.spotify.base.java.logging.Logger.e(r5, r6, r7)
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fdd.c(p.svm, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:122:0x039b  */
    /* JADX WARN: Code duplicated, block: B:160:0x045a  */
    /* JADX WARN: Code duplicated, block: B:167:0x046e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0512  */
    public final Object emit(Object obj, lnm lnmVar) {
        g4e g4eVar;
        WebView webView;
        String str;
        String str2;
        mq70 mq70Var;
        mq70 mq70Var2;
        Object value;
        xtk xtkVar;
        String strUri;
        lsm0 lsm0Var;
        iwn gwnVar;
        Object objF;
        Object value2;
        pir pirVar;
        boolean z = false;
        String str3 = null;
        switch (this.a) {
            case 0:
                return c((svm) obj, lnmVar);
            case 1:
                ((nid) this.b).b = (g390) obj;
                return rih1.a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                sjd sjdVar = (sjd) this.b;
                int i = sjd.j1;
                View view = sjdVar.f1;
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(zBooleanValue ? 0.8f : 0.0f).setDuration(300L).withEndAction(new c57(zBooleanValue, sjdVar, (byte) 1)).start();
                return rih1.a;
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                vkd vkdVar = (vkd) this.b;
                int i2 = vkd.z1;
                View view2 = vkdVar.k1;
                view2.animate().cancel();
                view2.setVisibility(0);
                view2.animate().alpha(zBooleanValue2 ? 0.8f : 0.0f).setDuration(300L).withEndAction(new c57(zBooleanValue2, vkdVar, (byte) 2)).start();
                return rih1.a;
            case 4:
                if (lnmVar instanceof g4e) {
                    g4eVar = (g4e) lnmVar;
                    int i3 = g4eVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        g4eVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        g4eVar = new g4e(this, lnmVar);
                    }
                } else {
                    g4eVar = new g4e(this, lnmVar);
                }
                Object obj2 = g4eVar.a;
                d9n d9nVar = d9n.a;
                int i4 = g4eVar.b;
                if (i4 == 0) {
                    hm5.M(obj2);
                    hxn hxnVar = (hxn) this.b;
                    g4eVar.b = 1;
                    if (hxnVar.invoke((ie61) obj, g4eVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj2);
                }
                return rih1.a;
            case 5:
                ((sie) this.b).c();
                return rih1.a;
            case 6:
                String str4 = (String) obj;
                rih1 rih1Var = rih1.a;
                if (!((gag) this.b).n && (webView = ((gag) this.b).m) != null) {
                    gag gagVar = (gag) this.b;
                    gagVar.k.post(new uu1(gagVar, webView, str4, (byte) 5));
                }
                return rih1Var;
            case 7:
                ((Boolean) obj).getClass();
                ((lzn0) ((sbg) this.b).f.c).d(blc0.L3);
                return rih1.a;
            case 8:
                vp70 vp70Var = vp70.c;
                i1r i1rVar = (k1r) obj;
                sng sngVar = (sng) this.b;
                if (i1rVar instanceof j1r) {
                    o3r o3rVar = sng.i;
                    sngVar.j();
                } else if (i1rVar instanceof i1r) {
                    mmr0 mmr0Var = (mmr0) i1rVar.a;
                    jo70 jo70Var = (jo70) mmr0Var.a;
                    xkk1 xkk1Var = (xkk1) mmr0Var.b;
                    if (xkk1Var == null || (mq70Var2 = xkk1Var.b) == null) {
                        str = null;
                    } else {
                        o3r o3rVar2 = sng.i;
                        up70 up70VarA = mq70Var2.a(vp70Var);
                        if (up70VarA != null) {
                            str = up70VarA.a.a;
                        } else {
                            str = null;
                        }
                    }
                    if (xkk1Var == null || (mq70Var = xkk1Var.a) == null) {
                        str2 = null;
                    } else {
                        o3r o3rVar3 = sng.i;
                        up70 up70VarA2 = mq70Var.a(vp70Var);
                        if (up70VarA2 != null) {
                            str2 = up70VarA2.a.a;
                        } else {
                            str2 = null;
                        }
                    }
                    boolean z2 = !(str == null || str.length() == 0);
                    bpb1 bpb1Var = sngVar.g;
                    String str5 = jo70Var.a;
                    String str6 = jo70Var.c;
                    if (str == null) {
                        str = str2 == null ? "" : str2;
                    }
                    bpb1Var.m((Object) null, new jmg(str5, str6, str, z2));
                    sngVar.i();
                } else {
                    if (!(i1rVar instanceof h1r)) {
                        eg.o();
                        return null;
                    }
                    Exception exc = new Exception(((h1r) i1rVar).a.getMessage());
                    o3r o3rVar4 = sng.i;
                    sngVar.h(exc);
                }
                return rih1.a;
            case 9:
                o5e0 o5e0Var = (o5e0) obj;
                lqg lqgVar = (lqg) this.b;
                if (o5e0Var.h()) {
                    lqgVar.g.m((Object) null, sqg.b);
                } else if (!o5e0Var.b()) {
                    lqgVar.g.m((Object) null, sqg.c);
                }
                return rih1.a;
            case 10:
                ((fbh) this.b).a.l((ymc0) obj);
                return rih1.a;
            case 11:
                tck tckVar = (tck) this.b;
                Object objY = fn31.Y((q8n) tckVar.g, new zti((lsk) obj, tckVar, (lnm) null, (byte) 18), lnmVar);
                return objY == d9n.a ? objY : rih1.a;
            case 12:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                iuk iukVar = (iuk) this.b;
                if (!zBooleanValue3) {
                    iukVar.t = true;
                } else if (iukVar.t) {
                    iukVar.t = false;
                    bpb1 bpb1Var2 = iukVar.d;
                    if (((wtk) bpb1Var2.getValue()).b != xtk.e) {
                        iukVar.X = "connectivity_recovery";
                        do {
                            value = bpb1Var2.getValue();
                            wtk wtkVar = (wtk) value;
                            if (iukVar.i) {
                                xtk xtkVar2 = wtkVar.b;
                                xtkVar = xtk.b;
                                if (xtkVar2 != xtkVar) {
                                    xtkVar = xtk.a;
                                }
                            } else {
                                xtkVar = xtk.a;
                            }
                            wtkVar.getClass();
                        } while (!bpb1Var2.k(value, new wtk(0, xtkVar)));
                        if (!iukVar.i) {
                            xab1 xab1Var = iukVar.h;
                            if (xab1Var != null) {
                                xab1Var.d((CancellationException) null);
                            }
                            iukVar.h = fn31.T(ack1.a(iukVar), (o8n) null, 0, new huk(iukVar, (lnm) null), 3);
                        }
                    }
                }
                return rih1.a;
            case 13:
                mmr0 mmr0Var2 = (mmr0) obj;
                boolean zBooleanValue4 = ((Boolean) mmr0Var2.a).booleanValue();
                m8l m8lVar = (m8l) this.b;
                ContextTrack contextTrack = m8lVar.h;
                LinkedHashSet linkedHashSet = m8lVar.g;
                if (contextTrack != null && (strUri = contextTrack.uri()) != null) {
                    str3 = (String) o7h.C0(ihc1.Q0(strUri, new String[]{":"}, 0, 6));
                }
                ContextTrack contextTrack2 = m8lVar.h;
                if (contextTrack2 != null && l4o1.E(contextTrack2)) {
                    if (o7h.i0(linkedHashSet, str3)) {
                        w0h1.i(linkedHashSet).remove(str3);
                    } else {
                        m8lVar.d.a(new bn0(zBooleanValue4 ? "primary_device" : "secondary_device", str3));
                    }
                }
                m8lVar.h = (ContextTrack) mmr0Var2.b;
                return rih1.a;
            case 14:
                ((ihp0) ((gal) this.b).b).n(new yob1("network.connection_quality", ((ial) obj).a.name(), b7x.a));
                return rih1.a;
            case 15:
                i091 i091Var = (i091) obj;
                r1m r1mVar = (r1m) this.b;
                r1mVar.h.l(i091Var);
                if ((ebp1.q(i091Var) || u890.j(i091Var.h, j091.a)) && !i091Var.g) {
                    z = true;
                }
                bpb1 bpb1Var3 = r1mVar.f;
                if (z && (lsm0Var = i091Var.a) != null) {
                    str3 = lsm0Var.a;
                }
                bpb1Var3.l(str3);
                return rih1.a;
            case 16:
                ResumptionProgressEsperanto$ContentResumedEvent resumptionProgressEsperanto$ContentResumedEvent = (ResumptionProgressEsperanto$ContentResumedEvent) obj;
                v1k v1kVar = (v1k) this.b;
                bpb1 bpb1Var4 = (bpb1) v1kVar.c;
                resumptionProgressEsperanto$ContentResumedEvent.getClass();
                f5m f5mVar = new f5m(resumptionProgressEsperanto$ContentResumedEvent, ((Number) ((Function0) v1kVar.b).invoke()).longValue());
                bpb1Var4.getClass();
                bpb1Var4.m((Object) null, f5mVar);
                return rih1.a;
            case 17:
                tv80 tv80Var = (tv80) obj;
                fqb fqbVar = (fqb) ((odm) this.b).c;
                String str7 = (String) fqbVar.c;
                lik1 lik1Var = (lik1) fqbVar.b;
                eoc0 eoc0Var = new eoc0(str7, lik1Var, (gn10) fqbVar.e);
                if (fqbVar.a) {
                    ((yhm) fqbVar.g).a(eoc0Var, tv80Var);
                } else {
                    mfm mfmVarA = ((i4q) fqbVar.f).a(lik1Var);
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mfm.b(mfmVarA, ((ywc0) fqbVar.d).a(eoc0Var), yon1.a1(), (bjm) null, tv80Var, 20);
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return b((qdm) obj, lnmVar);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                bpb1 bpb1Var5 = (bpb1) ((g1i) this.b).f;
                bpb1Var5.getClass();
                bpb1Var5.m((Object) null, bool);
                return rih1.a;
            case 20:
                zp11 zp11Var = (aq11) obj;
                bpb1 bpb1Var6 = ((mwn) this.b).e;
                if (zp11Var instanceof zp11) {
                    zp11 zp11Var2 = zp11Var;
                    gwnVar = new iwn(zp11Var2.b, zp11Var2.c, zp11Var2.d, (String) null, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2040);
                } else if (zp11Var instanceof yp11) {
                    yp11 yp11Var = (yp11) zp11Var;
                    gwnVar = new hwn(yp11Var.b, yp11Var.c, yp11Var.d, (String) null, (String) null, (String) null, (List) null, (dwn) null, (Map) null, false, (Map) null, 2040);
                } else {
                    gwnVar = new gwn(127, (String) null, (String) null);
                }
                bpb1Var6.m((Object) null, gwnVar);
                return rih1.a;
            case 21:
                rih1 rih1Var2 = rih1.a;
                asn asnVar = (asn) this.b;
                List listL1 = o7h.l1(((ConcurrentHashMap) asnVar.b).keySet());
                return (listL1.isEmpty() || (objF = asnVar.f(listL1, lnmVar)) != d9n.a) ? rih1Var2 : objF;
            case 22:
                f4h1 f4h1Var = (f4h1) obj;
                o1o o1oVar = (o1o) this.b;
                f4h1 f4h1Var2 = o1oVar.e;
                FrameLayout frameLayout = o1oVar.h;
                f4h1Var2.stop();
                frameLayout.removeAllViews();
                frameLayout.addView((View) f4h1Var.getView());
                o1oVar.e = f4h1Var;
                f4h1Var.start();
                return rih1.a;
            case 23:
                xid xidVar = ((ooo) this.b).c;
                xidVar.s().updateCursorAnchorInfo((View) xidVar.b, (CursorAnchorInfo) obj);
                return rih1.a;
            case 24:
                upo upoVar = (upo) this.b;
                rih1 rih1Var3 = rih1.a;
                if (((Number) ((mmr0) obj).a).intValue() <= 0) {
                    return rih1Var3;
                }
                hrr0 hrr0Var = upoVar.b;
                hrr0 hrr0Var2 = upoVar.f;
                if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                    wy71 wy71VarC = upoVar.c();
                    hrr0Var2.setValue(wy71VarC);
                    upoVar.a.t(upoVar.g(wy71VarC));
                    if (upoVar.d() <= 0) {
                        return rih1Var3;
                    }
                    upoVar.g.setValue(Boolean.TRUE);
                    return rih1Var3;
                }
                if (!((Boolean) upoVar.b.getValue()).booleanValue() || upoVar.c() == wy71.c || u890.h(upoVar.k, upoVar.g(upoVar.c()))) {
                    return rih1Var3;
                }
                wy71 wy71VarC2 = upoVar.c();
                n8b1 n8b1Var = upo.l;
                hrr0Var2.setValue(wy71VarC2);
                Object objA = upoVar.a(upoVar.g(wy71VarC2), n8b1Var, lnmVar);
                d9n d9nVar2 = d9n.a;
                if (objA != d9nVar2) {
                    objA = rih1Var3;
                }
                return objA == d9nVar2 ? objA : rih1Var3;
            case 25:
                AccessoryStateManager.Event event = (AccessoryStateManager.Event) obj;
                vdr vdrVar = (vdr) this.b;
                vdrVar.g.l(event);
                vdrVar.h = (List) vdrVar.f.getValue();
                Objects.toString(event);
                return rih1.a;
            case 26:
                ((sfr) this.b).c.l((List) obj);
                return rih1.a;
            case 27:
                ((hir) this.b).h.l((List) obj);
                return rih1.a;
            case 28:
                sir sirVar = (sir) this.b;
                Date date = new Date();
                bpb1 bpb1Var7 = sirVar.c;
                do {
                    value2 = bpb1Var7.getValue();
                    pirVar = (pir) value2;
                } while (!bpb1Var7.k(value2, new pir(date)));
                if (pirVar.b()) {
                    t2j0 t2j0Var = sirVar.a;
                    oe9 oe9VarN = BLECharacteristicState.n();
                    oe9VarN.v(pirVar.b);
                    oe9VarN.u(pirVar.c);
                    oe9VarN.x(pirVar.d);
                    oe9VarN.w(pirVar.e);
                    oe9VarN.q();
                    oe9VarN.n();
                    oe9VarN.s(pirVar.f);
                    oe9VarN.r(pirVar.g);
                    SimpleDateFormat simpleDateFormat = tir.a;
                    oe9VarN.y(simpleDateFormat.format(pirVar.a));
                    oe9VarN.t(simpleDateFormat.format(date));
                    t2j0Var.a(oe9VarN.build());
                }
                return rih1.a;
            default:
                rih1 rih1Var4 = rih1.a;
                ((njr) this.b).a(1, (List) obj);
                return rih1Var4;
        }
    }

    public /* synthetic */ fdd(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj2;
    }
}
