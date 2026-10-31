package p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import app.rive.ViewModelInstance;
import com.spotify.base.java.logging.Logger;
import com.spotify.offline_playable_cache_esperanto.proto.EsOfflinePlayableCache;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromSingle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.playlist.esperanto.proto.RootlistModificationRequest;
import spotify.playlist.esperanto.proto.RootlistModificationResponse;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$GetResumePointRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m311 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m311(String str, boolean z, tv80 tv80Var, ca31 ca31Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 21;
        this.c = str;
        this.b = z;
        this.d = tv80Var;
        this.e = ca31Var;
    }

    private final Object e(Object obj) {
        String str = (String) this.d;
        boolean z = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                mr20 triggerFlow = ((ViewModelInstance) this.c).getTriggerFlow(str);
                lm31 lm31Var = new lm31((iu30) this.e, (byte) 0);
                this.b = true;
                Object objCollect = triggerFlow.collect(lm31Var, this);
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
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, l1d.m("RiveMachine failed to observe trigger: ", str), new Object[0]);
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        kdy0 kdy0Var = (kdy0) this.c;
        zg4 zg4Var = (zg4) kdy0Var.e;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            int iK = zg4Var.k();
            long j = zg4Var.j();
            l24 l24Var = new l24(kdy0Var, (jvy0) this.d, (ufz) this.e, (lnm) null, (byte) 25);
            this.b = true;
            obj = ywo1.s(iK, j, l24Var, this);
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
        if (!((Boolean) obj).booleanValue()) {
            Logger.d(gvg.e(zg4Var.k(), "Robin display log failed after ", " retries"), new Object[0]);
        }
        return rih1.a;
    }

    private final Object h(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            jn7 jn7Var = ((pp31) this.c).c;
            jp31 jp31VarN = RootlistModificationRequest.n();
            jp31VarN.q((ModificationRequest) this.d);
            RootlistModificationRequest rootlistModificationRequest = (RootlistModificationRequest) jp31VarN.build();
            this.b = true;
            obj = jn7Var.O(rootlistModificationRequest, this);
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
        return i2x0.l(((RootlistModificationResponse) obj).o(), (String) this.e, n521.Y0);
    }

    private final Object i(Object obj) {
        zxh zxhVar;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            c9n c9nVar = (c9n) this.c;
            zxh zxhVar2 = (ayh) this.d;
            vu30 vu30Var = (vu30) this.e;
            try {
                this.c = zxhVar2;
                this.b = true;
                obj = vu30Var.invoke(c9nVar, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
                zxhVar = zxhVar2;
            } catch (Throwable th) {
                th = th;
                zxhVar = zxhVar2;
                obj = new m231(th);
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zxhVar = (zxh) this.c;
            try {
                hm5.M(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = new m231(th);
            }
        }
        sap1.d(zxhVar, obj);
        return rih1.a;
    }

    private final Object j(Object obj) {
        c9n c9nVar = (c9n) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ixg ixgVarF = ((lz31) this.d).b.f((String) this.e);
            ixgVarF.p(112, 112, 1);
            ixgVarF.g = false;
            Single singleI = ixgVarF.i();
            this.c = c9nVar;
            this.b = true;
            obj = fc11.j(singleI, this);
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
        tfp0 tfp0Var = new tfp0((Bitmap) obj);
        ArrayList arrayList = (ArrayList) tfp0Var.e;
        arrayList.clear();
        arrayList.add(yqi1.b);
        u7h u7hVarQ = ywo1.q(tfp0Var.a());
        Integer num = u7hVarQ != null ? new Integer(z4p1.G(u7hVarQ.a)) : null;
        smo1.t(c9nVar);
        return num;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                m311 m311Var = new m311((o311) obj3, (rjm0) obj2, lnmVar, (byte) 0);
                m311Var.c = obj;
                return m311Var;
            case 1:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 1);
            case 2:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 2);
            case 3:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 4);
            case 5:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                m311 m311Var2 = new m311((k811) obj3, (String) obj2, lnmVar, (byte) 6);
                m311Var2.c = obj;
                return m311Var2;
            case 7:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 7);
            case 8:
                m311 m311Var3 = new m311((e821) obj3, (String) obj2, lnmVar, (byte) 8);
                m311Var3.c = obj;
                return m311Var3;
            case 9:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                m311 m311Var4 = new m311((xa21) obj3, (String) obj2, lnmVar, (byte) 11);
                m311Var4.c = obj;
                return m311Var4;
            case 12:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 13);
            case 14:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 14);
            case 15:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 15);
            case 16:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 16);
            case 17:
                m311 m311Var5 = new m311((uqv0) obj3, (String) obj2, lnmVar, (byte) 17);
                m311Var5.c = obj;
                return m311Var5;
            case 18:
                m311 m311Var6 = new m311((m021) obj3, (kh71) obj2, lnmVar, (byte) 18);
                m311Var6.c = obj;
                return m311Var6;
            case 19:
                return new m311((z531) obj3, (k811) obj2, lnmVar, (byte) 19);
            case 20:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 20);
            case 21:
                return new m311((String) this.c, this.b, (tv80) obj3, (ca31) obj2, lnmVar);
            case 22:
                m311 m311Var7 = new m311((ti31) obj3, (String) obj2, lnmVar, (byte) 22);
                m311Var7.c = obj;
                return m311Var7;
            case 23:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 23);
            case 24:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 25);
            case 26:
                return new m311(this.c, obj3, obj2, lnmVar, (byte) 26);
            case 27:
                m311 m311Var8 = new m311((ayh) obj3, (vu30) obj2, lnmVar, (byte) 27);
                m311Var8.c = obj;
                return m311Var8;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                m311 m311Var9 = new m311((lz31) obj3, (String) obj2, lnmVar, (byte) 28);
                m311Var9.c = obj;
                return m311Var9;
            default:
                m311 m311Var10 = new m311((mr20) obj3, (ObservableEmitter) obj2, lnmVar, (byte) 29);
                m311Var10.c = obj;
                return m311Var10;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:434:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Exception {
        ijz0 ijz0Var;
        ijz0 j2v0Var;
        Object objY;
        Object objO;
        m231 m231Var;
        int i;
        String m231Var2;
        Object objJ;
        Object objB;
        m231 m231Var3;
        Object objQ;
        Object objB2;
        Object objA;
        q431 q431Var;
        Object objZ;
        q431 q431Var2;
        Object objY2;
        Object objA2;
        byte b = this.a;
        m231 m231Var4 = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        byte b2 = 1;
        bwn0 wqk0Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    ((o311) obj2).invoke((c9n) this.c, (rjm0) obj3, this);
                    return d9nVar;
                }
                if (z) {
                    hm5.M(obj);
                    return m231Var4;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objW = yah0.w((z2h) ((k811) this.c).d, (ArrayList) obj2, (ArrayList) obj3, this);
                    return objW == d9nVar ? d9nVar : objW;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m021 m021Var = (m021) this.c;
                r6h1 r6h1Var = (r6h1) obj3;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                xae xaeVar = (xae) m021Var.b;
                i521 i521Var = new i521(m021Var, (String) obj2, r6h1Var, ohdVar, (byte) 1);
                efr efrVar = xaeVar.b;
                Activity activity = xaeVar.a;
                String string = activity.getString(2131961132);
                String string2 = activity.getString(2131961123);
                String string3 = activity.getString(2131961131);
                String string4 = activity.getString(2131961130);
                boolean zA = ((zb4) xaeVar.c.b).a();
                p521 p521Var = p521.b;
                if (zA) {
                    if (efrVar.c()) {
                        l421 l421Var = new l421(i521Var, (byte) 0);
                        z50 z50Var = z50.c;
                        j2v0Var = new i2v0(xaeVar, oqo1.t((Activity) efrVar.b, new fhx(string, string2, new ygx(string3, new gbx(z50Var, l421Var)), new ygx(string4, new gbx(z50Var, new l421(i521Var, (byte) 1))), new l421(i521Var, (byte) 2), null, 80)), (byte) 3);
                        ijz0Var = j2v0Var;
                    } else {
                        i521Var.invoke(p521Var);
                        ijz0Var = ijz0.b1;
                    }
                } else if (activity.isFinishing() || activity.isDestroyed()) {
                    i521Var.invoke(p521Var);
                    ijz0Var = ijz0.c1;
                } else {
                    mw40 mw40VarT = yoi1.T(activity, string, string2);
                    mw40VarT.e = true;
                    mw40VarT.f = new vae((Object) i521Var, (byte) 8);
                    m421 m421Var = new m421(i521Var, (byte) 0);
                    mw40VarT.a = string3;
                    mw40VarT.c = m421Var;
                    m421 m421Var2 = new m421(i521Var, (byte) 1);
                    mw40VarT.b = string4;
                    mw40VarT.d = m421Var2;
                    pw40 pw40VarB = mw40VarT.b();
                    pw40VarB.b();
                    j2v0Var = new j2v0(xaeVar, pw40VarB, (byte) 3);
                    ijz0Var = j2v0Var;
                }
                ohdVar.n(new hii0(ijz0Var, (byte) 18));
                wqk0Var = r6h1Var != null ? new wqk0(r6h1Var, (byte) 21) : null;
                if (wqk0Var != null) {
                    wqk0Var.e();
                }
                Object objR = ohdVar.r();
                return objR == d9nVar ? d9nVar : objR;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                l2v0 l2v0Var = (l2v0) this.c;
                r6h1 r6h1Var2 = (r6h1) obj2;
                this.b = true;
                ohd ohdVar2 = new ohd(1, aym.t(this));
                ohdVar2.t();
                Context context = l2v0Var.b;
                ohdVar2.n(new k521(l2v0Var, r6h1Var2, l2v0Var.f(context.getString(2131961132), context.getString(2131961123), context.getString(2131961131), context.getString(2131961130), new l521(l2v0Var, (String) obj3, r6h1Var2, ohdVar2, (byte) 1), new m521(l2v0Var, r6h1Var2, ohdVar2, b2), new sdg(ohdVar2, (byte) 5)), b2));
                wqk0Var = r6h1Var2 != null ? new wqk0(r6h1Var2, (byte) 21) : null;
                if (wqk0Var != null) {
                    wqk0Var.e();
                }
                Object objR2 = ohdVar2.r();
                return objR2 == d9nVar ? d9nVar : objR2;
            case 4:
                String str = (String) this.c;
                x621 x621Var = (x621) obj2;
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        Set set = s4b1.f;
                        String strS = uic.x(str).s();
                        if (strS == null) {
                            throw new IllegalArgumentException("Invalid follower URI: " + str);
                        }
                        q8n q8nVar = x621Var.e;
                        w621 w621Var = new w621(x621Var, strS, (lnm) null, (byte) 0);
                        this.b = true;
                        objY = fn31.Y(q8nVar, w621Var, this);
                        if (objY == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objY = obj;
                    }
                    if (((sy21) objY).a.Q0) {
                        x621Var.a.k(new er91((fs91) null, x621Var.b.getString(2131961138, (String) obj3), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return m231Var4;
                    }
                    x621Var.b();
                    return m231Var4;
                } catch (Exception unused) {
                    x621Var.b();
                    return m231Var4;
                }
            case 5:
                vi11 vi11Var = (vi11) this.c;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    objO = vi11Var.O((String) obj2, (String) obj3, this);
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objO = obj;
                }
                er91 er91Var = new er91((fs91) null, (String) objO, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = (kt91) vi11Var.c;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                    return m231Var4;
                }
                kt91Var.o(er91Var);
                return m231Var4;
            case 6:
                k811 k811Var = (k811) obj2;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        String str2 = (String) obj3;
                        be beVar = ((buc) ((ynb0) k811Var.c).get()).c;
                        ipz ipzVarN = EsOfflinePlayableCache.RemoveTrackRequest.n();
                        ipzVarN.n(str2);
                        CompletableFromSingle completableFromSingleK = Completable.k(beVar.callSingle("spotify.offline_playable_cache_esperanto.proto.OfflinePlayableCache", "RemoveTrack", ipzVarN.build()).map(xi10.U0));
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableFromSingleK, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = m231Var4;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                er91 er91Var2 = new er91((fs91) null, ((dg30) k811Var.b).getString(!(m231Var instanceof m231) ? 2131959363 : 2131959361), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var2 = (kt91) k811Var.d;
                if (kt91Var2.g()) {
                    kt91Var2.k(er91Var2);
                    return m231Var4;
                }
                kt91Var2.o(er91Var2);
                return m231Var4;
            case 7:
                String str3 = (String) obj2;
                kl1 kl1Var = (kl1) this.c;
                kt91 kt91Var3 = (kt91) kl1Var.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                op31 op31Var = (op31) kl1Var.c;
                List listSingletonList = Collections.singletonList(str3);
                this.b = true;
                if (op31.a(op31Var, listSingletonList, this) == d9nVar) {
                    return d9nVar;
                }
                Context context2 = (Context) kl1Var.b;
                boolean z9 = kl1Var.a;
                if (z9) {
                    i = 2131953985;
                } else {
                    if (z9) {
                        eg.o();
                        return null;
                    }
                    i = 2131953986;
                }
                er91 er91Var3 = new er91((fs91) null, context2.getString(i), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (kt91Var3.g()) {
                    kt91Var3.k(er91Var3);
                } else {
                    kt91Var3.o(er91Var3);
                }
                if (!u890.j(str3, (String) obj3)) {
                    return m231Var4;
                }
                bwn0 bwn0VarC = oxu0.a.c(str3);
                if ((bwn0VarC instanceof bzu0 ? (bzu0) bwn0VarC : null) == null) {
                    return m231Var4;
                }
                ((lzn0) kl1Var.e).e();
                return m231Var4;
            case 8:
                boolean z10 = this.b;
                try {
                    if (z10) {
                        if (z10) {
                            hm5.M(obj);
                            objJ = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    String str4 = (String) obj3;
                    eny enyVar = (eny) ((e821) obj2).d;
                    Set set2 = s4b1.f;
                    Single singleA = enyVar.a(str4, uic.x(str4).c);
                    this.c = null;
                    this.b = true;
                    objJ = fc11.j(singleA, this);
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    m231Var2 = (String) objJ;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                if (!(m231Var2 instanceof m231)) {
                    return m231Var2;
                }
                return null;
            case 9:
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    this.b = true;
                    return ((bfd) ((e821) this.c).c).E((String) obj2, (String) obj3, this) == d9nVar ? d9nVar : m231Var4;
                }
                if (z11) {
                    hm5.M(obj);
                    return m231Var4;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        boolean z13 = ((j921) obj3).a;
                        this.b = true;
                        objB = ((gj10) ((hyy0) this.c).c).b((String) obj2, this, z13);
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objB = obj;
                    }
                    return (fru) objB;
                } catch (Exception e3) {
                    n57.s("error while creating a downgrade checkout " + e3);
                }
                break;
            case 11:
                String str5 = (String) obj3;
                xa21 xa21Var = (xa21) obj2;
                boolean z14 = this.b;
                try {
                    if (!z14) {
                        hm5.M(obj);
                        bfd bfdVar = xa21Var.b;
                        this.c = null;
                        this.b = true;
                        Object objE = bfdVar.b.a.e(str5, this);
                        if (objE != d9nVar) {
                            objE = m231Var4;
                        }
                        if (objE != d9nVar) {
                            objE = m231Var4;
                        }
                        if (objE == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z14) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var3 = m231Var4;
                    break;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th3) {
                    m231Var3 = new m231(th3);
                }
                if (e331.a(m231Var3) == null) {
                    xa21Var.d.a.l(yn30.a);
                    return m231Var4;
                }
                kt91 kt91Var4 = xa21Var.c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961174});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var4.k(new er91((fs91) null, "", 2131961174, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return m231Var4;
            case 12:
                String str6 = (String) obj3;
                s880 s880Var = (s880) obj2;
                za21 za21Var = (za21) this.c;
                boolean z15 = this.b;
                try {
                    if (!z15) {
                        hm5.M(obj);
                        za21Var.d();
                        bfd bfdVar2 = (bfd) s880Var.e;
                        this.b = true;
                        Object objE2 = bfdVar2.b.a.e(str6, this);
                        if (objE2 != d9nVar) {
                            objE2 = m231Var4;
                        }
                        if (objE2 != d9nVar) {
                            objE2 = m231Var4;
                        }
                        if (objE2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z15) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    za21Var.l(false);
                    return m231Var4;
                } catch (Exception unused2) {
                    op71.x(cto1.q((dg30) s880Var.f).b);
                    za21Var.h();
                    ((jjz) s880Var.d).a(new xiz(fjz.b, yiz.c, ajz.d), new d4v0(s880Var, str6, za21Var, (byte) 20), n521.g);
                    return m231Var4;
                }
            case 13:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    xyc0 xyc0Var = ((gc21) this.c).f;
                    String str7 = ((x4i1) obj2).b;
                    Integer num = new Integer(3500);
                    this.b = true;
                    objQ = xyc0Var.q((String) obj3, str7, (wls0) null, num, this);
                    if (objQ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objQ = obj;
                }
                ((py21) objQ).d();
                return m231Var4;
            case 14:
                ven0 ven0Var = (ven0) obj3;
                de21 de21Var = (de21) this.c;
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return m231Var4;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                long jF = Offset.f(((Offset) ((ven0) obj2).getValue()).a, ((Offset) de21Var.c.invoke()).a);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((int) (((yr80) ven0Var.getValue()).a & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (jF & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((((int) (((yr80) ven0Var.getValue()).a >> 32)) / 2.0f) + Float.intBitsToFloat((int) (jF >> 32)))) << 32);
                pe21 pe21Var = de21Var.a;
                Object obj4 = de21Var.b;
                this.b = true;
                return pe21Var.g(obj4, jFloatToRawIntBits, this) == d9nVar ? d9nVar : m231Var4;
            case 15:
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    this.b = true;
                    return ((jl21) this.c).d((String) obj2, (Map) obj3, this) == d9nVar ? d9nVar : m231Var4;
                }
                if (z18) {
                    hm5.M(obj);
                    return m231Var4;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                boolean z19 = this.b;
                try {
                    if (!z19) {
                        hm5.M(obj);
                        this.b = true;
                        objB2 = ((ti10) ((hyy0) this.c).c).b((String) obj2, (String) obj3, this);
                        if (objB2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z19) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objB2 = obj;
                    }
                    return new xv3((String) objB2);
                } catch (Exception e5) {
                    n57.s("Error requesting allocation feature: " + e5);
                    throw e5;
                }
            case 17:
                String str8 = (String) obj3;
                vr20 vr20Var = (vr20) this.c;
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return m231Var4;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ay8 ay8VarF = d3p1.F((d0r) ((uqv0) obj2).b, bu21.a, str8);
                this.c = null;
                this.b = true;
                u4p1.S(vr20Var);
                ay8VarF.collect(new ml21((vr20) new ru11(vr20Var, str8, (byte) 4), (byte) 4), this);
                return d9nVar;
            case 18:
                il71 il71Var = (il71) this.c;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    d821 d821Var = new d821(obj2, obj3, (lnm) wqk0Var, (byte) 11);
                    this.c = il71Var;
                    this.b = true;
                    objA = il71Var.a("resolve_entry_points", d821Var, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                tg71 tg71Var = (tg71) objA;
                il71Var.setAttribute("result", tg71Var instanceof eg71 ? "success" : "failure");
                return tg71Var;
            case 19:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    q431Var = ((z531) obj2).a.c;
                    if (q431Var != null) {
                        this.c = q431Var;
                        this.b = true;
                        objZ = ((k811) obj3).z(q431Var, this);
                        if (objZ == d9nVar) {
                            return d9nVar;
                        }
                        q431Var2 = q431Var;
                        if (((Boolean) objZ).booleanValue()) {
                            return q431Var2;
                        }
                    }
                } else if (z22) {
                    q431Var = (q431) this.c;
                    hm5.M(obj);
                    objZ = obj;
                    q431Var2 = q431Var;
                    if (((Boolean) objZ).booleanValue()) {
                        return q431Var2;
                    }
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 20:
                Set set3 = (Set) obj2;
                n631 n631Var = (n631) this.c;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return m231Var4;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jn7 jn7Var = n631Var.b;
                p831 p831VarP = ResumptionProgressEsperanto$GetResumePointRequest.p();
                p831VarP.n(set3);
                p831VarP.r(n631Var.c.c);
                p831VarP.s("resume_chapter");
                p831VarP.t();
                mr20 mr20VarCallStream = jn7Var.callStream("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "SubResumePoint", (ResumptionProgressEsperanto$GetResumePointRequest) p831VarP.build());
                tzy0 tzy0Var = new tzy0(set3, (iu30) obj3, n631Var);
                this.b = true;
                Object objCollect = mr20VarCallStream.collect(new ml21((vr20) tzy0Var, (byte) 7), this);
                if (objCollect != d9nVar) {
                    objCollect = m231Var4;
                }
                return objCollect == d9nVar ? d9nVar : m231Var4;
            case 21:
                hm5.M(obj);
                tv80 tv80Var = (tv80) obj2;
                ((ca31) obj3).c.f(new dwn0(((String) this.c) + "&startMuted=" + this.b, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null));
                return m231Var4;
            case 22:
                c9n c9nVar = (c9n) this.c;
                boolean z24 = this.b;
                try {
                    if (!z24) {
                        hm5.M(obj);
                        fns fnsVar = igu.a;
                        b3s b3sVar = b3s.c;
                        d821 d821Var2 = new d821(obj2, obj3, (lnm) wqk0Var, (byte) 14);
                        this.c = c9nVar;
                        this.b = true;
                        objY2 = fn31.Y(b3sVar, d821Var2, this);
                        if (objY2 == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z24) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objY2 = obj;
                    }
                    return (oi31) objY2;
                } catch (Exception unused3) {
                    smo1.t(c9nVar);
                }
                break;
            case 23:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    hj31 hj31Var = ((zj31) this.c).e;
                    this.b = true;
                    objA2 = hj31Var.a(true, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA2 = obj;
                }
                if (((Boolean) objA2).booleanValue()) {
                    ((ven0) obj2).setValue(Boolean.TRUE);
                    return m231Var4;
                }
                ((iu30) ((ven0) obj3).getValue()).invoke(new IllegalStateException("Rive initialization failed"));
                return m231Var4;
            case 24:
                return e(obj);
            case 25:
                return g(obj);
            case 26:
                return h(obj);
            case 27:
                return i(obj);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return j(obj);
            default:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj3;
                c9n c9nVar2 = (c9n) this.c;
                boolean z26 = this.b;
                try {
                    if (!z26) {
                        hm5.M(obj);
                        j0z0 j0z0Var = new j0z0(observableEmitter, (byte) 10);
                        this.c = c9nVar2;
                        this.b = true;
                        if (((mr20) obj2).collect(j0z0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z26) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    observableEmitter.onComplete();
                    return m231Var4;
                } catch (Throwable th4) {
                    if (th4 instanceof CancellationException) {
                        observableEmitter.onComplete();
                        return m231Var4;
                    }
                    if (observableEmitter.tryOnError(th4)) {
                        return m231Var4;
                    }
                    w0h1.u(th4, c9nVar2.J());
                    return m231Var4;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m311(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m311(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
