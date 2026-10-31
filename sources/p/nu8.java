package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nu8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lu8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nu8(lu8 lu8Var, byte b) {
        super(0);
        this.a = b;
        this.b = lu8Var;
    }

    public final Object invoke() {
        int i;
        byte b = this.a;
        lu8 lu8Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(f46.S0(new ku8[]{ku8.a, ku8.d}).contains(lu8Var.a));
            default:
                int iOrdinal = lu8Var.a.ordinal();
                if (iOrdinal == 0) {
                    i = 2131952683;
                } else if (iOrdinal == 1) {
                    i = 2131954704;
                } else if (iOrdinal == 2) {
                    i = 2131954705;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    i = 2131952684;
                }
                return Integer.valueOf(i);
        }
    }
}
