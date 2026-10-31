package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aur0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aur0(String str, qim0 qim0Var, Function0 function0, Function0 function1, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.e = qim0Var;
        this.c = function0;
        this.d = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = this.d;
                sio1.j(czo1.p(1), this.b, this.c, function0, (b0k) obj, this.e);
                break;
            case 1:
                ((Number) obj2).intValue();
                yzo1.h(czo1.p(7), this.b, this.c, this.d, (b0k) obj, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                ero1.d(czo1.p(1), this.b, this.c, this.d, (b0k) obj, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aur0(String str, Function0 function0, Function0 function1, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = function0;
        this.d = function1;
        this.e = qim0Var;
    }
}
