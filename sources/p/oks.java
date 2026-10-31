package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oks {
    public final ynb0 a;
    public final xtt b;
    public final gur c;
    public final i8h1 d;
    public final g0l e;
    public final ynb0 f;
    public final Map g = sqg0.J(new mmr0[]{new mmr0(yu40.c, 0), new mmr0(yu40.b, 1), new mmr0(yu40.a, 2)});

    public oks(ynb0 ynb0Var, xtt xttVar, gur gurVar, i8h1 i8h1Var, g0l g0lVar, ynb0 ynb0Var2) {
        this.a = ynb0Var;
        this.b = xttVar;
        this.c = gurVar;
        this.d = i8h1Var;
        this.e = g0lVar;
        this.f = ynb0Var2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(zv31 zv31Var, wly0 wly0Var, int i, int i2, String str) {
        Object next;
        Object next2;
        Object next3;
        l0l l0lVar;
        List listA1 = o7h.a1((Iterable) this.b.get(), new xvd(this, (byte) 10));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA1) {
            if (i == 1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((xu40) next).a(zv31Var, i2, str) instanceof n090));
        if (((xu40) next) != null) {
            return;
        }
        if (i != 2) {
            Iterator it2 = ((Iterable) this.a.get()).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((but) next2).getType() != wly0Var);
            but butVar = next2 instanceof but ? (but) next2 : null;
            if (butVar != null) {
                butVar.c(zv31Var, i2, str);
                return;
            }
            return;
        }
        Iterator it3 = this.e.i().iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            l0lVar = (l0l) next3;
            if (u890.j(l0lVar.j(), zv31Var.a)) {
                break;
            }
        } while (!zv31Var.g.contains(l0lVar.d()));
        l0l l0lVar2 = (l0l) next3;
        if (l0lVar2 != null) {
            w7h1 w7h1VarC = ((uks) this.f.get()).a(wly0Var).c(zv31Var, i2, str);
            String str2 = w7h1VarC != null ? this.d.m(w7h1VarC, (xj61) null).a.a : null;
            if (str2 != null) {
                this.c.b.x(i2, l0lVar2.j(), str2);
            }
        }
    }
}
