package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class xm7 {
    public static final mgc A;
    public static final /* synthetic */ mma0[] a = {new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new een0(xm7.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new een0(xm7.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1), new een0(xm7.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1), new een0(xm7.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1), new een0(xm7.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new een0(xm7.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1), new een0(xm7.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new een0(xm7.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new een0(xm7.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/ReturnValueStatus;", 1), new een0(xm7.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1), new een0(xm7.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1), new een0(xm7.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1), new een0(xm7.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new een0(xm7.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/ReturnValueStatus;", 1), new een0(xm7.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1), new een0(xm7.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1), new een0(xm7.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1), new een0(xm7.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new een0(xm7.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/ReturnValueStatus;", 1), new een0(xm7.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1), new een0(xm7.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1), new een0(xm7.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new een0(xm7.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new een0(xm7.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new een0(xm7.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new een0(xm7.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new een0(xm7.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new een0(xm7.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new een0(xm7.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1), new een0(xm7.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new een0(xm7.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new een0(xm7.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new een0(xm7.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new een0(xm7.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};
    public static final yzu b;
    public static final yzu c;
    public static final yzu d;
    public static final mgc e;
    public static final mgc f;
    public static final yzu g;
    public static final yzu h;
    public static final yzu i;
    public static final mgc j;
    public static final mgc k;
    public static final mgc l;
    public static final mgc m;
    public static final mgc n;
    public static final yzu o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final yzu f50p;
    public static final mgc q;
    public static final mgc r;
    public static final yzu s;
    public static final yzu t;
    public static final mgc u;
    public static final mgc v;
    public static final mgc w;
    public static final mgc x;
    public static final mgc y;
    public static final mgc z;

    static {
        lo20 lo20Var = no20.c;
        u2p1.i(new go20(lo20Var, 1));
        go20 go20Var = new go20(lo20Var, 1);
        int i2 = ao20.b;
        if (go20Var.b != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var, " was passed");
            return;
        }
        u2p1.j(new go20(lo20Var, 1));
        u2p1.q(new go20(lo20Var, 1));
        go20 go20Var2 = new go20(lo20Var, 1);
        co20 co20Var = co20.b;
        if (go20Var2.b != 1 || go20Var2.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var2, " was passed");
            return;
        }
        go20 go20Var3 = new go20(lo20Var, 1);
        fo20 fo20Var = fo20.b;
        if (go20Var3.b != 1 || go20Var3.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var3, " was passed");
            return;
        }
        go20 go20Var4 = new go20(lo20Var, 1);
        int i3 = fm7.d;
        if (go20Var4.b != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var4, " was passed");
            return;
        }
        b = u2p1.n(mm7.b);
        c = u2p1.x(vm7.b);
        im7 im7Var = im7.b;
        mo20 mo20Var = no20.f;
        t0z t0zVar = ieg.t;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(((ieg) d7Var.next()).a);
        }
        d = new yzu(im7Var, mo20Var, t0zVar, arrayList);
        e = u2p1.i(new go20(no20.g, 1));
        u2p1.i(new go20(no20.h, 1));
        u2p1.i(new go20(no20.i, 1));
        u2p1.i(new go20(no20.j, 1));
        f = u2p1.i(new go20(no20.k, 1));
        u2p1.i(new go20(no20.l, 1));
        u2p1.i(new go20(no20.m, 1));
        g = u2p1.x(wm7.b);
        go20 go20Var5 = new go20(no20.n, 1);
        int i4 = ao20.b;
        if (go20Var5.b != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var5, " was passed");
            return;
        }
        go20 go20Var6 = new go20(no20.o, 1);
        if (go20Var6.b != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var6, " was passed");
            return;
        }
        u2p1.s(pm7.b, no20.f32p);
        u2p1.m(jm7.b);
        h = u2p1.x(rm7.b);
        i = u2p1.n(nm7.b);
        j = u2p1.j(new go20(no20.r, 1));
        k = u2p1.j(new go20(no20.s, 1));
        l = u2p1.j(new go20(no20.t, 1));
        u2p1.j(new go20(no20.u, 1));
        m = u2p1.j(new go20(no20.v, 1));
        n = u2p1.j(new go20(no20.w, 1));
        u2p1.j(new go20(no20.x, 1));
        u2p1.j(new go20(no20.y, 1));
        u2p1.s(qm7.b, no20.z);
        o = u2p1.x(sm7.b);
        f50p = u2p1.n(km7.b);
        u2p1.m(hm7.b);
        q = u2p1.q(new go20(no20.A, 1));
        u2p1.q(new go20(no20.D, 1));
        u2p1.q(new go20(no20.E, 1));
        u2p1.q(new go20(no20.F, 1));
        u2p1.q(new go20(no20.G, 1));
        r = u2p1.q(new go20(no20.H, 1));
        u2p1.q(new go20(no20.I, 1));
        u2p1.s(om7.b, no20.J);
        s = u2p1.x(tm7.b);
        t = u2p1.n(lm7.b);
        go20 go20Var7 = new go20(no20.N, 1);
        co20 co20Var2 = co20.b;
        if (go20Var7.b != 1 || go20Var7.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var7, " was passed");
            return;
        }
        u = new mgc(co20Var2, new go20(no20.O, 1));
        v = new mgc(co20Var2, new go20(no20.P, 1));
        go20 go20Var8 = new go20(0, 1, 1);
        eo20 eo20Var = eo20.b;
        w = new mgc(eo20Var, go20Var8);
        lo20 lo20Var2 = no20.a;
        x = new mgc(eo20Var, new go20(lo20Var2.a + 1, lo20Var2.b, 1));
        lo20 lo20Var3 = no20.b;
        y = new mgc(eo20Var, new go20(lo20Var3.a + 1, lo20Var3.b, 1));
        z = new mgc(gm7.b, new go20(0, 1, 1));
        u2p1.x(um7.b);
        A = new mgc(fo20.b, new go20(no20.K, 1));
        go20 go20Var9 = new go20(no20.L, 1);
        if (go20Var9.b != 1 || go20Var9.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var9, " was passed");
            return;
        }
        go20 go20Var10 = new go20(no20.M, 1);
        if (go20Var10.b != 1 || go20Var10.c != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var10, " was passed");
            return;
        }
        int i5 = fm7.d;
        go20 go20Var11 = new go20(no20.Q, 1);
        if (go20Var11.b != 1) {
            bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var11, " was passed");
            return;
        }
        int i6 = fm7.d;
        go20 go20Var12 = new go20(no20.R, 1);
        if (go20Var12.b == 1) {
            return;
        }
        bhn0.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", go20Var12, " was passed");
    }

    public static final ieg a(l3b0 l3b0Var) {
        mma0 mma0Var = a[9];
        return (ieg) d.y(l3b0Var);
    }

    public static final boolean b(l3b0 l3b0Var) {
        mma0 mma0Var = a[10];
        return e.D(l3b0Var);
    }

    public static final boolean c(l3b0 l3b0Var) {
        mma0 mma0Var = a[14];
        return f.D(l3b0Var);
    }

    public static final boolean d(w3b0 w3b0Var) {
        mma0 mma0Var = a[36];
        return q.D(w3b0Var);
    }
}
