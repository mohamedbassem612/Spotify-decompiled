package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.android.MobiusLoopViewModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k21 implements ne41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MobiusLoopViewModel b;

    public /* synthetic */ k21(MobiusLoopViewModel mobiusLoopViewModel, byte b) {
        this.a = b;
        this.b = mobiusLoopViewModel;
    }

    public final Bundle a() {
        byte b = this.a;
        MobiusLoopViewModel mobiusLoopViewModel = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("ADAPTIVE_AUTH_VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle;
            case 1:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle2;
            case 2:
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle3;
            case 3:
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle4;
            case 4:
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle5;
            case 5:
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle6;
            case 6:
                Bundle bundle7 = new Bundle();
                bundle7.putParcelable("TIMELINE_VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle7;
            default:
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable("VM_STATE_KEY", (Parcelable) mobiusLoopViewModel.V());
                return bundle8;
        }
    }
}
