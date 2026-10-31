package p;

import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dof extends hab0 implements iu30 {
    public final /* synthetic */ fta a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dof(fta ftaVar) {
        super(1);
        this.a = ftaVar;
    }

    public final Object invoke(Object obj) {
        fta ftaVar = this.a;
        return Mobius.d(aof.a, (unf) ftaVar.b).d(new bof(ftaVar)).b(new cof(ftaVar));
    }
}
