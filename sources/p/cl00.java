package p;

import com.spotify.home.evopage.mobius.Event;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cl00 implements vr20 {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ el00 b;

    public cl00(p811 p811Var, el00 el00Var) {
        this.a = p811Var;
        this.b = el00Var;
    }

    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        vir0 vir0Var = (vir0) obj;
        boolean z = vir0Var instanceof sir0;
        p811 p811Var = this.a;
        if (z) {
            Object obj2 = p811Var.a;
            if ((obj2 instanceof uir0) || (obj2 instanceof tir0)) {
                this.b.c.l(Event.PageBecameFocused.INSTANCE);
            }
        }
        p811Var.a = vir0Var;
        return rih1.a;
    }
}
