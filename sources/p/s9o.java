package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s9o extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9o(int i, boolean z, long j, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, qim0 qim0Var, int i2) {
        super(2);
        this.d = i;
        this.b = z;
        this.c = j;
        this.e = j2iVar;
        this.f = j2iVar2;
        this.g = j2iVar3;
        this.h = j2iVar4;
        this.i = j2iVar5;
        this.t = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj4;
                j2i j2iVar2 = this.i;
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(115040257);
                int i = this.d;
                boolean z = this.b;
                long j = this.c;
                fuo1.d(i, z, j, (j2i) obj7, (j2i) obj6, (j2i) obj5, j2iVar, j2iVar2, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.d | 1);
                boolean z2 = this.b;
                long j2 = this.c;
                vu30 vu30Var = this.i;
                ((b0i0) obj7).f((String) obj6, z2, j2, (c380) obj5, (String) obj4, vu30Var, (Function0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9o(b0i0 b0i0Var, String str, boolean z, long j, c380 c380Var, String str2, vu30 vu30Var, Function0 function0, int i) {
        super(2);
        this.e = b0i0Var;
        this.f = str;
        this.b = z;
        this.c = j;
        this.g = c380Var;
        this.h = str2;
        this.i = vu30Var;
        this.t = function0;
        this.d = i;
    }
}
