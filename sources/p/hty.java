package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hty extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hty(byp bypVar, byte b) {
        super(1);
        this.a = b;
        this.b = bypVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byp bypVar = this.b;
        switch (b) {
            case 0:
                c380<String> c380Var = (c380) bypVar.a;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (String str : c380Var) {
                    arrayList.add(new h8k1(new gty(str), str));
                }
                return new huz(new hj50(arrayList, (ioj0) null), (byte) 10);
            case 1:
                return new uv11(((gty) obj).a, (String) bypVar.c, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 240);
            default:
                ji50 ji50Var = (ji50) obj;
                qdp qdpVar = (qdp) bypVar.e;
                String str2 = (String) bypVar.c;
                iac0 iac0Var = (iac0) bypVar.i;
                ji50Var.b.put(gty.class, new r3r(new xzq(((ogr) bypVar.d).J((lik1) bypVar.b, ji50Var.a, new Ctry(qdpVar.a(str2, iac0Var.getLifecycle(), new z6n(2, (xq51) bypVar.g, xq51.class, "getPlaybackTimestamp", "getPlaybackTimestamp(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 29), ((rdp) bypVar.f).a(d5p1.t(new any(ji50Var.a.c(e4r.a.a(str2)).a().a, (byte) 5), zso1.H(iac0Var.getLifecycle()), ey71.a, yry.a)))), (fjb) bypVar.h, oxx.Z), new hty(bypVar, (byte) 1)), lgx.c1, 4));
                return rih1.a;
        }
    }
}
