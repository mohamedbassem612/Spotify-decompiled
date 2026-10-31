package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.extras.patterns.InnerUpdate;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class x130 extends k01 implements vu30 {
    public static final x130 h = new x130(2, e130.class, "folderUpdate", "folderUpdate(Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllModel;Lcom/spotify/yourlibrary/yourlibraryx/shared/domain/AllEvent;Lcom/spotify/mobius/Update;Lcom/spotify/mobius/Update;)Lcom/spotify/mobius/Next;", 1);

    public final Object invoke(Object obj, Object obj2) {
        tr3 tr3Var = (tr3) obj;
        hr3 hr3Var = (hr3) obj2;
        gp71 gp71Var = gp71.d;
        InnerUpdate innerUpdateB = lwc0.b();
        sxc0 sxc0Var = tr3Var.b;
        if (hr3Var instanceof eq3) {
            return innerUpdateB.a(tr3Var, hr3Var);
        }
        if (hr3Var instanceof wo3) {
            boolean zC = sxc0Var.b.a.c(0);
            if (!zC || sxc0Var.a.d.isEmpty()) {
                return zC ? Next.a(Collections.singleton(new on3(m8k1.c))) : Next.a(Collections.singleton(new on3(new e9k1(false))));
            }
            return Next.a(f46.S0(new qxd0[]{new on3(new e9k1(false)), new tn3(new yoc0(new fqq0((as3) null, (dia1) null, new jf20(z6x.a, ryo1.t(sxc0Var.c)), (mml) null, (Boolean) null, (fab0) null, (a3t0) null, (Boolean) null, (Boolean) null, 507)))}));
        }
        if (hr3Var instanceof gp3) {
            return Next.a(Effects.a(new on3[]{new on3(new s8k1(((gp3) hr3Var).a))}));
        }
        if (!(hr3Var instanceof op3)) {
            if (!(hr3Var instanceof pp3)) {
                return gp71Var.a(tr3Var, hr3Var);
            }
            pp3 pp3Var = (pp3) hr3Var;
            return Next.a(Effects.a(new so3[]{new so3(((iml) tr3Var.a()).a, pp3Var.a, pp3Var.b)}));
        }
        op3 op3Var = (op3) hr3Var;
        String str = op3Var.a;
        String str2 = op3Var.b;
        tv80 tv80Var = op3Var.c;
        mml mmlVarA = tr3Var.a();
        iml imlVar = mmlVarA instanceof iml ? (iml) mmlVarA : null;
        return Next.a(Effects.a(new on3[]{new on3(new b9k1(str, str2, false, aey.h, tv80Var, imlVar != null ? imlVar.c : null, false, 256))}));
    }
}
