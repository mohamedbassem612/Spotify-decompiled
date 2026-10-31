package p;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lun implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ufx b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ lun(ufx ufxVar, boolean z, byte b) {
        this.a = b;
        this.b = ufxVar;
        this.c = z;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        ufx ufxVar = this.b;
        switch (b) {
            case 0:
                jtn jtnVar = (jtn) l0iVar;
                Context context = ufxVar.a;
                gw70 gw70Var = ufxVar.b;
                View view = jtnVar != null ? jtnVar.a : null;
                itn itnVar = jtnVar != null ? jtnVar.b : null;
                View view2 = jtnVar != null ? jtnVar.c : null;
                boolean z = jtnVar != null && jtnVar.d;
                View view3 = jtnVar != null ? jtnVar.e : null;
                View view4 = jtnVar != null ? jtnVar.g : null;
                View view5 = jtnVar != null ? jtnVar.h : null;
                View view6 = jtnVar != null ? jtnVar.i : null;
                View view7 = jtnVar != null ? jtnVar.f : null;
                return new avn(context, gw70Var, view, itnVar, view2, z, view3, view4, view5, view6, jtnVar != null ? jtnVar.t : null, jtnVar != null ? jtnVar.X : null, jtnVar != null ? jtnVar.Y : null, view7, jtnVar != null ? jtnVar.Z : null, (View) null, jtnVar != null && jtnVar.N0, this.c, jtnVar != null ? jtnVar.O0 : ktn.c);
            default:
                if (l0iVar == null) {
                    return new m2s(ufxVar.a, ufxVar.b, this.c);
                }
                bhn0.d();
                return null;
        }
    }
}
