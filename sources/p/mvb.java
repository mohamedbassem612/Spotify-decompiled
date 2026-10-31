package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mvb implements t1i {
    public final cfd a;
    public Consumer b;
    public Action c;

    public mvb(cfd cfdVar) {
        this.a = cfdVar;
    }

    @Override // p.t1i
    public final void e(q1i q1iVar) {
        View view = q1iVar.a.getView();
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(2131165301);
        view.setPaddingRelative(view.getResources().getDimensionPixelOffset(2131165300), dimensionPixelOffset, view.getResources().getDimensionPixelOffset(2131165299), dimensionPixelOffset);
    }

    @Override // p.t1i
    public final void k(r1i r1iVar) {
        Object pkkVar;
        of3 of3Var = (of3) r1iVar.d;
        String str = ((pf3) r1iVar.c).d;
        int i = r1iVar.b;
        Consumer consumer = this.b;
        if (consumer != null) {
            hr80 hr80Var = of3Var.a;
            boolean z = hr80Var instanceof nf3;
            cfd cfdVar = this.a;
            if (z) {
                tv80 tv80VarS = cfdVar.s(new zu80(str, i));
                Action action = this.c;
                if (action != null) {
                    action.run();
                }
                pkkVar = new rkk(i, str, tv80VarS);
            } else {
                if (!(hr80Var instanceof mf3)) {
                    eg.o();
                    return;
                }
                pkkVar = ((mf3) hr80Var).e ? new pkk(str, cfdVar.s(new xu80(str, i))) : new qkk(str, cfdVar.s(new yu80(str, i)));
            }
            consumer.accept(pkkVar);
        }
    }
}
