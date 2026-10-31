package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class pa extends q9r implements y0h1 {
    public final voe0 X;
    public final int f;
    public final boolean g;
    public final int h;
    public final toe0 i;
    public final toe0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(int i, int i2, fg5 fg5Var, n9r n9rVar, ajn0 ajn0Var, s1c1 s1c1Var, boolean z) {
        super(n9rVar, fg5Var, ajn0Var, mka1.m0);
        byte b = 0;
        if (s1c1Var == null) {
            r0(0);
            throw null;
        }
        byte b2 = 1;
        if (n9rVar == null) {
            r0(1);
            throw null;
        }
        if (fg5Var == null) {
            r0(2);
            throw null;
        }
        if (ajn0Var == null) {
            r0(3);
            throw null;
        }
        if (i == 0) {
            r0(4);
            throw null;
        }
        this.f = i;
        this.g = z;
        this.h = i2;
        na naVar = new na((q9r) this, (Object) s1c1Var, b);
        voe0 voe0Var = (voe0) s1c1Var;
        this.i = new toe0(voe0Var, naVar);
        this.t = new toe0(voe0Var, new na((q9r) this, (Object) ajn0Var, b2));
        this.X = voe0Var;
    }

    public static /* synthetic */ void r0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p.y0h1
    public final s1c1 J() {
        voe0 voe0Var = this.X;
        if (voe0Var != null) {
            return voe0Var;
        }
        r0(14);
        throw null;
    }

    @Override // p.y0h1
    public final boolean N() {
        return false;
    }

    @Override // p.y0h1, p.jfg
    public final h0h1 g() {
        h0h1 h0h1Var = (h0h1) this.i.invoke();
        if (h0h1Var != null) {
            return h0h1Var;
        }
        r0(9);
        throw null;
    }

    @Override // p.y0h1
    public final int getIndex() {
        return this.h;
    }

    @Override // p.y0h1
    public final List getUpperBounds() {
        return ((oa) g()).d();
    }

    @Override // p.jfg
    public final qx81 m() {
        qx81 qx81Var = (qx81) this.t.invoke();
        if (qx81Var != null) {
            return qx81Var;
        }
        r0(10);
        throw null;
    }

    @Override // p.n9r
    public final Object r(r9r r9rVar, Object obj) {
        return r9rVar.e(this, obj);
    }

    @Override // p.y0h1
    public final boolean u() {
        return this.g;
    }

    @Override // p.y0h1
    public final int x() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        r0(7);
        throw null;
    }

    public List x1(List list) {
        return list;
    }

    public abstract List y1();

    @Override // p.q9r, p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final n9r w1() {
        return this;
    }

    @Override // p.q9r, p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final y0h1 w1() {
        return this;
    }

    @Override // p.q9r, p.o9r, p.n9r, p.jfg
    /* JADX INFO: renamed from: a */
    public final jfg w1() {
        return this;
    }

    @Override // p.q9r
    public final p9r w1() {
        return this;
    }
}
