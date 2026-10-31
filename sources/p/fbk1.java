package p;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fbk1 extends k75 {
    public final View e1;
    public final g6o0 f1;
    public md41 g1;
    public iu30 h1;
    public iu30 i1;
    public iu30 j1;

    public fbk1(Context context, iu30 iu30Var, v340 v340Var, nd41 nd41Var, int i, oxq0 oxq0Var) {
        View view = (View) iu30Var.invoke(context);
        g6o0 g6o0Var = new g6o0();
        super(context, v340Var, i, g6o0Var, view, oxq0Var);
        this.e1 = view;
        this.f1 = g6o0Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objF = nd41Var != null ? nd41Var.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (nd41Var != null) {
            setSavableRegistryEntry(nd41Var.a(strValueOf, new ebk1(this, (byte) 0)));
        }
        ia4 ia4Var = dm5.a;
        this.h1 = ia4Var;
        this.i1 = ia4Var;
        this.j1 = ia4Var;
    }

    public static final void n(fbk1 fbk1Var) {
        fbk1Var.j1.invoke(fbk1Var.e1);
        fbk1Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(md41 md41Var) {
        md41 md41Var2 = this.g1;
        if (md41Var2 != null) {
            md41Var2.unregister();
        }
        this.g1 = md41Var;
    }

    public final g6o0 getDispatcher() {
        return this.f1;
    }

    public final iu30 getReleaseBlock() {
        return this.j1;
    }

    public final iu30 getResetBlock() {
        return this.i1;
    }

    public /* bridge */ /* synthetic */ o6 getSubCompositionView() {
        return null;
    }

    public final iu30 getUpdateBlock() {
        return this.h1;
    }

    public final void setReleaseBlock(iu30 iu30Var) {
        this.j1 = iu30Var;
        setRelease(new ebk1(this, (byte) 1));
    }

    public final void setResetBlock(iu30 iu30Var) {
        this.i1 = iu30Var;
        setReset(new ebk1(this, (byte) 2));
    }

    public final void setUpdateBlock(iu30 iu30Var) {
        this.h1 = iu30Var;
        setUpdate(new ebk1(this, (byte) 3));
    }

    public View getViewRoot() {
        return this;
    }
}
