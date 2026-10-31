package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cme extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;
    public final /* synthetic */ yle d;
    public final /* synthetic */ String e;
    public final /* synthetic */ eme f;
    public final /* synthetic */ d0r g;
    public final /* synthetic */ kdy0 h;
    public final /* synthetic */ dg8 i;
    public final /* synthetic */ lo9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cme(ArrayList arrayList, String str, yle yleVar, String str2, eme emeVar, d0r d0rVar, kdy0 kdy0Var, dg8 dg8Var, lo9 lo9Var, lnm lnmVar) {
        super(1, lnmVar);
        this.b = arrayList;
        this.c = str;
        this.d = yleVar;
        this.e = str2;
        this.f = emeVar;
        this.g = d0rVar;
        this.h = kdy0Var;
        this.i = dg8Var;
        this.t = lo9Var;
    }

    public final lnm create(lnm lnmVar) {
        return new cme(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.mje] */
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
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            ArrayList arrayList = this.b;
            String str = this.c;
            int iIndexOf = arrayList.indexOf(str);
            yle yleVar = this.d;
            if (iIndexOf >= 0) {
                c380 c380Var = yleVar.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : c380Var) {
                    if (obj2 instanceof vle) {
                        arrayList2.add(obj2);
                    }
                }
                List<vle> listD1 = o7h.d1(arrayList2, iIndexOf + 1);
                SingletonList = new ArrayList(q7h.U(listD1, 10));
                for (vle vleVar : listD1) {
                    SingletonList.add(new ahe(vleVar.a, vleVar.b));
                }
            } else {
                SingletonList = Collections.singletonList(new ahe(str, this.e));
            }
            ?? r10 = SingletonList;
            eme emeVar = this.f;
            ?? r4 = emeVar.n;
            String str2 = yleVar.a;
            d0r d0rVar = this.g;
            sxa sxaVar = new sxa(emeVar, d0rVar, (lnm) null, (byte) 22);
            this.a = true;
            Object objD = r4.d(d0rVar, this.h, this.i, this.t, str2, r10, sxaVar, this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
