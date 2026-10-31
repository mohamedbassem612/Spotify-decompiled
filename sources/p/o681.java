package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o681 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o681() {
        super(3, (lnm) null);
        this.a = (byte) 6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        vr20 vr20Var = (vr20) obj;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object obj4 = ((e331) obj2).a;
                o681 o681Var = new o681(b2, (lnm) obj3, (byte) 0);
                o681Var.c = vr20Var;
                o681Var.d = obj4;
                return o681Var.invokeSuspend(rih1Var);
            case 1:
                o681 o681Var2 = new o681(b2, (lnm) obj3, (byte) 1);
                o681Var2.c = vr20Var;
                o681Var2.d = obj2;
                return o681Var2.invokeSuspend(rih1Var);
            case 2:
                o681 o681Var3 = new o681(b2, (lnm) obj3, (byte) 2);
                o681Var3.c = vr20Var;
                o681Var3.d = obj2;
                return o681Var3.invokeSuspend(rih1Var);
            case 3:
                o681 o681Var4 = new o681(b2, (lnm) obj3, b2);
                o681Var4.c = vr20Var;
                o681Var4.d = obj2;
                return o681Var4.invokeSuspend(rih1Var);
            case 4:
                o681 o681Var5 = new o681(b2, (lnm) obj3, (byte) 4);
                o681Var5.c = vr20Var;
                o681Var5.d = obj2;
                return o681Var5.invokeSuspend(rih1Var);
            case 5:
                o681 o681Var6 = new o681(b2, (lnm) obj3, (byte) 5);
                o681Var6.c = vr20Var;
                o681Var6.d = obj2;
                return o681Var6.invokeSuspend(rih1Var);
            default:
                o681 o681Var7 = new o681(b2, (lnm) obj3, (byte) 6);
                o681Var7.c = vr20Var;
                o681Var7.d = obj2;
                return o681Var7.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        bpb1 huzVar;
        bpb1 huzVar2;
        huz z4t0Var;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    e331 e331Var = new e331(obj2);
                    this.c = null;
                    this.d = obj2;
                    this.b = true;
                    if (vr20Var.emit(e331Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (e331.a(obj2) != null) {
                    return Boolean.TRUE;
                }
                List list = (List) obj2;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (t6p1.k((na81) it.next())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                vr20 vr20Var2 = this.c;
                Object obj3 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441Var = ((e090) obj3) instanceof d090 ? new m441(new y2k(2, (lnm) null, (byte) 8)) : new huz(Boolean.FALSE, (byte) 10);
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, m441Var, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = this.c;
                Object obj4 = this.d;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zob1 zob1VarC = ((nw80) obj4).c();
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var3, zob1VarC, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = this.c;
                Object obj5 = this.d;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                cx80 cx80Var = (dx80) obj5;
                mr20 mr20VarA = cx80Var instanceof cx80 ? cx80Var.a() : r6x.a;
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var4, mr20VarA, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = this.c;
                Object obj6 = this.d;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var = (r091) obj6;
                if (r091Var == null || (huzVar = r091Var.g) == null) {
                    huzVar = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var5, huzVar, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                vr20 vr20Var6 = this.c;
                Object obj7 = this.d;
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var2 = (r091) obj7;
                if (r091Var2 == null || (huzVar2 = r091Var2.g) == null) {
                    huzVar2 = new huz((Object) null, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var6, huzVar2, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var7 = this.c;
                Object obj8 = this.d;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Set set = (Set) obj8;
                if (set.isEmpty()) {
                    z4t0Var = new huz(z6x.a, (byte) 10);
                } else {
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((s4j0) it2.next()).c());
                    }
                    z4t0Var = new z4t0((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 14);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var7, z4t0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o681(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
