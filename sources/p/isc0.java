package p;

import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import spotify.playlist.esperanto.proto.PlaylistPlayRequest;
import spotify.playlist.esperanto.proto.PlaylistPlayResponse;
import spotify.playlist.esperanto.proto.PlaylistQuery;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class isc0 extends a8d1 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public String b;
    public String c;
    public boolean d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isc0(EsLoggingParams.LoggingParams loggingParams, String str, rsc0 rsc0Var, Map map, trc0 trc0Var, EsPlayOrigin.PlayOrigin playOrigin, EsPlayOptions.PlayOptions playOptions, EsPreparePlayOptions.PreparePlayOptions preparePlayOptions, ayc0 ayc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = loggingParams;
        this.c = str;
        this.g = rsc0Var;
        this.t = map;
        this.X = trc0Var;
        this.Y = playOrigin;
        this.Z = playOptions;
        this.N0 = preparePlayOptions;
        this.O0 = ayc0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.O0;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.t;
        switch (b) {
            case 0:
                isc0 isc0Var = new isc0((EsLoggingParams.LoggingParams) this.i, this.c, (rsc0) this.g, (Map) obj7, (trc0) obj6, (EsPlayOrigin.PlayOrigin) obj5, (EsPlayOptions.PlayOptions) obj4, (EsPreparePlayOptions.PreparePlayOptions) obj3, (ayc0) obj2, lnmVar);
                isc0Var.h = obj;
                return isc0Var;
            default:
                return new isc0((p410) obj7, (String) obj6, (String) obj5, (n6n0) obj4, (m6n0) obj3, (tv80) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        mwt0 mwt0Var;
        Object objV;
        String str;
        ly21 m231Var;
        boolean z;
        vgn0 vgn0Var;
        String str2;
        String str3;
        p410 p410Var;
        tv80 tv80Var;
        m6n0 m6n0Var;
        n6n0 n6n0Var;
        byte b = this.a;
        Object obj2 = this.O0;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.t;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                EsLoggingParams.LoggingParams loggingParams = (EsLoggingParams.LoggingParams) this.i;
                rsc0 rsc0Var = (rsc0) this.g;
                Optional optional = rsc0Var.i;
                c9n c9nVar = (c9n) this.h;
                boolean z2 = this.d;
                if (!z2) {
                    hm5.M(obj);
                    mwt0 mwt0Var2 = new mwt0((String) null, (String) o7h.s0(loggingParams.q()), this.c, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262137);
                    optional.ifPresent(new gsc0(mwt0Var2, (byte) 0));
                    String str4 = this.c;
                    Map map = (Map) obj7;
                    trc0 trc0Var = (trc0) obj6;
                    EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) obj5;
                    EsPlayOptions.PlayOptions playOptions = (EsPlayOptions.PlayOptions) obj4;
                    EsPreparePlayOptions.PreparePlayOptions preparePlayOptions = (EsPreparePlayOptions.PreparePlayOptions) obj3;
                    ayc0 ayc0Var = (ayc0) obj2;
                    try {
                        coz builder = loggingParams.toBuilder();
                        qpz qpzVarP = EsOptional.OptionalInt64.p();
                        qpzVarP.n(rsc0Var.a.b());
                        builder.t(qpzVarP);
                        EsLoggingParams.LoggingParams loggingParamsBuild = builder.build();
                        cmz cmzVarP = EsContext.Context.p();
                        cmzVarP.t(str4);
                        cmzVarP.q(map);
                        PlaylistQuery playlistQueryB = mlu0.b(rsc0Var.e.a(), trc0Var);
                        jn7 jn7Var = rsc0Var.g;
                        hqu0 hqu0VarN = PlaylistPlayRequest.n();
                        hqu0VarN.n(cmzVarP);
                        hqu0VarN.s(playOrigin);
                        hqu0VarN.r(playOptions);
                        hqu0VarN.t(playlistQueryB);
                        hqu0VarN.u(preparePlayOptions);
                        hqu0VarN.q(loggingParamsBuild);
                        if (ayc0Var != null) {
                            hqu0VarN.v(e9p1.n(ayc0Var, false));
                        }
                        PlaylistPlayRequest playlistPlayRequestBuild = hqu0VarN.build();
                        this.h = c9nVar;
                        this.e = mwt0Var2;
                        this.f = rsc0Var;
                        this.b = str4;
                        this.d = true;
                        objV = jn7Var.V(playlistPlayRequestBuild, this);
                        if (objV == d9nVar) {
                            return d9nVar;
                        }
                        str = str4;
                        mwt0Var = mwt0Var2;
                    } catch (Throwable th) {
                        th = th;
                        mwt0Var = mwt0Var2;
                        m231Var = new m231(th);
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.b;
                    rsc0Var = (rsc0) this.f;
                    mwt0Var = (mwt0) this.e;
                    try {
                        hm5.M(obj);
                        objV = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        m231Var = new m231(th);
                    }
                }
                ly21 ly21VarL = i2x0.l(((PlaylistPlayResponse) objV).n(), str, fnc0.e);
                if (ly21VarL instanceof ly21) {
                    rsc0Var.i.ifPresent(new hsc0(ly21VarL, mwt0Var, (byte) 0));
                    break;
                }
                m231Var = ly21VarL;
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    if ((thA instanceof CancellationException) || (((z = thA instanceof Exception)) && !smo1.u(c9nVar))) {
                        optional.ifPresent(new gsc0(mwt0Var, (byte) 1));
                    } else if (z) {
                        String simpleName = thA.getClass().getSimpleName();
                        if (simpleName.length() == 0) {
                            simpleName = thA.getClass().getName();
                        }
                        optional.ifPresent(new hsc0(simpleName, mwt0Var, (byte) 1));
                    }
                }
                hm5.M(m231Var);
                return m231Var;
            default:
                boolean z3 = this.d;
                if (!z3) {
                    hm5.M(obj);
                    p410 p410Var2 = (p410) obj7;
                    vgn0Var = (xgn0) p410Var2.h;
                    String str5 = (String) obj6;
                    String str6 = (String) obj5;
                    n6n0 n6n0Var2 = (n6n0) obj4;
                    m6n0 m6n0Var2 = (m6n0) obj3;
                    tv80 tv80Var2 = (tv80) obj2;
                    this.e = vgn0Var;
                    this.f = p410Var2;
                    this.b = str5;
                    this.c = str6;
                    this.g = n6n0Var2;
                    this.h = m6n0Var2;
                    this.i = tv80Var2;
                    this.d = true;
                    if (vgn0Var.a(this) == d9nVar) {
                        return d9nVar;
                    }
                    str2 = str6;
                    str3 = str5;
                    p410Var = p410Var2;
                    tv80Var = tv80Var2;
                    m6n0Var = m6n0Var2;
                    n6n0Var = n6n0Var2;
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tv80Var = (tv80) this.i;
                    m6n0Var = (m6n0) this.h;
                    n6n0Var = (n6n0) this.g;
                    String str7 = this.c;
                    String str8 = this.b;
                    p410Var = (p410) this.f;
                    vgn0 vgn0Var2 = (xgn0) this.e;
                    hm5.M(obj);
                    vgn0Var = vgn0Var2;
                    str2 = str7;
                    str3 = str8;
                }
                try {
                    bpb1 bpb1Var = (bpb1) p410Var.f;
                    bpb1 bpb1Var2 = (bpb1) p410Var.e;
                    zau0 zau0Var = (zau0) p410Var.g;
                    bpb1Var.l(str3);
                    if (!((Boolean) zau0Var.b.getValue()).booleanValue()) {
                        ((ttm0) p410Var.b).a(zau0Var);
                        bpb1Var2.l(q3p1.r(zau0Var, (r091) bpb1Var2.getValue()));
                    }
                    r091 r091Var = (r091) bpb1Var2.getValue();
                    if (r091Var != null) {
                        ebp1.s(r091Var, new lsm0(str2, new ksm0(new gec1("9be001cc41b7413a9f3264187664885e"), str3, (String) null, n6n0Var.a, str3, (String) null, 484), false, false, m6n0Var != null ? new jsm0(new Long(m6n0Var.a), new Long(m6n0Var.b)) : null, 0L, (ism0) null, (String) null, false, 0, 2028), tv80Var, (yjp1) p410Var.d, 12);
                        r091Var.k();
                        break;
                    }
                    return rih1.a;
                } finally {
                    vgn0Var.c((Object) null);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isc0(p410 p410Var, String str, String str2, n6n0 n6n0Var, m6n0 m6n0Var, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = p410Var;
        this.X = str;
        this.Y = str2;
        this.Z = n6n0Var;
        this.N0 = m6n0Var;
        this.O0 = tv80Var;
    }
}
