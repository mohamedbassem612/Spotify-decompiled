package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xm8 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public xm8(oi oiVar, zr00 zr00Var) {
        this.a = (byte) 1;
        this.c = oiVar;
        this.b = zr00Var;
    }

    public final void onStart(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                wm8 wm8Var = (wm8) ((vm8) obj2);
                MobiusLoop mobiusLoop = wm8Var.c;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                }
                MobiusLoop mobiusLoopG = Mobius.d(n4.l, ed2.c).h(RxEventSources.a(new ObservableSource[]{wm8Var.a.b(new oi("AuthorBioSheetMetadataLoader", false, new wk3(str, (byte) 23))).filter(o9p1.t).map(new vdn1(new m9x0((byte) 29), str)).onErrorReturnItem(ym8.a)})).d(new lan1(wm8Var, (byte) 29)).g(dn8.a);
                mobiusLoopG.b(new y11(wm8Var, (byte) 3));
                wm8Var.c = mobiusLoopG;
                break;
            case 1:
                oi oiVar = (oi) obj;
                oiVar.d = yoi1.i(((zr00) obj2).a, o6x.a).subscribe(new fv5(oiVar, (byte) 5));
                break;
            default:
                ((Function0) obj2).invoke();
                break;
        }
    }

    public final void onStop(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                MobiusLoop mobiusLoop = ((wm8) ((vm8) this.b)).c;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                }
                break;
            case 1:
                ((Disposable) ((oi) obj).d).dispose();
                break;
            default:
                ((Function0) obj).invoke();
                break;
        }
    }

    public /* synthetic */ xm8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
