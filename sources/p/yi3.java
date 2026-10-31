package p;

import android.graphics.Bitmap;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yi3 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi3(gya gyaVar, l420 l420Var, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.c = gyaVar;
        this.d = l420Var;
        this.e = bitmap;
        this.f = compressFormat;
        this.b = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        qyc1 qyc1Var = this.d;
        switch (b) {
            case 0:
                yi3 yi3Var = new yi3((l811) qyc1Var, (aj3) obj3, (slc0) obj2, this.b, lnmVar);
                yi3Var.c = obj;
                return yi3Var;
            case 1:
                return new yi3((gya) this.c, (l420) qyc1Var, (Bitmap) obj3, (Bitmap.CompressFormat) obj2, this.b, lnmVar);
            default:
                return new yi3(this.b, (ven0) this.c, qyc1Var, (ryc1) obj3, (hdn0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((MessagePresentationStatus) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj2 = this.e;
        qyc1 qyc1Var = this.d;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                aj3 aj3Var = (aj3) obj2;
                MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) this.c;
                hm5.M(obj);
                l811 l811Var = (l811) qyc1Var;
                if (!l811Var.a && (messagePresentationStatus instanceof MessagePresentationStatus.Presented)) {
                    l811Var.a = true;
                    oj80 oj80Var = aj3Var.e;
                    String str = ((i8h1) oj80Var.b).f(((wqk0) oj80Var.c).e(), (Set) null).a.a;
                    ((lvc) aj3Var.d.b).b(this.b, str, "alexa", "", (slc0) obj3);
                }
                return rih1Var;
            case 1:
                l420 l420Var = (l420) qyc1Var;
                gya gyaVar = (gya) this.c;
                hm5.M(obj);
                try {
                    OutputStream outputStreamL = gyaVar.b.a.l(l420Var);
                    ((Bitmap) obj2).compress((Bitmap.CompressFormat) obj3, i, outputStreamL);
                    outputStreamL.close();
                    return gyaVar.c.c(l420Var, gyaVar.e.k());
                } catch (Exception e) {
                    Logger.d(e.getMessage(), new Object[0]);
                    return null;
                }
            default:
                err0 err0Var = (hdn0) obj3;
                hm5.M(obj);
                xhm1 xhm1Var = (xhm1) ((ven0) this.c).getValue();
                if (xhm1Var != null) {
                    qyc1 qyc1Var2 = qyc1Var;
                    ryc1 ryc1Var = (ryc1) obj2;
                    if (qyc1Var2 != null) {
                        err0 err0Var2 = err0Var;
                        if (i != err0Var2.s()) {
                            int iS = err0Var2.s();
                            b7x b7xVar = b7x.a;
                            if (i > iS) {
                                i8h1 i8h1Var = ryc1Var.c;
                                c4m0 c4m0VarA = ryc1Var.a(xhm1Var);
                                int iY = pto1.y(qyc1Var2);
                                Integer numValueOf = Integer.valueOf(i);
                                x6h1 x6h1VarC = c4m0VarA.c.c();
                                x6h1VarC.i.add(new a7h1("share_card_variant", z3m0.e(iY), numValueOf, (String) null, (String) null));
                                x6h1VarC.j = true;
                                i8h1Var.m(new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), c4m0VarA.b, System.currentTimeMillis()), (xj61) null);
                            } else {
                                i8h1 i8h1Var2 = ryc1Var.c;
                                c4m0 c4m0VarA2 = ryc1Var.a(xhm1Var);
                                int iY2 = pto1.y(qyc1Var2);
                                Integer numValueOf2 = Integer.valueOf(i);
                                x6h1 x6h1VarC2 = c4m0VarA2.c.c();
                                x6h1VarC2.i.add(new a7h1("share_card_variant", z3m0.e(iY2), numValueOf2, (String) null, (String) null));
                                x6h1VarC2.j = true;
                                i8h1Var2.m(new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), c4m0VarA2.b, System.currentTimeMillis()), (xj61) null);
                            }
                        }
                    }
                }
                err0Var.t(i);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi3(int i, ven0 ven0Var, qyc1 qyc1Var, ryc1 ryc1Var, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = i;
        this.c = ven0Var;
        this.d = qyc1Var;
        this.e = ryc1Var;
        this.f = hdn0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi3(l811 l811Var, aj3 aj3Var, slc0 slc0Var, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.d = l811Var;
        this.e = aj3Var;
        this.f = slc0Var;
        this.b = i;
    }
}
