package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class owd extends s470 {
    public final int g;

    public owd(l670 l670Var, int i) {
        super(l670Var);
        this.g = i;
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final r470 p(int i, ViewGroup viewGroup) {
        r470 r470VarA = super.A(i, viewGroup);
        View view = ((w611) r470VarA).a;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = view.findViewById(2131429110);
        if (viewFindViewById != null) {
            qhl qhlVar = new qhl(-1, -2);
            qhlVar.Q = this.g;
            viewFindViewById.setLayoutParams(qhlVar);
        }
        return r470VarA;
    }
}
