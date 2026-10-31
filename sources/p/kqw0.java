package p;

import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kqw0 implements rfd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kqw0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(hqw0 hqw0Var, qo90 qo90Var, ais aisVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(!(((e831) obj).a() instanceof AllboardingActivity));
            case 1:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return Boolean.valueOf(l0o1.i((vun) obj, yon1.k2()));
            default:
                e5a0 e5a0Var = (e5a0) ((Function0) obj).invoke();
                return Boolean.valueOf((e5a0Var != null ? e5a0Var.c : null) == null);
        }
    }
}
