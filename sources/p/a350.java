package p;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/a350;", "Lp/dwb;", "Lp/tqd0;", "<init>", "()V", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a350 extends dwb implements tqd0 {
    public final LinkedHashSet V1 = new LinkedHashSet();

    public final void D0() {
        ((zf30) this).h1 = true;
        Iterator it = this.V1.iterator();
        while (it.hasNext()) {
            ((uqd0) it.next()).getClass();
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        Iterator it = this.V1.iterator();
        while (it.hasNext()) {
            ((uqd0) it.next()).c();
        }
    }

    public final void I0(View view, Bundle bundle) {
        ((View) view.getParent()).setBackgroundColor(0);
    }

    @Override // p.tqd0
    public final void X(uqd0 uqd0Var) {
        this.V1.add(uqd0Var);
    }

    public final Dialog c1(Bundle bundle) {
        cwb cwbVarC1 = super.c1(bundle);
        cwbVarC1.g().L(3);
        return cwbVarC1;
    }

    public abstract String i1();

    @Override // p.tqd0
    public final void m(th30 th30Var) {
        g1(th30Var, i1());
    }
}
