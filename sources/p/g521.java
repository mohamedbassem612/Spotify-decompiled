package p;

import android.widget.Toast;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g521 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g521(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = 3;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                h521 h521Var = (h521) this.b;
                MobiusLoop mobiusLoop = h521Var.b;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                mmr0 mmr0VarR = bin.r(mobiusLoop);
                Disposable disposable = (Disposable) mmr0VarR.a;
                wen0 wen0Var = (wen0) mmr0VarR.b;
                h521Var.c = disposable;
                return wen0Var;
            case 1:
                f621 f621Var = (f621) this.b;
                iu30 iu30Var = f621Var.O0;
                if (iu30Var != null) {
                    iu30Var.invoke(new a621(f621.y(f621Var)));
                }
                return rih1.a;
            case 2:
                return (i8h1) ((uyp) ((k811) this.b).b).get();
            case 3:
                s880 s880Var = (s880) this.b;
                i8h1 i8h1Var = (i8h1) s880Var.c;
                zul0 zul0Var = (zul0) ((idd1) s880Var.a).getValue();
                zul0Var.getClass();
                x6h1 x6h1VarC = zul0Var.a.c();
                x6h1VarC.i.add(new a7h1("remove_suggestion_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 4:
                return (i8h1) ((uyp) ((k811) this.b).b).get();
            case 5:
                ((ze21) this.b).d.invoke(te21.a);
                return rih1.a;
            case 6:
                zf21 zf21Var = (zf21) this.b;
                return zf21Var.a.a(zf21Var.f, false, false, zf21Var.c);
            case 7:
                ((vl21) this.b).c.a(ixb.c);
                return rih1.a;
            case 8:
                ArrayList arrayListM = ((uxy0) this.b).m((String) null);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListM.iterator();
                while (it.hasNext()) {
                    r7h.W(((rq21) it.next()).a(), arrayList);
                }
                return arrayList;
            case 9:
                return new yx11((js21) this.b, b);
            case 10:
                mx21 mx21Var = (mx21) this.b;
                return mx21Var.b.c(mx21Var.a);
            case 11:
                return Integer.valueOf(((n531) this.b).d.size());
            case 12:
                de31 de31Var = (de31) this.b;
                luk lukVar = de31Var.b;
                if (lukVar != null) {
                    return (de31) lukVar.e(new e4n0(de31Var, (byte) 15));
                }
                return null;
            case 13:
                wdm wdmVar = (wdm) this.b;
                y7c0 y7c0VarA = ((xhp) wdmVar.d).a();
                y7c0VarA.b();
                gww0 gww0Var = gww0.a;
                Observable observable = (Observable) ((vqb0) wdmVar.b).invoke();
                ArrayList arrayList2 = (ArrayList) y7c0VarA.h;
                arrayList2.add(observable.map(new zc80(gww0Var, (byte) 8)));
                mr20 mr20Var = (mr20) ((d3s) wdmVar.c).invoke();
                o6x o6xVar = o6x.a;
                arrayList2.add(yoi1.i(mr20Var, o6xVar).map(new pob((byte) 14, false)));
                arrayList2.add(yoi1.i((mr20) ((gfr) wdmVar.e).invoke(), o6xVar).map(new zc80(fg90.a, (byte) 8)));
                return RxEventSources.a(new ObservableSource[]{y7c0VarA.a(eo31.a).doOnError(mux0.Z0), ((Observable) ((gfr) wdmVar.f).invoke()).doOnError(mux0.a1).map(u9x0.h), ((Observable) ((gfr) wdmVar.g).invoke()).doOnError(mux0.b1).map(vbx0.h), ((Observable) ((jqb0) wdmVar.h).invoke()).doOnError(mux0.c1).map(wbx0.h), ((Observable) ((jqb0) wdmVar.i).invoke()).doOnError(mux0.d1).map(ybx0.h), yoi1.i(new tu41(rqt0.u(new mt(((zns) ((zgz0) wdmVar.t).b).b, (byte) 28)), (byte) 3), o6xVar).doOnError(mux0.X0), yoi1.i(new f5y0(new any((wen0) wdmVar.X, (byte) 18), wdmVar, (byte) 24), o6xVar), yoi1.i(new x3s(rqt0.u(((jqg0) ((lqr) wdmVar.Y).b).a()), (byte) 1), o6xVar).doOnError(mux0.Y0)});
            case 14:
                iz31 iz31Var = (iz31) this.b;
                return uwo1.m(((q940) iz31Var.a.get()).a(iz31Var.c), gz31.b);
            case 15:
                return (tz31) ((mz31) this.b).a.getValue();
            case 16:
                Toast.makeText(((qfl1) ((vi11) this.b).f).a, 2131954276, 0).show();
                return rih1.a;
            case 17:
                vb41 vb41Var = (vb41) this.b;
                return vb41Var.h.doOnSubscribe(new ub41(vb41Var, (byte) 0)).doOnDispose(new ruz0(vb41Var, (byte) 7)).distinctUntilChanged().replay(1).f();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((mqw) this.b).b((Object) null, (dts) null, (String) null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (vkv) ((p2p) this.b).get();
            case 20:
                qn41 qn41Var = (qn41) this.b;
                fn31.T(qn41Var.b, (o8n) null, 0, new ic01((Object) qn41Var, lnmVar, (byte) 25), 3);
                return rih1.a;
            case 21:
                ((ram0) this.b).dispose();
                return rih1.a;
            case 22:
                ilo1.E(kn41.a, (ssw0) this.b);
                return rih1.a;
            case 23:
                ((SerialDisposable) this.b).a(EmptyDisposable.a);
                return rih1.a;
            case 24:
                vn41 vn41Var = (vn41) this.b;
                synchronized (vn41Var.b) {
                    vn41Var.c = null;
                }
                return rih1.a;
            case 25:
                return (i8h1) ((kly0) ((mzr0) this.b).f).get();
            case 26:
                ((ur41) this.b).b = oa41.h;
                return rih1.a;
            case 27:
                bz11 bz11Var = (bz11) this.b;
                return new r951((esw) bz11Var.c, (wao0) bz11Var.g);
            case 28:
                return v8r.q(new c8e1(0L, 6, ((l251) this.b).a));
            default:
                ((PickerCollapsingTitleBar) ((g931) this.b).c).e(true, false, true);
                return rih1.a;
        }
    }
}
