package p;

import android.view.Surface;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vdm1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cem1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vdm1(cem1 cem1Var, byte b) {
        super(1);
        this.a = b;
        this.b = cem1Var;
    }

    public final Object invoke(Object obj) {
        m3c m3cVar;
        byte b = this.a;
        cem1 cem1Var = this.b;
        switch (b) {
            case 0:
                Surface surface = (Surface) obj;
                qem1 qem1Var = cem1Var.d;
                if (qem1Var != null) {
                    qem1Var.f = surface;
                    yo00 yo00Var = qem1Var.e;
                    if (yo00Var != null) {
                        yo00Var.n(surface);
                    }
                }
                return rih1.a;
            default:
                ycm1 ycm1Var = cem1Var.e;
                ycm1Var.d();
                ycm1Var.i.clear();
                cdm1 cdm1Var = (cdm1) o7h.s0(ycm1Var.c);
                ycm1Var.d = cdm1Var != null ? cdm1Var.a : null;
                ycm1Var.f();
                ycm1Var.k = 0.0f;
                ycm1Var.h();
                ycm1Var.o = true;
                if (ycm1Var.n && (m3cVar = ycm1Var.j) != null && !m3cVar.b) {
                    Iterator it = ((LinkedHashMap) m3cVar.d).values().iterator();
                    while (it.hasNext()) {
                        ((hth0) it.next()).d();
                    }
                }
                ycm1Var.n = true;
                ycm1Var.g();
                return new kcf1(cem1Var, (byte) 14);
        }
    }
}
