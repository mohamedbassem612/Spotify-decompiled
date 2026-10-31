package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zsh extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zsh(String str, long j, djc0 djc0Var, qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.b = str;
        this.c = j;
        this.h = djc0Var;
        this.d = qim0Var;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.h;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                boolean z = this.e;
                qim0 qim0Var = this.d;
                long j = this.c;
                bth.i(z, qim0Var, j, (String) obj4, (Function0) obj3, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                long j2 = this.c;
                luo1.m((String) obj4, j2, (djc0) obj3, this.d, this.e, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.g;
                boolean z2 = this.e;
                long j3 = this.c;
                qim0 qim0Var2 = this.d;
                b6p1.d(z2, j3, qim0Var2, (bfs0) obj4, (j2i) obj3, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zsh(boolean z, long j, qim0 qim0Var, bfs0 bfs0Var, j2i j2iVar, int i, int i2) {
        super(2);
        this.e = z;
        this.c = j;
        this.d = qim0Var;
        this.b = bfs0Var;
        this.h = j2iVar;
        this.f = i;
        this.g = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zsh(boolean z, qim0 qim0Var, long j, String str, Function0 function0, int i, int i2) {
        super(2);
        this.e = z;
        this.d = qim0Var;
        this.c = j;
        this.b = str;
        this.h = function0;
        this.f = i;
        this.g = i2;
    }
}
