package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nb2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ short c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nb2(String str, j2i j2iVar, Function0 function0, Function0 function1, iu30 iu30Var, Integer num, int i, int i2) {
        super(2);
        this.d = str;
        this.e = j2iVar;
        this.f = function0;
        this.g = function1;
        this.h = iu30Var;
        this.i = num;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                tgp1.a((String) obj8, (j2i) obj7, (Function0) obj6, (Function0) obj5, (iu30) obj4, (Integer) obj3, (b0k) obj, czo1.p(i | 1), this.c);
                break;
            default:
                ((Number) obj2).intValue();
                no71.a((ta71) obj8, (q8n) obj7, (q8n) obj6, (qim0) obj5, (xwa) obj4, (vu30) obj3, (b0k) obj, czo1.p(i | 1), this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nb2(ta71 ta71Var, q8n q8nVar, q8n q8nVar2, qim0 qim0Var, xwa xwaVar, vu30 vu30Var, int i, int i2) {
        super(2);
        this.d = ta71Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        this.g = qim0Var;
        this.h = xwaVar;
        this.i = vu30Var;
        this.b = i;
        this.c = i2;
    }
}
