package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rcs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tcs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rcs(tcs tcsVar, byte b) {
        super(1);
        this.a = b;
        this.b = tcsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tcs tcsVar = this.b;
        switch (b) {
            case 0:
                return tcsVar.t1.U((r6h1) obj).b();
            case 1:
                return tcsVar.t1.G((r6h1) obj);
            case 2:
                return tcsVar.t1.p((r6h1) obj);
            case 3:
                return tcsVar.t1.a0((r6h1) obj);
            case 4:
                return tcsVar.t1.L((r6h1) obj);
            case 5:
                return tcsVar.t1.E((r6h1) obj);
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                View view = tcsVar.C1;
                if (view != null) {
                    view.setVisibility(zBooleanValue ? 0 : 8);
                    return rih1.a;
                }
                u890.C("mixingGradientView");
                throw null;
        }
    }
}
