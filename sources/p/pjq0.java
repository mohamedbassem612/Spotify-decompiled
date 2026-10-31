package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class pjq0 implements bra, Function, yg30, jrn0, ci7, hv30, tsc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pjq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(long j, long j2, long j3) {
        pjx0 pjx0Var = (pjx0) this.b;
        if (pjx0Var.e == null) {
            return;
        }
        float fA0 = (j == -1 || j == 0) ? -1.0f : zoi1.a0(j2, j);
        vxu vxuVar = pjx0Var.e;
        vxuVar.getClass();
        vxuVar.f(fA0, j, j2);
    }

    public Object apply(Object obj) {
        e3s0 e3s0Var;
        byte b = this.a;
        final byte b2 = 0;
        final byte b3 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                return ((ep31) obj2).a((c841) obj);
            case 5:
                t2s0 t2s0Var = (t2s0) obj2;
                bg11 bg11VarT = b380.t((w2s0) obj);
                h380 h380VarA = j380.a();
                w280 w280VarR = bg11VarT.r(0);
                while (w280VarR.hasNext()) {
                    for (r2s0 r2s0Var : ((w2s0) w280VarR.next()).b) {
                        String str = r2s0Var.c;
                        e3s0[] e3s0VarArrValues = e3s0.values();
                        int length = e3s0VarArrValues.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                e3s0Var = e3s0VarArrValues[i];
                                if (!e3s0Var.a.equals(str)) {
                                    i++;
                                }
                            } else {
                                e3s0Var = null;
                            }
                        }
                        e3s0 e3s0Var2 = e3s0.h;
                        if (e3s0Var == null) {
                            e3s0Var = e3s0Var2;
                        }
                        if (e3s0Var != e3s0Var2) {
                            boolean z = r2s0Var.a == q2s0.a;
                            boolean zB = e3s0Var == e3s0.f ? t2s0Var.c.b() : t2s0Var.b.a(e3s0Var);
                            String str2 = r2s0Var.b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            h380VarA.e(e3s0Var, new g19(z, zB, str2));
                        } else {
                            Logger.d("Unknown partner type: %s", new Object[]{r2s0Var.c});
                        }
                    }
                }
                return h380VarA.b(true);
            case 7:
                PlayerState playerState = (PlayerState) obj;
                return (playerState.isPaused() || !playerState.isPlaying()) ? Observable.just(playerState) : Observable.combineLatest(Observable.just(playerState), Observable.interval(0L, 15L, TimeUnit.SECONDS, (Scheduler) obj2), new qpp0((byte) 13));
            case 14:
                final Boolean bool = (Boolean) obj;
                return ((zyt0) obj2).N1.a().map(new Function() { // from class: p.yyt0
                    public final Object apply(Object obj3) {
                        PlayerError playerError = (PlayerError) obj3;
                        switch (b2) {
                            case 0:
                                break;
                        }
                        return new vyt0(playerError, bool.booleanValue());
                    }
                });
            case 16:
                final Boolean bool2 = (Boolean) obj;
                return ((zeu0) ((zsc) obj2).c).a().map(new Function() { // from class: p.yyt0
                    public final Object apply(Object obj3) {
                        PlayerError playerError = (PlayerError) obj3;
                        switch (b3) {
                            case 0:
                                break;
                        }
                        return new vyt0(playerError, bool2.booleanValue());
                    }
                });
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                j4b1 j4b1Var = j4b1.L2;
                Resources resources = (Resources) ((aru0) obj2).d;
                String string = resources.getString(2131955714);
                String string2 = resources.getString(2131955713);
                zpb0 zpb0Var = ee70.a;
                HubsImmutableComponentBundle hubsImmutableComponentBundle = HubsImmutableComponentBundle.b;
                return ee70.a(j4b1Var, string, string2, new HubsImmutableComponentBundle());
            default:
                return (erw0) ((nt9) obj2).invoke(obj);
        }
    }

    public Object b(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                k3q k3qVar = (k3q) obj3;
                qop qopVar = (qop) obj;
                daq daqVar = k3qVar.a;
                teq teqVar = k3qVar.b;
                qopVar.getClass();
                ((act) obj2).getClass();
                Intent intentA = qopVar.a();
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                c8o.l(lzn0Var);
                mnk0 mnk0Var = (mnk0) teqVar.b6.get();
                c8o.l(mnk0Var);
                q8n q8nVar = (q8n) daqVar.w1.get();
                c8o.l(q8nVar);
                return new ojq0(intentA, lzn0Var, mnk0Var, q8nVar, (byte) 0);
            case 1:
                l3q l3qVar = (l3q) obj3;
                qop qopVar2 = (qop) obj;
                act actVar = (act) obj2;
                daq daqVar2 = l3qVar.a;
                teq teqVar2 = l3qVar.b;
                qopVar2.getClass();
                actVar.getClass();
                Intent intentA2 = qopVar2.a();
                koc0 koc0Var = actVar.f;
                xh71 xh71Var = (xh71) teqVar2.N3.get();
                c8o.l(xh71Var);
                q8n q8nVar2 = (q8n) daqVar2.w1.get();
                c8o.l(q8nVar2);
                return new ojq0(intentA2, koc0Var, xh71Var, q8nVar2, (byte) 1);
            case 2:
                act actVar2 = (act) obj2;
                daq daqVar3 = ((d0q) obj3).a;
                ((qop) obj).getClass();
                actVar2.getClass();
                Context context = (Context) daqVar3.x1.a;
                c8o.l(context);
                koc0 koc0Var2 = actVar2.f;
                txc0 txc0Var = actVar2.g;
                c8o.l(txc0Var);
                q8n q8nVar3 = (q8n) daqVar3.E1.get();
                c8o.l(q8nVar3);
                q8n q8nVar4 = (q8n) daqVar3.V2.get();
                c8o.l(q8nVar4);
                return new yu8(context, koc0Var2, txc0Var, q8nVar3, q8nVar4, (byte) 1);
            case 8:
                qop qopVar3 = (qop) obj;
                daq daqVar4 = ((t2q) obj3).a;
                qopVar3.getClass();
                ((act) obj2).getClass();
                Intent intentA3 = qopVar3.a();
                kt91 kt91Var = (kt91) daqVar4.f8.get();
                c8o.l(kt91Var);
                return new fms0(intentA3, kt91Var);
            case 9:
                qop qopVar4 = (qop) obj;
                teq teqVar3 = ((mzp) obj3).a;
                qopVar4.getClass();
                ((act) obj2).getClass();
                iyc0 iyc0Var = (iyc0) teqVar3.g1.get();
                c8o.l(iyc0Var);
                return new odm(iyc0Var, qopVar4.b, qopVar4.d());
            case 12:
                qop qopVar5 = (qop) obj;
                bct bctVar = (bct) obj2;
                teq teqVar4 = ((w7q) obj3).a;
                m0q m0qVar = new m0q(teqVar4);
                qopVar5.getClass();
                bctVar.getClass();
                b6p b6pVar = new b6p(m0qVar, qopVar5, bctVar);
                String strD = qopVar5.d();
                koc0 koc0Var3 = bctVar.d;
                u6y0 u6y0Var = (u6y0) teqVar4.l8.get();
                c8o.l(u6y0Var);
                i5y0 i5y0Var = (i5y0) teqVar4.pb.get();
                c8o.l(i5y0Var);
                rg4 rg4Var = (rg4) teqVar4.ob.get();
                c8o.l(rg4Var);
                wxp wxpVar = (wxp) ((jly0) b6pVar.c).get();
                y4m1 y4m1Var = (y4m1) teqVar4.Le.get();
                c8o.l(y4m1Var);
                return new rb3(strD, koc0Var3, u6y0Var, i5y0Var, rg4Var, wxpVar, y4m1Var, teqVar4.g4());
            case 13:
                l3q l3qVar2 = (l3q) obj3;
                qop qopVar6 = (qop) obj;
                act actVar3 = (act) obj2;
                daq daqVar5 = l3qVar2.a;
                teq teqVar5 = l3qVar2.b;
                qopVar6.getClass();
                actVar3.getClass();
                String strD2 = qopVar6.d();
                iyc0 iyc0Var2 = (iyc0) teqVar5.g1.get();
                c8o.l(iyc0Var2);
                koc0 koc0Var4 = actVar3.f;
                q8n q8nVar5 = (q8n) daqVar5.E1.get();
                c8o.l(q8nVar5);
                luk lukVar = (luk) daqVar5.L1.get();
                c8o.l(lukVar);
                return new yu8(strD2, iyc0Var2, koc0Var4, q8nVar5, new ep4(false, lukVar), (byte) 2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k3q k3qVar2 = (k3q) obj3;
                bct bctVar2 = (bct) obj2;
                daq daqVar6 = k3qVar2.a;
                l3q l3qVar3 = new l3q(daqVar6, k3qVar2.b);
                ((qop) obj).getClass();
                bctVar2.getClass();
                wtp wtpVar = new wtp(l3qVar3, bctVar2);
                Context context2 = (Context) daqVar6.x1.a;
                c8o.l(context2);
                return new ce3(context2, bctVar2.d, (fzo) ((jly0) wtpVar.b).get(), (byte) 1);
            case 22:
                qop qopVar7 = (qop) obj;
                act actVar4 = (act) obj2;
                daq daqVar7 = ((p0q) obj3).b;
                qopVar7.getClass();
                actVar4.getClass();
                koc0 koc0Var5 = actVar4.f;
                kt91 kt91Var2 = (kt91) daqVar7.f8.get();
                c8o.l(kt91Var2);
                q8n q8nVar6 = (q8n) daqVar7.E1.get();
                c8o.l(q8nVar6);
                bpb1 bpb1VarB = qopVar7.b();
                q8n q8nVar7 = (q8n) daqVar7.V2.get();
                c8o.l(q8nVar7);
                return new fjk0(koc0Var5, kt91Var2, q8nVar6, bpb1VarB, q8nVar7);
            default:
                qop qopVar8 = (qop) obj;
                teq teqVar6 = ((yzp) obj3).a;
                zzp zzpVar = new zzp(teqVar6);
                qopVar8.getClass();
                ((mbt) obj2).getClass();
                k2q k2qVar = new k2q(zzpVar, qopVar8);
                String strD3 = qopVar8.d();
                jkq jkqVar = (jkq) ((jly0) k2qVar.c).get();
                ouw ouwVar = (ouw) teqVar6.a.Pb.get();
                c8o.l(ouwVar);
                return new zlx0(strD3, jkqVar, ouwVar);
        }
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                qbs0 qbs0Var = (qbs0) zf30Var;
                rbs0 rbs0Var = (rbs0) ((t700) obj).b.get();
                rbs0Var.getClass();
                qbs0Var.getClass();
                wtp wtpVar = new wtp(rbs0Var);
                qbs0Var.M1 = brt.x();
                qbs0Var.O1 = xqu.a((dlp) wtpVar.b);
                qbs0Var.V1 = xqu.a((dlp) wtpVar.c);
                c8o.l((kt91) rbs0Var.e.get());
                dma1 dma1Var = (dma1) rbs0Var.f.get();
                c8o.l(dma1Var);
                yqg yqgVar = (yqg) rbs0Var.g.get();
                c8o.l(yqgVar);
                nfa0 nfa0Var = (nfa0) rbs0Var.j.get();
                c8o.l(nfa0Var);
                qbs0Var.W1 = new xcs0(dma1Var, yqgVar, nfa0Var);
                nqh nqhVar = (nqh) rbs0Var.h.get();
                c8o.l(nqhVar);
                qbs0Var.X1 = nqhVar;
                g341 g341Var = (g341) rbs0Var.i.get();
                c8o.l(g341Var);
                qbs0Var.Y1 = g341Var;
                break;
            case 10:
                wts0 wts0Var = (wts0) zf30Var;
                xts0 xts0Var = (xts0) ((t700) obj).b.get();
                xts0Var.getClass();
                wts0Var.getClass();
                qqp qqpVar = new qqp(xts0Var, wts0Var);
                ohv0 ohv0Var = (ohv0) xts0Var.c.get();
                c8o.l(ohv0Var);
                wts0Var.G1 = ohv0Var;
                Scheduler scheduler = (Scheduler) xts0Var.g.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) xts0Var.f.get();
                c8o.l(scheduler2);
                Context context = (Context) xts0Var.a.a;
                c8o.l(context);
                nfa0 nfa0Var2 = (nfa0) xts0Var.b.get();
                c8o.l(nfa0Var2);
                br81 br81Var = (br81) xts0Var.d.get();
                c8o.l(br81Var);
                aus0 aus0Var = new aus0(context, nfa0Var2, rt71.y(br81Var));
                tac0 tac0Var = ((zf30) wts0Var).s1;
                i8h1 i8h1Var = (i8h1) xts0Var.i.get();
                c8o.l(i8h1Var);
                mwn0 mwn0Var = (mwn0) xts0Var.j.get();
                c8o.l(mwn0Var);
                wts0Var.H1 = new yts0(wts0Var, scheduler, scheduler2, aus0Var, tac0Var, i8h1Var, mwn0Var);
                g1f0 g1f0Var = (g1f0) xts0Var.k.get();
                c8o.l(g1f0Var);
                wts0Var.I1 = g1f0Var;
                kg0 kg0Var = (kg0) xts0Var.e.get();
                c8o.l(kg0Var);
                wts0Var.J1 = kg0Var;
                wts0Var.K1 = (mir0) ((jly0) qqpVar.c).get();
                break;
            case 11:
                y0t0 y0t0Var = (y0t0) zf30Var;
                v0t0 v0t0Var = (v0t0) ((t700) obj).b.get();
                v0t0Var.getClass();
                y0t0Var.getClass();
                ca40 ca40Var = (ca40) v0t0Var.a.get();
                c8o.l(ca40Var);
                y0t0Var.W1 = ca40Var;
                break;
            case 15:
                zyt0 zyt0Var = (zyt0) zf30Var;
                azt0 azt0Var = (azt0) ((t700) obj).b.get();
                azt0Var.getClass();
                zyt0Var.getClass();
                kt91 kt91Var = (kt91) azt0Var.a.get();
                c8o.l(kt91Var);
                zyt0Var.I1 = kt91Var;
                crd crdVar = (crd) azt0Var.b.get();
                c8o.l(crdVar);
                zyt0Var.J1 = crdVar;
                y390 y390Var = (y390) azt0Var.c.get();
                c8o.l(y390Var);
                zyt0Var.K1 = y390Var.a(zyt0Var, r6h1.c);
                yh2 yh2Var = (yh2) azt0Var.i.get();
                c8o.l(yh2Var);
                zyt0Var.L1 = yh2Var;
                wyt0 wyt0Var = (wyt0) azt0Var.d.get();
                c8o.l(wyt0Var);
                zyt0Var.M1 = wyt0Var;
                zeu0 zeu0Var = (zeu0) azt0Var.e.get();
                c8o.l(zeu0Var);
                zyt0Var.N1 = zeu0Var;
                o241 o241Var = (o241) azt0Var.f.get();
                c8o.l(o241Var);
                zyt0Var.O1 = o241Var;
                Scheduler scheduler3 = (Scheduler) azt0Var.h.get();
                c8o.l(scheduler3);
                zyt0Var.P1 = scheduler3;
                nw40 nw40Var = (nw40) azt0Var.g.get();
                c8o.l(nw40Var);
                zyt0Var.Q1 = nw40Var;
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                z2v0 z2v0Var = (z2v0) zf30Var;
                a3v0 a3v0Var = (a3v0) ((t700) obj).b.get();
                a3v0Var.getClass();
                z2v0Var.getClass();
                h72 h72Var = new h72(a3v0Var, z2v0Var);
                z2v0Var.F1 = (k3v0) ((jly0) h72Var.d).get();
                z2v0Var.G1 = (e3v0) ((jly0) h72Var.t).get();
                z2v0Var.H1 = (l3v0) ((jly0) h72Var.Y).get();
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                g7v0 g7v0Var = (g7v0) zf30Var;
                h7v0 h7v0Var = (h7v0) ((t700) obj).b.get();
                h7v0Var.getClass();
                g7v0Var.getClass();
                g7v0Var.G1 = (dgs) ((jly0) new wj3(h7v0Var, g7v0Var).P0).get();
                egs egsVar = (egs) h7v0Var.j.get();
                c8o.l(egsVar);
                g7v0Var.H1 = egsVar;
                kt91 kt91Var2 = (kt91) h7v0Var.f.get();
                c8o.l(kt91Var2);
                g7v0Var.I1 = kt91Var2;
                break;
            case 25:
                rww0 rww0Var = (rww0) zf30Var;
                sww0 sww0Var = (sww0) ((ynb0) ((uww0) obj).b).get();
                sww0Var.getClass();
                rww0Var.getClass();
                yjq yjqVar = new yjq(sww0Var, rww0Var);
                rww0Var.c2 = (wjq) ((jly0) yjqVar.b).get();
                jo80 jo80Var = sww0Var.c;
                dg30 dg30Var = (dg30) jo80Var.a;
                c8o.l(dg30Var);
                ma41 ma41Var = (ma41) sww0Var.h.get();
                c8o.l(ma41Var);
                dg30 dg30Var2 = (dg30) jo80Var.a;
                c8o.l(dg30Var2);
                lls0 lls0Var = new lls0(dg30Var2, (byte) 19);
                Object objT = jhc1.t(rww0Var.O0(), "extra_profile", tzw0.class);
                objT.getClass();
                tzw0 tzw0Var = (tzw0) objT;
                nzw0 nzw0Var = new nzw0(tzw0Var.a, tzw0Var.b, tzw0Var.c, tzw0Var.d);
                Scheduler scheduler4 = (Scheduler) sww0Var.f.get();
                c8o.l(scheduler4);
                Scheduler scheduler5 = (Scheduler) sww0Var.g.get();
                c8o.l(scheduler5);
                lzw0 lzw0Var = (lzw0) ((jly0) yjqVar.e).get();
                dg30 dg30Var3 = (dg30) jo80Var.a;
                c8o.l(dg30Var3);
                dg30 dg30Var4 = (dg30) jo80Var.a;
                c8o.l(dg30Var4);
                otu otuVar = new otu(dg30Var3, ((g0i) dg30Var4).i.h("com.spotify.profile.editprofile.permission.EditProfilePermissionsManager", new e1r0((byte) 3, false), new tww0((lzw0) ((jly0) yjqVar.e).get(), (byte) 0)), (byte) 10);
                dg30 dg30Var5 = (dg30) jo80Var.a;
                c8o.l(dg30Var5);
                rww0Var.d2 = new qis(dg30Var, ma41Var, rww0Var, lls0Var, nzw0Var, scheduler4, scheduler5, lzw0Var, otuVar, ((g0i) dg30Var5).i.h("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", new e1r0((byte) 11), new tww0((lzw0) ((jly0) yjqVar.e).get(), (byte) 1)));
                rww0Var.e2 = (lzw0) ((jly0) yjqVar.e).get();
                rww0Var.f2 = (xjq) ((jly0) yjqVar.f).get();
                RetrofitMaker retrofitMaker = (RetrofitMaker) sww0Var.i.get();
                c8o.l(retrofitMaker);
                rww0Var.g2 = new yww0(iwv0.t(retrofitMaker));
                i8h1 i8h1Var2 = (i8h1) sww0Var.e.get();
                c8o.l(i8h1Var2);
                rww0Var.h2 = i8h1Var2;
                l6h1 l6h1Var = (l6h1) sww0Var.j.get();
                c8o.l(l6h1Var);
                rww0Var.i2 = l6h1Var;
                break;
            default:
                fmx0 fmx0Var = (fmx0) zf30Var;
                gmx0 gmx0Var = (gmx0) ((ynb0) ((uww0) obj).b).get();
                gmx0Var.getClass();
                fmx0Var.getClass();
                a1r0 a1r0Var = (a1r0) gmx0Var.a.get();
                c8o.l(a1r0Var);
                fmx0Var.W1 = a1r0Var;
                break;
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        boolean z = blc0.kd == ((blc0) this.b);
        String string = intent.getData().toString();
        Set set = s4b1.f;
        Parcelable parcelableM = d7p1.m(uic.x(string));
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_root", z);
        bundle.putParcelable("uri", parcelableM);
        return new frn0(bundle, z2v0.class);
    }

    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public n8d0 m600apply(Object obj) {
        return (n8d0) ((mwv0) this.b).invoke(obj);
    }

    public Object apply(Object obj, Object obj2) {
        ((u0s0) this.b).startActivityForResult((Intent) obj, ((Integer) obj2).intValue());
        return Boolean.TRUE;
    }
}
