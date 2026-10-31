package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.recents.recentsdatasourceimpl.events.proto.RecentsDecorationErrorEvent;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n5u0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5u0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        bxt bxtVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return k5u0.b((k5u0) obj, 0L, (Long) null, (Long) null, false, 0.0f, false, (Integer) null, ((yhg0) obj2).c, (String) null, (jgc1) null, 0, false, false, 32511);
            case 1:
                smp0 smp0Var = (smp0) obj2;
                return new x010(((n3v) smp0Var.c).a(), ((lut0) smp0Var.d).c, new irp0(3, (lnm) null, (byte) 9), (byte) 1);
            case 2:
                bxt bxtVar2 = (bxt) obj;
                k7u0 k7u0Var = (k7u0) obj2;
                guc1 guc1Var = (guc1) k7u0Var.t.getValue();
                if (u890.j((guc1Var == null || (bxtVar = guc1Var.a) == null) ? null : bxtVar.d(), bxtVar2.d())) {
                    k7u0Var.t.l((Object) null);
                }
                return rih1Var;
            case 3:
                return new vm61(2131953407, 2131953406, 2131953405, new vm0((c8u0) obj2, (lnm) null, (byte) 25), new um61(new sl11(1, (byte) 7), new n601(hxt0.O0, (byte) 28), fft0.Z0));
            case 4:
                pcf.a(((k8u0) obj2).b, pro1.t("chatFeaturePlayedReceipts"), (tv80) obj, (Bundle) null);
                return rih1Var;
            case 5:
                lgu0 lgu0Var = (lgu0) obj2;
                return d3p1.F(lgu0Var.a, lgu0Var.b, (jgu0) obj);
            case 6:
                return new suc(((quc) obj2).c);
            case 7:
                oju0 oju0Var = (oju0) ((tju0) obj2);
                return new iju0(((Number) obj).intValue(), oju0Var.a, oju0Var.b);
            case 8:
                String strM = l1d.m("Failed to fetch playlist metadata: ", ((jy21) obj).b());
                Logger.d(strM, new Object[0]);
                t2j0 t2j0Var = (t2j0) ((phi0) obj2).e;
                wr01 wr01VarN = RecentsDecorationErrorEvent.n();
                wr01VarN.q(strM);
                wr01VarN.r("playlist_decorator");
                wr01VarN.n("data_fetch_error");
                t2j0Var.a(wr01VarN.build());
                return new kby((String) null, -1);
            case 9:
                return new yg40(((tg40) obj2).c);
            case 10:
                return ((zfx) ((dx0) obj2).d).a((l0i) null);
            case 11:
                wfx wfxVar = ((px6) obj2).b.c;
                return new eos(wfxVar.b, wfxVar.a, (byte) 8);
            case 12:
                Bundle bundle = (Bundle) obj;
                qzu0 qzu0Var = (qzu0) obj2;
                qzu0Var.E0 = bundle;
                Bundle bundle2 = bundle.getBundle("deferred_component_state");
                if (bundle2 != null) {
                    d3t d3tVar = qzu0Var.a;
                    ArrayList arrayListC = qzu0Var.c();
                    d3tVar.d = true;
                    if (d3tVar.a) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : arrayListC) {
                            if (obj3 instanceof mqb1) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((mqb1) it.next()).e(bundle2);
                        }
                    } else {
                        d3tVar.e = bundle2;
                    }
                }
                return rih1Var;
            case 13:
                String str = (String) obj;
                LinkedHashMap linkedHashMap = ((j1v0) obj2).r;
                if (linkedHashMap == null) {
                    u890.C("allSectionElementsAndCompanions");
                    throw null;
                }
                wtw wtwVar = (wtw) linkedHashMap.get(str);
                if (wtwVar != null) {
                    return wtwVar.c.a;
                }
                return null;
            case 14:
                return ((wul1) obj).getData().a((cxc0) obj2);
            case 15:
                return ((h3v0) obj2).b;
            case 16:
                q5v0 q5v0Var = (q5v0) obj2;
                return new yhl0(q5v0Var.C.path(), q5v0Var.D.a, (r6h1) obj);
            case 17:
                a7v0 a7v0Var = (a7v0) obj2;
                return a7v0Var.b.a(voo1.t(a7v0Var.d, (xzf1) obj));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((o7v0) obj2).b;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                cas casVar = (a7m0) obj;
                casVar.a = vbv0.c;
                casVar.d = tnt0.S0;
                casVar.b = RxEventSources.a(new ObservableSource[]{yoi1.i(((zwz0) ((sks0) ((tzr0) obj2).e).b).c(), o6x.a).distinctUntilChanged().map(c710.b1)});
                return rih1Var;
            case 20:
                ytp0 ytp0Var = (ytp0) obj2;
                return ((koc0) ytp0Var.c).e().filter(new cua(ytp0Var, (byte) 20)).distinctUntilChanged().switchMap(new swm0(ytp0Var, (byte) 28)).distinctUntilChanged().firstOrError().onErrorReturnItem(new p810("", "", z6x.a, false)).toObservable().toFlowable(BackpressureStrategy.d);
            case 21:
                b261.y((e261) obj, ((xdv0) obj2).c);
                return rih1Var;
            case 22:
                return new uxd(((ce3) obj2).b.getString(2131960253));
            case 23:
                return ((xhv0) obj2).l.getView();
            case 24:
                return ((o3m0) obj).a(((vhv0) obj2).a);
            case 25:
                ((qtr) obj).b(new u08((hjv0) obj2, (lnm) null, (byte) 13));
                return rih1Var;
            case 26:
                return ((hjc) ((rt01) obj2).c).a((l0i) null);
            case 27:
                return ((ofx) ((rt01) obj2).c).a((l0i) null);
            case 28:
                return ((zfx) ((rt01) obj2).c).a((l0i) null);
            default:
                return ((avv0) obj2).a.c;
        }
    }
}
