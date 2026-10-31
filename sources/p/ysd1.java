package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ysd1 implements tyq {
    public static final o3r Z;
    public final psw X;
    public final String Y;
    public final d0r a;
    public final lzn0 b;
    public final a9d c;
    public final j0a1 d;
    public final kt91 e;
    public final q8n f;
    public final q8n g;
    public final i4r h = new i4r(pod1.X, Z);
    public final ljm0 i;
    public final ia00 t;

    static {
        jd11 jd11Var = rc11.a;
        Z = w3p1.n(new l4r(new xv00(jd11Var.b(jo70.class)), 1, pod1.N0, new j4r(pod1.i), pod1.O0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, pod1.Y, new j4r(pod1.t), pod1.Z), usd1.a);
    }

    public ysd1(d0r d0rVar, lzn0 lzn0Var, a9d a9dVar, j0a1 j0a1Var, kt91 kt91Var, q8n q8nVar, q8n q8nVar2) {
        this.a = d0rVar;
        this.b = lzn0Var;
        this.c = a9dVar;
        this.d = j0a1Var;
        this.e = kt91Var;
        this.f = q8nVar;
        this.g = q8nVar2;
        k7b1 k7b1Var = new k7b1(1, this, ysd1.class, "concealedState", "concealedState(Lcom/spotify/campfire/chatpage/elements/tastematchcard/api/TasteMatchCardElement$Props;)Lcom/spotify/campfire/chatpage/elements/tastematchcard/api/TasteMatchCardElement$State$Concealed;", 0, (byte) 10);
        qwc1 qwc1Var = new qwc1(this, (byte) 10);
        j2i j2iVar = new j2i(1250380505, new wcy0(this, (byte) 18), true);
        xas xasVar = new xas();
        qwc1Var.invoke(xasVar);
        this.i = new ljm0(xasVar, k7b1Var, q8nVar2, j2iVar);
        this.t = n3o1.q(this).a(i6d1.X, i6d1.Y);
        j2i j2iVar2 = lmj.a;
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar2, (byte) 0);
        this.Y = "TasteMatchCardElement";
    }

    public static qsd1 g(psd1 psd1Var) {
        boolean z = psd1Var.f;
        return new qsd1(z, psd1Var.c == null && z, false);
    }

    public final rqw a() {
        return this.t;
    }

    public final String b() {
        return this.Y;
    }

    public final jsw c() {
        return this.X;
    }

    public final d0r e() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(psd1 psd1Var, onm onmVar) {
        xsd1 xsd1Var;
        boolean zBooleanValue;
        if (onmVar instanceof xsd1) {
            xsd1Var = (xsd1) onmVar;
            int i = xsd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xsd1Var.c = i - Integer.MIN_VALUE;
            } else {
                xsd1Var = new xsd1(this, onmVar);
            }
        } else {
            xsd1Var = new xsd1(this, onmVar);
        }
        Object objY = xsd1Var.a;
        int i2 = xsd1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                q8n q8nVar = this.f;
                pec1 pec1Var = new pec1(this, psd1Var, (lnm) null, (byte) 11);
                xsd1Var.c = 1;
                objY = fn31.Y(q8nVar, pec1Var, xsd1Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objY);
            }
            zBooleanValue = ((Boolean) objY).booleanValue();
        } catch (Throwable unused) {
            op71.x(xsd1Var.getContext());
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final mqw getBehavior() {
        return this.i;
    }

    public final f4r getData() {
        return this.h;
    }
}
