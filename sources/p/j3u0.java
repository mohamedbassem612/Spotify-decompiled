package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j3u0 extends hab0 implements iu30 {
    public final /* synthetic */ p3u0 a;
    public final /* synthetic */ llb1 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ Long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3u0(p3u0 p3u0Var, llb1 llb1Var, List list, List list2, List list3, List list4, int i, Long l, Long l2) {
        super(1);
        this.a = p3u0Var;
        this.b = llb1Var;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = l;
        this.i = l2;
    }

    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        p3u0 p3u0Var = this.a;
        lgy lgyVar = p3u0Var.h;
        m0u0 m0u0Var = p3u0Var.i;
        lgyVar.O(m0u0Var, this.b);
        lgyVar.z(m0u0Var, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        return rih1.a;
    }
}
