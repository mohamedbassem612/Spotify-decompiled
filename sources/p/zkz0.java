package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zkz0(byte b, Object obj, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
    }

    public final Object invoke() {
        Function0 function0;
        String str;
        byte b = this.a;
        String str2 = "";
        View view = null;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke(((eka1) obj).b);
                return rih1Var;
            case 1:
                if (((l201) obj).d == 0) {
                    ((iu30) obj2).invoke(p101.a);
                }
                return rih1Var;
            case 2:
                w501 w501Var = (w501) obj;
                ((iu30) obj2).invoke(new u501(w501Var.a.a, w501Var.b, w501Var.c));
                return rih1Var;
            case 3:
                ((iu30) obj2).invoke(new y001(((gxz0) obj).a));
                return rih1Var;
            case 4:
                ((iu30) obj2).invoke((fwb) obj);
                return rih1Var;
            case 5:
                Integer numValueOf = Integer.valueOf(((err0) ((jkr0) obj2).d.c).s());
                id01 id01Var = zc01.a;
                return new mmr0(numValueOf, (List) ((ven0) obj).getValue());
            case 6:
                ((iu30) obj2).invoke(((snu0) obj).a);
                return rih1Var;
            case 7:
                ((iu30) obj2).invoke((hc01) obj);
                return rih1Var;
            case 8:
                vy71 vy71Var = (vy71) obj2;
                xy71 xy71VarD = vy71Var.d();
                s24 s24Var = vy71Var.e;
                xy71 xy71Var = xy71.a;
                if (xy71VarD == xy71Var && ((xy71) ((mdt) s24Var.X).getValue()) == xy71Var && !s24Var.L()) {
                    ((Function0) obj).invoke();
                }
                return rih1Var;
            case 9:
                ll01 ll01Var = (ll01) obj2;
                if (!ll01Var.h) {
                    ll01Var.h = true;
                    ((q7r0) obj).c("");
                }
                return rih1Var;
            case 10:
                on01 on01Var = (on01) obj2;
                return rqt0.F(on01Var.d, new b201(on01Var, (trc0) obj, view, (byte) 14));
            case 11:
                rq01 rq01Var = (rq01) obj2;
                dw01 dw01Var = rq01Var.a;
                oq01 oq01Var = (oq01) obj;
                String str3 = oq01Var.d;
                boolean zContainsKey = dw01Var.b.containsKey(str3);
                vr01 vr01VarA = dw01Var.a.a(str3);
                lnm lnmVar = null;
                lt20 lt20Var = new lt20(new mpy0(new ht20(new fu20(new f5y0(vr01VarA.d(new lv01(20, (List) null, (m9m) null, (br01) null, false, zContainsKey, 62)), dw01Var, (byte) 16), new i3y0(dw01Var, str3, lnmVar, (byte) 9), (byte) 1), new elu0(dw01Var, str3, vr01VarA, lnmVar, (byte) 16)), rq01Var, oq01Var, (byte) 3), new dwf0(rq01Var, oq01Var, lnmVar, (byte) 17), (byte) 0);
                return rq01Var.e ? new m441(new ian0(lt20Var, (lnm) null, (byte) 28)) : lt20Var;
            case 12:
                cm0 cm0Var = (cm0) obj2;
                return new f5y0(d3p1.F((d0r) cm0Var.e, (o3r) cm0Var.t, (cu01) obj), cm0Var, (byte) 15);
            case 13:
                ((Function0) obj2).invoke();
                gbx gbxVar = (gbx) obj;
                if (gbxVar != null && (function0 = gbxVar.b) != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 14:
                ((iu30) obj2).invoke(new wx01(((xx01) obj).a));
                return rih1Var;
            case 15:
                ((iu30) obj2).invoke(new z111(((g211) obj).a.e));
                return rih1Var;
            case 16:
                ((iu30) obj2).invoke((sc11) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                qzh qzhVar = (qzh) obj;
                yh11 yh11Var = (yh11) obj2;
                if (!yh11Var.B.e() && !yh11Var.C.h()) {
                    return new jpg0(yh11Var.f.a(qzhVar), fd11.Q0);
                }
                pbq pbqVar = yh11Var.g;
                return new jpg0(new ri11((Flowable) pbqVar.f, (Flowable) pbqVar.b, (w9u0) pbqVar.g, (Consumer) pbqVar.h, (kvs0) pbqVar.i, (u4q0) pbqVar.X, (a1r0) pbqVar.c, qzhVar, (jn4) pbqVar.t, (rh11) pbqVar.d, (dma1) pbqVar.e), fd11.P0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((mi11) obj2).c.b(jvs0.g, ((ji11) obj).a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                l3 l3Var = (l3) obj2;
                ((rku) l3Var.g).b(((mi11) obj).e.subscribe(new lyw0(l3Var, (byte) 22)));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                kvs0 kvs0Var = ((ti11) obj2).d;
                j380 j380VarMetadata = ((ContextTrack) ((PlayerState) obj).track().b()).metadata();
                if (j380VarMetadata != null && (str = (String) j380VarMetadata.get("image_xlarge_url")) != null) {
                    str2 = str;
                }
                kvs0Var.b(jvs0.f, str2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((iu30) obj2).invoke(new ek11(((hk11) obj).a));
                return rih1Var;
            case 22:
                ((iu30) obj2).invoke(new mk11(((nk11) obj).a));
                return rih1Var;
            case 23:
                hp11 hp11Var = (hp11) obj2;
                if (hp11Var.m) {
                    return new kdn0((Object) null);
                }
                d0r d0rVar = hp11Var.k;
                String str4 = ((q381) obj).a;
                Context context = hp11Var.f;
                y8n y8nVarE = d3p1.E(d0rVar, jnc1.a, str4);
                fai0 fai0Var = new fai0();
                fai0Var.m(jnc1.a((k1r) y8nVarE.e(), context));
                fai0Var.n(y8nVarE, new jp5(fai0Var, context, (byte) 11));
                return fai0Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                uv11 uv11Var = ((jmb1) obj).a;
                tt11 tt11Var = (tt11) obj2;
                ien0 ien0Var = xhk1.a;
                uh uhVar = tt11Var.Z;
                bu11 bu11Var = tt11Var.b;
                tt11.b(uhVar != null ? uhVar.c.w : null, bu11Var.j(uv11Var.a));
                uh uhVar2 = tt11Var.O0;
                tt11.b(uhVar2 != null ? uhVar2.c.w : null, bu11Var.e(uv11Var.a));
                uh uhVar3 = tt11Var.P0;
                tt11.b(uhVar3 != null ? uhVar3.c.w : null, bu11Var.h(uv11Var.a));
                uh uhVar4 = tt11Var.Q0;
                tt11.b(uhVar4 != null ? uhVar4.c.w : null, bu11Var.t(uv11Var.a));
                uh uhVar5 = tt11Var.R0;
                tt11.b(uhVar5 != null ? uhVar5.c.w : null, bu11Var.k(uv11Var.a));
                dtw dtwVar = tt11Var.T0;
                tt11.b(dtwVar != null ? dtwVar.w : null, bu11Var.f(uv11Var.a));
                dtw dtwVar2 = tt11Var.U0;
                tt11.b(dtwVar2 != null ? dtwVar2.w : null, bu11Var.f(uv11Var.a));
                return rih1Var;
            case 25:
                hl00 hl00Var = new hl00((Object) new y11((ox11) obj, (byte) 21), (byte) 2);
                xfx xfxVar = (xfx) ((dx11) ((h72) ((znq) obj2).a.c).c).h.get();
                c8o.l(xfxVar);
                return new sd20(new zfx(xfxVar.c, (byte) 0), hl00Var);
            case 26:
                ((iu30) obj2).invoke(new p121(((k221) obj).e));
                return rih1Var;
            case 27:
                ven0 ven0Var = (ven0) obj;
                return Boolean.valueOf((u890.j((String) ven0Var.getValue(), ((oc21) obj2).b) || ihc1.y0((String) ven0Var.getValue())) ? false : true);
            case 28:
                pe21 pe21Var = ((de21) obj2).a;
                hrr0 hrr0Var = pe21Var.m;
                oe21 oe21VarB = pe21Var.b();
                qr80 qr80Var = oe21VarB != null ? new qr80(oe21VarB.a()) : null;
                oe21 oe21VarB2 = pe21Var.b();
                qtb0 qtb0Var = oe21VarB2 != null ? oe21VarB2.a : null;
                oe21 oe21VarB3 = pe21Var.b();
                if ((oe21VarB3 != null ? Integer.valueOf(oe21VarB3.a.a) : null) != null) {
                    pe21Var.u.setValue(hrr0Var.getValue());
                    fn31.T(pe21Var.b, (o8n) null, 0, new d6(qtb0Var, pe21Var, pe21Var.c(), (lnm) null, (byte) 7), 3);
                }
                pe21Var.o.setValue(new Offset(0L));
                hrr0Var.setValue((Object) null);
                pe21Var.p.setValue(new qr80(qr80Var != null ? qr80Var.a : 0L));
                st41 st41Var = pe21Var.h;
                fn31.T(st41Var.b, (o8n) null, 0, new qt41(st41Var, (lnm) null, (byte) 1), 3);
                pe21Var.q.setValue((Object) null);
                pe21Var.r.setValue((Object) null);
                ((Function0) obj).invoke();
                return rih1Var;
            default:
                return Boolean.valueOf(u890.j(obj2, ((pe21) obj).m.getValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zkz0(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
