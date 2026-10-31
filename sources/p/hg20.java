package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hg20 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rt01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg20(rt01 rt01Var, byte b) {
        super(4);
        this.a = b;
        this.b = rt01Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rt01 rt01Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new t3l0(new sqk0((w3l0) rt01Var.d));
            default:
                return new as0((Context) obj2, rt01Var);
        }
    }
}
