package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tjk implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ tjk(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                return arrayList.get(((Number) obj).intValue()).getClass().getName();
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return urw.X0.invoke(Integer.valueOf(iIntValue), arrayList.get(iIntValue));
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}
