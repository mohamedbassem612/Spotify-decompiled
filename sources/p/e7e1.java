package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e7e1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o811 b;
    public final /* synthetic */ r7e1 c;
    public final /* synthetic */ o811 d;

    public /* synthetic */ e7e1(o811 o811Var, o811 o811Var2, r7e1 r7e1Var, byte b) {
        this.a = b;
        this.b = o811Var;
        this.d = o811Var2;
        this.c = r7e1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r7e1 r7e1Var = this.c;
        o811 o811Var = this.d;
        o811 o811Var2 = this.b;
        switch (b) {
            case 0:
                r7e1.f(o811Var2, o811Var, r7e1Var);
                break;
            case 1:
                r7e1.h(o811Var2, o811Var, r7e1Var);
                break;
            case 2:
                r7e1.h(o811Var2, o811Var, r7e1Var);
                break;
            default:
                r7e1.f(o811Var2, o811Var, r7e1Var);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ e7e1(o811 o811Var, r7e1 r7e1Var, o811 o811Var2, byte b) {
        this.a = b;
        this.b = o811Var;
        this.c = r7e1Var;
        this.d = o811Var2;
    }
}
