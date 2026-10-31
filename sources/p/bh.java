package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.transcoder.BetamaxTranscoderException;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Completable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bh extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh(boolean z, Object obj, Object obj2, ven0 ven0Var, hdn0 hdn0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = ven0Var;
        this.f = hdn0Var;
    }

    private final Object e(Object obj) {
        em3 em3Var = (em3) this.d;
        ssw0 ssw0Var = (ssw0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            Logger.g("AudioRecognition WebSocket connecting to %s", new Object[]{"wss://audio-recognition.spotify.com/audio-recognition/v1/recognize"});
            AtomicReference atomicReference = new AtomicReference();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            azp0 azp0Var = (azp0) em3Var.b;
            ne neVar = new ne((byte) 9);
            neVar.e0("wss://audio-recognition.spotify.com/audio-recognition/v1/recognize");
            ((t360) neVar.c).b("Authorization", "Bearer ".concat((String) this.e));
            hh hhVar = new hh(atomicReference, atomicBoolean, azp0Var.c(new ln21(neVar), new q28(ssw0Var, atomicReference, (m441) this.f, atomicBoolean)), (byte) 24);
            this.c = null;
            this.b = true;
            Object objS = jch0.s(ssw0Var, hhVar, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0094 -> B:34:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object g(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f
            p.hdn0 r0 = (p.hdn0) r0
            java.lang.Object r1 = r12.e
            p.yqg r1 = (p.yqg) r1
            java.lang.Object r2 = r12.d
            p.jl9 r2 = (p.jl9) r2
            java.lang.Object r3 = r12.c
            p.c9n r3 = (p.c9n) r3
            boolean r4 = r12.b
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L23
            if (r4 != r6) goto L1d
            p.hm5.M(r13)
            goto L97
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r5
        L23:
            p.hm5.M(r13)
            long r7 = r1.b()
            int r13 = r2.a(r7)
            r4 = r0
            p.err0 r4 = (p.err0) r4
            r4.t(r13)
        L34:
            boolean r13 = p.smo1.u(r3)
            if (r13 == 0) goto La6
            long r7 = r1.b()
            p.jp9 r13 = r2.b
            if (r13 == 0) goto L83
            float r4 = r13.e
            r9 = 0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L4a
            goto L4b
        L4a:
            r13 = r5
        L4b:
            if (r13 != 0) goto L4e
            goto L83
        L4e:
            long r7 = r13.a(r7)
            java.util.List r4 = r2.a
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5a:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L6e
            java.lang.Object r9 = r4.next()
            r10 = r9
            p.yq9 r10 = (p.yq9) r10
            long r10 = r10.b
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 <= 0) goto L5a
            goto L6f
        L6e:
            r9 = r5
        L6f:
            p.yq9 r9 = (p.yq9) r9
            if (r9 == 0) goto L83
            long r9 = r9.b
            long r9 = r9 - r7
            float r4 = (float) r9
            float r13 = r13.e
            float r4 = r4 / r13
            long r7 = (long) r4
            r9 = 1
            long r7 = r7 + r9
            java.lang.Long r13 = java.lang.Long.valueOf(r7)
            goto L84
        L83:
            r13 = r5
        L84:
            if (r13 == 0) goto La6
            long r7 = r13.longValue()
            r12.c = r3
            r12.b = r6
            java.lang.Object r13 = p.hap1.i(r7, r12)
            p.d9n r4 = p.d9n.a
            if (r13 != r4) goto L97
            return r4
        L97:
            long r7 = r1.b()
            int r13 = r2.a(r7)
            r4 = r0
            p.err0 r4 = (p.err0) r4
            r4.t(r13)
            goto L34
        La6:
            p.rih1 r12 = p.rih1.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bh.g(java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj) {
        Object next;
        long j;
        String str;
        opa opaVar = (opa) this.d;
        ssw0 ssw0Var = (ssw0) this.c;
        boolean z = this.b;
        if (!z) {
            mpa mpaVar = new mpa(ssw0Var, l1d.y(obj));
            gha ghaVar = (gha) this.e;
            vga vgaVar = (vga) this.f;
            ConcurrentHashMap concurrentHashMap = opaVar.h;
            long j2 = opaVar.g;
            opaVar.g = 1 + j2;
            concurrentHashMap.put(Long.valueOf(j2), mpaVar);
            Iterator it = o7h.N0(ghaVar.b, ghaVar.a).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                str = (String) next;
                if (str.length() == 0) {
                    break;
                }
            } while (rwo1.v(str));
            String str2 = (String) next;
            if (str2 != null) {
                new BetamaxTranscoderException("Invalid source URL: ".concat(str2), null, xjz.ERROR_INVALID_TRANSCODER_SOURCE_URL, 2);
                concurrentHashMap.remove(Long.valueOf(j2));
                j2 = -1;
                j = -1;
            } else {
                String string = UUID.randomUUID().toString();
                opaVar.k.put(Long.valueOf(j2), string);
                j = -1;
                opaVar.l.put(Long.valueOf(j2), fn31.T(opaVar.f, (o8n) null, 0, new ie3(mpaVar, j2, string, opaVar, ghaVar, vgaVar, (lnm) null), 3));
            }
            if (j2 == j) {
                ssw0Var.l(new aha(new hha(j2)));
                ssw0Var.H((Throwable) null);
            }
            lpa lpaVar = new lpa(opaVar, j2, (byte) 0);
            this.c = null;
            this.b = true;
            Object objS = jch0.s(ssw0Var, lpaVar, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        m231 m231Var;
        fta ftaVar = (fta) this.d;
        boolean z = this.b;
        m231 m231Var2 = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                Completable completableA = ((e2b) ftaVar.d).a(new d2b((String) this.e));
                this.c = null;
                this.b = true;
                Object objI = fc11.i(completableA, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        tv80 tv80Var = (tv80) this.f;
        if (!(m231Var instanceof m231)) {
            ((lzn0) ftaVar.e).a(nik1.z0.a, tv80Var, (Bundle) null);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Error when trying to leave Blend", new Object[0]);
            hp91 hp91Var = (hp91) ftaVar.b;
            ((kt91) hp91Var.c).k(new er91((fs91) null, ((Context) hp91Var.b).getString(2131952740), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return m231Var2;
    }

    private final Object j(Object obj) {
        nsw0 nsw0Var = (nsw0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            y2b y2bVar = (y2b) this.e;
            String str = (String) this.f;
            this.c = null;
            this.d = nsw0Var;
            this.b = true;
            obj = y2bVar.c(str, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nsw0Var = (nsw0) this.d;
            hm5.M(obj);
        }
        ((psw0) nsw0Var).setValue(obj);
        return rih1.a;
    }

    private final Object m(Object obj) throws Exception {
        bh bhVar;
        Exception exc;
        c9n c9nVar = (c9n) this.c;
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        lnm lnmVar = null;
        byte b = 1;
        if (!z) {
            hm5.M(obj);
            String str = (String) this.d;
            if (str != null && !str.equals((String) this.e)) {
                fn31.T(c9nVar, (o8n) null, 0, new a4b((g4b) this.f, (String) this.d, lnmVar, b), 3);
            }
            try {
                g4b g4bVar = (g4b) this.f;
                try {
                    xyc0 xyc0Var = g4bVar.c;
                    String str2 = g4bVar.a;
                    String str3 = (String) this.e;
                    this.c = null;
                    this.b = true;
                    bhVar = this;
                    try {
                        obj = xyc0Var.p(str2, str3, true, false, bhVar);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                        ((py21) obj).d();
                        return rih1.a;
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        ((g4b) bhVar.f).j = (String) bhVar.d;
                        throw exc;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bhVar = this;
                }
            } catch (Exception e3) {
                e = e3;
                bhVar = this;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                hm5.M(obj);
                bhVar = this;
                try {
                    ((py21) obj).d();
                    return rih1.a;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Exception e5) {
                exc = e5;
                bhVar = this;
            }
        }
        exc = e;
        ((g4b) bhVar.f).j = (String) bhVar.d;
        throw exc;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                bh bhVar = new bh((ch) this.d, (Uri) this.e, (Function0) obj2, lnmVar, (byte) 0);
                bhVar.c = obj;
                return bhVar;
            case 1:
                return new bh((kly0) this.c, (kly0) this.d, (kly0) this.e, (dj) obj2, lnmVar, (byte) 1);
            case 2:
                bh bhVar2 = new bh((ArrayList) this.d, (ox) this.e, (of8) obj2, lnmVar, (byte) 2);
                bhVar2.c = obj;
                return bhVar2;
            case 3:
                return new bh((jkr0) this.c, (jk0) this.d, (Set) this.e, (iu30) obj2, lnmVar, (byte) 3);
            case 4:
                return new bh((upo) this.c, (ven0) this.d, (ven0) this.e, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                return new bh((z72) this.d, (ven0) this.e, (ven0) obj2, lnmVar, (byte) 5);
            case 6:
                return new bh((wb2) this.c, (String) this.d, (tv80) this.e, (Bundle) obj2, lnmVar, (byte) 6);
            case 7:
                return new bh((AgeAssuranceWebViewActivity) this.c, (p811) this.d, (l811) this.e, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new bh((fq2) this.c, (tt2) this.d, (String) this.e, (p811) obj2, lnmVar, (byte) 8);
            case 9:
                bh bhVar3 = new bh((ArrayList) this.d, (ya3) this.e, (d0r) obj2, lnmVar, (byte) 9);
                bhVar3.c = obj;
                return bhVar3;
            case 10:
                bh bhVar4 = new bh((iu30) this.d, (ml4) this.e, (vzb0) obj2, lnmVar, (byte) 10);
                bhVar4.c = obj;
                return bhVar4;
            case 11:
                return new bh(this.c, (o95) this.d, (ven0) this.e, (ven0) obj2, lnmVar, (byte) 11);
            case 12:
                return new bh((fns) this.c, (ven0) this.d, (nw4) this.e, (String) obj2, lnmVar, (byte) 12);
            case 13:
                bh bhVar5 = new bh((dwo) obj2, lnmVar, (byte) 13);
                bhVar5.c = obj;
                return bhVar5;
            case 14:
                return new bh((dwo) obj2, lnmVar, (byte) 14);
            case 15:
                bh bhVar6 = new bh((cy5) this.d, (Context) this.e, (ven0) obj2, lnmVar, (byte) 15);
                bhVar6.c = obj;
                return bhVar6;
            case 16:
                bh bhVar7 = new bh((ws40) this.d, (Context) this.e, (kx5) obj2, lnmVar, (byte) 16);
                bhVar7.c = obj;
                return bhVar7;
            case 17:
                bh bhVar8 = new bh((Iterable) this.d, lnmVar, (g7m1) this.e, (oe6) obj2);
                bhVar8.c = obj;
                return bhVar8;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new bh(this.b, (tob1) this.c, (ven0) this.d, (drr0) this.e, (hdn0) obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new bh(this.b, (dw91) this.c, (vu30) this.d, (ven0) this.e, (hdn0) obj2, lnmVar, (byte) 19);
            case 20:
                bh bhVar9 = new bh((p811) this.d, (bv6) this.e, (y0r) obj2, lnmVar, (byte) 20);
                bhVar9.c = obj;
                return bhVar9;
            case 21:
                return new bh((c64) this.c, (AtomicReference) this.d, (ssw0) this.e, (AtomicReference) obj2, lnmVar, (byte) 21);
            case 22:
                bh bhVar10 = new bh((em3) this.d, (String) this.e, (m441) obj2, lnmVar, (byte) 22);
                bhVar10.c = obj;
                return bhVar10;
            case 23:
                bh bhVar11 = new bh((jl9) this.d, (yqg) this.e, (hdn0) obj2, lnmVar, (byte) 23);
                bhVar11.c = obj;
                return bhVar11;
            case 24:
                return new bh((SceneTemplate.BespokeListeningAgeContent.Card2) this.c, (g7m1) this.d, (qla) this.e, (jia) obj2, lnmVar, (byte) 24);
            case 25:
                bh bhVar12 = new bh((opa) this.d, (gha) this.e, (vga) obj2, lnmVar, (byte) 25);
                bhVar12.c = obj;
                return bhVar12;
            case 26:
                bh bhVar13 = new bh((fta) this.d, (String) this.e, (tv80) obj2, lnmVar, (byte) 26);
                bhVar13.c = obj;
                return bhVar13;
            case 27:
                bh bhVar14 = new bh((y2b) this.e, (String) obj2, lnmVar);
                bhVar14.c = obj;
                return bhVar14;
            case 28:
                bh bhVar15 = new bh((String) this.d, (String) this.e, (g4b) obj2, lnmVar, (byte) 28);
                bhVar15.c = obj;
                return bhVar15;
            default:
                return new bh((y7e1) this.c, (iu30) this.d, (at80) this.e, (ven0) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((jx4) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:335:0x0739  */
    /* JADX WARN: Code duplicated, block: B:338:0x0743  */
    /* JADX WARN: Code duplicated, block: B:340:0x074b  */
    /* JADX WARN: Code duplicated, block: B:342:0x0762  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x0484 -> B:225:0x0488). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:334:0x0737 -> B:336:0x073b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(y2b y2bVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 27;
        this.e = y2bVar;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh(dwo dwoVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = dwoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(Iterable iterable, lnm lnmVar, g7m1 g7m1Var, oe6 oe6Var) {
        super(2, lnmVar);
        this.a = (byte) 17;
        this.d = iterable;
        this.e = g7m1Var;
        this.f = oe6Var;
    }
}
