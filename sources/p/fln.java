package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fln extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bln b;
    public final /* synthetic */ gln c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fln(bln blnVar, gln glnVar, byte b) {
        super(1);
        this.a = b;
        this.b = blnVar;
        this.c = glnVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ixb ixbVar = ixb.c;
        gln glnVar = this.c;
        zkn zknVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (!zknVar.d) {
                    glnVar.b.a(ixbVar);
                } else {
                    glnVar.c.invoke();
                }
                break;
            default:
                if (!zknVar.d) {
                    glnVar.b.a(ixbVar);
                } else {
                    glnVar.c.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
