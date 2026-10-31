package p;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yua1 implements h8l {
    public final mxr a;
    public final ConstraintLayout b;

    public yua1(mxr mxrVar) {
        this.a = mxrVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ((yt91) mxrVar.b).b;
        this.b = constraintLayout;
        rwq0.s(constraintLayout, xi81.h);
    }

    public final Connection L(Consumer consumer) {
        mxr mxrVar = this.a;
        mwa1 mwa1Var = new mwa1(mxrVar);
        mxrVar.d = new my71(consumer, (byte) 1);
        return mwa1Var;
    }

    public final Object getView() {
        return this.b;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
    }

    public final void stop() {
    }
}
