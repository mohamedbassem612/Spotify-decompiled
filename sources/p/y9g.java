package p;

import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y9g extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public gag b;
    public String c;
    public boolean d;
    public final /* synthetic */ gag e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9g(byte b, String str, gag gagVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.e = gagVar;
        this.f = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.f;
        gag gagVar = this.e;
        switch (b) {
            case 0:
                return new y9g((byte) 0, str, gagVar, lnmVar);
            default:
                return new y9g((byte) 1, str, gagVar, lnmVar);
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
        gag gagVar;
        String str;
        gag gagVar2;
        String str2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        gag gagVar3 = this.e;
        String str3 = this.f;
        switch (b) {
            case 0:
                boolean z = this.d;
                try {
                    if (!z) {
                        hm5.M(obj);
                        kag kagVar = gagVar3.i;
                        this.b = gagVar3;
                        this.c = str3;
                        this.d = true;
                        obj = kagVar.a(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                        gagVar = gagVar3;
                        str = str3;
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = this.c;
                        gagVar = this.b;
                        hm5.M(obj);
                    }
                    String strValueOf = String.valueOf(((Boolean) obj).booleanValue());
                    Set set = gag.z;
                    gagVar.f(str, strValueOf);
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    Set set2 = gag.z;
                    gagVar3.f(str3, LocalFilesProperties$TestHelper.FALSE);
                    return rih1Var;
                }
            default:
                boolean z2 = this.d;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        kag kagVar2 = gagVar3.i;
                        this.b = gagVar3;
                        this.c = str3;
                        this.d = true;
                        obj = kagVar2.c(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                        gagVar2 = gagVar3;
                        str2 = str3;
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = this.c;
                        gagVar2 = this.b;
                        hm5.M(obj);
                    }
                    String strValueOf2 = String.valueOf(((Boolean) obj).booleanValue());
                    Set set3 = gag.z;
                    gagVar2.f(str2, strValueOf2);
                    return rih1Var;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception unused2) {
                    Set set4 = gag.z;
                    gagVar3.f(str3, LocalFilesProperties$TestHelper.FALSE);
                    return rih1Var;
                }
        }
    }
}
