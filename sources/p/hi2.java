package p;

import android.content.ComponentName;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.nsd.NsdManager;
import android.provider.Settings;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hi2 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi2(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    private final Object e(Object obj) {
        mu4 mu4Var = (mu4) this.d;
        ssw0 ssw0Var = (ssw0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ConnectivityManager.NetworkCallback lu4Var = new lu4(ssw0Var, (byte) 0);
            ((ConnectivityManager) ((idd1) mu4Var.e).getValue()).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), lu4Var);
            nx2 nx2Var = new nx2(mu4Var, lu4Var, (byte) 13);
            this.c = null;
            this.b = true;
            Object objS = jch0.s(ssw0Var, nx2Var, this);
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

    private final Object g(Object obj) {
        NsdManager nsdManager = (NsdManager) this.d;
        ssw0 ssw0Var = (ssw0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            wv4 wv4Var = new wv4(ssw0Var);
            lbu lbuVarB = ka4.b();
            if (lbuVarB.equals(kbu.a)) {
                ka4.f(nsdManager, wv4Var);
            } else {
                if (!lbuVarB.equals(jbu.a)) {
                    eg.o();
                    return null;
                }
                nsdManager.discoverServices("_spotify-social-listening._tcp", 1, wv4Var);
            }
            nx2 nx2Var = new nx2(ssw0Var, nsdManager, wv4Var);
            this.c = null;
            this.b = true;
            Object objS = jch0.s(ssw0Var, nx2Var, this);
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

    private final Object h(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            pj80 pj80Var = (pj80) this.c;
            jx4 jx4Var = (jx4) this.d;
            this.c = pj80Var;
            this.b = true;
            ohd ohdVar = new ohd(1, aym.t(this));
            ohdVar.t();
            z8e1 z8e1Var = jx4Var.b;
            vdt0 vdt0Var = z8e1Var.a;
            vdt0Var.a();
            z8e1Var.b.set(new c9e1(z8e1Var, vdt0Var));
            ohdVar.n(new da(pj80Var, jx4Var, (byte) 3));
            Object objR = ohdVar.r();
            d9n d9nVar = d9n.a;
            if (objR == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        jah.d();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:18:0x005a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object i(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 != r2) goto L10
            java.lang.Object r0 = r8.c
            p.c9n r0 = (p.c9n) r0
            p.hm5.M(r9)
            goto L5a
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r1
        L16:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.c
            p.c9n r9 = (p.c9n) r9
            r0 = r9
        L1e:
            boolean r9 = p.smo1.u(r0)
            if (r9 == 0) goto L7d
            p.z9 r9 = new p.z9
            r3 = 15
            r9.<init>(r3)
            r8.c = r0
            r8.b = r2
            p.o8n r3 = r8.getContext()
            p.f610 r4 = p.f610.g
            p.m8n r3 = r3.A(r4)
            p.ya80 r3 = (p.ya80) r3
            if (r3 != 0) goto L4a
            p.o8n r3 = r8.getContext()
            p.rjm0 r3 = p.s110.h(r3)
            java.lang.Object r9 = r3.D(r9, r8)
            goto L55
        L4a:
            p.pbg r4 = new p.pbg
            r5 = 27
            r4.<init>(r9, r1, r5)
            java.lang.Object r9 = r3.I()
        L55:
            p.d9n r3 = p.d9n.a
            if (r9 != r3) goto L5a
            return r3
        L5a:
            java.lang.Object r9 = r8.d
            p.ifv0 r9 = (p.ifv0) r9
            int[] r3 = r9.g1
            boolean r4 = r9.isAttachedToWindow()
            if (r4 != 0) goto L67
            goto L1e
        L67:
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.Q0
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L79
            r3 = r3[r2]
            if (r6 == r3) goto L1e
        L79:
            r9.B()
            goto L1e
        L7d:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hi2.i(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Object j(Object obj) throws KotlinNothingValueException {
        boolean z = this.b;
        if (z) {
            if (z) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ggg1 ggg1Var = (ggg1) this.c;
        l45 l45Var = new l45((xid) this.d);
        this.b = true;
        ggg1Var.b(l45Var, this);
        return d9n.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    private final Object m(Object obj) throws AbortFlowException {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            u70 u70Var = new u70(w361.n(((awl1) ((e4b1) this.c).b).c.A(), (UUID) this.d), (byte) 21);
            this.b = true;
            obj = b5p1.i(u70Var, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        xvl1 xvl1Var = (xvl1) obj;
        return xvl1Var != null ? myo1.v(xvl1Var) : hy10.a;
    }

    private final Object o(Object obj) {
        iw5 iw5Var = (iw5) this.c;
        lw5 lw5Var = iw5Var.a;
        boolean z = this.b;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        if (!z) {
            hm5.M(obj);
            this.b = true;
            Object objQ = lw5Var.c.Q(this);
            d9n d9nVar = d9n.a;
            if (objQ != d9nVar) {
                objQ = rih1Var;
            }
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        if (lw5Var.c.v() && lw5Var.e.compareAndSet(false, true)) {
            Set set = (Set) iw5Var.b.get();
            Logger.b("[AppReadiness] Dispatching %d startup settled actions", new Object[]{new Integer(set.size())});
            u9c0 u9c0Var = (u9c0) this.d;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                fn31.T(u9c0Var, iw5Var.c, 0, new hi2(iw5Var, (m2t) it.next(), lnmVar, (byte) 25), 2);
            }
        }
        return rih1Var;
    }

    private final Object p(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            iw5 iw5Var = (iw5) this.c;
            m2t m2tVar = (m2t) this.d;
            this.b = true;
            Object objB = iw5Var.b(m2tVar, this);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
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

    private final Object r(Object obj) {
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ox5 ox5Var = ((tx5) this.c).c;
        ComponentName componentName = (ComponentName) this.d;
        this.b = true;
        Object objA = ox5Var.a(componentName, this);
        d9n d9nVar = d9n.a;
        return objA == d9nVar ? d9nVar : objA;
    }

    private final Object s(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            mfe mfeVarB = k4p1.B(((l96) this.c).j.b);
            mp0 mp0Var = new mp0((ven0) this.d, (byte) 1);
            this.b = true;
            Object objCollect = mfeVarB.collect(mp0Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
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

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new hi2((ii2) this.c, (tv80) obj2, lnmVar, (byte) 0);
            case 1:
                return new hi2((lo2) this.c, (String) obj2, lnmVar, (byte) 1);
            case 2:
                return new hi2((lo2) this.c, (p811) obj2, lnmVar, (byte) 2);
            case 3:
                return new hi2((byp0) this.c, (String) obj2, lnmVar, (byte) 3);
            case 4:
                return new hi2((fq2) this.c, (p811) obj2, lnmVar, (byte) 4);
            case 5:
                return new hi2((jt2) this.c, (String) obj2, lnmVar, (byte) 5);
            case 6:
                hi2 hi2Var = new hi2((gy2) obj2, lnmVar, (byte) 6);
                hi2Var.c = obj;
                return hi2Var;
            case 7:
                hi2 hi2Var2 = new hi2((iz2) obj2, lnmVar, (byte) 7);
                hi2Var2.c = obj;
                return hi2Var2;
            case 8:
                return new hi2((ip31) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                return new hi2((x73) this.c, (z73) obj2, lnmVar, (byte) 9);
            case 10:
                return new hi2((id3) this.c, (zeu0) obj2, lnmVar, (byte) 10);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new hi2((id3) this.c, (q9u0) obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new hi2((aj3) this.c, (slc0) obj2, lnmVar, (byte) 12);
            case 13:
                return new hi2((g931) this.c, (by41) obj2, lnmVar, (byte) 13);
            case 14:
                return new hi2((hb51) this.c, (xtb0) obj2, lnmVar, (byte) 14);
            case 15:
                hi2 hi2Var3 = new hi2((jj4) obj2, lnmVar, (byte) 15);
                hi2Var3.c = obj;
                return hi2Var3;
            case 16:
                return new hi2((ys4) this.c, (ContextTrack) obj2, lnmVar, (byte) 16);
            case 17:
                hi2 hi2Var4 = new hi2((Map) obj2, lnmVar, (byte) 17);
                hi2Var4.c = obj;
                return hi2Var4;
            case 18:
                hi2 hi2Var5 = new hi2((ys4) obj2, lnmVar, (byte) 18);
                hi2Var5.c = obj;
                return hi2Var5;
            case 19:
                hi2 hi2Var6 = new hi2((mu4) obj2, lnmVar, (byte) 19);
                hi2Var6.c = obj;
                return hi2Var6;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                hi2 hi2Var7 = new hi2((NsdManager) obj2, lnmVar, (byte) 20);
                hi2Var7.c = obj;
                return hi2Var7;
            case 21:
                hi2 hi2Var8 = new hi2((jx4) obj2, lnmVar, (byte) 21);
                hi2Var8.c = obj;
                return hi2Var8;
            case 22:
                hi2 hi2Var9 = new hi2((ifv0) obj2, lnmVar, (byte) 22);
                hi2Var9.c = obj;
                return hi2Var9;
            case 23:
                return new hi2((ggg1) this.c, (xid) obj2, lnmVar, (byte) 23);
            case 24:
                return new hi2((e4b1) this.c, (UUID) obj2, lnmVar, (byte) 24);
            case 25:
                return new hi2((iw5) this.c, (m2t) obj2, lnmVar, (byte) 25);
            case 26:
                return new hi2((iw5) this.c, (u9c0) obj2, lnmVar, (byte) 26);
            case 27:
                return new hi2((tx5) this.c, (ComponentName) obj2, lnmVar, (byte) 27);
            case 28:
                return new hi2((l96) this.c, (ven0) obj2, lnmVar, (byte) 28);
            default:
                return new hi2((xpx0) this.c, (ven0) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invoke(Object obj, Object obj2) throws AbortFlowException {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                create((pj80) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:213:0x03fd  */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        Object objI;
        Object objInvoke;
        Object objC;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ii2 ii2Var = (ii2) this.c;
                cbr0 cbr0Var = ii2Var.g;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        cbr0Var.a(new q6b(2, false));
                        f1n0 f1n0Var = ii2Var.c;
                        String str = nik1.Y6.a;
                        tv80 tv80Var = (tv80) this.d;
                        this.b = true;
                        if (f1n0.f(f1n0Var, str, tv80Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    cbr0Var.a(new q6b(2, true));
                    return rih1.a;
                } catch (Throwable th) {
                    cbr0Var.a(new q6b(2, true));
                    throw th;
                }
            case 1:
                String str2 = (String) this.d;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    nf nfVar = new nf(yoi1.g(((lo2) this.c).b.b(new oi("agent-audio-recognition", false, new v1(str2, (byte) 20)))), (byte) 6);
                    this.b = true;
                    objI = b5p1.i(nfVar, this);
                    if (objI == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                return ((uv00) objI).a(jo70.class, str2).b;
            case 2:
                po2 po2Var = po2.a;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                try {
                    try {
                        try {
                            if (!z3) {
                                hm5.M(obj);
                                m441 m441VarJ = z4p1.J(((lo2) this.c).a.a(), new ko2((lo2) this.c, (p811) this.d, null));
                                vt vtVar = new vt((lo2) this.c, (p811) this.d, (byte) 16);
                                this.b = true;
                                if (m441VarJ.collect(vtVar, this) == d9nVar3) {
                                    return d9nVar3;
                                }
                            } else {
                                if (!z3) {
                                    eg.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                hm5.M(obj);
                            }
                            faa0 faa0Var = ((lo2) this.c).f;
                            Object obj2 = ((p811) this.d).a;
                            if (obj2 == null) {
                                u890.C("sessionJob");
                                throw null;
                            }
                            if (faa0Var == ((faa0) obj2)) {
                                vo2 vo2Var = (vo2) ((lo2) this.c).d.getValue();
                                if ((vo2Var instanceof ro2) || (vo2Var instanceof oo2)) {
                                    Logger.d("Audio recognition ended without a terminal result", new Object[0]);
                                    ((lo2) this.c).d.m((Object) null, po2Var);
                                }
                            }
                            faa0 faa0Var2 = ((lo2) this.c).f;
                            Object obj3 = ((p811) this.d).a;
                            if (obj3 == null) {
                                u890.C("sessionJob");
                                throw null;
                            }
                            if (faa0Var2 == ((faa0) obj3)) {
                                ((lo2) this.c).f = null;
                            }
                            return rih1.a;
                        } catch (Throwable th2) {
                            faa0 faa0Var3 = ((lo2) this.c).f;
                            Object obj4 = ((p811) this.d).a;
                            if (obj4 == null) {
                                u890.C("sessionJob");
                                throw null;
                            }
                            if (faa0Var3 == ((faa0) obj4)) {
                                ((lo2) this.c).f = null;
                            }
                            throw th2;
                        }
                    } catch (Exception e) {
                        Logger.e(e, "Audio recognition failed", new Object[0]);
                        faa0 faa0Var4 = ((lo2) this.c).f;
                        Object obj5 = ((p811) this.d).a;
                        if (obj5 == null) {
                            u890.C("sessionJob");
                            throw null;
                        }
                        if (faa0Var4 == ((faa0) obj5)) {
                            ((lo2) this.c).d.m((Object) null, po2Var);
                        }
                        faa0 faa0Var5 = ((lo2) this.c).f;
                        Object obj6 = ((p811) this.d).a;
                        if (obj6 == null) {
                            u890.C("sessionJob");
                            throw null;
                        }
                        if (faa0Var5 == ((faa0) obj6)) {
                        }
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                break;
            case 3:
                String str3 = (String) this.d;
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        vpp0 vpp0Var = ((byp0) this.c).a;
                        toz tozVarO = EsOffline.DownloadRequest.o();
                        tozVarO.r(str3);
                        Completable completableFlatMapCompletable = vpp0Var.a(tozVarO.build()).flatMapCompletable(ta20.U0);
                        this.b = true;
                        if (fc11.i(completableFlatMapCompletable, this) == d9nVar4) {
                            return d9nVar4;
                        }
                    } else {
                        if (!z4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    n57.t("Failed to start download for ".concat(str3), e4);
                }
                return rih1.a;
            case 4:
                rih1 rih1Var = rih1.a;
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                try {
                    try {
                        if (!z5) {
                            hm5.M(obj);
                            oj80 oj80Var = ((fq2) this.c).n;
                            this.b = true;
                            objInvoke = ((no2) oj80Var.c).invoke(this);
                            if (objInvoke == d9nVar5) {
                                return d9nVar5;
                            }
                        } else {
                            if (!z5) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            objInvoke = obj;
                        }
                        boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        faa0 faa0Var6 = ((fq2) this.c).J;
                        Object obj7 = ((p811) this.d).a;
                        if (obj7 == null) {
                            u890.C("job");
                            throw null;
                        }
                        faa0 faa0Var7 = (faa0) obj7;
                        fq2 fq2Var = (fq2) this.c;
                        if (faa0Var6 != faa0Var7) {
                            faa0 faa0Var8 = fq2Var.J;
                            Object obj8 = ((p811) this.d).a;
                            if (obj8 == null) {
                                u890.C("job");
                                throw null;
                            }
                            if (faa0Var8 == ((faa0) obj8)) {
                                ((fq2) this.c).J = null;
                            }
                        } else {
                            fq2Var.J = null;
                            fq2 fq2Var2 = (fq2) this.c;
                            if (zBooleanValue) {
                                fq2Var2.E();
                            } else {
                                fq2Var2.Q = null;
                                ((fq2) this.c).m.b();
                            }
                            faa0 faa0Var9 = ((fq2) this.c).J;
                            Object obj9 = ((p811) this.d).a;
                            if (obj9 == null) {
                                u890.C("job");
                                throw null;
                            }
                            if (faa0Var9 == ((faa0) obj9)) {
                                ((fq2) this.c).J = null;
                            }
                        }
                        return rih1Var;
                    } catch (Throwable th3) {
                        faa0 faa0Var10 = ((fq2) this.c).J;
                        Object obj10 = ((p811) this.d).a;
                        if (obj10 == null) {
                            u890.C("job");
                            throw null;
                        }
                        if (faa0Var10 == ((faa0) obj10)) {
                            ((fq2) this.c).J = null;
                        }
                        throw th3;
                    }
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Exception e6) {
                    n57.t("Failed to request microphone permission for Agent audio recognition", e6);
                    faa0 faa0Var11 = ((fq2) this.c).J;
                    Object obj11 = ((p811) this.d).a;
                    if (obj11 == null) {
                        u890.C("job");
                        throw null;
                    }
                    if (faa0Var11 == ((faa0) obj11)) {
                        ((fq2) this.c).J = null;
                        ((fq2) this.c).Q = null;
                        lo2 lo2Var = ((fq2) this.c).m;
                        faa0 faa0Var12 = lo2Var.f;
                        lo2Var.f = null;
                        if (faa0Var12 != null) {
                            faa0Var12.d((CancellationException) null);
                        }
                        lo2Var.d.m((Object) null, po2.a);
                    }
                    faa0 faa0Var13 = ((fq2) this.c).J;
                    Object obj12 = ((p811) this.d).a;
                    if (obj12 == null) {
                        u890.C("job");
                        throw null;
                    }
                    if (faa0Var13 == ((faa0) obj12)) {
                    }
                }
                break;
            case 5:
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jr2 jr2Var = ((jt2) this.c).d;
                String str4 = (String) this.d;
                this.b = true;
                Object objA = lt2.a(jr2Var, str4, this);
                return objA == d9nVar6 ? d9nVar6 : objA;
            case 6:
                PlayerState playerState = (PlayerState) this.c;
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    ((gy2) this.d).f = playerState;
                    gy2 gy2Var = (gy2) this.d;
                    playerState.getClass();
                    this.c = null;
                    this.b = true;
                    if (gy2Var.g(playerState, this) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                vr20 vr20Var = (vr20) this.c;
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    m811 m811Var = new m811();
                    m811Var.a = 1.7777778f;
                    mr20 mr20Var = ((iz2) this.d).a;
                    vt vtVar2 = new vt(vr20Var, m811Var, (byte) 17);
                    this.c = null;
                    this.b = true;
                    if (mr20Var.collect(vtVar2, this) == d9nVar8) {
                        return d9nVar8;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 8:
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                c1v0 c1v0Var = new c1v0(((opv0) ((ip31) this.c).f).b((String) this.d, (ymd0) null), (byte) 7);
                this.b = true;
                Object objI2 = b5p1.i(c1v0Var, this);
                return objI2 == d9nVar9 ? d9nVar9 : objI2;
            case 9:
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x73 x73Var = (x73) this.c;
                z73 z73Var = (z73) this.d;
                this.b = true;
                mb3 mb3Var = z73Var.d;
                lik1 lik1Var = z73Var.b;
                String str5 = z73Var.a;
                String str6 = z73Var.c;
                Object objS = smo1.s(new s73(str6 == null ? str5 : str6, str5, x73Var, mb3Var, (lnm) null, lik1Var), this);
                return objS == d9nVar10 ? d9nVar10 : objS;
            case 10:
                id3 id3Var = (id3) this.c;
                String str7 = id3Var.h;
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    ezc ezcVarA = id3Var.d.a(str7);
                    mr20 mr20VarI = t5p1.i(id3Var.e.a());
                    Flowable flowableC = ((zeu0) this.d).c();
                    vbm[] vbmVarArr = q601.a;
                    ezc ezcVarF = h4p1.f(new lqv(id3Var.i.getLifecycle(), w8c0.d, h5p1.r(ezcVarA, mr20VarI, new kge(flowableC), id3Var.f.a(str7), new f3(5, (lnm) null, (byte) 2)), (lnm) null, (byte) 10));
                    hb0 hb0Var = new hb0(id3Var, (byte) 7);
                    this.b = true;
                    if (ezcVarF.collect(hb0Var, this) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    Completable completableIgnoreElement = ((id3) this.c).g.a((q9u0) this.d).ignoreElement();
                    completableIgnoreElement.getClass();
                    CompletableOnErrorComplete completableOnErrorCompleteO = completableIgnoreElement.o(Functions.h);
                    this.b = true;
                    if (fc11.i(completableOnErrorCompleteO, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case grn1.d /* 12 */:
                slc0 slc0Var = (slc0) this.d;
                aj3 aj3Var = (aj3) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        MaybeFlatMapCompletable maybeFlatMapCompletableU = aj3Var.c.u(slc0Var, 2, aj3Var.e.l());
                        this.b = true;
                        if (fc11.i(maybeFlatMapCompletableU, this) == d9nVar13) {
                            return d9nVar13;
                        }
                    } else {
                        if (!z13) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    aj3Var.d();
                    break;
                } catch (Throwable unused) {
                    aj3Var.c(slc0Var);
                }
                return rih1.a;
            case 13:
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                g931 g931Var = (g931) this.c;
                xx41 xx41Var = (xx41) ((by41) this.d);
                Single singleW = g931Var.w(xx41Var.c, xx41Var.a, xx41Var.b);
                this.b = true;
                Object objJ = fc11.j(singleW, this);
                return objJ == d9nVar14 ? d9nVar14 : objJ;
            case 14:
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (((hb51) this.c).m > 0) {
                        xtb0 xtb0Var = (xtb0) this.d;
                        this.b = true;
                        df41 df41Var = xtb0.y;
                        if (xtb0Var.k(0, 0, this) == d9nVar15) {
                            return d9nVar15;
                        }
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 15:
                vr20 vr20Var2 = (vr20) this.c;
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    Boolean boolValueOf = Boolean.valueOf(Settings.Global.getInt(((jj4) this.d).c.getContentResolver(), "airplane_mode_on", 0) != 0);
                    this.c = null;
                    this.b = true;
                    if (vr20Var2.emit(boolValueOf, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 16:
                d9n d9nVar17 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    uvy uvyVar = ((ys4) this.c).s;
                    String strUri = ((ContextTrack) this.d).uri();
                    this.b = true;
                    objC = uvyVar.c(strUri, this);
                    if (objC == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                return Boolean.valueOf(!((Collection) objC).isEmpty());
            case 17:
                vr20 vr20Var3 = (vr20) this.c;
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    Map map = (Map) this.d;
                    this.c = null;
                    this.b = true;
                    if (vr20Var3.emit(map, this) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 18:
                vr20 vr20Var4 = (vr20) this.c;
                d9n d9nVar19 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    r0i0 r0i0VarE = ((ys4) this.d).r.E();
                    this.c = null;
                    this.b = true;
                    if (vr20Var4.emit(r0i0VarE, this) == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                return e(obj);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return g(obj);
            case 21:
                return h(obj);
            case 22:
                return i(obj);
            case 23:
                return j(obj);
            case 24:
                return m(obj);
            case 25:
                return p(obj);
            case 26:
                return o(obj);
            case 27:
                return r(obj);
            case 28:
                return s(obj);
            default:
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    bs91 bs91Var = (bs91) ((ven0) this.d).getValue();
                    String str8 = ((xpx0) this.c).a;
                    this.b = true;
                    if (bs91.c(bs91Var, str8, this, 14) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hi2(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
