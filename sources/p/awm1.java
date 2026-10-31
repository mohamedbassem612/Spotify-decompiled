package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.extras.patterns.InnerUpdate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class awm1 extends k01 implements vu30 {
    public static final awm1 h = new awm1(2, vvm1.class, "searchUpdate", "searchUpdate(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllModel;Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;Lcom/spotify/mobius/Update;Lcom/spotify/mobius/Update;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        tr3 tr3Var = (tr3) obj;
        hr3 hr3Var = (hr3) obj2;
        gp71 gp71Var = gp71.d;
        InnerUpdate innerUpdateB = lwc0.b();
        if (hr3Var instanceof eq3) {
            return innerUpdateB.a(tr3Var, hr3Var);
        }
        if (hr3Var instanceof bp3) {
            return Next.a(Effects.a(new kn3[]{new kn3(((bp3) hr3Var).a)}));
        }
        if (hr3Var instanceof fp3) {
            fp3 fp3Var = (fp3) hr3Var;
            return Next.a(Effects.a(new qxd0[]{new ao3(fp3Var.a), w3p1.t(tr3Var, fp3Var)}));
        }
        if (!(hr3Var instanceof rq3)) {
            return gp71Var.a(tr3Var, hr3Var);
        }
        String str = ((rq3) hr3Var).a;
        mml mmlVar = tr3Var.b.a.e;
        kml kmlVar = mmlVar instanceof kml ? (kml) mmlVar : null;
        if (kmlVar != null) {
            return u890.j(kmlVar.a, str) ? Next.j() : Next.a(Effects.a(new tn3[]{new tn3(new yoc0(new fqq0((as3) null, (dia1) null, (jf20) null, new kml(str), (Boolean) tr3Var.c.a(rf90.a), (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 487)))}));
        }
        n57.e("No Search container in model");
        return Next.j();
    }
}
