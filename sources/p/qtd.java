package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qtd extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtd(String str, long j, Function0 function0, qim0 qim0Var, float f, boolean z, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = j;
        this.d = function0;
        this.e = qim0Var;
        this.f = f;
        this.g = z;
        this.h = j2iVar;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.i;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                h4o1.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                a6o1.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
