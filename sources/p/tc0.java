package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tc0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tc0(Function0 function0, qim0 qim0Var, boolean z, boolean z2, j2i j2iVar, int i, int i2) {
        super(2);
        this.b = function0;
        this.c = qim0Var;
        this.d = z;
        this.e = z2;
        this.f = j2iVar;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j1p1.a(czo1.p(i | 1), this.h, this.b, this.f, (b0k) obj, this.c, this.d, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                cpn1.b(czo1.p(i | 1), this.h, this.b, this.f, (b0k) obj, this.c, this.d, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tc0(qim0 qim0Var, boolean z, boolean z2, Function0 function0, j2i j2iVar, int i, int i2) {
        super(2);
        this.c = qim0Var;
        this.d = z;
        this.e = z2;
        this.b = function0;
        this.f = j2iVar;
        this.g = i;
        this.h = i2;
    }
}
