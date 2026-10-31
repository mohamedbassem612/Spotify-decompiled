package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hak extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p811 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hak(p811 p811Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = p811Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        p811 p811Var = this.c;
        switch (b) {
            case 0:
                hak hakVar = new hak(p811Var, lnmVar, (byte) 0);
                hakVar.b = obj;
                return hakVar;
            case 1:
                hak hakVar2 = new hak(p811Var, lnmVar, (byte) 1);
                hakVar2.b = obj;
                return hakVar2;
            case 2:
                hak hakVar3 = new hak(p811Var, lnmVar, (byte) 2);
                hakVar3.b = obj;
                return hakVar3;
            case 3:
                hak hakVar4 = new hak(p811Var, lnmVar, (byte) 3);
                hakVar4.b = obj;
                return hakVar4;
            default:
                hak hakVar5 = new hak(p811Var, lnmVar, (byte) 4);
                hakVar5.b = obj;
                return hakVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((uv00) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 2:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 3:
                create((g3e0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((Map) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                p811Var.a = (uv00) obj2;
                break;
            case 1:
                hm5.M(obj);
                p811Var.a = (uv00) obj2;
                break;
            case 2:
                String str = (String) obj2;
                hm5.M(obj);
                if (str.length() == 0) {
                    str = null;
                }
                p811Var.a = str;
                break;
            case 3:
                g3e0 g3e0Var = (g3e0) obj2;
                hm5.M(obj);
                if (g3e0Var instanceof f3e0) {
                    p811Var.a = g3e0Var;
                }
                break;
            default:
                hm5.M(obj);
                p811Var.a = (Map) obj2;
                break;
        }
        return rih1Var;
    }
}
