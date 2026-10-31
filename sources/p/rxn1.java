package p;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rxn1 extends PhantomReference {
    public final Set a;

    public /* synthetic */ rxn1(mfg mfgVar, ReferenceQueue referenceQueue, Set set, dbn1 dbn1Var) {
        super(mfgVar, referenceQueue);
        this.a = set;
    }
}
