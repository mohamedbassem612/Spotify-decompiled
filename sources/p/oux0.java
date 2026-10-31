package p;

import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oux0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mzr0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oux0(mzr0 mzr0Var, String str, String str2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mzr0Var;
        this.d = str;
        this.e = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new oux0(this.c, this.d, this.e, lnmVar, (byte) 0);
            case 1:
                return new oux0(this.c, this.d, this.e, lnmVar, (byte) 1);
            default:
                return new oux0(this.c, this.d, this.e, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.e;
        String str2 = this.d;
        mzr0 mzr0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    xyc0 xyc0Var = (iyc0) mzr0Var.a;
                    this.b = true;
                    a aVarN = ModificationRequest.Attributes.n();
                    aVarN.n(str);
                    Object objR = xyc0Var.r(str2, aVarN, this);
                    if (objR != d9nVar) {
                        objR = (py21) objR;
                    }
                    obj = objR;
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((py21) obj).d();
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    xyc0 xyc0Var2 = (iyc0) mzr0Var.a;
                    this.b = true;
                    a aVarN2 = ModificationRequest.Attributes.n();
                    aVarN2.r(str);
                    obj = xyc0Var2.r(str2, aVarN2, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((py21) obj).d();
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    xyc0 xyc0Var3 = (iyc0) mzr0Var.a;
                    this.b = true;
                    a aVarN3 = ModificationRequest.Attributes.n();
                    aVarN3.s(str);
                    obj = xyc0Var3.r(str2, aVarN3, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((py21) obj).d();
                return rih1Var;
        }
    }
}
