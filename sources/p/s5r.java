package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s5r extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5r(x5r x5rVar, byte b) {
        super(1);
        this.a = b;
        this.b = x5rVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x5r x5rVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e261 e261Var = (e261) obj;
                String strB = kh.b(x5rVar.c);
                if (x5rVar.d == null) {
                    strB = null;
                }
                b261.n(e261Var, o7h.y0(f46.i0(new String[]{strB, x5rVar.e}), "\n", (String) null, (String) null, (iu30) null, 62));
                break;
            default:
                b261.n((e261) obj, x5rVar.e);
                break;
        }
        return rih1Var;
    }
}
