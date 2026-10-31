package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kv30 extends z5 {
    public final /* synthetic */ lv30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv30(lv30 lv30Var) {
        super(lv30Var.e);
        this.c = lv30Var;
    }

    @Override // p.ma
    public final Collection a() {
        List listM;
        lv30 lv30Var = this.c;
        int i = lv30Var.h;
        yv30 yv30Var = lv30Var.g;
        uv30 uv30Var = uv30.d;
        if (u890.j(yv30Var, uv30Var)) {
            listM = Collections.singletonList(lv30.Y);
        } else if (u890.j(yv30Var, vv30.d)) {
            listM = p7h.M(new heg[]{lv30.Z, new heg(sfb1.l, uv30Var.a(i))});
        } else {
            xv30 xv30Var = xv30.d;
            if (u890.j(yv30Var, xv30Var)) {
                listM = Collections.singletonList(lv30.Y);
            } else {
                if (!u890.j(yv30Var, wv30.d)) {
                    int i2 = dz1.a;
                    eg.m("should not be called");
                    return null;
                }
                listM = p7h.M(new heg[]{lv30.Z, new heg(sfb1.f, xv30Var.a(i))});
            }
        }
        zim0 zim0VarX1 = ((ezq0) lv30Var.f).x1();
        List<heg> list = listM;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (heg hegVar : list) {
            beg begVarH = x1p1.h(zim0VarX1, hegVar);
            if (begVarH == null) {
                n9v.h("Built-in class ", hegVar, " not found");
                return null;
            }
            List listE1 = o7h.e1(begVarH.g().getParameters().size(), lv30Var.X);
            ArrayList arrayList2 = new ArrayList(q7h.U(listE1, 10));
            Iterator it = listE1.iterator();
            while (it.hasNext()) {
                arrayList2.add(new f1h1(((y0h1) it.next()).m()));
            }
            e0h1.b.getClass();
            arrayList.add(y3o1.h0(e0h1.c, begVarH, arrayList2));
        }
        return o7h.l1(arrayList);
    }

    @Override // p.ma
    public final djx0 c() {
        return djx0.R0;
    }

    public final List getParameters() {
        return this.c.X;
    }

    @Override // p.z5
    /* JADX INFO: renamed from: j */
    public final beg s() {
        return this.c;
    }

    public final jfg s() {
        return this.c;
    }

    public final boolean t() {
        return true;
    }

    public final String toString() {
        return this.c.toString();
    }
}
