package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hgf extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ uef c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgf(iu30 iu30Var, uef uefVar) {
        super(0);
        this.b = iu30Var;
        this.c = uefVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uef uefVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cso1 cso1Var = uefVar.a;
                if (cso1Var instanceof sef) {
                    zro1 zro1Var = ((sef) cso1Var).b;
                    if ((zro1Var instanceof oef) && !((oef) zro1Var).b) {
                        iu30Var.invoke(adf.a);
                    } else if ((cso1Var instanceof hef) && !((hef) cso1Var).b) {
                        iu30Var.invoke(adf.a);
                    }
                } else if (cso1Var instanceof hef) {
                    iu30Var.invoke(adf.a);
                }
                break;
            default:
                iu30Var.invoke(new sdf(((gef) uefVar.a).b));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgf(uef uefVar, iu30 iu30Var) {
        super(0);
        this.c = uefVar;
        this.b = iu30Var;
    }
}
