package p;

import com.spotify.mainlayout.ui.view.MainLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c1g0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1g0(float f, float f2, hdn0 hdn0Var) {
        super(0);
        this.a = (byte) 1;
        this.b = f;
        this.c = f2;
        this.d = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        float fS = this.b;
        Object obj = this.d;
        float f = this.c;
        switch (b) {
            case 0:
                MainLayout mainLayout = ((d1g0) obj).a;
                mainLayout.getNavigationContainerTop().setZ(fS);
                mainLayout.getLimitedExperienceIndicatorContainer().setZ(f);
                return rih1.a;
            case 1:
                err0 err0Var = (hdn0) obj;
                if (err0Var.s() > 0) {
                    fS = fS + err0Var.s() + f;
                }
                return Float.valueOf(fS);
            default:
                upb0 upb0Var = (upb0) obj;
                return Float.valueOf(((err0) upb0Var.d.c).s() > 0 ? 1.0f : yoi1.o(((err0) upb0Var.d.d).s() - fS, 0.0f, f) / f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1g0(Object obj, float f, float f2, byte b) {
        super(0);
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }
}
