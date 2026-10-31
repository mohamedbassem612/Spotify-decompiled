package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class un1 extends tt51 {
    public final Object X;
    public final /* synthetic */ byte g = 0;
    public final hy00 h;
    public final Object i;
    public final Object t;

    public un1(d0r d0rVar, u9c0 u9c0Var, g931 g931Var, aas aasVar, waz0 waz0Var, b7r0 b7r0Var) {
        super(d0rVar, u9c0Var, g931Var);
        this.i = aasVar;
        this.t = waz0Var;
        this.X = b7r0Var;
        this.h = n3o1.r(this).c(mm1.P0, mm1.Q0);
    }

    public final rqw a() {
        switch (this.g) {
            case 0:
                break;
        }
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // p.tt51
    public final Object e(aw51 aw51Var, tv80 tv80Var, lnm lnmVar) {
        my1 my1Var;
        byte b = this.g;
        Object obj = this.X;
        Object obj2 = this.t;
        Object obj3 = this.i;
        switch (b) {
            case 0:
                ArrayList arrayList = aw51Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((l7e0) it.next()).getUri());
                }
                if (arrayList2.isEmpty()) {
                    return Boolean.FALSE;
                }
                String str = (String) obj3;
                ((mhc) obj2).getClass();
                mhc.g(str, arrayList2, str);
                yt51 yt51Var = (yt51) obj;
                String str2 = (String) obj3;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((l7e0) it2.next()).a());
                }
                ((b431) yt51Var.a.s.getValue()).a(new yu1(str2, arrayList2, str2, false, new ey1(arrayList3)), tv80Var.a.a);
                return Boolean.FALSE;
            default:
                if (lnmVar instanceof my1) {
                    my1Var = (my1) lnmVar;
                    int i = my1Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        my1Var.c = i - Integer.MIN_VALUE;
                    } else {
                        my1Var = new my1(this, (onm) lnmVar);
                    }
                } else {
                    my1Var = new my1(this, (onm) lnmVar);
                }
                Object obj4 = my1Var.a;
                int i2 = my1Var.c;
                if (i2 == 0) {
                    hm5.M(obj4);
                    ArrayList arrayList4 = aw51Var.b;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : arrayList4) {
                        if (obj5 instanceof j7e0) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(((j7e0) it3.next()).a);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj6 : arrayList6) {
                        zuc0 zuc0Var = (zuc0) obj6;
                        fjf1 fjf1Var = zuc0Var.p;
                        boolean z = (fjf1Var instanceof fjf1) && fjf1Var.h;
                        if (zuc0Var.f() && zuc0Var.d() && dko1.o((waz0) obj2, zuc0Var.c, z)) {
                            arrayList7.add(obj6);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(ContextTrack.create(((zuc0) it4.next()).c));
                    }
                    if (arrayList8.isEmpty()) {
                        return Boolean.FALSE;
                    }
                    aas aasVar = (aas) obj3;
                    String str3 = tv80Var.a.a;
                    y6r0 y6r0Var = ((b7r0) obj).get();
                    String str4 = y6r0Var != null ? y6r0Var.a : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    CompletableObserveOn completableObserveOnA = aasVar.a(2, str4, str3, arrayList8);
                    my1Var.c = 1;
                    Object objI = fc11.i(completableObserveOnA, my1Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj4);
                }
                return Boolean.TRUE;
        }
    }

    public un1(d0r d0rVar, u9c0 u9c0Var, g931 g931Var, String str, mhc mhcVar, yt51 yt51Var) {
        super(d0rVar, u9c0Var, g931Var);
        this.i = str;
        this.t = mhcVar;
        this.X = yt51Var;
        this.h = n3o1.r(this).c(mm1.h, mm1.i);
    }
}
