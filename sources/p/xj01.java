package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.wrapped.v1.proto.Paragraph;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xj01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Paragraph b;
    public final /* synthetic */ Paragraph c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xj01(Paragraph paragraph, Paragraph paragraph2, boolean z, Function0 function0, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = paragraph;
        this.c = paragraph2;
        this.d = z;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                zj01.a(this.b, this.c, this.d, this.e, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                zj01.a(this.b, this.c, this.d, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
