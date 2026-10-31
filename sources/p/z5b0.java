package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z5b0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s061 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5b0(s061 s061Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = s061Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        s061 s061Var = this.c;
        switch (b) {
            case 0:
                z5b0 z5b0Var = new z5b0(s061Var, lnmVar, (byte) 0);
                z5b0Var.b = obj;
                return z5b0Var;
            case 1:
                z5b0 z5b0Var2 = new z5b0(s061Var, lnmVar, (byte) 1);
                z5b0Var2.b = obj;
                return z5b0Var2;
            default:
                z5b0 z5b0Var3 = new z5b0(s061Var, lnmVar, (byte) 2);
                z5b0Var3.b = obj;
                return z5b0Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((Set) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s061 s061Var = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj2;
                hm5.M(obj);
                String str = (String) mmr0Var.a;
                if (y5b0.a[((t061) mmr0Var.b).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                boolean zContains = ((Set) s061Var.b.a.getValue()).contains(str);
                bpb1 bpb1Var = s061Var.a;
                if (zContains) {
                    do {
                        value2 = bpb1Var.getValue();
                    } while (!bpb1Var.k(value2, dm61.u0(str, (Set) value2)));
                } else {
                    do {
                        value = bpb1Var.getValue();
                    } while (!bpb1Var.k(value, dm61.x0(str, (Set) value)));
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                fz51 fz51Var = (fz51) ((mmr0) obj2).b;
                if (u890.j(fz51Var, ez51.a)) {
                    if (((Boolean) s061Var.d.a.getValue()).booleanValue()) {
                        s061Var.c();
                    } else {
                        s061Var.b();
                    }
                } else if (fz51Var instanceof cz51) {
                    s061Var.c();
                } else {
                    if (!(fz51Var instanceof dz51)) {
                        eg.o();
                        return null;
                    }
                    gz51 gz51Var = ((dz51) fz51Var).a;
                    if (gz51Var.a) {
                        s061Var.b();
                        Set set = gz51Var.b;
                        bpb1 bpb1Var2 = s061Var.a;
                        bpb1Var2.getClass();
                        bpb1Var2.m((Object) null, set);
                    } else {
                        s061Var.c();
                    }
                }
                return rih1Var;
            default:
                Set set2 = (Set) obj2;
                hm5.M(obj);
                bpb1 bpb1Var3 = s061Var.a;
                do {
                    value3 = bpb1Var3.getValue();
                } while (!bpb1Var3.k(value3, o7h.v0((Set) value3, set2)));
                return rih1Var;
        }
    }
}
