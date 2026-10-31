package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iux extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ short e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iux(Uri uri, ksl kslVar, qim0 qim0Var, j6m j6mVar, jmr0 jmr0Var, jmr0 jmr0Var2, tl3 tl3Var, int i, int i2) {
        super(2);
        this.b = uri;
        this.f = kslVar;
        this.d = qim0Var;
        this.g = j6mVar;
        this.h = jmr0Var;
        this.i = jmr0Var2;
        this.t = tl3Var;
        this.c = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.c | 1);
                short s = this.e;
                Uri uri = this.b;
                qim0 qim0Var = this.d;
                cso1.d(uri, (ksl) obj7, qim0Var, (j6m) obj6, (jmr0) obj5, (jmr0) obj4, (tl3) obj3, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                short s2 = this.e;
                Uri uri2 = this.b;
                int i = this.c;
                j2p1.o((String) obj7, uri2, (String) obj6, (String) obj5, (String) obj4, i, (s171) obj3, this.d, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public iux(String str, Uri uri, String str2, String str3, String str4, int i, s171 s171Var, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.f = str;
        this.b = uri;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.c = i;
        this.t = s171Var;
        this.d = qim0Var;
        this.e = i3;
    }
}
