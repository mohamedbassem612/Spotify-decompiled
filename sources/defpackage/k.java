package defpackage;

import kotlin.jvm.functions.Function0;
import p.b0k;
import p.c10;
import p.c9n;
import p.czo1;
import p.hab0;
import p.qim0;
import p.rih1;
import p.vu30;
import p.vy71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ c10 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ vy71 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, c10 c10Var, c9n c9nVar, vy71 vy71Var, Function0 function0, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = str;
        this.b = c10Var;
        this.c = c9nVar;
        this.d = vy71Var;
        this.e = function0;
        this.f = qim0Var;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.g;
        l.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP, b);
        return rih1.a;
    }
}
