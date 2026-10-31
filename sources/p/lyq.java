package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lyq extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyq(String str, String str2, j2i j2iVar, Function0 function0, int i) {
        super(2);
        this.c = str;
        this.e = str2;
        this.b = j2iVar;
        this.d = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                g2p1.m(czo1.p(i | 1), this.c, this.e, this.d, this.b, (b0k) obj);
                break;
            default:
                ((Number) obj2).intValue();
                yy51.b(czo1.p(i | 1), this.c, this.e, this.d, this.b, (b0k) obj);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyq(j2i j2iVar, String str, Function0 function0, String str2, int i) {
        super(2);
        this.b = j2iVar;
        this.c = str;
        this.d = function0;
        this.e = str2;
        this.f = i;
    }
}
