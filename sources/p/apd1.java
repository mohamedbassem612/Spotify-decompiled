package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class apd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ j2i f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apd1(String str, int i, lee1 lee1Var, Function0 function0, j2i j2iVar, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = i;
        this.d = lee1Var;
        this.e = function0;
        this.f = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j2i j2iVar = this.f;
                int iP = czo1.p(24625);
                c0p1.d(this.b, this.c, this.d, this.e, j2iVar, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar2 = this.f;
                int iP2 = czo1.p(24625);
                c0p1.e(this.b, this.c, this.d, this.e, j2iVar2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
