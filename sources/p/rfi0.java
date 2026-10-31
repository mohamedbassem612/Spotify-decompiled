package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rfi0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ ira g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfi0(String str, String str2, ArrayList arrayList, lee1 lee1Var, long j, long j2, ira iraVar, boolean z, int i) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = lee1Var;
        this.e = j;
        this.f = j2;
        this.g = iraVar;
        this.h = z;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fqo1.y(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1));
        return rih1.a;
    }
}
