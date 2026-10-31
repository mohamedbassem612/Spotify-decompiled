package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class grn extends hab0 implements vu30 {
    public final /* synthetic */ Uri X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ grn(Uri uri, boolean z, boolean z2, boolean z3, Function0 function0, iu30 iu30Var, Function0 function1, String str, String str2, Uri uri2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = uri;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = function0;
        this.g = iu30Var;
        this.h = function1;
        this.i = str;
        this.t = str2;
        this.X = uri2;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.Y;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                aqo1.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                aqo1.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
