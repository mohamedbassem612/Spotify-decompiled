package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iib implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iib(mr20 mr20Var, Object obj, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        ft20 ft20Var;
        h441 h441Var;
        h441 h441Var2;
        Throwable th;
        byte b = this.a;
        int i = 0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.c;
        fu20 fu20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((mgb) fu20Var).collect(new hib(vr20Var, (oib) obj, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = fu20Var.collect(new g4c(vr20Var, (ybg) obj, (byte) 16), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = fu20Var.collect(new g4c(vr20Var, (z2k) obj, (byte) 22), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = fu20Var.collect(new t0l(vr20Var, (z68) obj, (byte) 12), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = fu20Var.collect(new mib((Object) vr20Var, obj, (byte) 4), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = fu20Var.collect(new ryr(vr20Var, (zus) obj, (byte) 11), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                xu30 xu30Var = (xu30) obj;
                if (lnmVar instanceof ft20) {
                    ft20Var = (ft20) lnmVar;
                    int i2 = ft20Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ft20Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        ft20Var = new ft20(this, lnmVar);
                    }
                } else {
                    ft20Var = new ft20(this, lnmVar);
                }
                Object obj2 = ft20Var.a;
                int i3 = ft20Var.b;
                try {
                    try {
                        if (i3 == 0) {
                            hm5.M(obj2);
                            ft20Var.d = vr20Var;
                            ft20Var.f = 0;
                            ft20Var.b = 1;
                            if (fu20Var.collect(vr20Var, ft20Var) != d9nVar) {
                            }
                            return d9nVar;
                        }
                        if (i3 != 1) {
                            if (i3 == 2) {
                                Throwable th2 = (Throwable) ft20Var.e;
                                hm5.M(obj2);
                                throw th2;
                            }
                            if (i3 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h441Var2 = ft20Var.e;
                            try {
                                hm5.M(obj2);
                                h441Var2.releaseIntercepted();
                                return rih1Var;
                            } catch (Throwable th3) {
                                th = th3;
                                h441Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        i = ft20Var.f;
                        vr20Var = ft20Var.d;
                        hm5.M(obj2);
                        ft20Var.d = null;
                        ft20Var.e = h441Var;
                        ft20Var.f = i;
                        ft20Var.b = 3;
                        if (xu30Var.invoke(h441Var, (Object) null, ft20Var) != d9nVar) {
                            h441Var2 = h441Var;
                            h441Var2.releaseIntercepted();
                            return rih1Var;
                        }
                    } catch (Throwable th4) {
                        h441Var2 = h441Var;
                        th = th4;
                        h441Var2.releaseIntercepted();
                        throw th;
                    }
                    h441Var = new h441(vr20Var, ft20Var.getContext());
                } catch (Throwable th5) {
                    fhe1 fhe1Var = new fhe1(th5);
                    ft20Var.d = null;
                    ft20Var.e = th5;
                    ft20Var.f = i;
                    ft20Var.b = 2;
                    if (u4p1.O(fhe1Var, xu30Var, th5, ft20Var) != d9nVar) {
                        throw th5;
                    }
                }
                return d9nVar;
            case 7:
                ((bpb1) fu20Var).collect(new buc0(vr20Var, (String) obj, (byte) 0), lnmVar);
                return d9nVar;
            case 8:
                Object objCollect7 = fu20Var.collect(new a8d0(vr20Var, (jqg0) obj, (byte) 25), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 9:
                Object objCollect8 = ((ezc) fu20Var).collect(new s4q0(vr20Var, (gvs0) obj, (byte) 7), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 10:
                Object objCollect9 = ((ezc) fu20Var).collect(new nw9(vr20Var, (Set) obj, (byte) 18), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 11:
                Object objCollect10 = ((xe01) fu20Var).a.collect(new p0x0((byte) 24, (vox0) obj, vr20Var), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 12:
                Object objCollect11 = fu20Var.collect(new g6z0((byte) 7, (rsz0) obj, vr20Var), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 13:
                Object objCollect12 = ((xe01) fu20Var).a.collect(new g6z0((byte) 10, (dxz0) obj, vr20Var), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 14:
                Object objCollect13 = ((lt20) fu20Var).collect(new hu51((byte) 24, (nd61) obj, vr20Var), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            default:
                Object objCollect14 = fu20Var.collect(new wtl1(vr20Var, (qzl1) obj, (byte) 3), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
        }
    }
}
