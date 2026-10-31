package p;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ebk1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fbk1 b;

    public /* synthetic */ ebk1(fbk1 fbk1Var, byte b) {
        this.a = b;
        this.b = fbk1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fbk1 fbk1Var = this.b;
        switch (b) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                fbk1Var.e1.saveHierarchyState(sparseArray);
                return sparseArray;
            case 1:
                fbk1.n(fbk1Var);
                return rih1Var;
            case 2:
                fbk1Var.i1.invoke(fbk1Var.e1);
                return rih1Var;
            default:
                fbk1Var.h1.invoke(fbk1Var.e1);
                return rih1Var;
        }
    }
}
