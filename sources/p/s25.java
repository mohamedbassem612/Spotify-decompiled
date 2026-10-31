package p;

import app.rive.runtime.kotlin.fonts.Fonts;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s25 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ s25(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                return pap1.t(Integer.valueOf(Math.abs(((Fonts.Font) obj).getWeight().getWeight() - i)), Integer.valueOf(Math.abs(((Fonts.Font) obj2).getWeight().getWeight() - i)));
            default:
                return pap1.t(Integer.valueOf(Math.abs(((Number) obj).intValue() - i)), Integer.valueOf(Math.abs(((Number) obj2).intValue() - i)));
        }
    }
}
