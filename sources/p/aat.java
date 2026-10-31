package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aat extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Comparable e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aat(Uri uri, boolean z, nux nuxVar, qim0 qim0Var, j6m j6mVar, int i, int i2) {
        super(2);
        this.e = uri;
        this.b = z;
        this.f = nuxVar;
        this.g = qim0Var;
        this.h = j6mVar;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Comparable comparable = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.d;
                boolean z = this.b;
                pdp1.e((String) comparable, (String) obj5, (wpo1) obj4, z, (Function0) obj3, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.d;
                boolean z2 = this.b;
                x2g0.p((Uri) comparable, z2, (nux) obj5, (qim0) obj4, (j6m) obj3, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public aat(String str, String str2, wpo1 wpo1Var, boolean z, Function0 function0, int i, int i2) {
        super(2);
        this.e = str;
        this.f = str2;
        this.g = wpo1Var;
        this.b = z;
        this.h = function0;
        this.c = i;
        this.d = i2;
    }
}
