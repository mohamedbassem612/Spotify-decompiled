package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class osw implements rsw {
    public final /* synthetic */ zu30 a;

    public osw(zu30 zu30Var) {
        this.a = zu30Var;
    }

    @Override // p.rsw
    public final isw a(Context context, ViewGroup viewGroup, lsw lswVar, iu30 iu30Var) {
        isw iswVar = (isw) this.a.J(new d75(context, viewGroup, lswVar), context, viewGroup, iu30Var);
        iswVar.getView().setSaveEnabled(false);
        return iswVar;
    }
}
