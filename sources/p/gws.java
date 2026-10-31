package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gws implements View.OnLongClickListener {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Object c;

    public gws(iws iwsVar, iu30 iu30Var) {
        this.c = iwsVar;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        Object obj = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iws iwsVar = (iws) obj;
                if (iws.s(iwsVar) || !iws.r(iwsVar).y()) {
                    return false;
                }
                iu30Var.invoke(pzf1.b);
                return true;
            default:
                iu30Var.invoke(new jjy(((lly) obj).e));
                return true;
        }
    }

    public gws(iu30 iu30Var, lly llyVar) {
        this.b = iu30Var;
        this.c = llyVar;
    }
}
