package p;

import android.R;
import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k8t extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8t(v5o0 v5o0Var, int[] iArr, int i, int i2) {
        super(1);
        this.a = (byte) 2;
        this.e = v5o0Var;
        this.d = iArr;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 2131820658;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                tom tomVar = (tom) obj2;
                int i4 = i3 + i2;
                hur hurVar = (hur) obj3;
                if (i4 > 1) {
                    rm5 rm5Var = (rm5) hurVar.c;
                    f2t f2tVar = new f2t(hurVar, tomVar, (byte) 4);
                    if (i3 > 0 && i2 > 0) {
                        i = 2131820659;
                    } else if (i2 > 0) {
                        i = 2131820660;
                    }
                    Activity activity = (Activity) rm5Var.a;
                    String string = activity.getString(2131954934);
                    String string2 = activity.getString(R.string.cancel);
                    mw40 mw40VarT = yoi1.T(activity, activity.getResources().getQuantityString(i, i4, Integer.valueOf(i4)), activity.getString(2131954935));
                    oad oadVar = new oad(f2tVar, (byte) 3);
                    mw40VarT.a = string;
                    mw40VarT.c = oadVar;
                    k6b k6bVar = new k6b((byte) 13);
                    mw40VarT.b = string2;
                    mw40VarT.d = k6bVar;
                    mw40VarT.e = false;
                    mw40VarT.b().b();
                } else {
                    ((goq) hurVar.b).b(tomVar, false);
                }
                return rih1Var;
            case 1:
                tom tomVar2 = (tom) obj2;
                int i5 = i3 + i2;
                iir iirVar = (iir) obj3;
                if (i5 > 1) {
                    rm5 rm5Var2 = (rm5) iirVar.c;
                    f2t f2tVar2 = new f2t(iirVar, tomVar2, (byte) 5);
                    if (i3 > 0 && i2 > 0) {
                        i = 2131820659;
                    } else if (i2 > 0) {
                        i = 2131820660;
                    }
                    Activity activity2 = (Activity) rm5Var2.a;
                    String string3 = activity2.getString(2131954934);
                    String string4 = activity2.getString(R.string.cancel);
                    mw40 mw40VarT2 = yoi1.T(activity2, activity2.getResources().getQuantityString(i, i5, Integer.valueOf(i5)), activity2.getString(2131954936));
                    oad oadVar2 = new oad(f2tVar2, (byte) 4);
                    mw40VarT2.a = string3;
                    mw40VarT2.c = oadVar2;
                    k6b k6bVar2 = new k6b((byte) 14);
                    mw40VarT2.b = string4;
                    mw40VarT2.d = k6bVar2;
                    mw40VarT2.e = false;
                    mw40VarT2.b().b();
                } else {
                    ((goq) iirVar.b).c(tomVar2, true);
                }
                return rih1Var;
            default:
                int[] iArr = ((v5o0) obj3).g;
                int[] iArr2 = (int[]) obj2;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
                return Boolean.valueOf(((w5o0) obj).dispatchNestedPreScroll(i3, i2, iArr, (int[]) null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8t(int i, int i2, Object obj, tom tomVar, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.e = obj;
        this.d = tomVar;
    }
}
