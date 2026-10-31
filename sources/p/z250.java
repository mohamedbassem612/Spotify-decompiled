package p;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp/z250;", "Lp/t2u;", "Lp/tqd0;", "<init>", "()V", "src_main_java_com_spotify_livesharing_googlemeetui-googlemeetui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class z250 extends t2u implements tqd0 {
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

    @Override // p.tqd0
    public final void X(uqd0 uqd0Var) {
        this.V1.add(uqd0Var);
    }

    public abstract String i1();

    public final void j1() {
        Iterator it = this.V1.iterator();
        while (it.hasNext()) {
            ((uqd0) it.next()).b();
        }
    }

    public final void k1() {
        Iterator it = this.V1.iterator();
        while (it.hasNext()) {
            ((uqd0) it.next()).a();
        }
    }

    @Override // p.tqd0
    public final void m(th30 th30Var) {
        g1(th30Var, i1());
    }
}
