package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ak01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak01(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        Object value;
        lao laoVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pl01 pl01Var = (pl01) obj2;
                bpb1 bpb1Var = pl01.b;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
                bpb1 bpb1Var2 = pl01.c;
                Boolean boolValueOf = Boolean.valueOf(((Number) bpb1Var.getValue()).intValue() > 0);
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, boolValueOf);
                return new tj4(pl01Var, (byte) 14);
            case 1:
                return kuo1.m((yk01) obj, (Resources) ((ngs0) obj2).d);
            case 2:
                return Boolean.valueOf(u890.j(((hby) obj).a, ((hby) obj2).a));
            case 3:
                ((vr01) obj2).f("Error from LP (main request): " + ((jy21) obj).b());
                return new huz(new wsc0(0, 0, 0, false, (List) null, new kby("spotify:list:recents:page", -2), 0L, (Integer) null, false, (Map) null, 0L, (List) null, 0, 16351), (byte) 10);
            case 4:
                fgx fgxVar = (fgx) ((rt01) obj2).c;
                ufx ufxVar = fgxVar.a;
                return new hjs(ufxVar.a(), ufxVar.b(), fgxVar.b, fgxVar.c);
            case 5:
                z2s z2sVar = (z2s) obj;
                rt01 rt01Var = (rt01) obj2;
                vmp vmpVar = (vmp) rt01Var.c;
                iu30 iu30Var = (iu30) rt01Var.d;
                switch (vmpVar.a) {
                    case 0:
                        kop kopVar = (kop) ((blp) vmpVar.b).c;
                        gw70 gw70VarB = kopVar.a.b();
                        c8o.l(gw70VarB);
                        laoVar = new lao(gw70VarB, new urk0((byte) 4), (yqg) kopVar.d.get(), iu30Var);
                        break;
                    default:
                        apq apqVar = (apq) ((ykq) vmpVar.b).c;
                        gw70 gw70VarB2 = apqVar.a.b();
                        c8o.l(gw70VarB2);
                        laoVar = new lao(gw70VarB2, new urk0((byte) 4), (yqg) apqVar.d.get(), iu30Var);
                        break;
                }
                z2sVar.R(qw01.class, laoVar, jt01.Y0, jt01.Z0, jt01.a1, false, atz0.Y0);
                return rih1Var;
            case 6:
                j011 j011Var = (j011) obj;
                Consumer consumer = ((g111) obj2).d;
                if (consumer != null) {
                    consumer.accept(j011Var);
                }
                return rih1Var;
            case 7:
                pux0 pux0Var = (pux0) obj2;
                return ((koc0) pux0Var.b).e().filter(new ejb(pux0Var, (byte) 22)).distinctUntilChanged().switchMap(new vqv0(pux0Var, (byte) 16)).distinctUntilChanged().firstOrError().onErrorReturnItem(new r111(z6x.a)).toObservable().toFlowable(BackpressureStrategy.d);
            case 8:
                cas casVar = (a7m0) obj;
                casVar.a = h211.b;
                et90 et90Var = (et90) obj2;
                ysu0 ysu0Var = (ysu0) et90Var.e;
                ObservableSource observableSourceSwitchMap = ysu0Var.b.switchMap(new swm0(ysu0Var, (byte) 25));
                pdu0 pdu0Var = (pdu0) et90Var.f;
                casVar.b = RxEventSources.a(new ObservableSource[]{observableSourceSwitchMap, pdu0Var.b.switchMap(new qkn0(pdu0Var, (byte) 21))});
                casVar.e = new i211(et90Var, (byte) 0);
                casVar.d = new i211(et90Var, (byte) 1);
                casVar.a(t011.P0, t011.Q0);
                return rih1Var;
            case 9:
                a511 a511Var = (a511) obj;
                return new f5y0(((k511) ((d511) obj2).b.b).a(a511Var.b), a511Var, (byte) 17);
            case 10:
                ((qtr) obj).b(new pnp0((s911) obj2, (lnm) null, (byte) 18));
                return rih1Var;
            case 11:
                return new rxc0(((j2y0) obj2).b);
            case 12:
                ((qtr) obj).b(new pnp0((gd11) obj2, (lnm) null, (byte) 20));
                return rih1Var;
            case 13:
                long j = ((Offset) obj).a;
                lz20.b((lz20) obj2);
                return rih1Var;
            case 14:
                yh11 yh11Var = (yh11) obj2;
                return new bil0(yh11Var.F.path(), yh11Var.G.a, (r6h1) obj);
            case 15:
                rwq0.z((qtr) obj, new ki11((mi11) obj2, (byte) 0));
                return rih1Var;
            case 16:
                rwq0.z((qtr) obj, new fj11((gj11) obj2, (byte) 0));
                return rih1Var;
            case 17:
                ((qtr) obj).b(new k8y0((et90) obj2, (lnm) null, (byte) 4));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                nm1 nm1Var = (nm1) obj2;
                List listJ = nm1.j((wk11) obj);
                if (listJ.isEmpty()) {
                    return new huz(b7x.a, (byte) 10);
                }
                List<String> list = listJ;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (String str : list) {
                    arrayList.add(new v3o(d3p1.F((d0r) nm1Var.b, (o3r) nm1Var.c, str), str, (byte) 3));
                }
                return new z4t0((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (zob1) ((yup0) obj2).c;
            case 20:
                z2s z2sVar2 = (z2s) obj;
                ug3 ug3Var = (ug3) obj2;
                z2sVar2.R(jm11.class, f6o1.A((tm) ug3Var.d, new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), hm11.i, hm11.t, hm11.N0, false, h211.U0);
                z2sVar2.R(km11.class, new jpg0(f6o1.A((c491) ug3Var.e, new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), hm11.X), hm11.Y, hm11.Z, hm11.O0, false, h211.V0);
                return rih1Var;
            case 21:
                b261.k((e261) obj, new d4h(((tm11) obj2).b.size(), 1));
                return rih1Var;
            case 22:
                return ((Context) ((r7m) obj2).d).getResources().getString(2131956662);
            case 23:
                uv11 uv11Var = (uv11) obj;
                if (ihc1.y0(uv11Var.a)) {
                    return gio1.b(new k910((t6g1) null, (dt11) null, (iix0) null, (n6u) null, (rrt0) null, false, false, false, (Double) null, (me2) null, (xn70) null, false, 8191));
                }
                ys11 ys11Var = (ys11) obj2;
                return d3p1.H(ys11Var.b, ys11Var.j1, uv11Var);
            case 24:
                return new xzq(((nt11) obj2).a.a(igu.a, (d0r) obj), mt11.a);
            case 25:
                return ((uh) obj2).c.w;
            case 26:
                uv11 uv11Var2 = (uv11) obj;
                return new mqm(new jvm(uv11Var2.b, uv11Var2.a, uv11Var2.d), new lqm(Collections.singletonList(ovm.a), ((eb8) obj2).c, (qle1) null, 4));
            case 27:
                return new rxc0(((tu11) obj2).b);
            case 28:
                e261 e261Var = (e261) obj;
                eoj0 eoj0Var = (eoj0) obj2;
                String str2 = eoj0Var.b;
                if (str2 == null) {
                    str2 = eoj0Var.a;
                }
                b261.n(e261Var, str2);
                return rih1Var;
            default:
                ((qv00) obj).a((String) ((kdy0) obj2).c, zoy0.class, false);
                return rih1Var;
        }
    }
}
