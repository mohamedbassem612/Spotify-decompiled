package p;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gr70 implements hx30 {
    public final /* synthetic */ hr70 a;

    public gr70(hr70 hr70Var) {
        this.a = hr70Var;
    }

    public final void onFailure(Throwable th) {
        this.a.d.b(ExportException.a(2000, th));
    }

    public final void onSuccess(Object obj) {
        ie30 ie30Var;
        Bitmap bitmap = (Bitmap) obj;
        this.a.i = (byte) 50;
        ge30 ge30Var = new ge30();
        ge30Var.w = bitmap.getHeight();
        ge30Var.v = bitmap.getWidth();
        ge30Var.o = asj0.p("image/raw");
        ge30Var.G = x8h.i;
        ie30 ie30Var2 = new ie30(ge30Var);
        if (this.a.e && Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
            ge30 ge30VarA = ie30Var2.a();
            ge30VarA.o = asj0.p("image/jpeg_r");
            ie30Var = new ie30(ge30VarA);
        } else {
            ie30Var = ie30Var2;
        }
        try {
            this.a.d.d(2, ie30Var2);
            this.a.f.submit(new c45(this, bitmap, ie30Var, (byte) 19));
        } catch (RuntimeException e) {
            this.a.d.b(ExportException.a(1000, e));
        }
    }
}
