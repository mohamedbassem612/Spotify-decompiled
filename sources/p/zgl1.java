package p;

import android.content.res.Resources;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class zgl1 extends tv30 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgl1(Object obj, byte b) {
        super(1, obj, idm1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0);
        this.a = b;
        switch (b) {
            case 8:
                super(1, obj, idm1.class, "startRetryButtonImpression", "startRetryButtonImpression(Lcom/spotify/campaigns/wrapped/logging/api/WrappedStoryLoggingContext;)Lcom/spotify/ubi/logger/ImpressionToken;", 0);
                break;
            case 9:
                super(1, obj, idm1.class, "stopImpression", "stopImpression(Lcom/spotify/ubi/logger/ImpressionToken;)V", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Resources resources = ((ahl1) ((lyc) this).receiver).a.getResources();
                return new nhb1(resources.getString(2131963845), resources.getString(2131963844), resources.getString(2131963843), resources.getString(2131963842), true, new hzh1(), 64);
            case 1:
                ((ijl1) ((lyc) this).receiver).i1((String) obj);
                return rih1Var;
            case 2:
                ((PublishSubject) ((lyc) this).receiver).onNext((s1l1) obj);
                return rih1Var;
            case 3:
                ((b2m1) ((lyc) this).receiver).a.accept(new q3m1(((Number) obj).intValue()));
                return rih1Var;
            case 4:
                ((b2m1) ((lyc) this).receiver).a.accept(new t3m1(((Number) obj).intValue()));
                return rih1Var;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i4m1 i4m1Var = (i4m1) ((lyc) this).receiver;
                i4m1Var.m.a(nxb.a(i4m1Var.l, (Integer) null, (ixb) null, 0, !zBooleanValue, false, 3967));
                return rih1Var;
            case 6:
                t480 t480Var = (t480) obj;
                tjz tjzVar = (tjz) ((lyc) this).receiver;
                if (t480Var != null) {
                    tjzVar.b.o(t480Var, tjz.d);
                } else {
                    tjzVar.getClass();
                }
                return rih1Var;
            case 7:
                ((idm1) ((lyc) this).receiver).c((t480) obj);
                return rih1Var;
            case 8:
                idm1 idm1Var = (idm1) ((lyc) this).receiver;
                uba ubaVar = idm1Var.b;
                c4m0 c4m0VarA = idm1Var.a((xhm1) obj);
                x6h1 x6h1VarC = c4m0VarA.c.c();
                x6h1VarC.i.add(new a7h1("panorama_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA = x6h1VarC3.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = c4m0VarA.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return ubaVar.p(k7h1Var.a(), idm1.d);
            case 9:
                ((idm1) ((lyc) this).receiver).c((t480) obj);
                return rih1Var;
            case 10:
                t480 t480Var2 = (t480) obj;
                tjz tjzVar2 = (tjz) ((lyc) this).receiver;
                if (t480Var2 != null) {
                    tjzVar2.b.o(t480Var2, tjz.d);
                } else {
                    tjzVar2.getClass();
                }
                return rih1Var;
            case 11:
                return (String) ((py7) ((lyc) this).receiver).a.get((String) obj);
            default:
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zgl1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgl1(ijl1 ijl1Var) {
        super(1, ijl1Var, ijl1.class, "onReceivedTitle", "onReceivedTitle(Ljava/lang/String;)V", 0);
        this.a = (byte) 1;
    }
}
