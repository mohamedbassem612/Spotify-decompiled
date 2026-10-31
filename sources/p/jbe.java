package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jbe extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ wat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jbe(iu30 iu30Var, wat watVar, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = watVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wat watVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(new p3v(watVar.M0((int) (((yr80) obj).a & 4294967295L)) + w6t0.d + w6t0.e));
                break;
            default:
                iu30Var.invoke(new p3v(watVar.M0((int) (((yr80) obj).a >> 32))));
                break;
        }
        return rih1Var;
    }
}
