package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ovd extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovd(View view, ConstraintLayout constraintLayout, int i, View view2, int i2, View view3, View view4, View view5) {
        super(1);
        this.d = view;
        this.e = constraintLayout;
        this.b = i;
        this.f = view2;
        this.c = i2;
        this.g = view3;
        this.h = view4;
        this.i = view5;
    }

    public final Object invoke(Object obj) {
        int i;
        byte b = this.a;
        int i2 = 0;
        rih1 rih1Var = rih1.a;
        int i3 = this.c;
        int i4 = this.b;
        Object obj2 = this.i;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.g;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                ArrayList arrayList = (ArrayList) obj5;
                int[] iArr = (int[]) obj6;
                ArrayList arrayList2 = (ArrayList) obj4;
                int[] iArr2 = (int[]) obj7;
                int[] iArr3 = (int[]) obj2;
                lr80 it = p7h.K((c380) obj3).iterator();
                while (((sr80) it).c) {
                    int iNextInt = it.nextInt();
                    p5t0Var.k((q5t0) arrayList.get(iNextInt), (i4 - ((q5t0) arrayList.get(iNextInt)).a) / 2, iArr[iNextInt] + i2, 0.0f);
                    p5t0Var.k((q5t0) arrayList2.get(iNextInt), i4 + i3, iArr2[iNextInt] + i2, 0.0f);
                    i2 += iArr3[iNextInt];
                }
                return rih1Var;
            case 1:
                return fn31.T((c9n) obj3, (o8n) null, 0, new wep0(((Number) obj).floatValue(), this.b, (tr80) obj5, this.c, (iu30) obj4, (o95) obj6, (iu30) obj7, (ven0) obj2, null), 3);
            default:
                kil kilVar = (kil) obj;
                View view = (View) obj7;
                View view2 = (View) obj6;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj5;
                View view3 = (View) obj4;
                View view4 = (View) obj3;
                if (view4 != null) {
                    kilVar.g(view4.getId(), 3, constraintLayout.getId(), 3);
                    kilVar.g(view4.getId(), 4, constraintLayout.getId(), 4);
                    kilVar.g(view4.getId(), 6, constraintLayout.getId(), 6);
                    kilVar.l(view4.getId()).e.y = 0.0f;
                    kilVar.u(view4.getId(), 3, i4);
                    kilVar.u(view4.getId(), 4, i4);
                    kilVar.g(view3.getId(), 6, view4.getId(), 7);
                    kilVar.t(view3.getId(), i3);
                    kilVar.g(view3.getId(), 3, view4.getId(), 3);
                    kilVar.g(view3.getId(), 4, view4.getId(), 4);
                } else {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    kilVar.g(view3.getId(), 3, viewGroup.getId(), 3);
                    kilVar.g(view3.getId(), 4, viewGroup.getId(), 4);
                    kilVar.g(view3.getId(), 6, constraintLayout.getId(), 6);
                }
                if (view2 != null) {
                    i = 7;
                    kilVar.g(view2.getId(), 6, view3.getId(), 7);
                    kilVar.g(view2.getId(), 7, view.getId(), 6);
                    kilVar.g(view2.getId(), 4, view3.getId(), 4);
                    kilVar.g(view2.getId(), 3, view3.getId(), 3);
                    kilVar.g(view3.getId(), 7, view2.getId(), 6);
                    kilVar.g(view.getId(), 6, view2.getId(), 7);
                } else {
                    i = 7;
                    kilVar.g(view3.getId(), 7, view.getId(), 6);
                }
                kilVar.g(view.getId(), i, constraintLayout.getId(), i);
                kilVar.g(view.getId(), 4, view3.getId(), 4);
                kilVar.g(view.getId(), 3, view3.getId(), 3);
                kilVar.g(((View) obj2).getId(), 4, constraintLayout.getId(), 4);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovd(c9n c9nVar, int i, tr80 tr80Var, int i2, iu30 iu30Var, o95 o95Var, iu30 iu30Var2, ven0 ven0Var) {
        super(1);
        this.d = c9nVar;
        this.b = i;
        this.e = tr80Var;
        this.c = i2;
        this.f = iu30Var;
        this.g = o95Var;
        this.h = iu30Var2;
        this.i = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovd(c380 c380Var, ArrayList arrayList, int i, int[] iArr, ArrayList arrayList2, int i2, int[] iArr2, int[] iArr3) {
        super(1);
        this.d = c380Var;
        this.e = arrayList;
        this.b = i;
        this.g = iArr;
        this.f = arrayList2;
        this.c = i2;
        this.h = iArr2;
        this.i = iArr3;
    }
}
