package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vns extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zns c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vns(zns znsVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = znsVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                vns vnsVar = new vns(this.c, lnmVar, (byte) 0);
                vnsVar.b = obj;
                return vnsVar;
            default:
                vns vnsVar2 = new vns(this.c, lnmVar, (byte) 1);
                vnsVar2.b = obj;
                return vnsVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mmr0 mmr0Var = (mmr0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(mmr0Var, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(mmr0Var, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        gz51 gz51Var;
        Set set;
        Object value2;
        gz51 gz51Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zns znsVar = this.c;
        mmr0 mmr0Var = (mmr0) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                String str = (String) mmr0Var.a;
                if (uns.a[((t061) mmr0Var.b).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                bpb1 bpb1Var = znsVar.b;
                do {
                    value = bpb1Var.getValue();
                    gz51Var = (gz51) value;
                    set = gz51Var.b;
                } while (!bpb1Var.k(value, gz51.a(gz51Var, set.contains(str) ? dm61.u0(str, set) : dm61.x0(str, set), 1)));
                return rih1Var;
            default:
                hm5.M(obj);
                fz51 fz51Var = (fz51) mmr0Var.b;
                boolean zJ = u890.j(fz51Var, ez51.a);
                b7x b7xVar = b7x.a;
                if (zJ) {
                    bpb1 bpb1Var2 = znsVar.b;
                    do {
                        value2 = bpb1Var2.getValue();
                        gz51Var2 = (gz51) value2;
                    } while (!bpb1Var2.k(value2, gz51Var2.a ? gz51.c : gz51.a(gz51Var2, null, 2)));
                    if (((gz51) znsVar.b.getValue()).a) {
                        return rih1Var;
                    }
                    znsVar.c.m((Object) null, b7xVar);
                    return rih1Var;
                }
                if (fz51Var instanceof cz51) {
                    znsVar.b.m((Object) null, gz51.c);
                    znsVar.c.m((Object) null, b7xVar);
                    return rih1Var;
                }
                if (!(fz51Var instanceof dz51)) {
                    eg.o();
                    return null;
                }
                gz51 gz51Var3 = ((dz51) fz51Var).a;
                if (gz51Var3.a) {
                    znsVar.b.m((Object) null, gz51Var3);
                    return rih1Var;
                }
                znsVar.b.m((Object) null, gz51.c);
                znsVar.c.m((Object) null, b7xVar);
                return rih1Var;
        }
    }
}
