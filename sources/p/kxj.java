package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kxj extends hab0 implements iu30 {
    public final /* synthetic */ tob1 N0;
    public final /* synthetic */ r6h1 O0;
    public final /* synthetic */ w061 P0;
    public final /* synthetic */ dw91 X;
    public final /* synthetic */ n8b1 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ txj g;
    public final /* synthetic */ cxc0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxj(vu30 vu30Var, List list, List list2, List list3, List list4, List list5, txj txjVar, cxc0 cxc0Var, float f, float f2, dw91 dw91Var, n8b1 n8b1Var, boolean z, tob1 tob1Var, r6h1 r6h1Var, w061 w061Var) {
        super(1);
        this.a = vu30Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = txjVar;
        this.h = cxc0Var;
        this.i = f;
        this.t = f2;
        this.X = dw91Var;
        this.Y = n8b1Var;
        this.Z = z;
        this.N0 = tob1Var;
        this.O0 = r6h1Var;
        this.P0 = w061Var;
    }

    public final Object invoke(Object obj) {
        List list;
        String str;
        rrj0 rrj0Var;
        rtb0 rtb0Var = (rtb0) obj;
        txj txjVar = this.g;
        byte b = 1;
        vu30 vu30Var = this.a;
        if (vu30Var != null) {
            rtb0Var.d("list_ux_platform_header", "list_ux_platform_header", new j2i(-125446311, new e6j(txjVar, vu30Var, (byte) 3), true));
        } else {
            rtb0.c(rtb0Var, "permanent_top_item", cei.b, 2);
        }
        cxc0 cxc0Var = this.h;
        j2i j2iVar = new j2i(745974585, new wh(txjVar, cxc0Var, (byte) 6), true);
        List list2 = this.b;
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String str2 = (String) obj2;
            rtb0Var.a(l1d.m("sticky_section_above_", str2), l1d.m("sticky_section_above_", str2), new j2i(2119697832, new cxj(str2, this.i, this.t, this.X, j2iVar, i), true));
            i = i2;
        }
        int size = list2.size();
        List list3 = this.c;
        int i3 = 0;
        for (Object obj3 : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            String str3 = (String) obj3;
            rtb0Var.d(l1d.m("section_above_", str3), l1d.m("section_above_", str3), new j2i(105040477, new dxj(j2iVar, str3, size, i3), true));
            i3 = i4;
        }
        int size2 = list3.size() + list2.size();
        List list4 = this.d;
        Iterator it = list4.iterator();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            List list5 = this.e;
            if (!zHasNext) {
                List list6 = list4;
                List list7 = list3;
                List list8 = list2;
                if (i5 < list5.size()) {
                    List listSubList = list5.subList(i5, list5.size());
                    rtb0Var.e(listSubList.size(), new kwd(listSubList, (byte) 22), new gxj(listSubList, txjVar, (byte) 0), new j2i(2039820996, new hxj(listSubList, listSubList, txjVar, this.Y, i5, this.Z, this.N0, this.O0, this.P0, (byte) 0), true));
                }
                int size3 = list6.size() + list7.size() + list8.size() + 1;
                List list9 = this.f;
                rtb0Var.e(list9.size(), new kwd(list9, (byte) 23), new kwd(list9, (byte) 24), new j2i(2039820996, new ixj(list9, txjVar, cxc0Var, size3), true));
                return rih1.a;
            }
            Object next = it.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                p7h.T();
                throw null;
            }
            rrj0 rrj0Var2 = (rrj0) next;
            int i8 = rrj0Var2.a;
            String str4 = rrj0Var2.b;
            int size4 = list5.size();
            if (i8 > size4) {
                i8 = size4;
            }
            if (i8 > i5) {
                List list10 = list3;
                List listSubList2 = list5.subList(i5, i8);
                list = list10;
                str = str4;
                rtb0Var.e(listSubList2.size(), new kwd(listSubList2, (byte) 25), new gxj(listSubList2, txjVar, b), new j2i(2039820996, new hxj(listSubList2, listSubList2, txjVar, this.Y, i5, this.Z, this.N0, this.O0, this.P0, (byte) 1), true));
                rrj0Var = rrj0Var2;
            } else {
                list = list3;
                str = str4;
                rrj0Var = rrj0Var2;
            }
            int i9 = rrj0Var.a;
            StringBuilder sb = new StringBuilder("mid_section_");
            String str5 = str;
            sb.append(str5);
            sb.append("_");
            sb.append(i9);
            txj txjVar2 = txjVar;
            txjVar = txjVar2;
            rtb0Var.d(sb.toString(), l1d.m("mid_section_", str5), new j2i(-813281019, new fxj(rrj0Var, txjVar2, this.h, size2, i6), true));
            i6 = i7;
            list2 = list2;
            list4 = list4;
            i5 = i8;
            list3 = list;
        }
    }
}
