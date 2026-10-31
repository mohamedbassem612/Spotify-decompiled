package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ln6 implements Function {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ ow3 c;

    public ln6(int i, ow3 ow3Var) {
        this.b = i;
        this.c = ow3Var;
    }

    public final Object apply(Object obj) {
        int i;
        List list;
        byte b = this.a;
        int i2 = this.b;
        ow3 ow3Var = this.c;
        switch (b) {
            case 0:
                List list2 = (List) obj;
                Context context = (Context) ow3Var.b;
                int iC = l1d.C(i2);
                if (iC == 0) {
                    i = 2131952542;
                } else if (iC == 1) {
                    i = 2131952507;
                } else if (iC == 2) {
                    i = 2131952540;
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i = 2131952508;
                }
                return new hey(context.getString(i), list2);
            default:
                ch90 ch90Var = (hi90) obj;
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    list = ch90Var.g;
                } else if (iC2 == 1) {
                    list = ch90Var.e;
                } else if (iC2 == 2) {
                    list = ch90Var.f;
                } else {
                    if (iC2 != 3) {
                        eg.o();
                        return null;
                    }
                    list = ch90Var.h;
                }
                return ((sjj0) ow3Var.c).a(list).map(new ln6(ow3Var, i2));
        }
    }

    public ln6(ow3 ow3Var, int i) {
        this.c = ow3Var;
        this.b = i;
    }
}
