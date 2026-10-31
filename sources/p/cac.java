package p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import com.spotify.player.model.HiFiStatus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cac implements xpw {
    public final /* synthetic */ byte a = 3;
    public final Object b;
    public final Object c;

    public cac(jpa0 jpa0Var, pbq pbqVar, ejb ejbVar, yaf0 yaf0Var, aaf0 aaf0Var) {
        this.b = yaf0Var;
        BitrateLevel bitrateLevel = BitrateLevel.UNKNOWN;
        vdu0 vdu0Var = new vdu0(false, bitrateLevel, bitrateLevel, false, BitrateStrategy.UNKNOWN, HiFiStatus.NONE);
        this.c = sbl.z(new zaf0(ual.b, false, ((j9f0) pbqVar.h).b.a(), (xa0) null, vdu0Var, (igb) null, u6o0.c, (Boolean) null, false, false, false, false, false, false, false), xxb0.i, aaf0Var, x5d0.b1, new baf0(jpa0Var, this));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return n3o1.q(this).a(new hp9(this, (byte) 16), s1b.T0);
            case 1:
                return new eih1();
            case 2:
                return new eih1();
            default:
                return new eih1();
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.c;
        byte b2 = 0;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                j2i j2iVar = new j2i(1999253443, new qcd0(this, b2), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 2:
                j2i j2iVar2 = new j2i(-1592468989, new xyh(this, (byte) 11), true);
                ien0 ien0Var2 = qsw.a;
                return new psw(j2iVar2, (byte) 0);
            default:
                return (psw) obj;
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return k1o1.p();
            case 1:
                return x3p1.n(new pcd0(this, (byte) 0), new pcd0(this, (byte) 1), x5d0.h, (o8n) null, (iu30) null, 24);
            case 2:
                return (e7m0) this.c;
            default:
                return new rey0(new dvt0(this, (byte) 19));
        }
    }

    public cac(l6m0 l6m0Var) {
        this.b = l6m0Var;
        j2i j2iVar = dai.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public cac(gcd0 gcd0Var, fg60 fg60Var) {
        this.b = gcd0Var;
        this.c = fg60Var;
    }

    public cac(Function0 function0) {
        this.b = function0;
        j2i j2iVar = aaj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
