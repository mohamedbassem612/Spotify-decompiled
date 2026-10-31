package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class clr implements x2e {
    public final ekb a;
    public final p7s b;
    public final ewh0 c;
    public final qtz d;
    public final yqg e;
    public final dxz0 f;
    public final q8n g;
    public c9n h;
    public bpb1 i;
    public final LinkedHashSet j = new LinkedHashSet();

    public clr(ekb ekbVar, p7s p7sVar, ewh0 ewh0Var, qtz qtzVar, yqg yqgVar, dxz0 dxz0Var, q8n q8nVar) {
        this.a = ekbVar;
        this.b = p7sVar;
        this.c = ewh0Var;
        this.d = qtzVar;
        this.e = yqgVar;
        this.f = dxz0Var;
        this.g = q8nVar;
        this.h = cy30.t(q8nVar);
    }

    @Override // p.x2e
    public final void a() {
        bpb1 bpb1Var = this.i;
        if (bpb1Var != null) {
            bpb1Var.m((Object) null, z6x.a);
        }
        smo1.q(this.h);
    }

    @Override // p.x2e
    public final void b() {
        this.h = qmo1.v(this.h, new z5o(this, (byte) 27));
        this.i = gio1.b(z6x.a);
        c921.y(this.h, (o8n) null, 0, new mx(this, null, (byte) 14), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        xkr xkrVar;
        int i;
        Iterator it;
        if (onmVar instanceof xkr) {
            xkrVar = (xkr) onmVar;
            int i2 = xkrVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xkrVar.e = i2 - Integer.MIN_VALUE;
            } else {
                xkrVar = new xkr(this, onmVar);
            }
        } else {
            xkrVar = new xkr(this, onmVar);
        }
        Object obj = xkrVar.c;
        int i3 = xkrVar.e;
        LinkedHashSet linkedHashSet = this.j;
        if (i3 == 0) {
            hm5.M(obj);
            linkedHashSet.size();
            i = 0;
            it = linkedHashSet.iterator();
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = xkrVar.b;
            it = xkrVar.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            xkrVar.a = it;
            xkrVar.b = i;
            xkrVar.e = 1;
            Object objB = this.d.b(str, xkrVar);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        }
        linkedHashSet.clear();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:36:0x00f1->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ArrayList arrayList, onm onmVar) {
        ykr ykrVar;
        Set set;
        List list;
        Iterator it;
        int i;
        Iterator it2;
        bzc bzcVar;
        if (onmVar instanceof ykr) {
            ykrVar = (ykr) onmVar;
            int i2 = ykrVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ykrVar.g = i2 - Integer.MIN_VALUE;
            } else {
                ykrVar = new ykr(this, onmVar);
            }
        } else {
            ykrVar = new ykr(this, onmVar);
        }
        Object obj = ykrVar.e;
        int i3 = ykrVar.g;
        LinkedHashSet linkedHashSet = this.j;
        int i4 = 0;
        Object obj2 = d9n.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = ykrVar.d;
                it = ykrVar.c;
                list = ykrVar.b;
                set = ykrVar.a;
                hm5.M(obj);
            } else {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = ykrVar.d;
                it2 = ykrVar.c;
                List list2 = ykrVar.b;
                Set set2 = ykrVar.a;
                hm5.M(obj);
                i4 = i5;
            }
            while (it2.hasNext()) {
                bzcVar = (tyc) it2.next();
                ykrVar.a = null;
                ykrVar.b = null;
                ykrVar.c = it2;
                ykrVar.d = i4;
                ykrVar.g = 2;
                if (e(bzcVar, ykrVar) == obj2) {
                    return obj2;
                }
            }
            return rih1.a;
        }
        hm5.M(obj);
        ekb ekbVar = this.a;
        ArrayList arrayListT = mmo1.t(arrayList, ekbVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayListT.iterator();
        while (it3.hasNext()) {
            y7u y7uVarK = mmo1.K((pr31) it3.next(), ekbVar);
            String str = y7uVarK != null ? y7uVarK.a : null;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Set setV0 = dm61.v0(linkedHashSet, o7h.p1(arrayList2));
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayListT, 10));
        Iterator it4 = arrayListT.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new tyc((pr31) it4.next(), arrayListT));
        }
        setV0.size();
        arrayList3.size();
        set = setV0;
        list = arrayList3;
        it = setV0.iterator();
        i = 0;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ykrVar.a = set;
            ykrVar.b = list;
            ykrVar.c = it;
            ykrVar.d = i;
            ykrVar.g = 1;
            if (this.d.b(str2, ykrVar) == obj2) {
                return obj2;
            }
        }
        linkedHashSet.removeAll(set);
        it2 = list.iterator();
        while (it2.hasNext()) {
            bzcVar = (tyc) it2.next();
            ykrVar.a = null;
            ykrVar.b = null;
            ykrVar.c = it2;
            ykrVar.d = i4;
            ykrVar.g = 2;
            if (e(bzcVar, ykrVar) == obj2) {
                return obj2;
            }
        }
        return rih1.a;
    }

    public final Object e(bzc bzcVar, onm onmVar) {
        pr31 pr31VarA = bzcVar.a();
        y7u y7uVarK = pr31VarA != null ? mmo1.K(pr31VarA, this.a) : null;
        boolean z = bzcVar instanceof tyc;
        d9n d9nVar = d9n.a;
        qtz qtzVar = this.d;
        LinkedHashSet linkedHashSet = this.j;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (y7uVarK == null) {
                Logger.d("CastBasic->%s", "Failed to convert route to DiscoveredDevice: " + ((tyc) bzcVar).b);
                return rih1Var;
            }
            linkedHashSet.add(y7uVarK.a);
            Object objD = qtzVar.d(y7uVarK, onmVar);
            if (objD == d9nVar) {
                return objD;
            }
        } else if (bzcVar instanceof uyc) {
            if (y7uVarK == null) {
                Logger.d("CastBasic->%s", "Failed to convert route to DiscoveredDevice: " + ((uyc) bzcVar).a());
                return rih1Var;
            }
            linkedHashSet.add(y7uVarK.a);
            Object objD2 = qtzVar.d(y7uVarK, onmVar);
            if (objD2 == d9nVar) {
                return objD2;
            }
        } else {
            if (!(bzcVar instanceof yyc)) {
                bzcVar.toString();
                return rih1Var;
            }
            yyc yycVar = (yyc) bzcVar;
            c3e c3eVarH = ekb.H(yycVar.a().k);
            String str = c3eVarH != null ? c3eVarH.a : null;
            if (str == null) {
                str = yycVar.a().a;
            }
            linkedHashSet.remove(str);
            Object objB = qtzVar.b(str, onmVar);
            if (objB == d9nVar) {
                return objB;
            }
        }
        return rih1Var;
    }
}
