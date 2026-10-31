package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fwa1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ cv30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwa1(int i, Function0 function0, boolean z) {
        super(0);
        this.b = i;
        this.c = z;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        boolean z = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    ((iu30) function0).invoke(Integer.valueOf(i));
                }
                break;
            default:
                if (i != 2 && z) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwa1(boolean z, iu30 iu30Var, int i) {
        super(0);
        this.c = z;
        this.d = iu30Var;
        this.b = i;
    }
}
