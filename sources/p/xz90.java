package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.SectionHeader;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xz90 extends xvc {
    public final xok0 N0;
    public MobiusLoop O0;
    public final aqn0 P0;
    public final pr90 Q0;
    public final vz90 X;
    public final i8h1 Y;
    public final t64 Z;

    public xz90(vz90 vz90Var, k kVar, qzn0 qzn0Var, i8h1 i8h1Var, t64 t64Var) {
        super(kVar, i8h1Var, qzn0Var, t64Var);
        this.X = vz90Var;
        this.Y = i8h1Var;
        this.Z = t64Var;
        this.N0 = new xok0((byte) 11);
        this.P0 = aqn0.a;
        this.Q0 = new pr90(this, (byte) 4);
        fn31.T(cto1.q(this), (o8n) null, 0, new bu(this, null, (byte) 22), 3).L(new hu90(this, (byte) 7));
    }

    public final sxd1 d() {
        MobiusLoop mobiusLoop = this.O0;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        wz90 wz90Var = (wz90) mobiusLoop.i;
        if (wz90Var == null) {
            wz90Var = new wz90(31);
        }
        wz90 wz90Var2 = wz90Var;
        String string = ((ap41) this).a.getString(2131953096);
        List list = wz90Var2.e;
        int i = 10;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            q6a0 q6a0Var = (q6a0) obj;
            String str = q6a0Var.a;
            lwc lwcVar = new lwc(str);
            String str2 = q6a0Var.b;
            arrayList.add(x760.D(lwcVar, (nwc) null, str2 != null ? new gvc(i, str2, (String) null) : new bvc(str), 2, (nwc) null, (Boolean) null, x1p1.d((kwc) null, new fvc(2131232946, (String) null, zuc.m.b(), 2), zuc.j.a(), false, new ka0(this, i2, q6a0Var, wz90Var2, (byte) 7), 25), false, false, (Float) null, (Function0) null, 3952));
            i2 = i3;
            i = 10;
        }
        List listSingletonList = Collections.singletonList(lgo1.t(string, arrayList, ((ap41) this).a.getString(2131953097), (Function0) null, (b8p1) null, (SectionHeader) null, 56));
        String string2 = wz90Var2.a;
        if (string2 == null) {
            string2 = ((ap41) this).a.getString(2131959276);
        }
        Header headerR = x1p1.r(string2, Action.BACK, (smc0) null, 4);
        boolean z = wz90Var2.c;
        List list2 = z6x.a;
        if (z) {
            listSingletonList = list2;
        }
        return lgo1.w(z, headerR, list2, listSingletonList, 16);
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.Q0;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.P0;
    }
}
