package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a5 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ qim0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(String str, List list, String str2, String str3, String str4, long j, long j2, qim0 qim0Var, int i) {
        super(2);
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        zro1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
        return rih1.a;
    }
}
