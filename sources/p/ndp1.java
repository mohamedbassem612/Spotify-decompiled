package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ndp1 extends mh70 implements odp1 {
    public static odp1 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return iInterfaceQueryLocalInterface instanceof odp1 ? (odp1) iInterfaceQueryLocalInterface : new kdp1(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", (byte) 4);
    }
}
