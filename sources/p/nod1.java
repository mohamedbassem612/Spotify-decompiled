package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nod1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ twa d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ i4o g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ yts t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nod1(ViewGroup viewGroup, twa twaVar, iu30 iu30Var, Function0 function0, i4o i4oVar, ArrayList arrayList, boolean z, ArrayList arrayList2, yts ytsVar) {
        super(1);
        this.c = viewGroup;
        this.d = twaVar;
        this.e = iu30Var;
        this.f = function0;
        this.g = i4oVar;
        this.b = arrayList;
        this.h = z;
        this.i = arrayList2;
        this.t = ytsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                z2s z2sVar = (z2s) obj;
                ViewGroup viewGroup = this.c;
                iac0 iac0VarH = x9p1.h(viewGroup);
                if (iac0VarH == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                yzo1.o(z2sVar, iac0VarH, this.d, this.e, this.f, false, this.g, this.b, this.h, this.i, this.t, viewGroup.getContext());
                return rih1Var;
            default:
                ArrayList arrayList = this.i;
                yts ytsVar = this.t;
                ViewGroup viewGroup2 = this.c;
                twa twaVar = this.d;
                iu30 iu30Var = this.e;
                Function0 function0 = this.f;
                i4o i4oVar = this.g;
                ArrayList arrayList2 = this.b;
                ((y2s) obj).b(BehaviorProcessor.e0(arrayList2), new nod1(viewGroup2, twaVar, iu30Var, function0, i4oVar, arrayList2, this.h, arrayList, ytsVar));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nod1(ArrayList arrayList, ViewGroup viewGroup, twa twaVar, iu30 iu30Var, Function0 function0, i4o i4oVar, boolean z, ArrayList arrayList2, yts ytsVar) {
        super(1);
        this.b = arrayList;
        this.c = viewGroup;
        this.d = twaVar;
        this.e = iu30Var;
        this.f = function0;
        this.g = i4oVar;
        this.h = z;
        this.i = arrayList2;
        this.t = ytsVar;
    }
}
