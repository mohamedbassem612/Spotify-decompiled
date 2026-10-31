package p;

import android.net.Uri;
import androidx.car.app.k;
import androidx.car.app.media.model.MediaPlaybackStyle;
import androidx.car.app.media.model.MediaPlaybackTemplate;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.Header;
import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e6p0 extends xvc {
    public final fna N0;
    public final qmu O0;
    public MobiusLoop P0;
    public final bqk0 Q0;
    public final d6p0 R0;
    public final fqn0 S0;
    public final qzn0 X;
    public final i8h1 Y;
    public final t64 Z;

    public e6p0(k kVar, qzn0 qzn0Var, i8h1 i8h1Var, l4p0 l4p0Var, t64 t64Var, fna fnaVar, qmu qmuVar) {
        super(kVar, i8h1Var, qzn0Var, t64Var);
        this.X = qzn0Var;
        this.Y = i8h1Var;
        this.Z = t64Var;
        this.N0 = fnaVar;
        this.O0 = qmuVar;
        this.Q0 = new bqk0((byte) 18);
        fn31.T(cto1.q(this), (o8n) null, 0, new ian0(this, l4p0Var, (lnm) null, (byte) 4), 3).L(new y3o0(this, (byte) 22));
        this.R0 = new d6p0(this, (byte) 0);
        this.S0 = fqn0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sxd1 d() {
        MediaPlaybackStyle mediaPlaybackStyle;
        Integer num;
        b7x b7xVar = b7x.a;
        MobiusLoop mobiusLoop = this.P0;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        q4p0 q4p0Var = (q4p0) mobiusLoop.i;
        if (q4p0Var == null) {
            q4p0Var = new q4p0(63);
        }
        if (((k) this.N0.b).d() >= 9) {
            euh0 euh0Var = new euh0();
            sfm0 sfm0Var = zuc.n;
            CarColor carColorCreateCustom = CarColor.createCustom(sfm0Var.b, sfm0Var.a);
            qpd.b.a(carColorCreateCustom);
            euh0Var.a = carColorCreateCustom;
            mediaPlaybackStyle = new MediaPlaybackStyle(euh0Var, 0);
        } else {
            mediaPlaybackStyle = null;
        }
        String str = q4p0Var.e;
        String str2 = (str == null || str.length() == 0) ? q4p0Var.f : null;
        Action action = Action.APP_ICON;
        smc0 smc0VarN = k4p1.n();
        String str3 = q4p0Var.e;
        if (str3 == null || str3.length() == 0) {
            num = null;
        } else {
            String str4 = q4p0Var.e;
            Set set = s4b1.f;
            num = null;
            String strZ = uic.x("spotify:search:" + Uri.encode(str4)).z();
            if (strZ == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            mqn0 mqn0Var = new mqn0(strZ);
            bqk0 bqk0Var = this.Q0;
            bqk0Var.getClass();
            x6h1 x6h1VarC = bqk0Var.b.c();
            x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("search_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            smc0VarN.add(g(2131959278, 2131232554, new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), mqn0Var));
        }
        if (q4p0Var.b) {
            bqk0 bqk0Var2 = this.Q0;
            bqk0Var2.getClass();
            x6h1 x6h1VarC3 = bqk0Var2.b.c();
            x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            x6h1 x6h1VarC4 = x6h1VarC3.a().c();
            x6h1VarC4.i.add(new a7h1("jam_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            smc0VarN.add(g(2131959276, 2131231943, new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:jam:settings")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), bqn0.a));
        }
        if (q4p0Var.a) {
            Integer num2 = q4p0Var.b ? num : 2131959277;
            bqk0 bqk0Var3 = this.Q0;
            bqk0Var3.getClass();
            x6h1 x6h1VarC5 = bqk0Var3.b.c();
            x6h1VarC5.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            x6h1 x6h1VarC6 = x6h1VarC5.a().c();
            x6h1VarC6.i.add(new a7h1("queue_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC6.j = false;
            smc0VarN.add(g(num2, 2131232471, new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:queue")), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), kqn0.a));
        }
        if (q4p0Var.c) {
            kwc kwcVar = new kwc(2131959275);
            fvc fvcVar = new fvc(2131232157, num, zuc.n.b(), 10);
            this.O0.getClass();
            smc0VarN.add(x1p1.d(kwcVar, fvcVar, (CarColor) null, false, new d6p0(this, (byte) 1), 12));
        }
        Header headerQ = x1p1.q(str2, action, k4p1.k(smc0VarN));
        fuh0 fuh0Var = new fuh0();
        fuh0Var.a = headerQ;
        if (mediaPlaybackStyle != 0) {
            fuh0Var.b = mediaPlaybackStyle;
        }
        return new MediaPlaybackTemplate(fuh0Var);
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.R0;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.S0;
    }

    public final Action g(Integer num, int i, w7h1 w7h1Var, wqn0 wqn0Var) {
        return x1p1.d(num != null ? new kwc(num.intValue()) : null, new fvc(Integer.valueOf(i), (String) null, zuc.n.b(), 10), (CarColor) null, false, new iyo0(wqn0Var, this, w7h1Var, (byte) 1), 28);
    }

    @Override // p.xvc
    public final void onResume(iac0 iac0Var) {
        super.onResume(iac0Var);
        this.O0.getClass();
    }

    public final void onStop(iac0 iac0Var) {
        MobiusLoop mobiusLoop = this.P0;
        if (mobiusLoop != null) {
            if (mobiusLoop == null) {
                u890.C("mobiusLoop");
                throw null;
            }
            q4p0 q4p0Var = (q4p0) mobiusLoop.i;
            if (!u890.j(q4p0Var != null ? q4p0Var.d : null, zz80.a)) {
                MobiusLoop mobiusLoop2 = this.P0;
                if (mobiusLoop2 == null) {
                    u890.C("mobiusLoop");
                    throw null;
                }
                q4p0 q4p0Var2 = (q4p0) mobiusLoop2.i;
                u890.j(q4p0Var2 != null ? q4p0Var2.d : null, a090.a);
            }
        }
        this.O0.getClass();
    }
}
