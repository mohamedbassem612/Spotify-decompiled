package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class stl1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ py21 b;
    public /* synthetic */ py21 c;
    public final /* synthetic */ xtl1 d;
    public final /* synthetic */ aek1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ stl1(xtl1 xtl1Var, aek1 aek1Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = xtl1Var;
        this.e = aek1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aek1 aek1Var = this.e;
        xtl1 xtl1Var = this.d;
        py21 py21Var = (py21) obj;
        py21 py21Var2 = (py21) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                stl1 stl1Var = new stl1(xtl1Var, aek1Var, lnmVar, (byte) 0);
                stl1Var.b = py21Var;
                stl1Var.c = py21Var2;
                return stl1Var.invokeSuspend(rih1Var);
            case 1:
                stl1 stl1Var2 = new stl1(xtl1Var, aek1Var, lnmVar, (byte) 1);
                stl1Var2.b = py21Var;
                stl1Var2.c = py21Var2;
                return stl1Var2.invokeSuspend(rih1Var);
            default:
                stl1 stl1Var3 = new stl1(xtl1Var, aek1Var, lnmVar, (byte) 2);
                stl1Var3.b = py21Var;
                stl1Var3.c = py21Var2;
                return stl1Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        aek1 aek1Var = this.e;
        xtl1 xtl1Var = this.d;
        switch (b) {
            case 0:
                py21 py21Var = this.b;
                py21 py21Var2 = this.c;
                hm5.M(obj);
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = xtl1.e;
                return xtl1Var.c(aek1Var, py21Var, py21Var2);
            case 1:
                py21 py21Var3 = this.b;
                py21 py21Var4 = this.c;
                hm5.M(obj);
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy2 = xtl1.e;
                return xtl1Var.c(aek1Var, py21Var3, py21Var4);
            default:
                py21 py21Var5 = this.b;
                py21 py21Var6 = this.c;
                hm5.M(obj);
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy3 = xtl1.e;
                return xtl1Var.c(aek1Var, py21Var5, py21Var6);
        }
    }
}
