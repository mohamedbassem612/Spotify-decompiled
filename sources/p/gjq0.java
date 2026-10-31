package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gjq0 implements jjq0 {
    public final /* synthetic */ byte a;
    public final lik1 b;
    public final Object c;
    public final Object d;

    public /* synthetic */ gjq0(lik1 lik1Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = lik1Var;
        this.c = obj;
        this.d = obj2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lik1 lik1Var = this.b;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ssi0 ssi0Var = (ssi0) obj;
                ((yhm) obj2).a(new z73(ssi0Var.b, lik1Var, (String) null, new mb3(ssi0Var.c, false, !((g95) obj3).a(), (ugo0) null, (String) null, false, 1, false, false, (ok51) null, false, (p860) null, 256929)), ssi0Var.e);
                break;
            case 1:
                ssi0 ssi0Var2 = (ssi0) obj;
                zpk zpkVar = (zpk) obj2;
                String str = ssi0Var2.b;
                String str2 = nik1.p2.a;
                String str3 = ssi0Var2.d;
                ypk ypkVar = new ypk(false, false, (String) null, (List) null, (smc0) null, 248);
                mwm1 mwm1Var = zpkVar.i;
                zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
                zsm1VarP.q(str);
                Observable observableFlatMap = mwm1Var.c((YourLibraryDecorateRequest) zsm1VarP.build()).flatMap(new cp31(zpkVar, this.b, str, str2, str3, ypkVar));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b((mfm) obj3, observableFlatMap, yon1.d1(), (bjm) null, ssi0Var2.e, 20);
                break;
            default:
                ssi0 ssi0Var3 = (ssi0) obj;
                String str4 = ssi0Var3.b;
                Observable observableA = ((k781) obj2).a(str4, lik1Var, new l781((String) null, (String) null, true, false, (c821) null, (ugo0) null, (ok51) null, 2, false, false, (r6h1) null, false, (String) null, (p860) null, 4177659));
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                mfm.b((mfm) obj3, observableA, yon1.c1(), new bjm(6, str4, (String) null), ssi0Var3.e, 16);
                break;
        }
        return rih1Var;
    }
}
