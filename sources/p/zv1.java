package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zv1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(c9n c9nVar, boolean z, jkr0 jkr0Var, int i) {
        super(0);
        this.d = c9nVar;
        this.b = z;
        this.e = jkr0Var;
        this.c = i;
    }

    public final Object invoke() {
        byte b = this.a;
        int i = this.c;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((ow1) obj2).f.invoke(Integer.valueOf(i), (ot1) obj, Boolean.valueOf(z));
                break;
            case 1:
                int i2 = this.c;
                fn31.T((c9n) obj2, (o8n) null, 0, new qe5(this.b, (jkr0) obj, i2, null, (byte) 3), 3);
                break;
            default:
                if (!z) {
                    ((iu30) obj2).invoke(new aff1(i, ((zff1) obj).e));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(ow1 ow1Var, int i, ot1 ot1Var, boolean z) {
        super(0);
        this.d = ow1Var;
        this.c = i;
        this.e = ot1Var;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(boolean z, iu30 iu30Var, int i, zff1 zff1Var) {
        super(0);
        this.b = z;
        this.d = iu30Var;
        this.c = i;
        this.e = zff1Var;
    }
}
