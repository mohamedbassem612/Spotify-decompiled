package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qih1 {
    public final vq80 a;
    public final pdb0 b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public qih1(vq80 vq80Var, pdb0 pdb0Var) {
        this.a = vq80Var;
        this.b = pdb0Var;
    }

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
    public final String a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.c;
        Object obj = map.get(numValueOf);
        Object obj2 = obj;
        if (obj == null) {
            String str = (String) this.a.invoke(Integer.valueOf(i));
            HashMap map2 = this.d;
            Object objValueOf = map2.get(str);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(i);
                map2.put(str, objValueOf);
            }
            String str2 = str;
            if (((Number) objValueOf).intValue() != i) {
                this.b.invoke(str);
                str2 = str + "_" + i;
            }
            map.put(numValueOf, str2);
            obj2 = str2;
        }
        return (String) obj2;
    }
}
