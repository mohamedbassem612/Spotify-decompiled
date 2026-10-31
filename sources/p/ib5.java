package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ib5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib5(ArrayList arrayList, byte b) {
        super(1);
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList<yvg1> arrayList = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    p5t0.g(0, 0, p5t0Var, (q5t0) arrayList.get(i));
                }
                return rih1Var;
            case 1:
                b261.n((e261) obj, o7h.y0(this.b, ", ", (String) null, (String) null, ag6.N0, 30));
                return rih1Var;
            case 2:
                b261.n((e261) obj, o7h.y0(this.b, ", ", (String) null, (String) null, ag6.O0, 30));
                return rih1Var;
            case 3:
                return ((d87) arrayList.get(((Number) obj).intValue())).a.e;
            case 4:
                ((qv00) obj).b(mtl.class, arrayList, false);
                return rih1Var;
            case 5:
                ((qv00) obj).b(jo70.class, arrayList, false);
                return rih1Var;
            case 6:
                b261.k((e261) obj, new d4h(arrayList.size(), 1));
                return rih1Var;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                return f4i1.c(iIntValue, "chip-");
            case 8:
                int iIntValue2 = ((Number) obj).intValue();
                int i2 = iIntValue2 + 3;
                int size2 = arrayList.size();
                if (i2 > size2) {
                    i2 = size2;
                }
                return yoi1.Q(iIntValue2, i2);
            case 9:
                qv00 qv00Var = (qv00) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qv00Var.a((String) it.next(), zvh.class, false);
                }
                return rih1Var;
            case 10:
                qv00 qv00Var2 = (qv00) obj;
                qv00Var2.b(jo70.class, arrayList, false);
                qv00Var2.b(xkk1.class, arrayList, false);
                return rih1Var;
            case 11:
                return Boolean.valueOf(((Number) obj).intValue() == arrayList.size());
            case 12:
                return ((ilt) arrayList.get(((Number) obj).intValue())).a;
            case 13:
                qv00 qv00Var3 = (qv00) obj;
                qv00Var3.b(jo70.class, arrayList, false);
                qv00Var3.b(xkk1.class, arrayList, false);
                return rih1Var;
            case 14:
                ((qv00) obj).b(s5k.class, arrayList, false);
                return rih1Var;
            case 15:
                r7h.W(arrayList, ((qv00) obj).a);
                return rih1Var;
            case 16:
                return zs10.b1.invoke(arrayList.get(((Number) obj).intValue()));
            case 17:
                return (qa20) arrayList.get(((Number) obj).intValue());
            case 18:
                ((epb0) obj).R(arrayList.size(), new ry4(arrayList, (byte) 26), (vu30) null, new ry4(arrayList, (byte) 27), new j2i(-1942245546, new s88(arrayList, (byte) 1), true));
                return rih1Var;
            case 19:
                p5t0 p5t0Var2 = (p5t0) obj;
                for (yvg1 yvg1Var : arrayList) {
                    p5t0Var2.k((q5t0) yvg1Var.a, ((Number) yvg1Var.b).intValue(), ((Number) yvg1Var.c).intValue(), 0.0f);
                }
                return rih1Var;
            case 20:
                b261.n((e261) obj, o7h.y0(this.b, "", (String) null, (String) null, ob90.a, 30));
                return rih1Var;
            case 21:
                p5t0 p5t0Var3 = (p5t0) obj;
                for (yvg1 yvg1Var2 : arrayList) {
                    List list = (List) yvg1Var2.a;
                    int iIntValue3 = ((Number) yvg1Var2.b).intValue();
                    int iIntValue4 = ((Number) yvg1Var2.c).intValue();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        p5t0Var3.f((q5t0) it2.next(), iIntValue3, iIntValue4, 0.0f);
                    }
                }
                return rih1Var;
            case 22:
                p5t0 p5t0Var4 = (p5t0) obj;
                Iterator it3 = arrayList.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    q5t0 q5t0Var = (q5t0) it3.next();
                    p5t0Var4.k(q5t0Var, 0, i3, 0.0f);
                    i3 += q5t0Var.b;
                }
                return rih1Var;
            case 23:
                ((qv00) obj).b(ojf1.class, arrayList, false);
                return rih1Var;
            case 24:
                qv00 qv00Var4 = (qv00) obj;
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    qv00Var4.a((String) it4.next(), xkk1.class, false);
                }
                return rih1Var;
            case 25:
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                return Boolean.valueOf(arrayList.contains(l4o1.c0(contextTrack)));
            case 26:
                ((qv00) obj).b(gh3.class, arrayList, false);
                return rih1Var;
            case 27:
                ((qv00) obj).b(zei1.class, arrayList, false);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return ((vpx0) arrayList.get(((Number) obj).intValue())).getId();
            default:
                ((kex) obj).b(arrayList.size(), new j2i(-1673449743, new hf50(arrayList, (byte) 3), true), new ib5(arrayList, (byte) 28));
                return rih1Var;
        }
    }
}
