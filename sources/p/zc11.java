package p;

import android.view.View;
import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zc11 implements View.OnClickListener {
    public final /* synthetic */ xk00 a;
    public final /* synthetic */ String b;

    public zc11(xk00 xk00Var, String str) {
        this.a = xk00Var;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.m(this.b, DismissedEntity.Type.INLINE_CARD);
    }
}
