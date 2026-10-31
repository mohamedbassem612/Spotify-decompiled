package p;

import android.content.Context;
import android.content.res.Resources;
import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import androidx.car.app.model.SectionHeader;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sie extends ed10 {
    public final lie Q0;
    public final i8h1 R0;
    public final t64 S0;
    public final vpn0 T0;
    public final bqk0 U0;
    public MobiusLoop V0;
    public final rie W0;
    public final vpn0 X0;
    public final r6h1 Y0;

    public sie(k kVar, fna fnaVar, lie lieVar, i8h1 i8h1Var, qzn0 qzn0Var, md10 md10Var, t64 t64Var, vpn0 vpn0Var) {
        super(kVar, fnaVar, i8h1Var, qzn0Var, md10Var, t64Var);
        this.Q0 = lieVar;
        this.R0 = i8h1Var;
        this.S0 = t64Var;
        this.T0 = vpn0Var;
        bqk0 bqk0Var = new bqk0((byte) 15);
        this.U0 = bqk0Var;
        fn31.T(cto1.q(this), (o8n) null, 0, new bu(this, null, (byte) 7), 3).L(new m4d(this, (byte) 18));
        this.W0 = new rie(this, (byte) 0);
        this.X0 = vpn0Var;
        this.Y0 = bqk0Var.b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.model.Action */
    public final sxd1 d() throws Action {
        String str;
        MobiusLoop mobiusLoop = this.V0;
        Action action = null;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        mie mieVar = (mie) mobiusLoop.i;
        if (mieVar == null) {
            mieVar = new mie(this.T0.a);
        }
        int i = mieVar.b;
        int size = mieVar.f.size();
        String str2 = mieVar.c;
        StringBuilder sb = new StringBuilder("[CAL] ChapterListScreen: state=");
        if (i == 1) {
            str = "Error";
        } else if (i == 2) {
            str = "Loaded";
        } else if (i != 3) {
            str = i != 4 ? "null" : "PendingLoad";
        } else {
            str = "Loading";
        }
        sb.append(str);
        sb.append(", chapters=");
        sb.append(size);
        sb.append(", episodeName=");
        sb.append(str2);
        Logger.b(sb.toString(), new Object[0]);
        int iC = l1d.C(mieVar.b);
        if (iC == 0) {
            return lgo1.v(z6x.a);
        }
        if (iC != 1) {
            if (iC == 2 || iC == 3) {
                return lgo1.w(true, x1p1.r((String) null, Action.BACK, (smc0) null, 4), ed10.g(this), (List) null, 24);
            }
            eg.o();
            return null;
        }
        Header headerR = x1p1.r(mieVar.c, Action.BACK, (smc0) null, 4);
        ArrayList arrayListG = ed10.g(this);
        smc0 smc0VarN = k4p1.n();
        if (!mieVar.g) {
            String string = ((ap41) this).a.getString(2131953094);
            String str3 = mieVar.c;
            if (str3 == null) {
                str3 = "";
            }
            lwc lwcVar = new lwc(str3);
            String str4 = mieVar.d;
            lwc lwcVar2 = str4 != null ? new lwc(str4) : null;
            String str5 = mieVar.e;
            smc0VarN.add(lgo1.t(string, Collections.singletonList(x760.D(lwcVar, lwcVar2, str5 != null ? new gvc(12, str5, this.T0.a) : null, (Integer) null, (nwc) null, (Boolean) null, (Action) null, false, false, (Float) null, new rie(this, (byte) 1), 2040)), (String) null, (Function0) null, (b8p1) null, (SectionHeader) null, 60));
        }
        Context context = ((ap41) this).a;
        String string2 = context.getString(2131953093);
        List list = mieVar.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                Action action2 = action;
                p7h.T();
                throw action2;
            }
            bhe bheVar = (bhe) next;
            Action action3 = action;
            Header header = headerR;
            long j = bheVar.d - bheVar.c;
            lwc lwcVar3 = new lwc(bheVar.b);
            Resources resources = context.getResources();
            long j2 = j / 1000;
            ArrayList arrayList2 = arrayListG;
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            if (j4 > 0 && j3 >= 30) {
                j4++;
            }
            Iterator it2 = it;
            long j5 = j4 / 60;
            long j6 = j4 % 60;
            Context context2 = context;
            smc0 smc0VarN2 = k4p1.n();
            if (j5 > 0) {
                int i4 = (int) j5;
                smc0VarN2.add(resources.getQuantityString(2131820588, i4, Integer.valueOf(i4)));
            }
            if (j6 > 0) {
                int i5 = (int) j6;
                smc0VarN2.add(resources.getQuantityString(2131820589, i5, Integer.valueOf(i5)));
            }
            if (smc0VarN2.isEmpty()) {
                int i6 = (int) j3;
                smc0VarN2.add(resources.getQuantityString(2131820590, i6, Integer.valueOf(i6)));
            }
            arrayList.add(x760.D(lwcVar3, new lwc(o7h.y0(k4p1.k(smc0VarN2), " ", (String) null, (String) null, (iu30) null, 62)), (hvc) null, (Integer) null, (nwc) null, (Boolean) null, bheVar.e ? new ty(Action.MEDIA_PLAYBACK).a() : action3, false, false, (Float) null, new wv1(this, i2, bheVar, (byte) 6), 1916));
            i2 = i3;
            headerR = header;
            action = action3;
            arrayListG = arrayList2;
            it = it2;
            context = context2;
            string2 = string2;
        }
        smc0VarN.add(lgo1.t(string2, arrayList, (String) null, (Function0) null, (b8p1) null, (SectionHeader) null, 60));
        return lgo1.w(false, headerR, arrayListG, k4p1.k(smc0VarN), 16);
    }

    @Override // p.xvc
    public final Function0 e() {
        return this.W0;
    }

    @Override // p.xvc
    public final wqn0 f() {
        return this.X0;
    }

    @Override // p.ed10
    public final r6h1 h() {
        return this.Y0;
    }
}
