package p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l3e1 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ l3e1(Drawable drawable, byte b) {
        this.a = b;
        this.b = drawable;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Drawable drawable = this.b;
        switch (b) {
            case 0:
                long j = ((u7h) obj).a;
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b0kVar2.b0();
                } else {
                    ykb0.c.f(drawable, b0kVar2, 48);
                }
                break;
            default:
                long j2 = ((u7h) obj).a;
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b0kVar4.b0();
                } else {
                    ykb0.c.f(drawable, b0kVar4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
