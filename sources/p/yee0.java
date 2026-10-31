package p;

import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yee0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ bfe0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yee0(bfe0 bfe0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = bfe0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        bfe0 bfe0Var = this.c;
        switch (b) {
            case 0:
                return new yee0(bfe0Var, lnmVar, (byte) 0);
            default:
                return new yee0(bfe0Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        bfe0 bfe0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarIsEnabled = ((LocalFilesFeature) bfe0Var.c).isEnabled();
                this.b = true;
                Object objK = b5p1.k(mr20VarIsEnabled, this);
                return objK == d9nVar ? d9nVar : objK;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (bfe0Var.c(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
