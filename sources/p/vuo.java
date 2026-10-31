package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vuo extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vuo(List list, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        List list = this.c;
        switch (b) {
            case 0:
                vuo vuoVar = new vuo(list, lnmVar, (byte) 0);
                vuoVar.b = obj;
                return vuoVar;
            case 1:
                vuo vuoVar2 = new vuo(list, lnmVar, (byte) 1);
                vuoVar2.b = obj;
                return vuoVar2;
            default:
                vuo vuoVar3 = new vuo(list, lnmVar, (byte) 2);
                vuoVar3.b = obj;
                return vuoVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((ptb0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((py21) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        List list = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) obj2;
                hm5.M(obj);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new tuo((rh31) it.next(), null, (byte) 1), 3);
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                return Boolean.valueOf(((ptb0) obj2).o >= list.size());
            default:
                oy21 oy21Var = (py21) obj2;
                hm5.M(obj);
                nec0 nec0Var = new nec0(list, (byte) 5);
                oy21Var.getClass();
                if (oy21Var instanceof ly21) {
                    return Boolean.FALSE;
                }
                if (oy21Var instanceof oy21) {
                    return nec0Var.invoke(oy21Var.a);
                }
                eg.o();
                return null;
        }
    }
}
