package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bvh1 extends hab0 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bih1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvh1(boolean z, bih1 bih1Var, int i, iu30 iu30Var, int i2) {
        super(0);
        this.a = z;
        this.b = bih1Var;
        this.c = i;
        this.d = iu30Var;
        this.e = i2;
    }

    public final Object invoke() {
        String str;
        if (this.a) {
            bih1 bih1Var = this.b;
            i8h1 i8h1Var = (i8h1) bih1Var.b;
            x6h1 x6h1VarC = ((brl0) bih1Var.c).b.c();
            switch (this.c) {
                case 1:
                    str = "friday";
                    break;
                case 2:
                    str = "monday";
                    break;
                case 3:
                    str = "saturday";
                    break;
                case 4:
                    str = "sunday";
                    break;
                case 5:
                    str = "thursday";
                    break;
                case 6:
                    str = "tuesday";
                    break;
                case 7:
                    str = "wednesday";
                    break;
                default:
                    throw null;
            }
            x6h1VarC.i.add(new a7h1("weekly_cadence_button", str, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            b7x b7xVar = b7x.a;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            this.d.invoke(Integer.valueOf(this.e));
        }
        return rih1.a;
    }
}
