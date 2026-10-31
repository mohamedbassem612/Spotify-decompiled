package p;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jvc implements l120 {
    public final hvc a;
    public final Context b;
    public final gg11 c;
    public final lvc d;

    public jvc(hvc hvcVar, Context context, gg11 gg11Var, lvc lvcVar) {
        this.a = hvcVar;
        this.b = context;
        this.c = gg11Var;
        this.d = lvcVar;
    }

    public final Object a(lnm lnmVar) {
        Bitmap m231Var;
        hvc hvcVar = this.a;
        yuc yucVar = (yuc) this.c.get(hvcVar.getClass());
        if (yucVar != null) {
            try {
                m231Var = yucVar.b(hvcVar, this.b);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            Throwable thA = e331.a(m231Var);
            if (thA != null) {
                String strConcat = "fetcher:".concat(hvcVar.getClass().getSimpleName());
                String message = thA.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                this.d.c(strConcat, message);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            Bitmap bitmap = m231Var;
            if (bitmap != null) {
                return new ss70(new kxa(bitmap), false, 2);
            }
        }
        return null;
    }
}
