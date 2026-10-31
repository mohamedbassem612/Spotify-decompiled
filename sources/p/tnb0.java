package p;

import android.content.Context;
import java.io.File;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tnb0 implements ot40 {
    public static final tnb0 b = new tnb0(0);
    public static final tnb0 c = new tnb0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ tnb0(byte b2) {
        this.a = b2;
    }

    public final File a(Context context, String str) {
        switch (this.a) {
            case 0:
                return jch0.w(context, str);
            default:
                return jch0.w(context, u890.A(".preferences_pb", str));
        }
    }

    public final Object b(Context context, String str) {
        switch (this.a) {
            case 0:
                lnb0 lnb0Var = lnb0.a;
                snb0 snb0Var = new snb0(context, str, (byte) 0);
                fns fnsVar = igu.a;
                llm llmVarE = smo1.e(flo1.l(b3s.c, guo1.B()));
                return new h191(snb0Var, lnb0Var, Collections.singletonList(new vdd(z6x.a, (lnm) null, (byte) 1)), new ekb((byte) 17), llmVarE);
            default:
                return ws10.b((ze3) null, new snb0(context, str, (byte) 1), 7);
        }
    }
}
