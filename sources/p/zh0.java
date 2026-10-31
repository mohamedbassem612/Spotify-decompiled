package p;

import android.view.View;
import com.spotify.mobius.MobiusLoop;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zh0 implements o5s, ko21 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ zh0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public Object a(qf01 qf01Var) {
        Object objN = u890.n((x8c0) this.b, qf01Var);
        return objN == d9n.a ? objN : rih1.a;
    }

    public void b() {
        ((x8c0) this.b).d(this);
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((f0i) ((dg30) obj)).a.d(this);
                ((j0d1) obj2).d((CancellationException) null);
                break;
            case 1:
                ks3 ks3Var = (ks3) ((hs3) obj2);
                MobiusLoop mobiusLoop = ks3Var.i;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                }
                ks3Var.i = null;
                ((x8c0) obj).d(this);
                break;
            case 2:
                ((l1k) obj).invoke();
                ((x8c0) obj2).d(this);
                break;
            case 3:
                p1m p1mVar = (p1m) obj2;
                MobiusLoop mobiusLoop2 = p1mVar.i;
                if (mobiusLoop2 != null) {
                    mobiusLoop2.dispose();
                }
                p1mVar.i = null;
                ((x8c0) obj).d(this);
                break;
            case 4:
                ((l1k) obj).invoke();
                ((x8c0) obj2).d(this);
                break;
            case 5:
                hvr hvrVar = (hvr) obj;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954011});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954011});
                er91 er91Var = new er91((fs91) null, "", 2131954011, (String) null, 2131954010, new cvr((Object) hvrVar, obj2, (byte) 0), (cvr) null, new dvr(hvrVar, (byte) 0), false);
                boolean zJ = hvrVar.b.j(hvrVar.a);
                kt91 kt91Var = hvrVar.f;
                if (zJ) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                hvrVar.c.d.c.getLifecycle().d(this);
                break;
            case 6:
                ((kt91) ((zeu) obj).b).k((er91) obj2);
                break;
            case 7:
                ((kt91) ((sp00) obj).c).k(new er91((fs91) null, (String) obj2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 8:
                ((faa0) obj2).d((CancellationException) null);
                break;
            case 9:
                ((war0) obj).c((rjp0) obj2);
                break;
            case 10:
                ((qr91) obj).b.k((er91) obj2);
                break;
            default:
                ((nda1) obj).invoke();
                ((x8c0) obj2).d(this);
                break;
        }
    }

    public void start() {
        ((x8c0) this.b).a(this);
    }
}
