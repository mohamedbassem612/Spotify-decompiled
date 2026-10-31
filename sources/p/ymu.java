package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.offline_esperanto.proto.EsOffline$EstimateMusicVideoDownloadSizeRequest;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ymu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymu(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new ymu((zmu) this.c, (u0y) obj2, lnmVar, (byte) 0);
            case 1:
                return new ymu((fnu) this.c, (iu30) obj2, lnmVar, (byte) 1);
            case 2:
                return new ymu((cs91) this.c, (String) obj2, lnmVar, (byte) 2);
            case 3:
                return new ymu((kou) this.c, (u0y) obj2, lnmVar, (byte) 3);
            case 4:
                return new ymu((zeu) this.c, (ou80) obj2, lnmVar, (byte) 4);
            case 5:
                return new ymu((suu) this.c, (mxr) obj2, lnmVar, (byte) 5);
            case 6:
                return new ymu((nsu) this.c, (bsu) obj2, lnmVar, (byte) 6);
            case 7:
                return new ymu((zeu) this.c, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new ymu((x1v) this.c, (String) obj2, lnmVar, (byte) 8);
            case 9:
                return new ymu((u8v) this.c, (String) obj2, lnmVar, (byte) 9);
            case 10:
                return new ymu((hdv) this.c, (ven0) obj2, lnmVar, (byte) 10);
            case 11:
                return new ymu((jiv) this.c, (kx5) obj2, lnmVar, (byte) 11);
            case 12:
                return new ymu((jut) this.c, (String) obj2, lnmVar, (byte) 12);
            case 13:
                ymu ymuVar = new ymu((d0r) obj2, lnmVar, (byte) 13);
                ymuVar.c = obj;
                return ymuVar;
            case 14:
                return new ymu((m3w) this.c, (k6a1) obj2, lnmVar, (byte) 14);
            case 15:
                ymu ymuVar2 = new ymu((t3w) obj2, lnmVar, (byte) 15);
                ymuVar2.c = obj;
                return ymuVar2;
            case 16:
                return new ymu((ezw) this.c, (hj0) obj2, lnmVar, (byte) 16);
            case 17:
                ymu ymuVar3 = new ymu((k6y) obj2, lnmVar, (byte) 17);
                ymuVar3.c = obj;
                return ymuVar3;
            case 18:
                return new ymu((xvo) this.c, (ofb) obj2, lnmVar, (byte) 18);
            case 19:
                return new ymu((zeu) this.c, (String) obj2, lnmVar, (byte) 19);
            case 20:
                return new ymu((fmy) this.c, (emy) obj2, lnmVar, (byte) 20);
            case 21:
                return new ymu((eny) this.c, (String) obj2, lnmVar, (byte) 21);
            case 22:
                ymu ymuVar4 = new ymu((kuy) obj2, lnmVar, (byte) 22);
                ymuVar4.c = obj;
                return ymuVar4;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new ymu((kuy) this.c, (String) obj2, lnmVar, (byte) 23);
            case 24:
                return new ymu((lgy) this.c, (ccz) obj2, lnmVar, (byte) 24);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ymu ymuVar5 = new ymu((itz) obj2, lnmVar, (byte) 25);
                ymuVar5.c = obj;
                return ymuVar5;
            case 26:
                ymu ymuVar6 = new ymu((iuz) obj2, lnmVar, (byte) 26);
                ymuVar6.c = obj;
                return ymuVar6;
            case 27:
                ymu ymuVar7 = new ymu((vpp0) obj2, lnmVar, (byte) 27);
                ymuVar7.c = obj;
                return ymuVar7;
            case 28:
                return new ymu((pk00) this.c, (ttm0) obj2, lnmVar, (byte) 28);
            default:
                return new ymu((wr00) this.c, (String) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
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
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((g6y) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((a480) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((Set) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        Object objI;
        Object objF;
        Object objC;
        String m231Var;
        Object objE;
        Object objE2;
        switch (this.a) {
            case 0:
                zmu zmuVar = (zmu) this.c;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    Flowable flowable = zmuVar.a;
                    vbm[] vbmVarArr = q601.a;
                    mr20 mr20VarU = rqt0.u(new otf(rqt0.t(new pzs(new xy0(new kge(flowable), (byte) 19), zmuVar, (byte) 9), qlt.U0), (byte) 1));
                    vi viVar = new vi((u0y) this.d, (byte) 5);
                    this.b = true;
                    if (mr20VarU.collect(viVar, this) == d9nVar) {
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
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    m441 m441Var = new m441(new d7i0(((fnu) this.c).n, (lnm) null, (byte) 12));
                    this.b = true;
                    objI = b5p1.i(m441Var, this);
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
                grj0 grj0Var = (grj0) objI;
                wnu wnuVar = (wnu) ((fnu) this.c).q.getValue();
                synchronized (wnuVar) {
                    if (!((Boolean) wnuVar.b.getValue()).booleanValue()) {
                        Logger.k("Received mic permission result without a pending request", new Object[0]);
                        return rih1.a;
                    }
                    bpb1 bpb1Var = wnuVar.b;
                    Boolean bool = Boolean.FALSE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                    boolean z3 = grj0Var.a;
                    iu30 iu30Var = (iu30) this.d;
                    if (z3) {
                        iu30Var.invoke(et81.a);
                    } else {
                        iu30Var.invoke(new dt81(((fnu) this.c).f.a() == 1));
                    }
                    return rih1.a;
                }
            case 2:
                hr91 hr91Var = hr91.a;
                d9n d9nVar3 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    cs91 cs91Var = (cs91) this.c;
                    String str = (String) this.d;
                    this.b = true;
                    if (cs91Var.a(str, hr91Var, this) == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 3:
                d9n d9nVar4 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    Flowable flowable2 = ((kou) this.c).a;
                    vbm[] vbmVarArr2 = q601.a;
                    mr20 mr20VarU2 = rqt0.u(new xy0(new kge(flowable2), (byte) 22));
                    skr skrVar = new skr((u0y) this.d, (byte) 20);
                    this.b = true;
                    if (mr20VarU2.collect(skrVar, this) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 4:
                zeu zeuVar = (zeu) this.c;
                d9n d9nVar5 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    bpb1 bpb1Var2 = (wen0) zeuVar.b;
                    a090 a090Var = a090.a;
                    bpb1 bpb1Var3 = bpb1Var2;
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, a090Var);
                    Completable completableA = ((h1y) zeuVar.a).a(new f1y(new rzx("your-dj"), (ou80) this.d, null));
                    this.b = true;
                    if (fc11.i(completableA, this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 5:
                d9n d9nVar6 = d9n.a;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        this.b = true;
                        hap1.f(this);
                        return d9nVar6;
                    }
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    ((suu) this.c).f.a();
                    Disposable disposable = (Disposable) ((mxr) ((mxr) this.d).d).d;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    throw th;
                }
            case 6:
                d9n d9nVar7 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    f1n0 f1n0Var = ((nsu) this.c).a;
                    dwn0 dwn0Var = new dwn0(((bsu) this.d).a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                    this.b = true;
                    if (f1n0.d(f1n0Var, dwn0Var, this) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                d9n d9nVar8 = d9n.a;
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
                zeu zeuVar2 = (zeu) this.c;
                String str2 = (String) this.d;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                pbh0 pbh0Var = new pbh0((Activity) zeuVar2.a, 0);
                pbh0Var.f(2131959985);
                pbh0Var.b(2131959982);
                pbh0 pbh0VarD = pbh0Var.c(2131959983, new ln5(zeuVar2, ohdVar, (byte) 11)).d(2131959984, new j7b(zeuVar2, str2, ohdVar, (byte) 2));
                ((uh3) pbh0VarD).a.m = new mn5(zeuVar2, ohdVar, (byte) 10);
                vh3 vh3VarCreate = pbh0VarD.create();
                ohdVar.n(new n2u(vh3VarCreate, (byte) 1));
                vh3VarCreate.show();
                Object objR = ohdVar.r();
                return objR == d9nVar8 ? d9nVar8 : objR;
            case 8:
                Serializable serializable = d9n.a;
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
                x1v x1vVar = (x1v) this.c;
                String str3 = (String) this.d;
                this.b = true;
                Serializable serializableA = x1vVar.a(str3, this);
                return serializableA == serializable ? serializable : serializableA;
            case 9:
                d9n d9nVar9 = d9n.a;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                u8v u8vVar = (u8v) this.c;
                String str4 = (String) this.d;
                this.b = true;
                Object objB = u8vVar.b(str4, this);
                return objB == d9nVar9 ? d9nVar9 : objB;
            case 10:
                d9n d9nVar10 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    mr20 mr20Var = ((hdv) this.c).c;
                    mp0 mp0Var = new mp0((ven0) this.d, (byte) 5);
                    this.b = true;
                    if (mr20Var.collect(mp0Var, this) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 11:
                d9n d9nVar11 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    Context context = ((jiv) this.c).a;
                    kx5 kx5Var = (kx5) this.d;
                    afv afvVar = new afv(2, (lnm) null, (byte) 1);
                    this.b = true;
                    if (y7y0.S(context, kx5Var, afvVar, this) == d9nVar11) {
                        return d9nVar11;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 12:
                d9n d9nVar12 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    rsc0 rsc0Var = (xrc0) ((jut) this.c).b;
                    String str5 = (String) this.d;
                    trc0 trc0Var = new trc0(vjv.a, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                    this.b = true;
                    objF = rsc0Var.f(str5, trc0Var, this);
                    if (objF == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = obj;
                }
                return ((py21) objF).d();
            case 13:
                d0r d0rVar = (d0r) this.d;
                ssw0 ssw0Var = (ssw0) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    ckv ckvVar = new ckv(ssw0Var, d0rVar, (byte) 1);
                    d0rVar.a(ckvVar);
                    if (!ssw0Var.K()) {
                        ssw0Var.l(don1.o(d0rVar.j()));
                    }
                    f2t f2tVar = new f2t(d0rVar, ckvVar, (byte) 19);
                    this.c = null;
                    this.b = true;
                    if (jch0.s(ssw0Var, f2tVar, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 14:
                d9n d9nVar14 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    if (((m3w) this.c).d == ke81.a) {
                        this.b = true;
                        if (hap1.i(100L, this) == d9nVar14) {
                            return d9nVar14;
                        }
                    }
                    return rih1.a;
                }
                if (!z16) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                b6t b6tVar = (k6a1) this.d;
                if (b6tVar != null) {
                    b6tVar.b();
                }
                return rih1.a;
            case 15:
                String str6 = (String) this.c;
                d9n d9nVar15 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    t3w t3wVar = (t3w) this.d;
                    ezb1 ezb1Var = t3wVar.f;
                    String str7 = t3wVar.a.a;
                    this.c = null;
                    this.b = true;
                    objC = ezb1Var.c(str6, str7, this);
                    if (objC == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objC = obj;
                }
                Iterable iterable = (Iterable) objC;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vg80) it.next()).a);
                }
                return arrayList;
            case 16:
                d9n d9nVar16 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    CompletableCreate completableCreateO = ((gw70) ((ezw) this.c).c).f(((hj0) this.d).b).o();
                    this.b = true;
                    if (fc11.i(completableCreateO, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 17:
                g6y g6yVar = (g6y) this.c;
                d9n d9nVar17 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    f7y f7yVar = ((k6y) this.d).d;
                    ro8 ro8Var = new ro8(g6yVar, (lnm) null, (byte) 10);
                    this.c = null;
                    this.b = true;
                    if (f7yVar.f(ro8Var, this) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 18:
                d9n d9nVar18 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    mr20 mr20VarU3 = rqt0.u(yoi1.g(((xvo) this.c).a(true)));
                    skr skrVar2 = new skr((ofb) this.d, (byte) 24);
                    this.b = true;
                    if (mr20VarU3.collect(skrVar2, this) == d9nVar18) {
                        return d9nVar18;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                d9n d9nVar19 = d9n.a;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zeu zeuVar3 = (zeu) this.c;
                rsc0 rsc0Var2 = (xrc0) zeuVar3.a;
                String str8 = (String) this.d;
                trc0 trc0Var2 = new trc0((PlaylistRequestDecorationPolicy) zeuVar3.c, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                this.b = true;
                Object objF2 = rsc0Var2.f(str8, trc0Var2, this);
                return objF2 == d9nVar19 ? d9nVar19 : objF2;
            case 20:
                d9n d9nVar20 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    w390 w390Var = ((fmy) this.c).e;
                    r6h1 r6h1Var = r6h1.c;
                    w8n w8nVarA = w390Var.a();
                    this.b = true;
                    if (w8nVarA.a(this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 21:
                d9n d9nVar21 = d9n.a;
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var3 = ((eny) this.c).a;
                rxc0 rxc0Var = new rxc0((String) this.d);
                this.b = true;
                Object objJ = rsc0Var3.j(rxc0Var, this);
                return objJ == d9nVar21 ? d9nVar21 : objJ;
            case 22:
                String str9 = (String) this.c;
                d9n d9nVar22 = d9n.a;
                boolean z24 = this.b;
                try {
                    if (!z24) {
                        hm5.M(obj);
                        uvy uvyVar = (uvy) ((kuy) this.d).h;
                        str9.getClass();
                        this.c = str9;
                        this.b = true;
                        objE = uvyVar.e(str9, this, true);
                        if (objE == d9nVar22) {
                            return d9nVar22;
                        }
                    } else {
                        if (!z24) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objE = obj;
                    }
                    m231Var = ((nvy) objE).b;
                    break;
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                return new guy(str9, m231Var instanceof m231 ? null : m231Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                fuy fuyVar = fuy.a;
                String str10 = (String) this.d;
                d9n d9nVar23 = d9n.a;
                boolean z25 = this.b;
                try {
                    if (!z25) {
                        hm5.M(obj);
                        uvy uvyVar2 = (uvy) ((kuy) this.c).h;
                        str10.getClass();
                        this.b = true;
                        objE2 = uvyVar2.e(str10, this, true);
                        if (objE2 == d9nVar23) {
                            return d9nVar23;
                        }
                    } else {
                        if (!z25) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objE2 = obj;
                    }
                    nvy nvyVar = (nvy) objE2;
                    if (nvyVar.a.size() >= 2) {
                        return new guy(str10, nvyVar.b);
                    }
                } catch (Exception unused) {
                }
                return fuyVar;
            case 24:
                d9n d9nVar24 = d9n.a;
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lgy lgyVar = (lgy) this.c;
                jo70 jo70Var = ((ccz) this.d).b;
                this.b = true;
                Object objZ = lgyVar.Z(jo70Var, this);
                return objZ == d9nVar24 ? d9nVar24 : objZ;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                rih1 rih1Var = rih1.a;
                vr20 vr20Var = (vr20) this.c;
                d9n d9nVar25 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    mr20 mr20VarCallStream = ((ua6) ((itz) this.d).a.get()).callStream("spotify.connect.discovery.cast.esperanto.proto.ArtisanalCastGroupControlService", "Subscribe", Empty.n());
                    this.c = null;
                    this.b = true;
                    u4p1.S(vr20Var);
                    Object objCollect = mr20VarCallStream.collect(new tv5(vr20Var, (byte) 5), this);
                    if (objCollect != d9nVar25) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar25) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 26:
                a480 a480Var = (a480) this.c;
                d9n d9nVar26 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    dt71 dt71Var = ((iuz) this.d).c;
                    this.c = null;
                    this.b = true;
                    if (dt71Var.emit(a480Var, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 27:
                Set set = (Set) this.c;
                d9n d9nVar27 = d9n.a;
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                voz vozVarO = EsOffline$EstimateMusicVideoDownloadSizeRequest.o();
                vozVarO.n(set);
                EsOffline$EstimateMusicVideoDownloadSizeRequest esOffline$EstimateMusicVideoDownloadSizeRequest = (EsOffline$EstimateMusicVideoDownloadSizeRequest) vozVarO.build();
                vpp0 vpp0Var = (vpp0) this.d;
                esOffline$EstimateMusicVideoDownloadSizeRequest.getClass();
                Single map = vpp0Var.callSingle("spotify.offline_esperanto.proto.Offline", "EstimateMusicVideoDownloadSize", esOffline$EstimateMusicVideoDownloadSizeRequest).map(ws10.U0);
                this.c = null;
                this.b = true;
                Object objJ2 = fc11.j(map, this);
                return objJ2 == d9nVar27 ? d9nVar27 : objJ2;
            case 28:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar28 = d9n.a;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pk00 pk00Var = (pk00) this.c;
                dt71 dt71Var2 = pk00Var.a.b;
                u5z u5zVar = new u5z(pk00Var, (ttm0) this.d, (byte) 6);
                this.b = true;
                dt71Var2.collect(new l6z(u5zVar, (byte) 22), this);
                return d9nVar28;
            default:
                rih1 rih1Var3 = rih1.a;
                wr00 wr00Var = (wr00) this.c;
                d9n d9nVar29 = d9n.a;
                boolean z31 = this.b;
                if (!z31) {
                    hm5.M(obj);
                    x8c0 lifecycle = wr00Var.a.getLifecycle();
                    if (lifecycle.b().a(w8c0.e)) {
                        lifecycle.a(wr00Var.d);
                        w8n w8nVar = (w8n) wr00Var.b.get();
                        this.b = true;
                        if (w8nVar.a(this) == d9nVar29) {
                            return d9nVar29;
                        }
                    }
                } else {
                    if (!z31) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymu(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }
}
