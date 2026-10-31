package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h2u extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2u(String str, String str2, String str3, String str4, float f, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.c = f;
        this.h = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                String str = this.b;
                float f = this.c;
                i2u.a(str, (String) obj6, (String) obj5, (String) obj4, f, (qim0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                String str2 = this.b;
                float f2 = this.c;
                c1q0.e((e0q0) obj6, (Function0) obj5, str2, f2, (gdx) obj4, (Function0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2u(e0q0 e0q0Var, Function0 function0, String str, float f, gdx gdxVar, Function0 function1, int i) {
        super(2);
        this.e = e0q0Var;
        this.f = function0;
        this.b = str;
        this.c = f;
        this.g = gdxVar;
        this.h = function1;
        this.d = i;
    }
}
