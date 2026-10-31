package p;

import spotify.your_library.esperanto.proto.YourLibraryRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rkr0 extends a8d1 implements xu30 {
    public boolean a;
    public /* synthetic */ vr20 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ YourLibraryRequest d;
    public final /* synthetic */ xkr0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ bpb1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkr0(lnm lnmVar, YourLibraryRequest yourLibraryRequest, xkr0 xkr0Var, long j, bpb1 bpb1Var) {
        super(3, lnmVar);
        this.d = yourLibraryRequest;
        this.e = xkr0Var;
        this.f = j;
        this.g = bpb1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rkr0 rkr0Var = new rkr0((lnm) obj3, this.d, this.e, this.f, this.g);
        rkr0Var.b = (vr20) obj;
        rkr0Var.c = obj2;
        return rkr0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        vr20 vr20Var = this.b;
        Object obj2 = this.c;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            int iIntValue = ((Number) obj2).intValue();
            YourLibraryRequest yourLibraryRequest = this.d;
            gvm1 builder = yourLibraryRequest.toBuilder();
            hvm1 builder2 = yourLibraryRequest.n().toBuilder();
            builder2.C(iIntValue);
            builder2.E();
            builder.n(builder2);
            YourLibraryRequest yourLibraryRequestBuild = builder.build();
            xkr0 xkr0Var = this.e;
            vwm1 vwm1Var = xkr0Var.a;
            yourLibraryRequestBuild.getClass();
            m441 m441Var = new m441(new wkr0(new e6s(vwm1Var.d(yourLibraryRequestBuild), (byte) 7), null, this.f, iIntValue, xkr0Var, this.g));
            this.b = null;
            this.c = null;
            this.a = true;
            Object objS = l4p1.s(vr20Var, m441Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
