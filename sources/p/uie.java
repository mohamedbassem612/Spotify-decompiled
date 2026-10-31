package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uie extends a8d1 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ String c;
    public Object d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uie(mje mjeVar, d0r d0rVar, kdy0 kdy0Var, pie pieVar, cke ckeVar, ahe aheVar, String str, lnm lnmVar) {
        super(1, lnmVar);
        this.f = mjeVar;
        this.d = d0rVar;
        this.e = kdy0Var;
        this.g = pieVar;
        this.h = ckeVar;
        this.i = aheVar;
        this.c = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new uie((mje) this.f, (d0r) this.d, (kdy0) this.e, (pie) obj3, (cke) obj2, (ahe) obj, this.c, lnmVar);
            case 1:
                d0r d0rVar = (d0r) this.d;
                kdy0 kdy0Var = (kdy0) this.e;
                return new uie((ArrayList) this.f, this.c, (yle) obj3, (String) obj2, (eme) obj, d0rVar, kdy0Var, lnmVar);
            default:
                return new uie((gc21) obj3, (x4i1) obj2, (vpu0) obj, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [p.mje] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) {
        ?? SingletonList;
        Boolean m231Var;
        vpu0 vpu0Var;
        gc21 gc21Var;
        x4i1 x4i1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return ((mje) this.f).c((d0r) this.d, (kdy0) this.e, (pie) obj4, (cke) obj3, (ahe) obj2, this.c, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                yle yleVar = (yle) obj4;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ArrayList arrayList = (ArrayList) this.f;
                String str = this.c;
                int iIndexOf = arrayList.indexOf(str);
                if (iIndexOf >= 0) {
                    c380 c380Var = yleVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : c380Var) {
                        if (obj5 instanceof vle) {
                            arrayList2.add(obj5);
                        }
                    }
                    List<vle> listK0 = o7h.k0(arrayList2, iIndexOf);
                    SingletonList = new ArrayList(q7h.U(listK0, 10));
                    for (vle vleVar : listK0) {
                        SingletonList.add(new ahe(vleVar.a, vleVar.b));
                    }
                } else {
                    SingletonList = Collections.singletonList(new ahe(str, (String) obj3));
                }
                ?? r4 = SingletonList;
                ?? r0 = ((eme) obj2).n;
                d0r d0rVar = (d0r) this.d;
                kdy0 kdy0Var = (kdy0) this.e;
                String str2 = yleVar.a;
                this.b = true;
                return r0.f(d0rVar, kdy0Var, str2, r4, this) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        gc21 gc21Var2 = (gc21) obj4;
                        x4i1 x4i1Var2 = (x4i1) obj3;
                        vpu0Var = (vpu0) obj2;
                        m311 m311Var = new m311(gc21Var2, x4i1Var2, this.c, (lnm) null, (byte) 13);
                        this.f = x4i1Var2;
                        this.d = vpu0Var;
                        this.e = gc21Var2;
                        this.b = true;
                        if (rc2.M(3500L, m311Var, this) == d9nVar) {
                            return d9nVar;
                        }
                        gc21Var = gc21Var2;
                        x4i1Var = x4i1Var2;
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gc21Var = (gc21) this.e;
                        vpu0Var = (vpu0) this.d;
                        x4i1Var = (x4i1) this.f;
                        hm5.M(obj);
                    }
                    gc21Var.j(x4i1Var, vpu0Var.b.b);
                    m231Var = Boolean.TRUE;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    return null;
                }
                return m231Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uie(ArrayList arrayList, String str, yle yleVar, String str2, eme emeVar, d0r d0rVar, kdy0 kdy0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.f = arrayList;
        this.c = str;
        this.g = yleVar;
        this.h = str2;
        this.i = emeVar;
        this.d = d0rVar;
        this.e = kdy0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uie(gc21 gc21Var, x4i1 x4i1Var, vpu0 vpu0Var, String str, lnm lnmVar) {
        super(1, lnmVar);
        this.g = gc21Var;
        this.h = x4i1Var;
        this.i = vpu0Var;
        this.c = str;
    }
}
