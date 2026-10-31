package p;

import com.spotify.signup.signup.v2.proto.Error;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gmd1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ omd1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ y1c1 d;
    public final /* synthetic */ d281 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd1(y1c1 y1c1Var, omd1 omd1Var, String str, d281 d281Var) {
        super(1);
        this.d = y1c1Var;
        this.b = omd1Var;
        this.c = str;
        this.e = d281Var;
    }

    public final Object invoke(Object obj) {
        int i;
        ezc huzVar;
        lnm lnmVar;
        x010 x010Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                d281 d281Var = this.e;
                y1c1 y1c1Var = this.d;
                omd1 omd1Var = this.b;
                String str = this.c;
                gh61 gh61Var = new gh61(y1c1Var, omd1Var, str, d281Var, (byte) 29);
                Map map = ama.a;
                hqa1 hqa1Var = new hqa1(str, (byte) 15);
                sld1 sld1Var = sld1.Q0;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(fld1.class, new vw21(hqa1Var, map, new fc3(gh61Var, (byte) 5), sld1Var, (vu30) null));
                linkedHashMap.put(eld1.class, new vw21(zld1.i, b7x.a, new fc3(new fmd1(omd1Var, (byte) 0), (byte) 5), sld1.S0, (vu30) null));
                break;
            default:
                dnc0 dnc0Var = (dnc0) obj;
                omd1 omd1Var2 = this.b;
                d0r d0rVar = omd1Var2.h;
                o3r o3rVar = vmd1.a;
                String str2 = this.c;
                any anyVar = new any(d3p1.H(d0rVar, o3rVar, str2), (byte) 18);
                if (omd1Var2.z) {
                    msn msnVar = omd1Var2.y;
                    n481 n481Var = msnVar.a;
                    Set set = s4b1.f;
                    String strH = uic.x(str2).h();
                    o8z o8zVar = new o8z(2);
                    aqa0 aqa0Var = new aqa0(Collections.singletonMap("trailer", Boolean.TRUE));
                    List list = msn.b;
                    List list2 = list;
                    int iS = zno1.s(q7h.U(list2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                    for (Object obj2 : list2) {
                        linkedHashMap2.put(obj2, Boolean.TRUE);
                    }
                    e3z e3zVar = new e3z((aqa0) null, (List) null, linkedHashMap2);
                    ArrayList arrayListO0 = o7h.O0("consumptionOrder", list);
                    int iS2 = zno1.s(q7h.U(arrayListO0, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                    for (Object obj3 : arrayListO0) {
                        linkedHashMap3.put(obj3, Boolean.TRUE);
                    }
                    t881 t881Var = new t881(new y381(e3zVar, new x381(Collections.singletonList(Integer.valueOf(Error.TOO_YOUNG_FIELD_NUMBER)), linkedHashMap3), aqa0Var));
                    i = 3;
                    huzVar = yoi1.g(n481Var.a(new b481(strH, o8zVar, 0, g620.e, t881Var, Boolean.TRUE, null, 130980)).map(new c9c(msnVar, (byte) 3)).toObservable());
                } else {
                    i = 3;
                    huzVar = new huz(cma.a, (byte) 10);
                }
                two1.v(dnc0Var, new x010(huzVar, anyVar, new ap51(i, (lnm) null, (byte) 9), (byte) 1), true, new gmd1(this.d, omd1Var2, str2, this.e));
                if (omd1Var2.d) {
                    brz0 brz0Var = omd1Var2.e;
                    lnmVar = null;
                    x010Var = new x010(brz0Var.a.c(1, str2), brz0Var.b.a, new arz0(3, (lnm) null), (byte) 1);
                } else {
                    lnmVar = null;
                    x010Var = omd1Var2.c.a;
                }
                two1.v(dnc0Var, new x010(x010Var, anyVar, new cq2(str2, lnmVar, (byte) 7), (byte) 1), true, new emd1(omd1Var2, (byte) 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd1(omd1 omd1Var, String str, y1c1 y1c1Var, d281 d281Var) {
        super(1);
        this.b = omd1Var;
        this.c = str;
        this.d = y1c1Var;
        this.e = d281Var;
    }
}
