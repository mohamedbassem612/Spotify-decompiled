package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ej5 implements ne41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ej5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.ne41
    public final Bundle a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((gj5) obj).h0();
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                ((zh30) obj).X.o(bundle2);
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("VM_STATE_KEY", (Parcelable) ((MobiusLoopViewModel) obj).V());
                return bundle3;
        }
    }
}
