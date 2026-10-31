package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yfo implements f4h1 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public yfo(tjq tjqVar, dgs dgsVar, String str) {
        this.b = tjqVar;
        this.c = dgsVar;
        this.d = str;
        this.e = (LinearLayout) ((p410) tjqVar.c).b;
    }

    public final Object getView() {
        switch (this.a) {
            case 0:
                return ((w470) ((lgo) this.d).b).e();
            default:
                return (LinearLayout) this.e;
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                return mno1.h(new mmr0[]{new mmr0("cultural-moments-data", ((ie70) ((lgo) this.d).c).b())});
            default:
                return new Bundle();
        }
    }

    public final void start() {
        rd70 rd70VarF;
        int i;
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                lgo lgoVar = (lgo) obj2;
                ie70 ie70Var = (ie70) lgoVar.c;
                rd70 rd70Var = (re70) obj3;
                String str = (String) ((wfo) this.e).c.get("section");
                Integer rm5Var = null;
                if (str != null) {
                    List listT = ha71.t(cj20.f, rd70Var.k(), ha71.a);
                    List f670Var = listT.isEmpty() ? Collections.EMPTY_LIST : new f670(listT, (byte) 0);
                    y570 y570Var = (y570) (f670Var.isEmpty() ? null : f670Var.get(0));
                    if (y570Var != null) {
                        Integer numR = y570Var.g().r("activeTab");
                        int iIntValue = numR != null ? numR.intValue() : 0;
                        int[] iArrP = myo1.p(str, y570Var.s());
                        rm5Var = iArrP.length != 0 ? Integer.valueOf(iArrP[0]) : null;
                        rm5Var = new pyp0(iIntValue, rm5Var != null ? rm5Var.intValue() : 0, y570Var, (byte) 9);
                    }
                    if (rm5Var == null || ((pyp0) rm5Var).b == (i = ((pyp0) rm5Var).c)) {
                        rd70VarF = rd70Var;
                    } else {
                        qd70 builder = rd70Var.toBuilder();
                        List<gd70> listK = rd70Var.k();
                        ArrayList arrayList = new ArrayList(q7h.U(listK, 10));
                        for (gd70 gd70VarX : listK) {
                            if (u890.j(gd70VarX.a(), ((y570) ((pyp0) rm5Var).d).a())) {
                                gd70VarX = gd70VarX.toBuilder().p("activeTab", Integer.valueOf(i)).x();
                            }
                            arrayList.add(gd70VarX);
                        }
                        rd70VarF = builder.o(arrayList).f();
                    }
                    rm5Var = new rm5(myo1.p(str, rd70VarF.k()), rd70VarF);
                }
                if (rm5Var != null) {
                    rd70Var = (re70) ((rm5) rm5Var).b;
                }
                ie70Var.c(rd70Var);
                Parcelable parcelable = (Parcelable) jhc1.t((Bundle) obj, "cultural-moments-data", Parcelable.class);
                if (parcelable != null) {
                    ie70Var.a(parcelable);
                } else if (rm5Var != null) {
                    if (!(((int[]) ((rm5) rm5Var).a).length == 0)) {
                        ((w470) lgoVar.b).e().addOnLayoutChangeListener(new x37(this, rm5Var, (byte) 6));
                    }
                }
                break;
            default:
                ((dgs) obj3).b((String) obj2, (tjq) obj);
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((dgs) this.c).a();
                break;
        }
    }

    private final void b() {
    }

    public yfo(Bundle bundle, re70 re70Var, lgo lgoVar, wfo wfoVar) {
        this.b = bundle;
        this.c = re70Var;
        this.d = lgoVar;
        this.e = wfoVar;
    }
}
