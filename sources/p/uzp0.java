package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uzp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzp0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ry21 ry21Var = (ry21) obj4;
                zx21 zx21VarC = ry21Var.c();
                uz21 uz21Var = ry21Var.g;
                vzp0 vzp0Var = (vzp0) obj3;
                i4g1 i4g1Var = (i4g1) obj2;
                zx21VarC.g = new yf01(String.valueOf(uz21Var.e()), uz21Var.d(), sj1.g(new tzp0(uz21Var.d1(), uz21Var.d(), new ozp0(vzp0Var, i4g1Var, (byte) 3), new ntf0(vzp0Var, i4g1Var, ry21Var, (ln21) obj, (byte) 20))));
                return zx21VarC.a();
            default:
                ((Function0) obj4).invoke();
                cde1 cde1Var = (cde1) obj3;
                if (cde1Var.b()) {
                    ((iu30) obj2).invoke(((String) obj).substring(cde1Var.d(), cde1Var.c()));
                }
                return rih1.a;
        }
    }
}
