package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class en6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d0r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ en6(d0r d0rVar, byte b) {
        super(1);
        this.a = b;
        this.b = d0rVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        d0r d0rVar = this.b;
        switch (b) {
            case 0:
                sxg sxgVar = (sxg) obj;
                List list = sxgVar.c;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((pvc0) it.next()).c);
                }
                List listD1 = o7h.d1(arrayList, 2);
                int size = list.size();
                if (!listD1.isEmpty()) {
                    return new dn6(hn6.b(d0rVar, listD1), sxgVar, size, (byte) 0);
                }
                z6a1 z6a1Var = sxgVar.b;
                return new huz(new i1r(new um6((int) z6a1Var.a, (int) z6a1Var.b, size, sxgVar.a.a, z6x.a), (Integer) null), (byte) 10);
            case 1:
                ey81 ey81Var = (ey81) obj;
                List list3 = ey81Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((pvc0) it2.next()).c);
                }
                List listD2 = o7h.d1(arrayList2, 2);
                if (!listD2.isEmpty()) {
                    return new c64(hn6.b(d0rVar, listD2), ey81Var, (byte) 8);
                }
                z6a1 z6a1Var2 = ey81Var.a;
                return new huz(new i1r(new wm6((int) z6a1Var2.a, (int) z6a1Var2.b, z6x.a), (Integer) null), (byte) 10);
            case 2:
                i1r i1rVarN = x2p1.n(d0rVar, eme.x, (String) obj);
                i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
                if (i1rVar != null) {
                    return (iix0) i1rVar.a;
                }
                return null;
            case 3:
                return new jpg0(f6o1.A(new hho(d0rVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), yoy.a1);
            case 4:
                return f6o1.A(new xzq(new hho(d0rVar), lyy.e), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            default:
                return f6o1.A(new xzq(new hho(d0rVar), lcl1.U0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        }
    }
}
