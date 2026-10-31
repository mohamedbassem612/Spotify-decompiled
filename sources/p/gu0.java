package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gu0 implements d0u0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public /* synthetic */ gu0(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = serializable;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
    }

    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fu0(this);
            default:
                l811 l811Var = this.e;
                return new oa71(m0u0Var, oot0Var, new jt41(l811Var, (ven0) this.f, (byte) 24), new fh61(l811Var, (ven0) this.g, (byte) 15), new fh61((xwa) this.h, (ven0) this.i, (byte) 16), (yqg) this.b, (q8n) this.c, (q8n) this.d);
        }
    }
}
