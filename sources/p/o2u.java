package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o2u implements DialogInterface.OnClickListener {
    public final /* synthetic */ q2u a;
    public final /* synthetic */ int b;

    public o2u(q2u q2uVar, int i) {
        this.a = q2uVar;
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b.a("pin_limit_reached_" + this.b);
    }
}
