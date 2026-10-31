package p;

import com.spotify.mobius.android.AndroidLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class re80 extends hab0 implements iu30 {
    public final /* synthetic */ se80 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re80(se80 se80Var) {
        super(1);
        this.a = se80Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        se80 se80Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new jb50(se80Var, (byte) 23);
        casVar.e = new cc00(se80Var, (byte) 18);
        casVar.d = new nd70(se80Var, (byte) 14);
        casVar.g = new AndroidLogger();
        return rih1.a;
    }
}
