package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class py5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py5(iu30 iu30Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.c = iu30Var;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                py5 py5Var = new py5(iu30Var, lnmVar, (byte) 0);
                py5Var.b = obj;
                return py5Var;
            case 1:
                py5 py5Var2 = new py5(iu30Var, lnmVar, (byte) 1);
                py5Var2.b = obj;
                return py5Var2;
            case 2:
                py5 py5Var3 = new py5(lnmVar, iu30Var, (byte) 2);
                py5Var3.b = obj;
                return py5Var3;
            case 3:
                py5 py5Var4 = new py5(lnmVar, iu30Var, (byte) 3);
                py5Var4.b = obj;
                return py5Var4;
            case 4:
                return new py5(iu30Var, this.b, lnmVar);
            case 5:
                py5 py5Var5 = new py5(iu30Var, lnmVar, (byte) 5);
                py5Var5.b = obj;
                return py5Var5;
            case 6:
                py5 py5Var6 = new py5(iu30Var, lnmVar, (byte) 6);
                py5Var6.b = obj;
                return py5Var6;
            case 7:
                py5 py5Var7 = new py5(iu30Var, lnmVar, (byte) 7);
                py5Var7.b = obj;
                return py5Var7;
            case 8:
                py5 py5Var8 = new py5(iu30Var, lnmVar, (byte) 8);
                py5Var8.b = obj;
                return py5Var8;
            default:
                py5 py5Var9 = new py5(iu30Var, lnmVar, (byte) 9);
                py5Var9.b = obj;
                return py5Var9;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((bw7) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((t7g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((t7g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((CharSequence) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((bsc1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((q2f1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                String str = (String) this.b;
                hm5.M(obj);
                iu30Var.invoke(new az5(str));
                return rih1Var;
            case 1:
                bw7 bw7Var = (bw7) this.b;
                hm5.M(obj);
                iu30Var.invoke(bw7Var);
                return rih1Var;
            case 2:
                hm5.M(obj);
                return iu30Var.invoke(((t7g1) this.b).b());
            case 3:
                hm5.M(obj);
                return iu30Var.invoke(((t7g1) this.b).b());
            case 4:
                hm5.M(obj);
                iu30Var.invoke(this.b);
                return rih1Var;
            case 5:
                CharSequence charSequence = (CharSequence) this.b;
                hm5.M(obj);
                iu30Var.invoke(charSequence.toString());
                return rih1Var;
            case 6:
                String str2 = (String) this.b;
                hm5.M(obj);
                iu30Var.invoke(new f251(str2));
                return rih1Var;
            case 7:
                String str3 = (String) this.b;
                hm5.M(obj);
                iu30Var.invoke(new f251(str3));
                return rih1Var;
            case 8:
                bsc1 bsc1Var = (bsc1) this.b;
                hm5.M(obj);
                iu30Var.invoke(bsc1Var);
                return rih1Var;
            default:
                q2f1 q2f1Var = (q2f1) this.b;
                hm5.M(obj);
                iu30Var.invoke(q2f1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py5(lnm lnmVar, iu30 iu30Var, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py5(iu30 iu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iu30Var;
    }
}
