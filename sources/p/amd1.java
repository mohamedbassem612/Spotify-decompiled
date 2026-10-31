package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class amd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ nmd1 b;
    public final /* synthetic */ n3z c;
    public final /* synthetic */ String d;
    public final /* synthetic */ y1c1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amd1(nmd1 nmd1Var, n3z n3zVar, y1c1 y1c1Var, String str) {
        super(1);
        this.b = nmd1Var;
        this.c = n3zVar;
        this.e = y1c1Var;
        this.d = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ji50 ji50Var = (ji50) obj;
                nmd1 nmd1Var = this.b;
                n3z n3zVar = this.c;
                y1c1 y1c1Var = this.e;
                gh61 gh61Var = new gh61(nmd1Var, ji50Var, n3zVar, y1c1Var, (byte) 27);
                zld1 zld1Var = zld1.b;
                sld1 sld1Var = sld1.g;
                LinkedHashMap linkedHashMap = ji50Var.b;
                w7x w7xVar = w7x.a;
                linkedHashMap.put(djd1.class, r4o1.Q(zld1Var, w7xVar, gh61Var, sld1Var));
                linkedHashMap.put(yid1.class, new r3r(new xzq(nmd1Var.z.a(nmd1Var.a, 2, true), new uld1(n3zVar, (byte) 5)), sld1.d, 4));
                linkedHashMap.put(zid1.class, r4o1.Q(zld1.c, w7xVar, new wld1(nmd1Var, n3zVar, (byte) 3), sld1.h));
                linkedHashMap.put(ajd1.class, r4o1.Q(zld1.d, w7xVar, new wld1(nmd1Var, n3zVar, (byte) 4), sld1.i));
                linkedHashMap.put(njd1.class, r4o1.Q(zld1.e, w7xVar, new wld1(nmd1Var, n3zVar, (byte) 5), sld1.t));
                linkedHashMap.put(bjd1.class, r4o1.Q(new uld1(n3zVar, (byte) 2), c13.i(zvh.class), new wld1(nmd1Var, n3zVar, (byte) 0), sld1.X));
                String str = this.d;
                linkedHashMap.put(vhd1.class, r4o1.Q(vkd1.a1, w7xVar, new xld1(nmd1Var, str, n3zVar), sld1.Y));
                linkedHashMap.put(sjd1.class, r4o1.Q(new uld1(n3zVar, (byte) 4), yag1.e, new wld1(nmd1Var, n3zVar, (byte) 1), sld1.Z));
                linkedHashMap.put(rjd1.class, r4o1.Q(vkd1.b1, w7xVar, new wld1(n3zVar, nmd1Var), sld1.N0));
                linkedHashMap.put(ejd1.class, r4o1.Q(vkd1.c1, w7xVar, new yld1(n3zVar, nmd1Var, y1c1Var, (byte) 0), sld1.O0));
                linkedHashMap.put(pjd1.class, r4o1.Q(vkd1.d1, w7xVar, new yld1(n3zVar, nmd1Var, y1c1Var, (byte) 1), sld1.e));
                linkedHashMap.put(qjd1.class, r4o1.Q(vkd1.e1, w7xVar, new gh61(n3zVar, str, nmd1Var, y1c1Var, (byte) 28), sld1.f));
                break;
            default:
                dnc0 dnc0Var = (dnc0) obj;
                Boolean bool = Boolean.FALSE;
                nmd1 nmd1Var2 = this.b;
                nep nepVar = nmd1Var2.w;
                d0r d0rVar = nmd1Var2.a;
                n3z n3zVar2 = this.c;
                String str2 = n3zVar2.a;
                f9p f9pVar = (f9p) nepVar.a.c;
                mh4 mh4VarB = f9pVar.b();
                tjh tjhVar = (tjh) ((e7z) f9pVar.X).t.get();
                c8o.l(tjhVar);
                bw20 bw20Var = (ov20) ((e7z) f9pVar.X).a0.get();
                c8o.l(bw20Var);
                t7y t7yVar = new t7y(mh4VarB, tjhVar, bw20Var, d0rVar, str2);
                ay8 ay8VarF = d3p1.F(d0rVar, (o3r) t7yVar.c, str2);
                o6x o6xVar = o6x.a;
                Observable map = yoi1.i(ay8VarF, o6xVar).map(zp8.b1);
                Observable observableStartWithItem = mh4VarB.e() ? tjhVar.h.flatMap(new cfd(tjhVar, str2, (byte) 22)).subscribeOn(tjhVar.a).map(wcp1.a1).onErrorReturn(vgp1.b1).startWithItem(bool) : Observable.just(bool);
                observableStartWithItem.getClass();
                ezc ezcVarG = yoi1.g(Observable.combineLatest(map, observableStartWithItem, yoi1.i(mh4VarB.d() ? new any(rqt0.u(new any(bw20Var.c("type", ""), (byte) 19)), (byte) 20) : new huz(bool, (byte) 10), o6xVar), new efr(t7yVar, (byte) 27)));
                String str3 = this.d;
                two1.v(dnc0Var, new xs4(ezcVarG, str3, (byte) 17), false, new amd1(nmd1Var2, n3zVar2, this.e, str3));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amd1(nmd1 nmd1Var, n3z n3zVar, String str, y1c1 y1c1Var) {
        super(1);
        this.b = nmd1Var;
        this.c = n3zVar;
        this.d = str;
        this.e = y1c1Var;
    }
}
