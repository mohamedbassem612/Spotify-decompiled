package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jg41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zsc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg41(zsc zscVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = zscVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        zsc zscVar = this.c;
        switch (b) {
            case 0:
                jg41 jg41Var = new jg41(zscVar, lnmVar, (byte) 0);
                jg41Var.b = obj;
                return jg41Var;
            default:
                jg41 jg41Var2 = new jg41(zscVar, lnmVar, (byte) 1);
                jg41Var2.b = obj;
                return jg41Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zsc zscVar = this.c;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Iterator it = p7h.M(new o95[]{(o95) zscVar.b, (o95) zscVar.c, (o95) zscVar.d, (o95) zscVar.e}).iterator();
                while (it.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new lc41((o95) it.next(), zscVar, (lnm) null, (byte) 3), 3);
                }
                break;
            default:
                hm5.M(obj);
                Iterator it2 = p7h.M(new o95[]{(o95) zscVar.b, (o95) zscVar.c, (o95) zscVar.d, (o95) zscVar.e}).iterator();
                while (it2.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new b((o95) it2.next(), (lnm) null, (byte) 18), 3);
                }
                break;
        }
        return rih1Var;
    }
}
