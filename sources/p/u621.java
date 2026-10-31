package p;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u621 implements DialogInterface.OnClickListener {
    public final /* synthetic */ mzr0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List d;

    public u621(mzr0 mzr0Var, String str, boolean z, List list) {
        this.a = mzr0Var;
        this.b = str;
        this.c = z;
        this.d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        mzr0 mzr0Var = this.a;
        fn31.T(cto1.q((dg30) mzr0Var.a), (o8n) null, 0, new du2(mzr0Var, this.d, this.b, this.c, (lnm) null, (byte) 15), 3);
    }
}
