package p;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ojh1 extends AbstractList implements mvb0, RandomAccess {
    public final hvb0 a;

    public ojh1(hvb0 hvb0Var) {
        this.a = hvb0Var;
    }

    @Override // p.mvb0
    public final List a() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // p.mvb0
    public final void a0(ghc ghcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        xob0 xob0Var = new xob0((byte) 1);
        xob0Var.b = this.a.iterator();
        return xob0Var;
    }

    @Override // p.mvb0
    public final Object j(int i) {
        return this.a.b.get(i);
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
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        njh1 njh1Var = new njh1((byte) 0);
        njh1Var.b = this.a.listIterator(i);
        return njh1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // p.mvb0
    public final mvb0 g() {
        return this;
    }
}
