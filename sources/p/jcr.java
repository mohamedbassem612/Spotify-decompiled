package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jcr implements Consumer {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ kcr b;

    public jcr(sj sjVar, kcr kcrVar) {
        this.b = kcrVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        kcr kcrVar = this.b;
        switch (b) {
            case 0:
                String str = ((fcr) obj).a.b;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-spotify-tap-onboarding";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                i8h1 i8h1Var = kcrVar.c;
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            default:
                kcrVar.d.b();
                break;
        }
    }

    public jcr(kcr kcrVar) {
        this.b = kcrVar;
    }
}
