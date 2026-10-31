package p;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f94 implements e94 {
    public final g94 a;

    public f94(g94 g94Var) {
        this.a = g94Var;
    }

    public final kmg a() {
        ClipData primaryClip = this.a.a().getPrimaryClip();
        if (primaryClip != null) {
            return new kmg(primaryClip);
        }
        return null;
    }

    public final void b(kmg kmgVar) {
        g94 g94Var = this.a;
        if (kmgVar != null) {
            g94Var.a().setPrimaryClip(kmgVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ph5.d(g94Var.a());
        } else {
            g94Var.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
