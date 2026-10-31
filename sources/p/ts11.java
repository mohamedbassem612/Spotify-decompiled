package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ts11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts11(ms11 ms11Var, zsc zscVar, w3l0 w3l0Var, y1c1 y1c1Var, toc tocVar, boolean z, it8 it8Var, hpc hpcVar, lzn0 lzn0Var) {
        super(1);
        this.c = ms11Var;
        this.d = zscVar;
        this.e = w3l0Var;
        this.f = y1c1Var;
        this.g = tocVar;
        this.b = z;
        this.h = it8Var;
        this.i = hpcVar;
        this.t = lzn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.i;
        Object obj4 = this.t;
        byte b2 = 0;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        byte b3 = 1;
        switch (b) {
            case 0:
                ji50 ji50Var = (ji50) obj;
                qs11 qs11Var = new qs11((hpc) obj3, (byte) 1);
                ss11 ss11Var = ss11.c;
                rs11 rs11Var = rs11.d;
                LinkedHashMap linkedHashMap = ji50Var.b;
                Set set = w7x.a;
                linkedHashMap.put(bpc.class, r4o1.Q(ss11Var, set, qs11Var, rs11Var));
                ms11 ms11Var = (ms11) obj9;
                wr1 wr1Var = new wr1(ms11Var, (w3l0) obj7, (y1c1) obj2, (zsc) obj8, this.b, (toc) obj6);
                d50 d50Var = ms11Var.e;
                cjx0 cjx0Var = ms11Var.x;
                lvc1 lvc1Var = ms11Var.l;
                d50 d50Var2 = d50Var instanceof d50 ? d50Var : null;
                d50 d50Var3 = ms11Var.f;
                d50 d50Var4 = d50Var3 instanceof d50 ? d50Var3 : null;
                d50 d50Var5 = ms11Var.a;
                d50 d50Var6 = d50Var5 instanceof d50 ? d50Var5 : null;
                d50 d50Var7 = ms11Var.b;
                d50 d50Var8 = d50Var7 instanceof d50 ? d50Var7 : null;
                d50 d50Var9 = ms11Var.c;
                d50 d50Var10 = d50Var9 instanceof d50 ? d50Var9 : null;
                d50 d50Var11 = ms11Var.d;
                List listI0 = f46.i0(new d50[]{d50Var2, d50Var4, d50Var6, d50Var8, d50Var10, d50Var11 instanceof d50 ? d50Var11 : null});
                ArrayList arrayList = new ArrayList();
                Iterator it = listI0.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    rih1 rih1Var = rih1.a;
                    if (!zHasNext) {
                        Set setP1 = o7h.p1(arrayList);
                        Set set2 = cjx0Var != null ? cjx0Var.a : null;
                        if (set2 == null) {
                            set2 = set;
                        }
                        Map mapJ = sqg0.J(new mmr0[]{new mmr0(sv11.a, dm61.y0(dm61.y0(setP1, set2), (Set) lvc1Var.b)), new mmr0(sv11.b, (Set) lvc1Var.c)});
                        linkedHashMap.put(apc.class, new vw21(br11.a1, mapJ, new fc3(wr1Var, (byte) 5), h211.e1, cjx0Var != null ? new ps11(cjx0Var, b2) : null));
                        e4p1.h(ji50Var, (it8) obj5);
                        linkedHashMap.put(cpc.class, r4o1.Q(ss11.e, set, new jli0((lzn0) obj4, (byte) 2), rs11.e));
                        return rih1Var;
                    }
                    Object obj10 = ((d50) it.next()).a.get(rih1Var);
                    obj10.getClass();
                    r7h.W((Iterable) obj10, arrayList);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                azg1 azg1Var = (azg1) obj4;
                vh6 vh6Var = (vh6) obj3;
                SceneTemplate.WrappedTwinContent.SearchingCard searchingCard = (SceneTemplate.WrappedTwinContent.SearchingCard) obj2;
                if (!this.b) {
                    return new naf1((gyg1) obj9, (wj31) obj8, (List) obj7, searchingCard.u(), (wen0) obj6, new hcf1(1, (ayg1) obj5, ayg1.class, "update", "update(F)V", 0, (byte) 8), new xyg1(vh6Var, b3), new yyg1(azg1Var, null, (byte) 1));
                }
                wen0 wen0Var = (wen0) obj6;
                return new bzg1((gyg1) obj9, (wj31) obj8, (List) obj7, searchingCard.u(), wen0Var, new wyg1(wen0Var, (byte) 1), new hcf1(1, (ayg1) obj5, ayg1.class, "update", "update(F)V", 0, (byte) 7), new xyg1(vh6Var, b2), zBooleanValue, new yyg1(azg1Var, null, (byte) 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts11(boolean z, gyg1 gyg1Var, wj31 wj31Var, List list, SceneTemplate.WrappedTwinContent.SearchingCard searchingCard, wen0 wen0Var, ayg1 ayg1Var, vh6 vh6Var, azg1 azg1Var) {
        super(1);
        this.b = z;
        this.c = gyg1Var;
        this.d = wj31Var;
        this.e = list;
        this.f = searchingCard;
        this.g = wen0Var;
        this.h = ayg1Var;
        this.i = vh6Var;
        this.t = azg1Var;
    }
}
