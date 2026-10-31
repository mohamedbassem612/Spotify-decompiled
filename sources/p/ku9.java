package p;

import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ku9 extends xbk1 {
    public final UUID b;
    public WeakReference c;

    public ku9(fe41 fe41Var) {
        UUID uuidRandomUUID = (UUID) fe41Var.b.s("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            fe41Var.b(uuidRandomUUID, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = uuidRandomUUID;
    }

    public final void S() {
        WeakReference weakReference = this.c;
        if (weakReference == null) {
            u890.C("saveableStateHolderRef");
            throw null;
        }
        kd41 kd41Var = (kd41) weakReference.get();
        if (kd41Var != null) {
            kd41Var.b(this.b);
        }
        WeakReference weakReference2 = this.c;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            u890.C("saveableStateHolderRef");
            throw null;
        }
    }
}
