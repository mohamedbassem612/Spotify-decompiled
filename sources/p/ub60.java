package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ub60 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ub60(j2i j2iVar, byte b) {
        super(4);
        this.a = b;
        this.b = j2iVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj4).intValue();
                j2iVar.invoke(Integer.valueOf(iIntValue), (b0k) obj3, Integer.valueOf((iIntValue2 >> 3) & 14));
                break;
            default:
                j2iVar.invoke(obj2, (b0k) obj3, Integer.valueOf((((Number) obj4).intValue() >> 3) & 14));
                break;
        }
        return rih1Var;
    }
}
