package p;

import io.reactivex.rxjava3.functions.Function;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryDecorateResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class yxm1 implements Function, cgp1, vcp1, v0i, adp1 {
    public static final /* synthetic */ yxm1 a = new yxm1();
    public static final /* synthetic */ yxm1 b = new yxm1();
    public static final /* synthetic */ yxm1 c = new yxm1();

    public /* synthetic */ yxm1() {
    }

    public /* synthetic */ pno1 a(kap1 kap1Var, a2x0 a2x0Var) {
        return wfn1.c(kap1Var, a2x0Var);
    }

    public Object apply(Object obj) {
        YourLibraryDecorateResponse yourLibraryDecorateResponse = (YourLibraryDecorateResponse) obj;
        if (yourLibraryDecorateResponse.a() == 1) {
            YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityN = yourLibraryDecorateResponse.n();
            if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityN.e().u()) {
                return tum1.a;
            }
            if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityN.s() != gtm1.c || yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityN.w().n()) {
                if (wxm1.a[yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntityN.e().t().ordinal()] == 1) {
                    return sum1.a;
                }
            }
        }
        return uum1.a;
    }

    public kap1 f(pno1 pno1Var, a2x0 a2x0Var) {
        kap1 kap1Var = ((jdp1) pno1Var).d;
        jdp1.w(kap1Var, a2x0Var);
        return kap1Var;
    }

    public Object m(dxy dxyVar) {
        mfg mfgVar = new mfg();
        dbn1 dbn1Var = new dbn1();
        ReferenceQueue referenceQueue = mfgVar.a;
        Set set = mfgVar.b;
        set.add(new rxn1(mfgVar, referenceQueue, set, dbn1Var));
        Thread thread = new Thread((Runnable) new sjj1(referenceQueue, set, (byte) 10), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return mfgVar;
    }

    public yxm1(zxm1 zxm1Var) {
    }
}
