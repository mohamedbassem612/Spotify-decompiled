package p;

import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vr0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(szc0 szc0Var, sst0 sst0Var, trc0 trc0Var, EsPreparePlayOptions.PreparePlayOptions preparePlayOptions, EsPlayOrigin.PlayOrigin playOrigin, EsLoggingParams.LoggingParams loggingParams, lnm lnmVar) {
        super(3, lnmVar);
        this.d = szc0Var;
        this.e = sst0Var;
        this.f = trc0Var;
        this.g = preparePlayOptions;
        this.h = playOrigin;
        this.i = loggingParams;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                vr0 vr0Var = new vr0((lnm) obj3, (yr0) obj6, (dg30) obj5, (kly0) obj4);
                vr0Var.d = (vr20) obj;
                vr0Var.e = obj2;
                return vr0Var.invokeSuspend(rih1Var);
            case 1:
                vr0 vr0Var2 = new vr0((Integer) this.e, (Integer) obj6, (l811) obj5, (qxc0) obj4, (iev0) this.i, (lnm) obj3);
                vr0Var2.c = (vr20) obj;
                vr0Var2.d = (k1r) obj2;
                return vr0Var2.invokeSuspend(rih1Var);
            default:
                vr0 vr0Var3 = new vr0((szc0) this.d, (sst0) this.e, (trc0) obj6, (EsPreparePlayOptions.PreparePlayOptions) obj5, (EsPlayOrigin.PlayOrigin) obj4, (EsLoggingParams.LoggingParams) this.i, (lnm) obj3);
                vr0Var3.c = (x610) obj;
                return vr0Var3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cb  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x009f, please report this as an issue */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        pr0 pr0Var;
        sr0 huzVar;
        b7x b7xVar;
        Object objB2;
        ly21 ly21Var;
        String str;
        ou80 ou80Var;
        Single singleF;
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                yr0 yr0Var = (yr0) obj4;
                vr20 vr20Var = (vr20) this.d;
                Object obj5 = this.e;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        pr0 pr0Var2 = (pr0) this.i;
                        vr20 vr20Var2 = (vr20) this.c;
                        hm5.M(obj);
                        pr0Var = pr0Var2;
                        vr20Var = vr20Var2;
                        objB = obj;
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1.a;
                }
                hm5.M(obj);
                pr0 pr0Var3 = (pr0) obj5;
                if (pr0Var3.b) {
                    String str2 = pr0Var3.c;
                    this.d = null;
                    this.e = null;
                    this.c = vr20Var;
                    this.i = pr0Var3;
                    this.b = (byte) 1;
                    objB = yr0Var.b(str2, this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                    pr0Var = pr0Var3;
                } else {
                    huzVar = new huz((Object) null, (byte) 10);
                }
                this.d = null;
                this.e = null;
                this.c = null;
                this.i = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var, huzVar, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
                huzVar = new sr0(rqt0.u(new xr0(d5p1.h(((f0i) ((dg30) obj3)).a.j), (byte) 0)), (kly0) obj2, pr0Var, (wb10) objB, (byte) 0);
                this.d = null;
                this.e = null;
                this.c = null;
                this.i = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var, huzVar, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
            case 1:
                l811 l811Var = (l811) obj3;
                Integer num = (Integer) this.e;
                Integer num2 = (Integer) obj4;
                vr20 vr20Var3 = (vr20) this.c;
                h1r h1rVar = (k1r) this.d;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1 || b3 == 2 || b3 == 3) {
                        hm5.M(obj);
                        return Boolean.valueOf(!l811Var.a);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (h1rVar instanceof j1r) {
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 1;
                    if (vr20Var3.emit(rev0.a, this) == d9nVar) {
                        return d9nVar;
                    }
                } else if (h1rVar instanceof h1r) {
                    pev0 pev0Var = new pev0(h1rVar.a);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    if (vr20Var3.emit(pev0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!(h1rVar instanceof i1r)) {
                        eg.o();
                        return null;
                    }
                    List list = (List) ((i1r) h1rVar).a;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((pvc0) it.next()).c);
                    }
                    List listJ0 = o7h.j0(arrayList);
                    if (num == null || num2 == null || listJ0.size() >= num2.intValue() || list.size() < num.intValue()) {
                        if (num2 != null) {
                            listJ0 = o7h.d1(listJ0, num2.intValue());
                        }
                        qxc0 qxc0Var = (qxc0) obj2;
                        qev0 qev0Var = new qev0(new bev0(listJ0, qxc0Var.Z, qxc0Var.S0, qxc0Var.Y, (iev0) this.i));
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 3;
                        if (vr20Var3.emit(qev0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        l811Var.a = true;
                    }
                }
                return Boolean.valueOf(!l811Var.a);
            default:
                sst0 sst0Var = (sst0) this.e;
                szc0 szc0Var = (szc0) this.d;
                x610 x610Var = (x610) this.c;
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1) {
                        hm5.M(obj);
                    } else if (b4 == 2) {
                        hm5.M(obj);
                        xrc0 xrc0Var = szc0Var.a;
                        String str3 = sst0Var.a;
                        trc0 trc0Var = (trc0) obj4;
                        EsPreparePlayOptions.PreparePlayOptions preparePlayOptions = (EsPreparePlayOptions.PreparePlayOptions) obj3;
                        EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) obj2;
                        b7xVar = sst0Var.h;
                        if (b7xVar == null) {
                            b7xVar = b7x.a;
                        }
                        EsLoggingParams.LoggingParams loggingParams = (EsLoggingParams.LoggingParams) this.i;
                        this.c = null;
                        this.b = (byte) 3;
                        objB2 = xrc0.b(xrc0Var, str3, trc0Var, preparePlayOptions, playOrigin, (EsPlayOptions.PlayOptions) null, b7xVar, loggingParams, (ayc0) null, this, 144);
                        if (objB2 == d9nVar) {
                            return d9nVar;
                        }
                        ly21Var = (py21) objB2;
                        if (ly21Var instanceof ly21) {
                            jzq jzqVar = kzq.Companion;
                            String str4 = "listEndpoint.play rejected by backend: " + ly21Var.a;
                            jzqVar.getClass();
                            return jzq.a(str4);
                        }
                        g510 g510Var = szc0Var.d;
                        m210 m210Var = SpotifyWearableListenerService.T0;
                        String str5 = sst0Var.a;
                        str = sst0Var.f;
                        if (str != null) {
                            ou80Var = new ou80(str);
                        } else {
                            ou80Var = null;
                        }
                        singleF = g510.f(g510Var, m210Var, str5, (w7h1) null, ou80Var, 20);
                        this.c = null;
                        this.b = (byte) 4;
                        if (fc11.j(singleF, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else if (b4 == 3) {
                        hm5.M(obj);
                        objB2 = obj;
                        ly21Var = (py21) objB2;
                        if (ly21Var instanceof ly21) {
                            jzq jzqVar2 = kzq.Companion;
                            String str6 = "listEndpoint.play rejected by backend: " + ly21Var.a;
                            jzqVar2.getClass();
                            return jzq.a(str6);
                        }
                        g510 g510Var2 = szc0Var.d;
                        m210 m210Var2 = SpotifyWearableListenerService.T0;
                        String str7 = sst0Var.a;
                        str = sst0Var.f;
                        if (str != null) {
                            ou80Var = new ou80(str);
                        } else {
                            ou80Var = null;
                        }
                        singleF = g510.f(g510Var2, m210Var2, str7, (w7h1) null, ou80Var, 20);
                        this.c = null;
                        this.b = (byte) 4;
                        if (fc11.j(singleF, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (b4 != 4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    kzq.Companion.getClass();
                    return jzq.b();
                }
                hm5.M(obj);
                String str8 = sst0Var.f;
                this.c = null;
                this.b = (byte) 1;
                int i = szc0.h;
                if (szc0Var.a(x610Var, str8, this) == d9nVar) {
                    return d9nVar;
                }
                String str9 = sst0Var.a;
                Boolean bool = sst0Var.k;
                this.c = null;
                this.b = (byte) 2;
                int i2 = szc0.h;
                if (szc0Var.b(str9, bool, this) == d9nVar) {
                    return d9nVar;
                }
                xrc0 xrc0Var2 = szc0Var.a;
                String str10 = sst0Var.a;
                trc0 trc0Var2 = (trc0) obj4;
                EsPreparePlayOptions.PreparePlayOptions preparePlayOptions2 = (EsPreparePlayOptions.PreparePlayOptions) obj3;
                EsPlayOrigin.PlayOrigin playOrigin2 = (EsPlayOrigin.PlayOrigin) obj2;
                b7xVar = sst0Var.h;
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                EsLoggingParams.LoggingParams loggingParams2 = (EsLoggingParams.LoggingParams) this.i;
                this.c = null;
                this.b = (byte) 3;
                objB2 = xrc0.b(xrc0Var2, str10, trc0Var2, preparePlayOptions2, playOrigin2, (EsPlayOptions.PlayOptions) null, b7xVar, loggingParams2, (ayc0) null, this, 144);
                if (objB2 == d9nVar) {
                    return d9nVar;
                }
                ly21Var = (py21) objB2;
                if (ly21Var instanceof ly21) {
                    jzq jzqVar3 = kzq.Companion;
                    String str11 = "listEndpoint.play rejected by backend: " + ly21Var.a;
                    jzqVar3.getClass();
                    return jzq.a(str11);
                }
                g510 g510Var3 = szc0Var.d;
                m210 m210Var3 = SpotifyWearableListenerService.T0;
                String str12 = sst0Var.a;
                str = sst0Var.f;
                if (str != null) {
                    ou80Var = new ou80(str);
                } else {
                    ou80Var = null;
                }
                singleF = g510.f(g510Var3, m210Var3, str12, (w7h1) null, ou80Var, 20);
                this.c = null;
                this.b = (byte) 4;
                if (fc11.j(singleF, this) == d9nVar) {
                    return d9nVar;
                }
                kzq.Companion.getClass();
                return jzq.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(lnm lnmVar, yr0 yr0Var, dg30 dg30Var, kly0 kly0Var) {
        super(3, lnmVar);
        this.f = yr0Var;
        this.g = dg30Var;
        this.h = kly0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(Integer num, Integer num2, l811 l811Var, qxc0 qxc0Var, iev0 iev0Var, lnm lnmVar) {
        super(3, lnmVar);
        this.e = num;
        this.f = num2;
        this.g = l811Var;
        this.h = qxc0Var;
        this.i = iev0Var;
    }
}
