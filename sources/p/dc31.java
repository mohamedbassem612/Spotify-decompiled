package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.spotify.campfire.elements.sharedbychip.impl.proto.NudgeData;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import spotify.autodownload.esperanto.proto.ShowStateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dc31 implements Function, zdh, ird1, l381, jrn0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public dc31(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                UnicastSubject unicastSubject = new UnicastSubject(Observable.bufferSize(), (Runnable) null);
                this.b = unicastSubject;
                mp8 mp8Var = new mp8((byte) 22);
                unicastSubject.concatMap(new lpd(mp8Var, (byte) 15)).take(1L).subscribe(new keh(mp8Var, (byte) 0));
                this.c = mp8Var;
                break;
            case 20:
                bpb1 bpb1VarB = gio1.b((Object) null);
                this.b = bpb1VarB;
                this.c = new kr41(new any(bpb1VarB, (byte) 18), (byte) 6);
                break;
            default:
                this.b = new LinkedHashMap();
                this.c = new LinkedHashMap();
                break;
        }
    }

    public static CompletableOnErrorComplete f(dc31 dc31Var, String str, boolean z) {
        Completable completableIgnoreElements = ((Observable) dc31Var.b).map(new hr8((byte) 7, dc31Var, str, "", z)).ignoreElements();
        completableIgnoreElements.getClass();
        return completableIgnoreElements.o(Functions.h);
    }

    public void a(leh lehVar) {
        ((mp8) this.c).b = lehVar;
    }

    public Object apply(Object obj) {
        g281 g281Var;
        byte b = this.a;
        z6x z6xVar = z6x.a;
        String strB = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                w281 w281Var = ((tv00) mmr0Var.a).b;
                w281Var.getClass();
                return new k2u((g281) obj3, w281Var, ((tv00) mmr0Var.b).b, (i1z) obj2);
            case 6:
                u310 u310Var = (u310) obj;
                Set set = s4b1.f;
                if (uic.x(u310Var.a).c == blc0.Pg) {
                    Observable observableJust = Observable.just(p7h.H(new u310[]{u310Var}));
                    observableJust.getClass();
                    return observableJust;
                }
                z741 z741Var = (z741) obj3;
                r9c r9cVarA = r9c.a((r9c) obj2, (String) null, u310Var.a, false, false, (String) null, false, 262141);
                am6 am6Var = (am6) z741Var.d;
                onc0 onc0Var = (onc0) z741Var.c;
                if (onc0Var.a(r9cVarA)) {
                    strB = onc0Var.b();
                } else if (am6Var.a(r9cVarA)) {
                    strB = am6Var.b();
                }
                if (strB != null) {
                    Observable observable = strB.b(r9cVarA).map(u3x0.i).toObservable();
                    observable.getClass();
                    return observable;
                }
                Observable observableJust2 = Observable.just(z6xVar);
                observableJust2.getClass();
                return observableJust2;
            case 8:
                String str = ((ya41) obj).c;
                if (str.length() == 0) {
                    return Observable.empty();
                }
                l420 l420VarK = ((f420) obj3).k(str);
                se11 se11Var = r8i0.e;
                tn21 rn21Var = new rn21(new rn21(bmq0.w("image/jpeg"), l420VarK));
                return Observable.combineLatest(((s080) obj2).a(rn21Var).toObservable().startWithItem(new w080()), ((PublishSubject) ((rn21) rn21Var).c).startWithItem(Float.valueOf(0.0f)), o9x0.h).onErrorReturn(s9x0.i);
            case 10:
                jn41 jn41Var = (ln41) obj;
                if (jn41Var instanceof jn41) {
                    return (Observable) ((mn41) obj3).invoke(jn41Var.a);
                }
                if (jn41Var.equals(kn41.a)) {
                    return (Observable) obj2;
                }
                eg.o();
                return null;
            case 12:
                q551 q551Var = (q551) obj;
                return new tw41(q551Var.a, q551Var.b, ((String) obj3).length() == 0 ? q551Var.c : (List) obj2);
            case 13:
                e821 e821Var = (e821) obj3;
                w6e0 w6e0Var = ((n451) ((ow3) e821Var.d).c).a;
                return zho1.H((hc51) w6e0Var.e, new jgd0(w6e0Var, (byte) 14)).map(new yla((Object) w6e0Var, (byte) 15)).subscribeOn((Scheduler) w6e0Var.c).map(drm0.h).flatMap(new g931((Object) e821Var, obj, obj2, (byte) 18));
            case 14:
                return ((kd51) obj3).U(((e331) obj).a, (String) obj2, z6xVar);
            case 22:
                to61 to61Var = (to61) obj;
                nt8 nt8Var = (nt8) obj3;
                String str2 = to61Var.a;
                mt8 mt8Var = nt8Var.a;
                ma81 ma81VarN = ShowStateRequest.n();
                ma81VarN.q(str2);
                ma81VarN.n();
                return Single.zip(mt8Var.callStream("spotify.autodownload_esperanto.proto.AutoDownloadService", "StreamShowState", ma81VarN.build()).map(qz70.t).map(cq41.t).distinctUntilChanged().firstOrError(), ((cs61) obj2).a.a(), n9x0.t).flatMapMaybe(new nt21((Object) to61Var, (Object) nt8Var, (byte) 26));
            default:
                i1z i1zVar = (i1z) ((Map) obj).get((String) obj3);
                if (i1zVar != null && (g281Var = i1zVar.z) != null) {
                    strB = g281Var.a;
                }
                if (strB == null) {
                    strB = "";
                }
                if (strB.length() == 0) {
                    return Single.just(b7x.a);
                }
                z281 z281Var = (z281) obj2;
                Set set2 = s4b1.f;
                return z281Var.a.a(uic.x(strB).h(), (e481) z281Var.d.getValue()).map(r5x0.Y);
        }
    }

    public o3r b() {
        switch (this.a) {
            case 18:
                break;
        }
        return (o3r) this.b;
    }

    public void c(py8 py8Var) {
        ((UnicastSubject) this.b).onNext(py8Var);
    }

    public jhm d(ok51 ok51Var) {
        return new jhm("campfire_see_in_chat", uox.c, (fhm) null, 2131958558, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(th51.Y, new mn41((Object) ok51Var, (byte) 13)), new hf31(ok51Var, this, (byte) 24)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(NudgeData nudgeData, cex0 cex0Var, onm onmVar) {
        yr71 yr71Var;
        if (onmVar instanceof yr71) {
            yr71Var = (yr71) onmVar;
            int i = yr71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yr71Var.d = i - Integer.MIN_VALUE;
            } else {
                yr71Var = new yr71(this, onmVar);
            }
        } else {
            yr71Var = new yr71(this, onmVar);
        }
        Object objA = yr71Var.b;
        int i2 = yr71Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            List listSingletonList = Collections.singletonList(nudgeData.n());
            yr71Var.a = nudgeData;
            yr71Var.d = 1;
            objA = cex0Var.a(listSingletonList, yr71Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nudgeData = yr71Var.a;
            hm5.M(objA);
        }
        w4i1 w4i1Var = (w4i1) ((Map) objA).get(nudgeData.n());
        return w4i1Var == null ? new w4i1(nudgeData.n(), nudgeData.n(), 8, "") : w4i1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, onm onmVar) {
        g441 g441Var;
        if (onmVar instanceof g441) {
            g441Var = (g441) onmVar;
            int i = g441Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g441Var.c = i - Integer.MIN_VALUE;
            } else {
                g441Var = new g441(this, onmVar);
            }
        } else {
            g441Var = new g441(this, onmVar);
        }
        Object objM = g441Var.a;
        int i2 = g441Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objM);
                long jI = ((zg4) ((kly0) this.c).get()).i();
                d821 d821Var = new d821(this, str, (lnm) null, (byte) 25);
                g441Var.c = 1;
                objM = rc2.M(jI, d821Var, g441Var);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objM);
            }
            return (Bitmap) objM;
        } catch (TimeoutCancellationException | RuntimeException unused) {
            return null;
        }
    }

    public Scheduler h() {
        return (Scheduler) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e2 A[Catch: Exception -> 0x0136, TryCatch #0 {Exception -> 0x0136, blocks: (B:14:0x0046, B:43:0x0110, B:37:0x00dc, B:39:0x00e2, B:44:0x012e, B:19:0x0055, B:36:0x00c1, B:22:0x005b, B:28:0x007f, B:30:0x008b, B:32:0x00a2, B:25:0x0062), top: B:49:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x010f -> B:43:0x0110). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object i(java.lang.String r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dc31.i(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(qg21 qg21Var, onm onmVar) {
        x261 x261Var;
        goe m231Var;
        if (onmVar instanceof x261) {
            x261Var = (x261) onmVar;
            int i = x261Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x261Var.c = i - Integer.MIN_VALUE;
            } else {
                x261Var = new x261(this, onmVar);
            }
        } else {
            x261Var = new x261(this, onmVar);
        }
        Object objH = x261Var.a;
        int i2 = x261Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                bfd bfdVar = (bfd) this.b;
                ArrayList arrayList = qg21Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(p((pg21) it.next(), qg21Var.a, qg21Var.b));
                }
                x261Var.c = 1;
                objH = bfdVar.H(arrayList2, x261Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            m231Var = (goe) objH;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? ih21.a : eh21.a;
    }

    public void k(vew vewVar) {
        String str = vewVar.a;
        if (str != null) {
            ((nn60) this.b).a = str;
            ((cbr0) this.c).a(new vmc1(eqr0.I(str).c));
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        b6w0 b6w0VarK = ((mmo) ((b72) this.b).c).k();
        return new hrn0(ju61.class, new lu61(((mu61) this.c).e(), new gu61(th61Var.a), (b6w0VarK instanceof b6w0) && b6w0VarK.b), new b6w0(true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r5 == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.pt51
            if (r0 == 0) goto L13
            r0 = r9
            p.pt51 r0 = (p.pt51) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.pt51 r0 = new p.pt51
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.rih1 r5 = p.rih1.a
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r9)     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            goto L6a
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r2
        L33:
            java.lang.String r8 = r0.a
            p.hm5.M(r9)
            goto L58
        L39:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.b
            p.haa0 r9 = (p.haa0) r9
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r9.b     // Catch: java.lang.Throwable -> L55
            p.dw7 r9 = (p.dw7) r9     // Catch: java.lang.Throwable -> L55
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r8)     // Catch: java.lang.Throwable -> L55
            io.reactivex.rxjava3.subjects.BehaviorSubject r9 = r9.a     // Catch: java.lang.Throwable -> L55
            java.util.Optional r1 = java.util.Optional.ofNullable(r1)     // Catch: java.lang.Throwable -> L55
            r9.onNext(r1)     // Catch: java.lang.Throwable -> L55
        L55:
            if (r5 != r6) goto L58
            goto L67
        L58:
            java.lang.Object r7 = r7.c     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            p.fw7 r7 = (p.fw7) r7     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            r0.a = r2     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            r0.d = r3     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            p.bpb1 r7 = r7.a     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            r7.l(r8)     // Catch: java.util.concurrent.CancellationException -> L68 java.lang.Throwable -> L6a
            if (r5 != r6) goto L6a
        L67:
            return r6
        L68:
            r7 = move-exception
            goto L6b
        L6a:
            return r5
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dc31.m(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:46:0x00b6, B:48:0x00ba, B:50:0x00c4), top: B:74:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object n(String str, onm onmVar) throws Throwable {
        c371 c371Var;
        String str2;
        io70 io70Var;
        String str3;
        String str4;
        String strI;
        String str5;
        String str6;
        Object objA;
        z1u0 m231Var;
        String str7;
        String str8;
        String str9;
        Throwable thA;
        z1u0 z1u0Var;
        d7u0 d7u0Var;
        my7 my7Var;
        x2z x2zVar = (x2z) this.b;
        if (onmVar instanceof c371) {
            c371Var = (c371) onmVar;
            int i = c371Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c371Var.f = i - Integer.MIN_VALUE;
            } else {
                c371Var = new c371(this, onmVar);
            }
        } else {
            c371Var = new c371(this, onmVar);
        }
        Object objA2 = c371Var.d;
        int i2 = c371Var.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA2);
            Set set = s4b1.f;
            if (uic.g(str, blc0.M3)) {
                c371Var.a = str;
                c371Var.f = 1;
                objA2 = x2zVar.a(str, c371Var);
                if (objA2 != d9nVar) {
                    str2 = str;
                }
                return d9nVar;
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str6 = c371Var.c;
                str3 = c371Var.b;
                str5 = c371Var.a;
                try {
                    hm5.M(objA2);
                    d7u0Var = (d7u0) objA2;
                    if (d7u0Var != null || (my7Var = (my7) o7h.s0(d7u0Var.a)) == null) {
                        m231Var = null;
                    } else {
                        m231Var = my7Var.c;
                    }
                } catch (Throwable th) {
                    th = th;
                    m231Var = new m231(th);
                }
                str7 = str6;
                str8 = str3;
                str9 = str5;
                thA = e331.a(m231Var);
                if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                z1u0Var = m231Var;
                if (z1u0Var != null) {
                    return new llg(jfv.h(z1u0Var.a), jfv.h(z1u0Var.b), str9, str7, str8);
                }
                return null;
            }
            String str10 = c371Var.b;
            String str11 = c371Var.a;
            hm5.M(objA2);
            str3 = str10;
            str2 = str11;
            str4 = ((jo70) objA2).a;
            if (str4.length() != 0) {
                strI = xcg1.i(str3, " - ", str4);
                try {
                    u271 u271Var = (u271) this.c;
                    c371Var.a = str2;
                    c371Var.b = str3;
                    c371Var.c = strI;
                    c371Var.f = 3;
                    objA = u271Var.a(str2, c371Var);
                    if (objA != d9nVar) {
                        str5 = str2;
                        str6 = strI;
                        objA2 = objA;
                        d7u0Var = (d7u0) objA2;
                        if (d7u0Var != null) {
                            m231Var = null;
                        } else {
                            m231Var = null;
                        }
                        str7 = str6;
                        str8 = str3;
                        str9 = str5;
                        thA = e331.a(m231Var);
                        if (thA == null) {
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        z1u0Var = m231Var;
                        if (z1u0Var != null) {
                            return new llg(jfv.h(z1u0Var.a), jfv.h(z1u0Var.b), str9, str7, str8);
                        }
                    }
                    return d9nVar;
                } catch (Throwable th2) {
                    th = th2;
                    str5 = str2;
                    str6 = strI;
                    m231Var = new m231(th);
                }
            }
            return null;
        }
        str2 = c371Var.a;
        hm5.M(objA2);
        jo70 jo70Var = (jo70) objA2;
        String str12 = jo70Var.b;
        if (str12.length() != 0 && (io70Var = jo70Var.e) != null) {
            String str13 = io70Var.b;
            c371Var.a = str2;
            c371Var.b = str12;
            c371Var.f = 2;
            objA2 = x2zVar.a(str13, c371Var);
            if (objA2 != d9nVar) {
                str3 = str12;
                str4 = ((jo70) objA2).a;
                if (str4.length() != 0) {
                    strI = xcg1.i(str3, " - ", str4);
                    u271 u271Var2 = (u271) this.c;
                    c371Var.a = str2;
                    c371Var.b = str3;
                    c371Var.c = strI;
                    c371Var.f = 3;
                    objA = u271Var2.a(str2, c371Var);
                    if (objA != d9nVar) {
                        str5 = str2;
                        str6 = strI;
                        objA2 = objA;
                        d7u0Var = (d7u0) objA2;
                        if (d7u0Var != null) {
                            m231Var = null;
                        } else {
                            m231Var = null;
                        }
                        str7 = str6;
                        str8 = str3;
                        str9 = str5;
                        thA = e331.a(m231Var);
                        if (thA == null) {
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        z1u0Var = m231Var;
                        if (z1u0Var != null) {
                            return new llg(jfv.h(z1u0Var.a), jfv.h(z1u0Var.b), str9, str7, str8);
                        }
                    }
                }
            }
            return d9nVar;
        }
        return null;
    }

    public void o(Exception exc) {
        ((View) this.b).setVisibility(8);
        ((ImageView) this.c).setVisibility(0);
    }

    public void onSuccess() {
        ((View) this.b).setVisibility(8);
        ((ImageView) this.c).setVisibility(0);
    }

    public g8d p(pg21 pg21Var, goe goeVar, String str) {
        a8d e8dVar;
        long jB = ((yqg) this.c).b() / 1000;
        String str2 = goeVar.a;
        String string = UUID.randomUUID().toString();
        if (pg21Var instanceof ng21) {
            e8dVar = new a8d(new tom(String.valueOf(jB), goeVar.a, new w4i1(str, str, 12, (String) null), jB, false, new vol(((ng21) pg21Var).a, (String) null), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 4032), false);
        } else if (pg21Var instanceof mg21) {
            e8dVar = new e8d(new tom(String.valueOf(jB), goeVar.a, new w4i1(str, str, 12, (String) null), jB, false, new lpl(((mg21) pg21Var).a.getUri(), (bc71) null, (String) null, (kpl) null, (hmp0) null, (String) null, (String) null, 126), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 4032), false);
        } else if (pg21Var instanceof lg21) {
            e8dVar = new d8d(new tom(String.valueOf(jB), goeVar.a, new w4i1(str, str, 12, (String) null), jB, false, ((lg21) pg21Var).a, (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 4032));
        } else {
            if (!(pg21Var instanceof og21)) {
                eg.o();
                return null;
            }
            og21 og21Var = (og21) pg21Var;
            e8dVar = new e8d(new tom(String.valueOf(jB), goeVar.a, new w4i1(str, str, 12, (String) null), jB, false, new lpl(og21Var.a, (bc71) null, (String) null, new jpl(og21Var.b, og21Var.c, (String) null), (hmp0) null, (String) null, (String) null, 118), (rom) null, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 4032), false);
        }
        return new g8d(str2, string, e8dVar, true);
    }

    public boolean t(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 18:
                qxc0 qxc0Var = (qxc0) obj;
                uc61 uc61Var = (uc61) obj2;
                List list = qxc0Var.N0;
                Map map = qxc0Var.X;
                return uc61Var.c.m(list, map) && !uc61Var.a(ioo1.P(list, map)).isEmpty();
            default:
                qxc0 qxc0Var2 = (qxc0) obj;
                ncc0 ncc0Var = (ncc0) obj2;
                return ncc0Var.c.b(new cij1(ncc0Var.b, qxc0Var2.X0, ncc0Var.d.a(qxc0Var2.e), qxc0Var2.N0, qxc0Var2.t, qxc0Var2.X)) == 3;
        }
    }

    public dc31(Scheduler scheduler) {
        this.a = (byte) 11;
        this.b = new SchedulerWorkRunner(scheduler);
        this.c = scheduler;
    }

    public dc31(Context context, String str, String str2) {
        this.a = (byte) 28;
        this.c = str;
        this.b = context.getApplicationContext().getSharedPreferences(str2, 0).edit();
    }

    public dc31(ncc0 ncc0Var) {
        this.a = (byte) 19;
        this.c = ncc0Var;
        this.b = ncc0Var.g;
    }

    public dc31(uc61 uc61Var) {
        this.a = (byte) 18;
        this.c = uc61Var;
        this.b = uc61Var.q;
    }

    public /* synthetic */ dc31(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
