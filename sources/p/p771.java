package p;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p771 {
    public final Context a;
    public final oi b;

    public p771(Context context, a1g1 a1g1Var) {
        this.a = context;
        this.b = ((g420) a1g1Var.b).a();
    }

    public final l420 a(String str) {
        File cacheDir = this.a.getApplicationContext().getCacheDir();
        oi oiVar = this.b;
        l420 l420VarN = oiVar.n(cacheDir, "videoshare");
        File file = l420VarN.b;
        if (file.exists() || l420VarN.mkdirs()) {
            return oiVar.p(l420VarN, str);
        }
        bhn0.f("Can't create directory ".concat(file.getAbsolutePath()));
        return null;
    }
}
