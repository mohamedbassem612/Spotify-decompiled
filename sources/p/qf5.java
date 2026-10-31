package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qf5 implements pf5 {
    public final a8b0 a;
    public final Map b;
    public final mka1 c;

    public qf5(qx81 qx81Var, Map map, mka1 mka1Var) {
        if (qx81Var == null) {
            c(0);
            throw null;
        }
        this.a = qx81Var;
        this.b = map;
        this.c = mka1Var;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p.pf5
    public final Map a() {
        return this.b;
    }

    @Override // p.pf5
    public final kf30 b() {
        beg begVarD = kht.d(this);
        if (begVarD != null) {
            if (bkz.e(begVarD)) {
                begVarD = null;
            }
            if (begVarD != null) {
                return kht.c(begVarD);
            }
        }
        return null;
    }

    @Override // p.pf5
    public final mka1 getSource() {
        return this.c;
    }

    @Override // p.pf5
    public final a8b0 getType() {
        a8b0 a8b0Var = this.a;
        if (a8b0Var != null) {
            return a8b0Var;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return cht.c.v(this, null);
    }
}
