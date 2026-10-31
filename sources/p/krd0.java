package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class krd0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrd0 b;

    public /* synthetic */ krd0(mrd0 mrd0Var, byte b) {
        this.a = b;
        this.b = mrd0Var;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mrd0 mrd0Var = this.b;
                mrd0Var.P0 = false;
                mrd0Var.Q0 = false;
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                ztd0 ztd0Var = (gud0) mmr0Var.a;
                Boolean bool = (Boolean) mmr0Var.b;
                mrd0 mrd0Var2 = this.b;
                ztd0Var.getClass();
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                drd0 drd0Var = drd0.a;
                erd0 erd0Var = erd0.a;
                brd0 brd0Var = brd0.a;
                Objects.toString(ztd0Var);
                if (ztd0Var instanceof ytd0) {
                    mrd0Var2.R0.onNext(drd0Var);
                    mrd0Var2.h().b();
                    break;
                } else if (ztd0Var instanceof ztd0) {
                    if (!mrd0Var2.Q0) {
                        if (!ztd0Var.a) {
                            mrd0Var2.h().d(new hrd0(mrd0Var2, (byte) 5), mrd0Var2.b());
                        } else {
                            mrd0Var2.h().c(new hrd0(mrd0Var2, (byte) 4), mrd0Var2.b());
                        }
                    }
                    break;
                } else if (ztd0Var instanceof std0) {
                    if (zBooleanValue) {
                        mrd0Var2.V0 = false;
                    }
                    if (zBooleanValue || u890.j(mrd0Var2.R0.h(), brd0Var)) {
                        mrd0Var2.R0.onNext(erd0Var);
                    }
                    if (!mrd0Var2.Q0) {
                        mrd0Var2.h().c(new hrd0(mrd0Var2, (byte) 6), mrd0Var2.b());
                    }
                    break;
                } else if (ztd0Var instanceof ttd0) {
                    if (zBooleanValue) {
                        mrd0Var2.V0 = false;
                    }
                    if (zBooleanValue || u890.j(mrd0Var2.R0.h(), erd0Var)) {
                        mrd0Var2.R0.onNext(brd0Var);
                    }
                    if (!mrd0Var2.Q0) {
                        mrd0Var2.h().d(new hrd0(mrd0Var2, (byte) 7), mrd0Var2.b());
                    }
                    break;
                } else if (ztd0Var instanceof eud0) {
                    q350 q350VarH = mrd0Var2.h();
                    yrd0 yrd0Var = q350VarH.c;
                    i8h1 i8h1Var = yrd0Var.a;
                    py9 py9Var = yrd0Var.c;
                    x6h1 x6h1VarC = py9Var.c.c();
                    x6h1VarC.i.add(new a7h1("host_starting_session_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = py9Var.b;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                    k2i.a(q350VarH.b, 2131956292);
                    break;
                } else if (ztd0Var instanceof wtd0) {
                    q350 q350VarH2 = mrd0Var2.h();
                    yrd0 yrd0Var2 = q350VarH2.c;
                    i8h1 i8h1Var2 = yrd0Var2.a;
                    py9 py9Var2 = yrd0Var2.c;
                    x6h1 x6h1VarC2 = py9Var2.c.c();
                    x6h1VarC2.i.add(new a7h1("participant_joining_session_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).b = py9Var2.b;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var2.f(k7h1Var2.a(), (Set) null);
                    k2i.a(q350VarH2.b, 2131956308);
                    break;
                } else if (ztd0Var instanceof vtd0) {
                    if (!((vtd0) ztd0Var).a) {
                        q350 q350VarH3 = mrd0Var2.h();
                        hrd0 hrd0Var = new hrd0(mrd0Var2, (byte) 2);
                        hrd0 hrd0Var2 = new hrd0(mrd0Var2, (byte) 3);
                        yrd0 yrd0Var3 = q350VarH3.c;
                        i8h1 i8h1Var3 = yrd0Var3.a;
                        py9 py9Var3 = yrd0Var3.c;
                        x6h1 x6h1VarC3 = py9Var3.c.c();
                        x6h1VarC3.i.add(new a7h1("participant_end_session_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                        k7h1 k7h1Var3 = new k7h1();
                        ((xjn) k7h1Var3).a = y6h1VarA3;
                        ((xjn) k7h1Var3).b = py9Var3.b;
                        ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var3.f(k7h1Var3.a(), (Set) null);
                        k2i.b(q350VarH3.b, new dh30(q350VarH3, hrd0Var2, (byte) 9), 2131956306, new o350(new p350(0, yrd0Var3, yrd0.class, "clickedParticipantEndSessionTopBar", "clickedParticipantEndSessionTopBar()V", 0, (byte) 1), hrd0Var, (byte) 0));
                    } else {
                        q350 q350VarH4 = mrd0Var2.h();
                        hrd0 hrd0Var3 = new hrd0(mrd0Var2, (byte) 0);
                        hrd0 hrd0Var4 = new hrd0(mrd0Var2, (byte) 1);
                        yrd0 yrd0Var4 = q350VarH4.c;
                        i8h1 i8h1Var4 = yrd0Var4.a;
                        py9 py9Var4 = yrd0Var4.c;
                        x6h1 x6h1VarC4 = py9Var4.c.c();
                        x6h1VarC4.i.add(new a7h1("host_end_session_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = true;
                        y6h1 y6h1VarA4 = x6h1VarC4.a();
                        k7h1 k7h1Var4 = new k7h1();
                        ((xjn) k7h1Var4).a = y6h1VarA4;
                        ((xjn) k7h1Var4).b = py9Var4.b;
                        ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                        i8h1Var4.f(k7h1Var4.a(), (Set) null);
                        k2i.b(q350VarH4.b, new ro30(q350VarH4, hrd0Var4, (byte) 8), 2131956290, new o350(new y0u(0, yrd0Var4, yrd0.class, "clickedHostEndSessionTopBar", "clickedHostEndSessionTopBar()V", 0, (byte) 28), hrd0Var3, (byte) 0));
                    }
                    break;
                } else if (ztd0Var instanceof cud0) {
                    if (mrd0Var2.O0 != null && (u890.j(mrd0Var2.R0.h(), erd0Var) || u890.j(mrd0Var2.R0.h(), brd0Var))) {
                        mrd0Var2.R0.onNext(drd0Var);
                    }
                    if (ztd0Var instanceof bud0) {
                        int i = LiveSharingRecordingDialogsHostActivity.h1;
                        dg30 dg30Var = mrd0Var2.a;
                        urd0 urd0Var = urd0.a;
                        Intent intent = new Intent((Context) dg30Var, (Class<?>) LiveSharingRecordingDialogsHostActivity.class);
                        intent.setFlags(268435456);
                        intent.putExtra("recording_session_dialog_type", urd0Var);
                        dg30Var.startActivity(intent);
                    }
                    mrd0Var2.h().c(new hrd0(mrd0Var2, (byte) 8), (p350) null);
                    break;
                } else if (ztd0Var instanceof utd0) {
                    h350 h350Var = (h350) mrd0Var2.Y0.getValue();
                    ouz.t(h350Var.b, h350Var.a.getString(2131956287));
                    break;
                } else if (ztd0Var.equals(xtd0.a)) {
                    mrd0Var2.R0.onNext(ard0.a);
                    break;
                } else if (ztd0Var.equals(dud0.a)) {
                    h350 h350Var2 = (h350) mrd0Var2.Y0.getValue();
                    ouz.t(h350Var2.b, h350Var2.a.getString(2131956286));
                    break;
                } else if (!ztd0Var.equals(fud0.a)) {
                    eg.o();
                    break;
                }
                break;
        }
    }
}
