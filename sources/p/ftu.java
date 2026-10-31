package p;

import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ftu extends hab0 implements iu30 {
    public final /* synthetic */ gtu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftu(gtu gtuVar) {
        super(1);
        this.a = gtuVar;
    }

    public final Object invoke(Object obj) {
        return Mobius.d(ctu.a, this.a.b.a.invoke());
    }
}
