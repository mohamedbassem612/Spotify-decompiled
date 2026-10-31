package p;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fi80 extends InputConnectionWrapper {
    public final /* synthetic */ gi80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi80(InputConnection inputConnection, gi80 gi80Var) {
        super(inputConnection, false);
        this.a = gi80Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        jl00 jl00Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            jl00Var = new jl00(new hi80(inputContentInfo), (byte) 19);
        }
        if (this.a.g(jl00Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
