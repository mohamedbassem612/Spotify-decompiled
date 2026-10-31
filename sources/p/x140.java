package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x140 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x140(String str, r140 r140Var, r140 r140Var2, boolean z, boolean z2, boolean z3, String str2, int i) {
        super(2);
        this.b = str;
        this.g = r140Var;
        this.h = r140Var2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                boolean z = this.c;
                boolean z2 = this.d;
                boolean z3 = this.e;
                e9k.d((String) obj6, (r140) obj4, (r140) obj3, z, z2, z3, (String) obj5, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                boolean z4 = this.e;
                int iP2 = czo1.p(1);
                boolean z5 = this.c;
                boolean z6 = this.d;
                cw51.a((String) obj6, z5, z6, (Function0) obj5, (Function0) obj4, (qim0) obj3, z4, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                boolean z7 = this.c;
                boolean z8 = this.d;
                boolean z9 = this.e;
                men1.j(z7, z8, (Function0) obj6, (List) obj5, z9, (iu30) obj4, (qim0) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x140(String str, boolean z, boolean z2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z3, int i) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.f = function0;
        this.g = function1;
        this.h = qim0Var;
        this.e = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x140(boolean z, boolean z2, Function0 function0, List list, boolean z3, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.c = z;
        this.d = z2;
        this.b = function0;
        this.f = list;
        this.e = z3;
        this.g = iu30Var;
        this.h = qim0Var;
    }
}
