package p;

import com.spotify.home.evopage.mobius.Effect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u2e0 extends a8d1 implements vu30 {
    public np60 a;
    public String b;
    public ice0 c;
    public boolean d;
    public byte e;
    public final /* synthetic */ y2e0 f;
    public final /* synthetic */ s2t g;
    public final /* synthetic */ Effect.LoadHomeStructure h;
    public final /* synthetic */ s2t i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2e0(Effect.LoadHomeStructure loadHomeStructure, lnm lnmVar, s2t s2tVar, s2t s2tVar2, y2e0 y2e0Var) {
        super(2, lnmVar);
        this.f = y2e0Var;
        this.g = s2tVar;
        this.h = loadHomeStructure;
        this.i = s2tVar2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new u2e0(this.h, lnmVar, this.g, this.i, this.f);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090 A[RETURN] */
    public final Object invokeSuspend(Object obj) {
        np60 np60Var;
        String str;
        Object objQ;
        ice0 loadingStrategy;
        Object objQ2;
        String str2;
        boolean z;
        Object objC;
        byte b = this.e;
        Effect.LoadHomeStructure loadHomeStructure = this.h;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            y2e0 y2e0Var = this.f;
            np60Var = y2e0Var.a;
            str = y2e0Var.f.a;
            this.a = np60Var;
            this.b = str;
            this.e = (byte) 1;
            objQ = this.g.Q(this);
            if (objQ != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            str = this.b;
            np60 np60Var2 = this.a;
            hm5.M(obj);
            np60Var = np60Var2;
            objQ = obj;
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.d;
            ice0 ice0Var = this.c;
            str2 = this.b;
            np60Var = this.a;
            hm5.M(obj);
            loadingStrategy = ice0Var;
            objQ2 = obj;
        }
        boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
        String refreshToken = loadHomeStructure.getRefreshToken();
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = (byte) 3;
        objC = np60.c(np60Var, str2, z, loadingStrategy, zBooleanValue, refreshToken, this, 16);
        if (objC != d9nVar) {
            return d9nVar;
        }
        return objC;
        boolean zBooleanValue2 = ((Boolean) objQ).booleanValue();
        loadingStrategy = loadHomeStructure.getLoadingStrategy();
        this.a = np60Var;
        this.b = str;
        this.c = loadingStrategy;
        this.d = zBooleanValue2;
        this.e = (byte) 2;
        objQ2 = this.i.Q(this);
        if (objQ2 != d9nVar) {
            str2 = str;
            z = zBooleanValue2;
            boolean zBooleanValue3 = ((Boolean) objQ2).booleanValue();
            String refreshToken2 = loadHomeStructure.getRefreshToken();
            this.a = null;
            this.b = null;
            this.c = null;
            this.e = (byte) 3;
            objC = np60.c(np60Var, str2, z, loadingStrategy, zBooleanValue3, refreshToken2, this, 16);
            if (objC != d9nVar) {
                return objC;
            }
        }
        return d9nVar;
    }
}
