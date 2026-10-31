package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gex extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vzq0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lex d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ vu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gex(vzq0 vzq0Var, String str, lex lexVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3) {
        super(2);
        this.b = vzq0Var;
        this.c = str;
        this.d = lexVar;
        this.e = vu30Var;
        this.f = vu30Var2;
        this.g = vu30Var3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    poo1.h(this.b, this.c, this.d, this.e, this.f, this.g, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                poo1.h(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gex(vzq0 vzq0Var, String str, lex lexVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, int i) {
        super(2);
        this.b = vzq0Var;
        this.c = str;
        this.d = lexVar;
        this.e = vu30Var;
        this.f = vu30Var2;
        this.g = vu30Var3;
    }
}
