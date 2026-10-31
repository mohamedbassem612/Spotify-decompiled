package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDebounce;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mo9 implements FlowableTransformer {
    public final /* synthetic */ byte a;
    public static final mo9 b = new mo9(0);
    public static final mo9 c = new mo9(1);
    public static final mo9 d = new mo9(2);
    public static final mo9 e = new mo9(3);
    public static final mo9 f = new mo9(4);
    public static final mo9 g = new mo9(5);
    public static final mo9 h = new mo9(6);
    public static final mo9 i = new mo9(7);
    public static final mo9 t = new mo9(8);
    public static final mo9 X = new mo9(9);
    public static final mo9 Y = new mo9(10);
    public static final mo9 Z = new mo9(11);
    public static final mo9 N0 = new mo9(12);
    public static final mo9 O0 = new mo9(13);
    public static final mo9 P0 = new mo9(14);
    public static final mo9 Q0 = new mo9(15);
    public static final mo9 R0 = new mo9(16);
    public static final mo9 S0 = new mo9(17);
    public static final mo9 T0 = new mo9(18);
    public static final mo9 U0 = new mo9(19);

    public /* synthetic */ mo9(byte b2) {
        this.a = b2;
    }

    public final moy0 a(Flowable flowable) {
        byte b2 = this.a;
        mo9 mo9Var = Y;
        eqa1 eqa1Var = eqa1.a;
        switch (b2) {
            case 0:
                return flowable.J(cxo1.Y);
            case 1:
                return flowable.J(o9p1.Y);
            case 2:
                return flowable.J(cq41.a1);
            case 3:
                return Flowable.I(l4m.c);
            case 4:
                return Flowable.I(eqa1Var);
            case 5:
                return flowable.J(zz10.h);
            case 6:
                return flowable.J(dj10.P0);
            case 7:
                return flowable.J(a020.Z0).t(Functions.a);
            case 8:
                return flowable.J(o810.Z0).t(Functions.a);
            case 9:
                return flowable.J(yb10.a1).t(Functions.a);
            case 10:
                return flowable.J(eh10.a1).t(Functions.a);
            case 11:
                return flowable.j(mo9Var).J(mi10.a1).t(Functions.a);
            case 12:
                return flowable.J(si10.a1).t(Functions.a);
            case 13:
                return flowable.J(xi10.a1).t(Functions.a);
            case 14:
                return flowable.j(mo9Var).J(aj20.c1).t(Functions.a);
            case 15:
                return flowable.x(y1x0.h).J(a2x0.i).t(Functions.a);
            case 16:
                Flowable flowableK = Flowable.k(Flowable.I(Boolean.FALSE), new FlowableDebounce(flowable.J(s9x0.t), u9x0.i));
                flowableK.getClass();
                return flowableK.t(Functions.a);
            case 17:
                return flowable.J(gex0.t).t(Functions.a);
            case 18:
                return flowable.J(hgx0.t).t(Functions.a);
            case 19:
                Flowable flowableK2 = Flowable.k(Flowable.I(Boolean.FALSE), new FlowableDebounce(flowable.J(mgx0.i), bjx0.t));
                flowableK2.getClass();
                return flowableK2.t(Functions.a);
            case 20:
                return flowable.J(n9x0.X).t(Functions.a);
            case 21:
                return flowable.J(o9x0.X).t(Functions.a);
            default:
                return Flowable.I(eqa1Var);
        }
    }
}
