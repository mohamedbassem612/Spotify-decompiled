package p;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ij6 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ ij6(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final void dispose() {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((iu30) ven0Var.getValue()).invoke(Boolean.FALSE);
                break;
            case 1:
                Bitmap bitmap = (Bitmap) ven0Var.getValue();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                break;
            case 2:
                pn31 pn31Var = (pn31) ven0Var.getValue();
                if (pn31Var != null) {
                    xku xkuVar = pn31Var.f;
                    xkuVar.b(pn31Var);
                    Iterator it = pn31Var.g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            xku xkuVar2 = xkuVar instanceof xku ? xkuVar : null;
                            if (xkuVar2 != null) {
                                xkuVar2.dispose();
                            }
                            pn31Var.b.h(pn31Var);
                            smo1.p(pn31Var.c, (CancellationException) null);
                            pn31Var.h.a(w7x.a, (ArrayList) null, (ArrayList) null);
                            break;
                        } else {
                            v3h1 v3h1Var = (v3h1) it.next();
                            xku xkuVar3 = v3h1Var instanceof xku ? (xku) v3h1Var : null;
                            if (xkuVar3 != null) {
                                xkuVar3.dispose();
                            }
                        }
                    }
                }
                break;
            case 3:
                ven0Var.setValue(Boolean.FALSE);
                break;
            case 4:
                ven0Var.setValue(Boolean.FALSE);
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                break;
        }
    }
}
