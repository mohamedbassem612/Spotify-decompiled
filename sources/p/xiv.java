package p;

import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xiv extends hab0 implements iu30 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ twa b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ utt f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ viv t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xiv(ViewGroup viewGroup, twa twaVar, iu30 iu30Var, Function0 function0, boolean z, utt uttVar, ArrayList arrayList, boolean z2, ArrayList arrayList2, viv vivVar) {
        super(1);
        this.a = viewGroup;
        this.b = twaVar;
        this.c = iu30Var;
        this.d = function0;
        this.e = z;
        this.f = uttVar;
        this.g = arrayList;
        this.h = z2;
        this.i = arrayList2;
        this.t = vivVar;
    }

    public final Object invoke(Object obj) {
        z2s z2sVar = (z2s) obj;
        ViewGroup viewGroup = this.a;
        iac0 iac0VarH = x9p1.h(viewGroup);
        if (iac0VarH == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        yzo1.o(z2sVar, iac0VarH, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, viewGroup.getContext());
        return rih1.a;
    }
}
