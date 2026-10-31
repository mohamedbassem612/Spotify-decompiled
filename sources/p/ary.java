package p;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsPlayOptions;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.proto.PermissionGrantDescription;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Pattern;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ary extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(yz90 yz90Var, EsPlayOrigin.PlayOrigin playOrigin, EsLoggingParams.LoggingParams loggingParams, EsPreparePlayOptions.PreparePlayOptions preparePlayOptions, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.e = yz90Var;
        this.f = playOrigin;
        this.g = loggingParams;
        this.d = preparePlayOptions;
        this.c = str;
    }

    private final Object e(Object obj) throws Throwable {
        String str;
        Object objA;
        yn71 m231Var;
        String str2;
        qmp0 qmp0Var = (qmp0) this.e;
        smp0 smp0Var = (smp0) this.d;
        omp0 omp0Var = (omp0) this.f;
        iu30 iu30Var = (iu30) this.g;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        pmp0 pmp0Var = pmp0.c;
        if (!z) {
            hm5.M(obj);
            if (qmp0Var.d == pmp0.b && qmp0Var.b == null) {
                Set set = s4b1.f;
                String strZ = uic.C(omp0Var.a, null).z();
                if (strZ == null) {
                    iu30Var.invoke(qmp0.a(qmp0Var, null, pmp0Var, 7));
                    return rih1Var;
                }
                try {
                    bo71 bo71Var = (bo71) smp0Var.c;
                    Map mapJ = sqg0.J(new mmr0[]{new mmr0("feature", "campfire_invite"), new mmr0("new_message_invite", LocalFilesProperties$TestHelper.TRUE), new mmr0("friend_request", LocalFilesProperties$TestHelper.TRUE), new mmr0("locale", omp0Var.d)});
                    a571 a571Var = a571.d;
                    go71 go71Var = new go71(strZ, (String) null, (cqi1) null, mapJ, "qr-code", 38);
                    this.c = strZ;
                    this.b = true;
                    objA = bo71Var.a(go71Var, this);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    str = strZ;
                } catch (Throwable th) {
                    th = th;
                    str = strZ;
                    m231Var = new m231(th);
                }
            }
            return rih1Var;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) this.c;
        try {
            hm5.M(obj);
            objA = obj;
        } catch (Throwable th2) {
            th = th2;
            m231Var = new m231(th);
        }
        m231Var = (yn71) objA;
        String str3 = str;
        Throwable thA = e331.a(m231Var);
        if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (m231Var instanceof m231) {
            str2 = null;
        } else {
            yn71 yn71Var = m231Var;
            m771 m771Var = (m771) smp0Var.d;
            a571 a571Var2 = a571.d;
            m771.b(m771Var, str3, "qr-code", "link", yn71Var.b, (String) null, yn71Var.a, yn71Var.d, (String) null, (String) null, str3, "profile", "friend-invite-qr", (String) null, 4496);
            str2 = null;
            iu30Var.invoke(qmp0.a(qmp0Var, yn71Var.a, null, 13));
        }
        if (e331.a(m231Var) != null) {
            iu30Var.invoke(qmp0.a(qmp0Var, str2, pmp0Var, 7));
        }
        return rih1Var;
    }

    private final Object g(Object obj) throws Throwable {
        ArrayList arrayList;
        c9n c9nVar = (c9n) this.f;
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            j1v0 j1v0Var = (j1v0) this.c;
            ArrayList arrayList2 = j1v0Var.f;
            Object obj2 = this.g;
            vhc1 vhc1Var = (vhc1) obj2;
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((rzq) j1v0Var.c.d).c(((zqw) ((s1v0) it.next()).b).c().b().a(vhc1Var)));
            }
            try {
                ven0 ven0Var = (ven0) this.d;
                j1v0 j1v0Var2 = (j1v0) this.c;
                vhc1 vhc1Var2 = (vhc1) obj2;
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new elu0((c0r) it2.next(), ven0Var, j1v0Var2, vhc1Var2, (lnm) null, (byte) 2), 3);
                }
                this.f = null;
                this.e = arrayList3;
                this.b = true;
                hap1.f(this);
                return d9nVar;
            } catch (Throwable th) {
                th = th;
                arrayList = arrayList3;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.e;
            try {
                hm5.M(obj);
                throw new KotlinNothingValueException();
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((c0r) it3.next()).dispose();
        }
        throw th;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new ary((byte) 0, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 1:
                return new ary((byte) 1, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 2:
                return new ary(this.b, (jr30) this.e, (rcz) this.f, (ven0) this.c, (ven0) obj3, (ven0) obj2, lnmVar);
            case 3:
                return new ary((byte) 3, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 4:
                ary aryVar = new ary(this.f, this.c, obj3, obj2, lnmVar, (byte) 4);
                aryVar.e = obj;
                return aryVar;
            case 5:
                ary aryVar2 = new ary(this.c, obj3, obj2, lnmVar, (byte) 5);
                aryVar2.f = obj;
                return aryVar2;
            case 6:
                ary aryVar3 = new ary((is20) this.f, lnmVar, (js20) this.c, (is20) obj3, (h141) obj2);
                aryVar3.e = obj;
                return aryVar3;
            case 7:
                ary aryVar4 = new ary(this.f, this.c, obj3, obj2, lnmVar, (byte) 7);
                aryVar4.e = obj;
                return aryVar4;
            case 8:
                return new ary((String) this.c, (aod) this.f, (ven0) obj3, (ven0) obj2, lnmVar);
            case 9:
                return new ary((byte) 9, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 10:
                return new ary((yz90) this.e, (EsPlayOrigin.PlayOrigin) this.f, (EsLoggingParams.LoggingParams) obj3, (EsPreparePlayOptions.PreparePlayOptions) obj2, (String) this.c, lnmVar);
            case 11:
                ary aryVar5 = new ary(this.c, obj3, obj2, lnmVar, (byte) 11);
                aryVar5.f = obj;
                return aryVar5;
            case 12:
                return new ary((l5d0) this.f, (i5d0) obj3, (t45) obj2, lnmVar);
            case 13:
                return new ary((tv80) obj2, (q7d0) this.e, (cxc0) this.f, (b431) obj3, lnmVar);
            case 14:
                return new ary((byte) 14, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 15:
                return new ary((byte) 15, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 16:
                return new ary(this.c, obj3, obj2, lnmVar, (byte) 16);
            case 17:
                return new ary((byte) 17, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 18:
                return new ary((q9i0) this.e, (String) this.c, (String) this.f, (w8i0) obj3, (v9i0) obj2, lnmVar);
            case 19:
                return new ary(this.c, obj3, obj2, lnmVar, (byte) 19);
            case 20:
                return new ary((jek0) this.e, (vdk0) this.f, (iu30) this.c, (tv80) obj2, (iu30) obj3, lnmVar);
            case 21:
                return new ary((byte) 21, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 22:
                return new ary((p410) obj3, (String) obj2, lnmVar);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ary aryVar6 = new ary(this.f, this.c, obj3, obj2, lnmVar, (byte) 23);
                aryVar6.e = obj;
                return aryVar6;
            case 24:
                return new ary((byte) 24, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new ary((byte) 25, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 26:
                return new ary((qmp0) this.e, (omp0) this.f, (iu30) obj3, (smp0) obj2, lnmVar);
            case 27:
                return new ary((byte) 27, this.e, this.f, this.c, obj3, obj2, lnmVar);
            case 28:
                ary aryVar7 = new ary(this.c, obj3, obj2, lnmVar, (byte) 28);
                aryVar7.f = obj;
                return aryVar7;
            default:
                ary aryVar8 = new ary((m441) this.f, lnmVar, (xmu0) obj3, (p811) obj2, (String) this.c);
                aryVar8.e = obj;
                return aryVar8;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((mr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:373:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:376:0x08c9 A[LOOP:3: B:374:0x08b7->B:376:0x08c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:472:0x08cb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        ast0 ast0Var;
        faa0 faa0Var;
        Object objE;
        ?? r9;
        Object value;
        xab1 xab1Var;
        Object objY;
        ven0 ven0Var;
        oy21 m231Var;
        Object objA2;
        xyc0 xyc0Var;
        String str;
        t45 t45Var;
        Object objF;
        String str2;
        ou80 ou80Var;
        Object objA3;
        wkt wktVar;
        iu30 iu30Var;
        s201 s201Var;
        iu30 iu30Var2;
        Object obj2;
        p410 p410Var;
        xgn0 xgn0Var;
        String str3;
        hnn0 hnn0Var;
        Object objO;
        int i = 0;
        Object obj3 = null;
        switch (this.a) {
            case 0:
                String str4 = (String) this.c;
                lik1 lik1Var = (lik1) this.f;
                uny unyVar = (uny) this.e;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    zqy zqyVar = (zqy) unyVar.b;
                    wqy wqyVar = (wqy) this.g;
                    this.b = true;
                    objA = zqyVar.a(lik1Var, str4, wqyVar, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA = obj;
                }
                mfm mfmVarA = ((i4q) unyVar.c).a(lik1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.c(mfmVarA, (kjm) objA, yon1.X0(), new bjm(6, str4, (String) null), (tv80) this.d, 16);
                return rih1.a;
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gvy gvyVar = (gvy) this.e;
                ylt0 ylt0Var = gvyVar.g;
                String str5 = gvyVar.c;
                jmb1 jmb1Var = (jmb1) this.f;
                rlt0 rlt0Var = new rlt0(str5, jmb1Var.a.a, (String) this.c);
                int iOrdinal = jmb1Var.f.ordinal();
                if (iOrdinal == 0) {
                    ast0Var = ast0.a;
                } else if (iOrdinal == 1) {
                    ast0Var = ast0.c;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    ast0Var = ast0.b;
                }
                ast0 ast0Var2 = ast0Var;
                avy avyVar = (avy) this.g;
                y4m y4mVar = avyVar.a;
                r840 r840Var = avyVar.b;
                tv80 tv80Var = (tv80) this.d;
                this.b = true;
                if (ylt0.b(ylt0Var, rlt0Var, ast0Var2, r840Var, y4mVar, tv80Var, (ijk0) null, this, 96) == d9nVar2) {
                    return d9nVar2;
                }
                return rih1.a;
            case 2:
                ven0 ven0Var2 = (ven0) this.d;
                ven0 ven0Var3 = (ven0) this.g;
                hm5.M(obj);
                if (((Boolean) ((ven0) this.c).getValue()).booleanValue() && this.b && !((Boolean) ven0Var3.getValue()).booleanValue() && ((Long) ven0Var2.getValue()) == null) {
                    ven0Var2.setValue(((jr30) this.e).a(((rcz) this.f).a));
                    ven0Var3.setValue(Boolean.TRUE);
                }
                return rih1.a;
            case 3:
                ven0 ven0Var4 = (ven0) this.f;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                        b6t b6tVar = (k6a1) this.e;
                        if (b6tVar != null) {
                            b6tVar.a();
                        }
                        xr00 xr00Var = new xr00((erl1) this.c, (wat) this.g, (lnm) null, (byte) 5);
                        this.b = true;
                        if (rc2.O(600L, xr00Var, this) == d9nVar3) {
                            return d9nVar3;
                        }
                    }
                    return rih1.a;
                }
                if (!z3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ((ven0) this.d).setValue(Boolean.TRUE);
                ven0Var4.setValue(Boolean.FALSE);
                return rih1.a;
            case 4:
                Context context = (Context) this.c;
                ssw0 ssw0Var = (ssw0) this.e;
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jlb jlbVar = new jlb(ssw0Var, (byte) 11);
                if (!(((tr20) this.f) instanceof tr20)) {
                    eg.o();
                    return null;
                }
                context.registerReceiver(jlbVar, (IntentFilter) this.g, null, (Handler) this.d);
                t3x t3xVar = new t3x((Object) context, (Object) jlbVar, (byte) 28);
                this.e = null;
                this.b = true;
                if (jch0.s(ssw0Var, t3xVar, this) == d9nVar4) {
                    return d9nVar4;
                }
                return rih1.a;
            case 5:
                es20 es20Var = (es20) this.c;
                bpb1 bpb1Var = es20Var.e;
                c9n c9nVar = (c9n) this.f;
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    faa0 faa0VarZ = op71.z(c9nVar.J());
                    try {
                        gw20 gw20Var = (gw20) this.g;
                        List list = gw20Var.b;
                        Map map = gw20Var.a;
                        dw20 dw20Var = (dw20) this.d;
                        this.f = c9nVar;
                        this.e = faa0VarZ;
                        this.b = true;
                        objE = es20Var.e(list, map, dw20Var, this);
                        if (objE == d9nVar5) {
                            return d9nVar5;
                        }
                        faa0Var = faa0VarZ;
                    } catch (Throwable th) {
                        th = th;
                        faa0Var = faa0VarZ;
                        if (es20Var.k == faa0Var) {
                            r9 = 0;
                            es20Var.k = null;
                            while (true) {
                                value = bpb1Var.getValue();
                                if (!bpb1Var.k(value, gw20.a((gw20) value, (Map) r9, (List) r9, false, 3))) {
                                    r9 = 0;
                                }
                            }
                        }
                        throw th;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    faa0Var = (faa0) this.e;
                    try {
                        hm5.M(obj);
                        objE = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        if (es20Var.k == faa0Var) {
                            r9 = 0;
                            es20Var.k = null;
                            while (true) {
                                value = bpb1Var.getValue();
                                if (!bpb1Var.k(value, gw20.a((gw20) value, (Map) r9, (List) r9, false, 3))) {
                                    r9 = 0;
                                }
                            }
                        }
                        throw th;
                    }
                }
                bs20 bs20Var = (bs20) objE;
                op71.x(c9nVar.J());
                faa0 faa0Var2 = es20Var.k;
                if (faa0Var2 == faa0Var) {
                    try {
                        es20Var.a(bs20Var);
                        xab1Var = null;
                        es20Var.k = null;
                        faa0Var2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (es20Var.k == faa0Var) {
                            r9 = 0;
                            es20Var.k = null;
                            while (true) {
                                value = bpb1Var.getValue();
                                if (!bpb1Var.k(value, gw20.a((gw20) value, (Map) r9, (List) r9, false, 3))) {
                                    r9 = 0;
                                }
                            }
                        }
                        throw th;
                    }
                } else {
                    xab1Var = null;
                }
                if (faa0Var2 == faa0Var) {
                    es20Var.k = xab1Var;
                    while (true) {
                        Object value2 = bpb1Var.getValue();
                        if (!bpb1Var.k(value2, gw20.a((gw20) value2, xab1Var, xab1Var, false, 3))) {
                            xab1Var = null;
                        }
                    }
                }
                return rih1.a;
            case 6:
                d9n d9nVar6 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    if (!((is20) this.f).f) {
                        xu30 xu30Var = ((js20) this.c).d.b;
                        Object obj4 = ((is20) this.g).d;
                        Object state = ((h141) this.d).getState();
                        this.e = null;
                        this.b = true;
                        if (xu30Var.invoke(obj4, state, this) == d9nVar6) {
                            return d9nVar6;
                        }
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                d9n d9nVar7 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    nsw0 nsw0Var = (nsw0) this.e;
                    x8c0 x8c0Var = (x8c0) this.f;
                    w8c0 w8c0Var = (w8c0) this.c;
                    p5o p5oVar = new p5o((o8n) this.g, (mr20) this.d, nsw0Var, (lnm) null, (byte) 1);
                    this.b = true;
                    if (z8p1.t(x8c0Var, w8c0Var, p5oVar, this) == d9nVar7) {
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
            case 8:
                String str6 = (String) this.c;
                d9n d9nVar8 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    if (str6 != null && ((Boolean) ((ven0) this.g).getValue()).booleanValue()) {
                        ven0 ven0Var5 = (ven0) this.d;
                        aod aodVar = (aod) this.f;
                        this.e = ven0Var5;
                        this.b = true;
                        aodVar.getClass();
                        fns fnsVar = igu.a;
                        objY = fn31.Y(b3s.c, new x4c((kj31) aodVar.b, (ti31) aodVar.c, str6, (lnm) null, (byte) 9), this);
                        if (objY == d9nVar8) {
                            return d9nVar8;
                        }
                        ven0Var = ven0Var5;
                    }
                    return rih1.a;
                }
                if (!z8) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ven0Var = (ven0) this.e;
                hm5.M(obj);
                objY = obj;
                ven0Var.setValue((wj31) objY);
                return rih1.a;
            case 9:
                d9n d9nVar9 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    mr20 mr20VarU = rqt0.u(rwq.q(new it70((iie1) this.e, (byte) 0)));
                    tv1 tv1Var = new tv1((jkr0) this.f, (iu30) this.c, (hdn0) this.g, (ven0) this.d, (lnm) null);
                    this.b = true;
                    if (l4p1.q(mr20VarU, tv1Var, this) == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 10:
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    xrc0 xrc0Var = ((yz90) this.e).c;
                    EsPlayOrigin.PlayOrigin playOrigin = (EsPlayOrigin.PlayOrigin) this.f;
                    playOrigin.getClass();
                    EsLoggingParams.LoggingParams loggingParams = (EsLoggingParams.LoggingParams) this.g;
                    loggingParams.getClass();
                    EsPreparePlayOptions.PreparePlayOptions preparePlayOptions = (EsPreparePlayOptions.PreparePlayOptions) this.d;
                    preparePlayOptions.getClass();
                    trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) null, (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 479);
                    String str7 = (String) this.c;
                    this.b = true;
                    if (xrc0.b(xrc0Var, str7, trc0Var, preparePlayOptions, playOrigin, (EsPlayOptions.PlayOptions) null, (Map) null, loggingParams, (ayc0) null, this, 176) == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 11:
                String str8 = (String) this.c;
                py21 py21VarJ = d9n.a;
                boolean z11 = this.b;
                try {
                    if (!z11) {
                        hm5.M(obj);
                        xyc0 xyc0Var2 = (xyc0) this.g;
                        String str9 = (String) this.d;
                        jyc0 jyc0VarV = xgc.v(str8);
                        if (jyc0VarV == null) {
                            return xgc.q(str8);
                        }
                        gqu0 gqu0Var = xyc0Var2.f;
                        String str10 = jyc0VarV.a;
                        String str11 = jyc0VarV.b;
                        this.f = null;
                        this.e = xyc0Var2;
                        this.b = true;
                        objA2 = gqu0Var.a(str10, str11, str9, this);
                        if (objA2 != py21VarJ) {
                            xyc0Var = xyc0Var2;
                        }
                        return py21VarJ;
                    }
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xyc0Var = (xyc0) this.e;
                    hm5.M(obj);
                    objA2 = obj;
                    PermissionGrantDescription permissionGrantDescription = (PermissionGrantDescription) objA2;
                    boolean zN = permissionGrantDescription.n();
                    x7i1 x7i1VarF = permissionGrantDescription.hasCapabilities() ? xyc0Var.a.f(permissionGrantDescription.getCapabilities()) : null;
                    xyc0Var.getClass();
                    m231Var = new oy21(new hyc0(zN, x7i1VarF, (permissionGrantDescription.p() && permissionGrantDescription.o().r()) ? xyc0Var.v(permissionGrantDescription) : null));
                } catch (Throwable th4) {
                    m231Var = new m231(th4);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    return m231Var;
                }
                py21VarJ = i2x0.j(str8, thA, fnc0.t);
                return py21VarJ;
            case 12:
                i5d0 i5d0Var = (i5d0) this.g;
                d9n d9nVar11 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    l5d0 l5d0Var = (l5d0) this.f;
                    String str12 = i5d0Var.a;
                    l5d0Var.getClass();
                    String strReplaceAll = Pattern.compile("[^a-zA-Z0-9]+").matcher(str12).replaceAll("_");
                    t45 t45Var2 = (t45) this.d;
                    t45.m(t45Var2, strReplaceAll, 2);
                    iu30 iu30Var3 = i5d0Var.b;
                    this.e = t45Var2;
                    this.c = strReplaceAll;
                    this.b = true;
                    if (iu30Var3.invoke(this) == d9nVar11) {
                        return d9nVar11;
                    }
                    str = strReplaceAll;
                    t45Var = t45Var2;
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.c;
                    t45Var = (t45) this.e;
                    hm5.M(obj);
                }
                t45Var.g(str);
                return rih1.a;
            case 13:
                d9n d9nVar12 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    tv80 tv80Var2 = (tv80) this.d;
                    String str13 = (tv80Var2 == null || (ou80Var = tv80Var2.a) == null) ? null : ou80Var.a;
                    q7d0 q7d0Var = (q7d0) this.e;
                    cxc0 cxc0Var = (cxc0) this.f;
                    this.c = str13;
                    this.b = true;
                    objF = q7d0Var.f(cxc0Var, this);
                    if (objF == d9nVar12) {
                        return d9nVar12;
                    }
                    str2 = str13;
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) this.c;
                    hm5.M(obj);
                    objF = obj;
                }
                ((b431) this.g).a((e720) objF, str2);
                return rih1.a;
            case 14:
                rih1 rih1Var = rih1.a;
                d9n d9nVar13 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    mr20 mr20VarC = ((ov20) ((j2e0) this.e).b).c("client-locked-state", "");
                    fca0 fca0Var = new fca0(2, (lnm) null, (byte) 12);
                    u60 u60Var = new u60((p811) this.f, (x8c0) this.c, (Consumer) this.g, (p811) this.d, (byte) 27);
                    this.b = true;
                    Object objCollect = mr20VarC.collect(new eu20(u60Var, fca0Var, (byte) 1), this);
                    if (objCollect != d9nVar13) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 15:
                xtb0 xtb0Var = (xtb0) this.e;
                tob1 tob1Var = (tob1) this.d;
                d9n d9nVar14 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (((Number) tob1Var.getValue()).intValue() >= 0) {
                        int iIntValue = ((Number) tob1Var.getValue()).intValue();
                        this.b = true;
                        df41 df41Var = xtb0.y;
                        if (xtb0Var.f(iIntValue, 0, this) == d9nVar14) {
                            return d9nVar14;
                        }
                    }
                    return rih1.a;
                }
                if (!z15) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ptb0 ptb0VarH = xtb0Var.h();
                dw91 dw91Var = (dw91) this.f;
                List list2 = (List) this.c;
                int i2 = ptb0VarH.n;
                ArrayList arrayList = new ArrayList();
                for (qtb0 qtb0Var : ptb0VarH.l) {
                    int i3 = qtb0Var.a;
                    aef0 aef0Var = (aef0) o7h.t0(i3, list2);
                    String str14 = aef0Var != null ? aef0Var.b : obj3;
                    y9e1 y9e1Var = (y9e1) dw91Var.get(Integer.valueOf(i3));
                    if (str14 == 0 || str14.length() == 0) {
                        i = 0;
                        obj3 = null;
                    } else if (y9e1Var != null) {
                        zrm0 zrm0Var = y9e1Var.b;
                        int i4 = qtb0Var.p;
                        int i5 = zrm0Var.f;
                        int i6 = i;
                        while (i6 < i5) {
                            if (zrm0Var.b(i6) + i4 > i2) {
                                i = 0;
                            }
                            arrayList.add(new mkk1(i3, i6, str14.substring(y9e1Var.i(i6), zrm0Var.c(i6, true))));
                            i6++;
                            i = 0;
                            obj3 = null;
                            break;
                        }
                    }
                }
                ((iu30) this.g).invoke(arrayList);
                return rih1.a;
            case 16:
                d9n d9nVar15 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    wkt wktVar2 = ((rnf0) this.c).t;
                    if (wktVar2 != null) {
                        iu30 iu30Var4 = (iu30) this.g;
                        xwa xwaVar = (xwa) this.d;
                        vwa[] vwaVarArr = {new vwa()};
                        this.e = iu30Var4;
                        this.f = wktVar2;
                        this.b = true;
                        objA3 = xwaVar.a(vwaVarArr, this);
                        if (objA3 == d9nVar15) {
                            return d9nVar15;
                        }
                        wktVar = wktVar2;
                        iu30Var = iu30Var4;
                    }
                    return rih1.a;
                }
                if (!z16) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wktVar = (wkt) this.f;
                iu30Var = (iu30) this.e;
                hm5.M(obj);
                objA3 = obj;
                iu30Var.invoke(new k300(((wwa) o7h.V0((List) objA3)).b, wktVar));
                return rih1.a;
            case 17:
                d9n d9nVar16 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    ytw0 ytw0Var = jfv.b;
                    long jK0 = fdg1.k0(1, ngv.d);
                    this.b = true;
                    if (hap1.j(jK0, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                l811 l811Var = (l811) this.e;
                if (!l811Var.a) {
                    mth1.G((p811) this.c, l811Var, (i0g0) this.g, (lbc0) this.d, (v5v) this.f, 0.0f);
                }
                return rih1.a;
            case 18:
                d9n d9nVar17 = d9n.a;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    q9i0 q9i0Var = (q9i0) this.e;
                    String str15 = (String) this.c;
                    String str16 = (String) this.f;
                    w8i0 w8i0Var = (w8i0) this.g;
                    v9i0 v9i0Var = (v9i0) this.d;
                    this.b = true;
                    if (q9i0Var.i(str15, str16, w8i0Var, v9i0Var, this) == d9nVar17) {
                        return d9nVar17;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                d9n d9nVar18 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    s201 s201Var2 = (s201) ((ven0) this.c).getValue();
                    if (s201Var2 != null) {
                        iu30 iu30Var5 = (iu30) this.g;
                        ((ven0) this.d).setValue(Boolean.FALSE);
                        this.e = iu30Var5;
                        this.f = s201Var2;
                        this.b = true;
                        if (hap1.i(200L, this) == d9nVar18) {
                            return d9nVar18;
                        }
                        s201Var = s201Var2;
                        iu30Var2 = iu30Var5;
                    }
                    return rih1.a;
                }
                if (!z19) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s201Var = (s201) this.f;
                iu30Var2 = (iu30) this.e;
                hm5.M(obj);
                iu30Var2.invoke(s201Var);
                return rih1.a;
            case 20:
                iu30 iu30Var6 = (iu30) this.c;
                d9n d9nVar19 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    vek0 vek0Var = ((jek0) this.e).b;
                    String str17 = ((vdk0) this.f).a;
                    z6x z6xVar = z6x.a;
                    this.b = true;
                    Object objB = vek0Var.b(str17, z6xVar, this);
                    if (objB == d9nVar19) {
                        return d9nVar19;
                    }
                    obj2 = objB;
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    obj2 = ((e331) obj).a;
                }
                wd21 wd21Var = (wd21) (obj2 instanceof m231 ? null : obj2);
                if (wd21Var == null || !(!wd21Var.b.isEmpty())) {
                    iu30Var6.invoke(dek0.a);
                    ((iu30) this.g).invoke(new sdk0(false));
                } else {
                    iu30Var6.invoke(new fek0((tv80) this.d));
                }
                return rih1.a;
            case 21:
                d9n d9nVar20 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(((m0t) this.e).d);
                    ywm0 ywm0Var = new ywm0((gij1) this.f, (q9l1) this.c, (ven0) this.g, (ven0) this.d, (byte) 0);
                    this.b = true;
                    if (ezcVarG.collect(ywm0Var, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 22:
                d9n d9nVar21 = d9n.a;
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    p410Var = (p410) this.g;
                    xgn0Var = (xgn0) p410Var.h;
                    String str18 = (String) this.d;
                    this.e = xgn0Var;
                    this.f = p410Var;
                    this.c = str18;
                    this.b = true;
                    if (xgn0Var.a(this) == d9nVar21) {
                        return d9nVar21;
                    }
                    str3 = str18;
                } else {
                    if (!z22) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str19 = (String) this.c;
                    p410Var = (p410) this.f;
                    xgn0Var = (xgn0) this.e;
                    hm5.M(obj);
                    str3 = str19;
                }
                try {
                    zau0 zau0Var = (zau0) p410Var.g;
                    bpb1 bpb1Var2 = (bpb1) p410Var.e;
                    if (!((Boolean) zau0Var.b.getValue()).booleanValue()) {
                        ((ttm0) p410Var.b).a(zau0Var);
                        bpb1Var2.l(q3p1.r(zau0Var, (r091) bpb1Var2.getValue()));
                    }
                    r091 r091Var = (r091) bpb1Var2.getValue();
                    if (r091Var != null) {
                        ebp1.s(r091Var, new lsm0(str3, new ksm0(fec1.c, (String) null, (String) null, "music-quiz-background-music", (String) null, (String) null, 502), true, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2040), (tv80) null, (yjp1) p410Var.d, 14);
                        r091Var.k();
                        break;
                    }
                    return rih1.a;
                } finally {
                    xgn0Var.c((Object) null);
                }
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                drr0 drr0Var = (drr0) this.c;
                ven0 ven0Var6 = (ven0) this.d;
                uvj uvjVar = (uvj) this.f;
                ven0 ven0Var7 = (ven0) this.g;
                d9n d9nVar22 = d9n.a;
                boolean z23 = this.b;
                try {
                    if (!z23) {
                        hm5.M(obj);
                        mr20 mr20Var = (mr20) this.e;
                        drr0Var.t(0.0f);
                        hnn0 hnn0Var2 = (hnn0) o7h.C0((List) ven0Var7.getValue());
                        hnn0Var2.getClass();
                        uvjVar.b().h(hnn0Var2);
                        uvjVar.b().h((hnn0) ((List) ven0Var7.getValue()).get(((List) ven0Var7.getValue()).size() - 2));
                        ygi0 ygi0Var = new ygi0(ven0Var6, drr0Var, (byte) 12);
                        this.e = hnn0Var2;
                        this.b = true;
                        if (mr20Var.collect(ygi0Var, this) == d9nVar22) {
                            return d9nVar22;
                        }
                        hnn0Var = hnn0Var2;
                    } else {
                        if (!z23) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hnn0Var = (hnn0) this.e;
                        hm5.M(obj);
                    }
                    ven0Var6.setValue(Boolean.FALSE);
                    uvjVar.i(hnn0Var, false);
                    break;
                } catch (CancellationException unused) {
                    ven0Var6.setValue(Boolean.FALSE);
                }
                return rih1.a;
            case 24:
                d9n d9nVar23 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    yjq yjqVar = ((jeo0) this.e).b;
                    List list3 = (List) this.f;
                    String str20 = (String) this.g;
                    gj3 gj3Var = (gj3) this.d;
                    this.b = true;
                    if (yjqVar.I(list3, str20, gj3Var, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                d9n d9nVar24 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    mr20 mr20VarU2 = rqt0.u(rwq.q(new nxb0((xtb0) this.e, (byte) 16)));
                    ywm0 ywm0Var2 = new ywm0((Set) this.f, (c380) this.c, (ven0) this.g, (ven0) this.d, (byte) 1);
                    this.b = true;
                    if (mr20VarU2.collect(ywm0Var2, this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 26:
                return e(obj);
            case 27:
                d9n d9nVar25 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    bkc0 bkc0Var = (bkc0) this.e;
                    if (bkc0Var == null) {
                        return null;
                    }
                    phi0 phi0Var = (phi0) this.f;
                    p811 p811Var = (p811) this.c;
                    ih71 ih71Var = (ih71) this.g;
                    g471 g471Var = (g471) this.d;
                    ilh1 ilh1Var = (ilh1) phi0Var.c;
                    Object obj5 = p811Var.a;
                    obj5.getClass();
                    ela1 ela1Var = ih71Var.d;
                    this.b = true;
                    objO = ilh1Var.o(bkc0Var, (p371) obj5, ela1Var, g471Var, this);
                    if (objO == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objO = obj;
                }
                return (String) objO;
            case 28:
                return g(obj);
            default:
                vr20 vr20Var = (vr20) this.e;
                d9n d9nVar26 = d9n.a;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    m441 m441Var = (m441) this.f;
                    ywm0 ywm0Var3 = new ywm0(vr20Var, (xmu0) this.g, (p811) this.d, (String) this.c, (byte) 5);
                    this.e = null;
                    this.b = true;
                    if (m441Var.collect(ywm0Var3, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ary(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.c = obj2;
        this.g = obj3;
        this.d = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ary(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.g = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(String str, aod aodVar, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.c = str;
        this.f = aodVar;
        this.g = ven0Var;
        this.d = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(p410 p410Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.g = p410Var;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(is20 is20Var, lnm lnmVar, js20 js20Var, is20 is20Var2, h141 h141Var) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.f = is20Var;
        this.c = js20Var;
        this.g = is20Var2;
        this.d = h141Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(tv80 tv80Var, q7d0 q7d0Var, cxc0 cxc0Var, b431 b431Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.d = tv80Var;
        this.e = q7d0Var;
        this.f = cxc0Var;
        this.g = b431Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ary(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.g = obj4;
        this.d = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(l5d0 l5d0Var, i5d0 i5d0Var, t45 t45Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.f = l5d0Var;
        this.g = i5d0Var;
        this.d = t45Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(q9i0 q9i0Var, String str, String str2, w8i0 w8i0Var, v9i0 v9i0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 18;
        this.e = q9i0Var;
        this.c = str;
        this.f = str2;
        this.g = w8i0Var;
        this.d = v9i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(jek0 jek0Var, vdk0 vdk0Var, iu30 iu30Var, tv80 tv80Var, iu30 iu30Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 20;
        this.e = jek0Var;
        this.f = vdk0Var;
        this.c = iu30Var;
        this.d = tv80Var;
        this.g = iu30Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(qmp0 qmp0Var, omp0 omp0Var, iu30 iu30Var, smp0 smp0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 26;
        this.e = qmp0Var;
        this.f = omp0Var;
        this.g = iu30Var;
        this.d = smp0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(m441 m441Var, lnm lnmVar, xmu0 xmu0Var, p811 p811Var, String str) {
        super(2, lnmVar);
        this.a = (byte) 29;
        this.f = m441Var;
        this.g = xmu0Var;
        this.d = p811Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ary(boolean z, jr30 jr30Var, rcz rczVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.b = z;
        this.e = jr30Var;
        this.f = rczVar;
        this.c = ven0Var;
        this.g = ven0Var2;
        this.d = ven0Var3;
    }
}
