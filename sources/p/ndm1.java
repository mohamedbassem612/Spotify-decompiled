package p;

import com.spotify.wrapped.v1.proto.Image;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndm1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ndm1(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new ndm1((Image) obj3, (odm1) obj2, (aof1) obj, lnmVar, (byte) 0);
            default:
                return new ndm1((vu30) obj3, (String) obj2, (bju) obj, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return (yj41) obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Image image = (Image) obj4;
                if (image != null) {
                    odm1 odm1Var = (odm1) obj3;
                    ob01 ob01Var = new ob01(image, odm1Var, (lnm) null, (byte) 25);
                    this.b = true;
                    obj = odm1Var.c("panorama_track_" + ((aof1) obj2), ob01Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    return (yj41) obj;
                }
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                wi31 wi31Var = new wi31((String) obj3, ((bju) obj2).b);
                this.b = true;
                Object objInvoke = ((vu30) obj4).invoke(wi31Var, this);
                return objInvoke == d9nVar ? d9nVar : objInvoke;
        }
    }
}
