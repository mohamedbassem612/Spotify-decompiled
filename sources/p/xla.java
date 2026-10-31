package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xla extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ cv30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(int i, int i2, int i3, int i4, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, int i5) {
        super(2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = j2iVar;
        this.h = j2iVar2;
        this.i = j2iVar3;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.i;
        Object obj3 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                j2i j2iVar2 = this.h;
                j2i j2iVar3 = (j2i) function0;
                int iP = czo1.p(1794049);
                n9p1.g(this.c, this.d, this.e, this.f, j2iVar, j2iVar2, j2iVar3, this.b, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                vu30 vu30Var = this.h;
                bqn1.p((String) obj3, vu30Var, function0, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(String str, vu30 vu30Var, Function0 function0, qim0 qim0Var, int i, int i2, int i3, int i4, int i5) {
        super(2);
        this.g = str;
        this.h = vu30Var;
        this.i = function0;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }
}
