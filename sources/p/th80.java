package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class th80 implements r511 {
    public final r511[] a;
    public final s5j1 b;
    public final gr60 c;
    public final s5j1 d;
    public final gr60 e;

    public th80(r511[] r511VarArr) {
        this.a = r511VarArr;
        int length = r511VarArr.length;
        final s5j1[] s5j1VarArr = new s5j1[length];
        final byte b = 0;
        for (int i = 0; i < length; i++) {
            s5j1VarArr[i] = this.a[i].a();
        }
        final byte b2 = 1;
        this.b = new s5j1(new vu30() { // from class: p.r5j1
            public final Object invoke(Object obj, Object obj2) {
                float fJ;
                byte b3 = b2;
                s5j1[] s5j1VarArr2 = s5j1VarArr;
                p5t0 p5t0Var = (p5t0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fJ = bmq0.J(p5t0Var, false, s5j1VarArr2, fFloatValue);
                        break;
                    default:
                        fJ = bmq0.J(p5t0Var, true, s5j1VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fJ);
            }
        });
        int length2 = this.a.length;
        final gr60[] gr60VarArr = new gr60[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            gr60VarArr[i2] = this.a[i2].b();
        }
        this.c = new gr60(new vu30() { // from class: p.fr60
            public final Object invoke(Object obj, Object obj2) {
                float fJ;
                byte b3 = b2;
                gr60[] gr60VarArr2 = gr60VarArr;
                p5t0 p5t0Var = (p5t0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fJ = bmq0.J(p5t0Var, false, gr60VarArr2, fFloatValue);
                        break;
                    default:
                        fJ = bmq0.J(p5t0Var, true, gr60VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fJ);
            }
        });
        int length3 = this.a.length;
        final s5j1[] s5j1VarArr2 = new s5j1[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            s5j1VarArr2[i3] = this.a[i3].d();
        }
        this.d = new s5j1(new vu30() { // from class: p.r5j1
            public final Object invoke(Object obj, Object obj2) {
                float fJ;
                byte b3 = b;
                s5j1[] s5j1VarArr3 = s5j1VarArr2;
                p5t0 p5t0Var = (p5t0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fJ = bmq0.J(p5t0Var, false, s5j1VarArr3, fFloatValue);
                        break;
                    default:
                        fJ = bmq0.J(p5t0Var, true, s5j1VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fJ);
            }
        });
        int length4 = this.a.length;
        final gr60[] gr60VarArr2 = new gr60[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            gr60VarArr2[i4] = this.a[i4].c();
        }
        this.e = new gr60(new vu30() { // from class: p.fr60
            public final Object invoke(Object obj, Object obj2) {
                float fJ;
                byte b3 = b;
                gr60[] gr60VarArr3 = gr60VarArr2;
                p5t0 p5t0Var = (p5t0) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (b3) {
                    case 0:
                        fJ = bmq0.J(p5t0Var, false, gr60VarArr3, fFloatValue);
                        break;
                    default:
                        fJ = bmq0.J(p5t0Var, true, gr60VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fJ);
            }
        });
    }

    @Override // p.r511
    public final s5j1 a() {
        return this.b;
    }

    @Override // p.r511
    public final gr60 b() {
        return this.c;
    }

    @Override // p.r511
    public final gr60 c() {
        return this.e;
    }

    @Override // p.r511
    public final s5j1 d() {
        return this.d;
    }

    public final String toString() {
        return f46.s0(this.a, (String) null, "innermostOf(", ")", (iu30) null, 57);
    }
}
