package p;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u5s {
    public final ah51 a;
    public final tg51 b;
    public v8o0 c;
    public jvc0 d = new jvc0(new i4d0(0, 0, 0), z6x.a);

    public u5s(ah51 ah51Var, tg51 tg51Var) {
        this.a = ah51Var;
        this.b = tg51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jvc0 a(tr3 tr3Var) {
        List list;
        boolean z = tr3Var.d;
        sxc0 sxc0Var = tr3Var.b;
        Parcelable parcelable = sxc0Var.c;
        bqq0 bqq0Var = sxc0Var.a;
        un90 un90Var = sxc0Var.c;
        boolean z2 = parcelable instanceof rn90;
        if (!z2 && !(parcelable instanceof b8e0) && !(parcelable instanceof on90)) {
            return this.d;
        }
        List listA = this.a.a(tr3Var);
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                mhy mhyVar = (mhy) obj;
                if ((mhyVar instanceof lhy) || (mhyVar instanceof hhy)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        } else {
            list = listA;
        }
        List list2 = z6x.a;
        List listA2 = z ? list2 : this.b.a(tr3Var);
        int iR = ryo1.r(un90Var);
        tr80 tr80VarX = ryo1.x(un90Var);
        as3 as3Var = z ? as3.b : bqq0Var.b;
        boolean z3 = parcelable instanceof b8e0;
        int iH = z3 ? ((b8e0) parcelable).h() : 0;
        Set set = (Set) tr3Var.c.a(h0v0.a);
        mml mmlVar = bqq0Var.e;
        t5s t5sVar = new t5s(iH, set, mmlVar, as3Var, list, listA2, bqq0Var.d);
        b8e0 b8e0Var = z3 ? (b8e0) parcelable : null;
        List items = b8e0Var != null ? b8e0Var.getItems() : null;
        v8o0 v8o0Var = new v8o0(t5sVar, items, iR, tr80VarX, z2);
        v8o0 v8o0Var2 = this.c;
        if (v8o0Var2 != null && t5sVar.equals((t5s) v8o0Var2.c) && items == ((List) v8o0Var2.d) && iR == v8o0Var2.a && tr80VarX.equals((tr80) v8o0Var2.e) && z2 == v8o0Var2.b) {
            return this.d;
        }
        ntl1 ntl1Var = new ntl1(iR, tr80VarX, kqn1.p(items == null ? list2 : items, ((rr80) tr80VarX).a, set, as3Var, !(mmlVar instanceof iml), z2), new m4r(as3Var, (byte) 24));
        i4d0 i4d0Var = new i4d0(list.size(), listA2.size(), iR);
        this.c = v8o0Var;
        jvc0 jvc0Var = new jvc0(i4d0Var, new bqb0(new vtl(new List[]{list, ntl1Var, listA2})));
        this.d = jvc0Var;
        return jvc0Var;
    }
}
