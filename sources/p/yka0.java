package p;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yka0 extends lla0 {
    public static final /* synthetic */ mma0[] w = {new cey0(yka0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new cey0(yka0.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new cey0(yka0.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new cey0(yka0.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new cey0(yka0.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new cey0(yka0.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new cey0(yka0.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new cey0(yka0.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new cey0(yka0.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new cey0(yka0.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new cey0(yka0.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new cey0(yka0.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new cey0(yka0.class, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new cey0(yka0.class, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new cey0(yka0.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new cey0(yka0.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new cey0(yka0.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new cey0(yka0.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new cey0(yka0.class, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};
    public final znb0 c;
    public final mc11 d;
    public final mc11 e;
    public final mc11 f;
    public final mc11 g;
    public final mc11 h;
    public final mc11 i;
    public final mc11 j;
    public final mc11 k;
    public final znb0 l;
    public final mc11 m;
    public final mc11 n;
    public final mc11 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mc11 f101p;
    public final mc11 q;
    public final mc11 r;
    public final mc11 s;
    public final mc11 t;
    public final mc11 u;
    public final /* synthetic */ bla0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yka0(bla0 bla0Var) {
        super(bla0Var);
        this.v = bla0Var;
        this.c = dm5.S(2, new y170(bla0Var, this, (byte) 1));
        this.d = jhc1.A(null, new vka0(bla0Var, (byte) 4));
        this.e = jhc1.A(null, new vka0(bla0Var, this, (byte) 6));
        this.f = jhc1.A(null, new vka0(bla0Var, this, (byte) 7));
        this.g = jhc1.A(null, new vka0(bla0Var, (byte) 8));
        this.h = jhc1.A(null, new uka0(bla0Var, this, (byte) 4));
        jhc1.A(null, new uka0(this, bla0Var, (byte) 5));
        dm5.S(2, new uka0(this, bla0Var, (byte) 6));
        this.i = jhc1.A(null, new uka0(this, bla0Var, (byte) 7));
        this.j = jhc1.A(null, new uka0(this, bla0Var, (byte) 8));
        this.k = jhc1.A(null, new uka0(bla0Var, this, (byte) 0));
        jhc1.A(null, new uka0(bla0Var, this, (byte) 1));
        this.l = dm5.S(2, new uka0(this, bla0Var, (byte) 2));
        this.m = jhc1.A(null, new vka0(bla0Var, (byte) 0));
        this.n = jhc1.A(null, new vka0(bla0Var, (byte) 1));
        this.o = jhc1.A(null, new vka0(bla0Var, (byte) 2));
        this.f101p = jhc1.A(null, new vka0(bla0Var, (byte) 3));
        this.q = jhc1.A(null, new b9o(this, (byte) 6));
        this.r = jhc1.A(null, new wka0(this, (byte) 0));
        this.s = jhc1.A(null, new wka0(this, (byte) 1));
        this.t = jhc1.A(null, new uka0(this, bla0Var, (byte) 3));
        this.u = jhc1.A(null, new vka0(bla0Var, (byte) 5));
    }

    public final Collection a() {
        mma0 mma0Var = w[10];
        return (Collection) this.m.invoke();
    }

    public final beg b() {
        mma0 mma0Var = w[0];
        return (beg) this.d.invoke();
    }

    public final l3b0 c() {
        return (l3b0) this.c.getValue();
    }

    public final c1h1 d() {
        mma0 mma0Var = w[7];
        return (c1h1) this.j.invoke();
    }

    public final boolean e() {
        if (!oed1.b() || oed1.c()) {
            return true;
        }
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(Iterable.class);
        bla0 bla0Var = this.v;
        return ila0.x(bla0Var, tka0VarB) || ila0.x(bla0Var, jd11Var.b(Map.class)) || ila0.x(bla0Var, jd11Var.b(CharSequence.class)) || ila0.x(bla0Var, jd11Var.b(Number.class));
    }
}
