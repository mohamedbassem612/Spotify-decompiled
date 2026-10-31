package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kfj1 implements View.OnClickListener {
    public final /* synthetic */ mfj1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public kfj1(mfj1 mfj1Var, String str, boolean z, boolean z2) {
        this.a = mfj1Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.invoke(new tej1(this.b, this.c, this.d));
    }
}
