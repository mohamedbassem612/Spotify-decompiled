package p;

import com.google.android.recaptcha.internal.zzals;
import com.google.android.recaptcha.internal.zzanf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lin1 {
    public static final hin1 b;
    public final rin1 a;

    static {
        hin1 hin1Var = hin1.b;
        int i = phn1.a;
        b = hin1.b;
    }

    public lin1(rin1 rin1Var) {
        this.a = rin1Var;
    }

    public final rin1 a(byte[] bArr) throws zzals {
        rin1 rin1VarR = rin1.r(this.a, bArr, bArr.length, b);
        if (rin1VarR == null || rin1.q(rin1VarR, true)) {
            return rin1VarR;
        }
        x4n1.g(new zzanf().getMessage());
        return null;
    }
}
