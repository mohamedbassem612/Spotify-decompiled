package p;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vts extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vts(int i, Function0 function0, iu30 iu30Var, iu30 iu30Var2, bih1 bih1Var, mvh1 mvh1Var, mvh1 mvh1Var2) {
        super(0);
        this.b = i;
        this.h = iu30Var;
        this.c = mvh1Var;
        this.d = mvh1Var2;
        this.e = function0;
        this.f = iu30Var2;
        this.g = bih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e A[PHI: r2
      0x005e: PHI (r2v4 int) = (r2v0 int), (r2v17 int), (r2v18 int), (r2v19 int), (r2v20 int) binds: [B:12:0x004d, B:14:0x0050, B:16:0x0053, B:18:0x0056, B:20:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke() {
        View view;
        int i;
        Integer num;
        xhm1 xhm1Var;
        byte b = this.a;
        int i2 = 1;
        Object obj = null;
        gaf1Var = null;
        gaf1 gaf1Var = null;
        obj = null;
        int i3 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                mxr mxrVar = (mxr) obj7;
                lvc1 lvc1Var = (lvc1) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                nxr nxrVar = (nxr) obj2;
                qwc1 qwc1Var = (qwc1) obj6;
                ViewPager2 viewPager2 = (ViewPager2) lvc1Var.d;
                LinearLayout linearLayout = (LinearLayout) lvc1Var.b;
                TabLayout tabLayout = (TabLayout) lvc1Var.c;
                jhc1.q(0, viewPager2).setId(2131428389);
                if (arrayList.size() == 1) {
                    viewPager2.setUserInputEnabled(false);
                    tabLayout.setVisibility(8);
                } else {
                    viewPager2.setUserInputEnabled(true);
                    tabLayout.setVisibility(0);
                    new vrv0(tabLayout, viewPager2, new iir(arrayList, lvc1Var, (byte) 24)).b();
                    tabLayout.a(new aus(nxrVar, mxrVar, this.b, qwc1Var, arrayList));
                }
                iu30 iu30Var = (iu30) obj5;
                if (iu30Var != null && (view = (View) iu30Var.invoke(linearLayout)) != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388611;
                    view.setLayoutParams(layoutParams);
                    linearLayout.addView(view, linearLayout.indexOfChild(viewPager2));
                    obj = view;
                }
                mxrVar.b = obj;
                break;
            case 1:
                Float f = (Float) ((dw91) obj7).get(Integer.valueOf(i3));
                Float f2 = (Float) ((dw91) obj4).get(Integer.valueOf(i3));
                if (f != null && f2 != null) {
                    bs51.d((ven0) obj3, (ss50) obj2, (xtb0) obj6, (ven0) obj5, new hz(f2.floatValue() + f.floatValue()));
                }
                break;
            case 2:
                Object obj8 = ((rk41) obj3).c;
                rx7 rx7Var = ((laf1) obj7).b;
                naf1 naf1Var = (naf1) obj4;
                kaf1 kaf1Var = (kaf1) naf1Var.c;
                int i4 = this.b;
                int i5 = i4 + 1;
                if (i5 != 1) {
                    i2 = 2;
                    if (i5 != 2) {
                        i2 = 3;
                        if (i5 != 3) {
                            i2 = 4;
                            if (i5 != 4) {
                                i2 = 5;
                                if (i5 != 5) {
                                    i = 0;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    i = i2;
                }
                if (i != 0 && (xhm1Var = (xhm1) ((ven0) obj2).getValue()) != null) {
                    ard1 ard1Var = (ard1) naf1Var.d;
                    sju sjuVar = rx7Var.c;
                    ard1Var.b(xhm1Var, zqd1.b, i4, sjuVar != null ? sjuVar.c : null, i);
                }
                String str = kaf1Var.a;
                StoryCard storyCard = ((wgm1) ((xgm1) obj8).getState().getValue()).a;
                String id = storyCard != null ? storyCard.getId() : null;
                boolean z = kaf1Var.d;
                if (u890.j(id, str) && rx7Var != null) {
                    gaf1Var = new gaf1(rx7Var, z);
                }
                if (gaf1Var != null) {
                    qam1 qam1Var = (qam1) obj6;
                    ven0 ven0Var = (ven0) obj5;
                    ((iu30) naf1Var.f).invoke(Integer.valueOf(i4));
                    rx7 rx7Var2 = gaf1Var.a;
                    ((xgm1) obj8).a(new lgm1(rx7Var2.a, rx7Var2.b, rx7Var2.c));
                    if (gaf1Var.b && ((num = (Integer) ven0Var.getValue()) == null || num.intValue() != i4)) {
                        sam1.b(qam1Var);
                    }
                    ven0Var.setValue(Integer.valueOf(i4));
                }
                break;
            default:
                mvh1 mvh1Var = (mvh1) obj7;
                if (i3 != 0) {
                    ((bih1) obj6).h(i3);
                }
                ((iu30) obj5).invoke(mvh1Var);
                if (!mvh1Var.equals((mvh1) obj4)) {
                    ((Function0) obj3).invoke();
                    ((iu30) obj2).invoke(mvh1Var);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vts(int i, laf1 laf1Var, naf1 naf1Var, rk41 rk41Var, ven0 ven0Var, qam1 qam1Var, ven0 ven0Var2) {
        super(0);
        this.b = i;
        this.c = laf1Var;
        this.d = naf1Var;
        this.e = rk41Var;
        this.f = ven0Var;
        this.g = qam1Var;
        this.h = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vts(mxr mxrVar, lvc1 lvc1Var, ArrayList arrayList, int i, nxr nxrVar, qwc1 qwc1Var, iu30 iu30Var) {
        super(0);
        this.c = mxrVar;
        this.d = lvc1Var;
        this.e = arrayList;
        this.b = i;
        this.f = nxrVar;
        this.g = qwc1Var;
        this.h = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vts(dw91 dw91Var, int i, dw91 dw91Var2, ven0 ven0Var, ss50 ss50Var, xtb0 xtb0Var, ven0 ven0Var2) {
        super(0);
        this.c = dw91Var;
        this.b = i;
        this.d = dw91Var2;
        this.e = ven0Var;
        this.f = ss50Var;
        this.g = xtb0Var;
        this.h = ven0Var2;
    }
}
