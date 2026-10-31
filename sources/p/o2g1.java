package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o2g1 extends ozy implements qad1 {
    public final qzh W0;
    public final cce X0;
    public m9d1 Y0;

    public o2g1(qzh qzhVar, cce cceVar) {
        super(qzhVar, rc11.a.b(e1h.class));
        this.W0 = qzhVar;
        this.X0 = cceVar;
    }

    @Override // p.ozy
    public final void E(f1h f1hVar, qka qkaVar) {
        e1h e1hVar = (e1h) f1hVar;
        rsc1 rsc1Var = new rsc1(this, e1hVar, qkaVar, (byte) 20);
        qzh qzhVar = this.W0;
        qzhVar.n(rsc1Var);
        Context context = qzhVar.getView().getContext();
        o8e1 o8e1Var = new o8e1(this, e1hVar, qkaVar, (byte) 9);
        plm plmVar = new plm(context, 2132018135);
        int iO = ago1.o(plmVar, 2130968844, 0);
        int iO2 = ago1.o(plmVar, 2130968831, 0);
        Drawable drawable = plmVar.getDrawable(2131231360);
        if (drawable != null) {
            drawable.setTint(iO);
        } else {
            drawable = null;
        }
        this.Y0 = drawable != null ? new m9d1(iO2, new ads(drawable, (Drawable) null), o8e1Var) : null;
    }

    @Override // p.ozy
    public final Object F(f1h f1hVar) {
        k4m k4mVar;
        e1h e1hVar = (e1h) f1hVar;
        fy6 fy6Var = e1hVar.b;
        String str = fy6Var.c;
        List listSingletonList = Collections.singletonList(fy6Var.h);
        g07 g07Var = new g07(fy6Var.i);
        o1v o1vVar = fy6Var.j;
        if (fy6Var.e) {
            k4mVar = k4m.a;
        } else {
            k4mVar = fy6Var.d ? k4m.b : k4m.d;
        }
        return new swf1(str, listSingletonList, g07Var, o1vVar, k4mVar, e1hVar.d, fy6Var.f, 2096328);
    }

    public final m9d1 b() {
        return this.Y0;
    }
}
