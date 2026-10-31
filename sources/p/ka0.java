package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ka0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(mvh1 mvh1Var, bih1 bih1Var, iu30 iu30Var, int i) {
        super(0);
        this.a = (byte) 15;
        this.e = mvh1Var;
        this.d = bih1Var;
        this.b = iu30Var;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0629  */
    public final Object invoke() {
        int iS;
        View viewC;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ea0 ea0Var = (ga0) obj3;
                if (ea0Var instanceof ea0) {
                    ea0 ea0Var2 = ea0Var;
                    if (ea0Var2.e.size() + ea0Var2.d.size() > 1) {
                        ((ven0) obj).setValue(Integer.valueOf(i));
                    } else {
                        ((iu30) obj2).invoke(new x90(ea0Var, i));
                    }
                } else {
                    ((iu30) obj2).invoke(new x90(ea0Var, i));
                }
                return rih1Var;
            case 1:
                ((ven0) obj).setValue((Object) null);
                ((iu30) obj2).invoke(new x90((ea0) obj3, i));
                return rih1Var;
            case 2:
                it8 it8Var = (it8) obj3;
                ktc1 ktc1Var = (ktc1) obj2;
                String str = ktc1Var.a;
                i8h1 i8h1Var = (i8h1) it8Var.b;
                otk0 otk0Var = (otk0) it8Var.c;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC = otk0Var.b.c();
                x6h1VarC.i.add(new a7h1("suggestion_card", (String) null, numValueOf, (String) null, str));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((vu30) obj).invoke(ktc1Var.b, new fzx0(str));
                return rih1Var;
            case 3:
                ic9 ic9Var = (ic9) obj3;
                ktc1 ktc1Var2 = (ktc1) obj2;
                String str2 = ktc1Var2.a;
                i8h1 i8h1Var2 = (i8h1) ic9Var.b;
                otk0 otk0Var2 = (otk0) ic9Var.c;
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC2 = otk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("suggestion_chip", (String) null, numValueOf2, (String) null, str2));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((vu30) obj).invoke(ktc1Var2.b, str2);
                return rih1Var;
            case 4:
                s7w s7wVar = (s7w) obj3;
                tdl0 tdl0Var = s7wVar.g;
                Integer numValueOf3 = Integer.valueOf(i);
                bxn bxnVar = (bxn) obj2;
                String str3 = bxnVar.a;
                x6h1 x6h1VarC3 = tdl0Var.b.c();
                x6h1VarC3.i.add(new a7h1("editor_row", (String) null, numValueOf3, str3, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA = x6h1VarC3.a();
                i8h1 i8h1Var3 = (i8h1) s7wVar.f.get();
                String str4 = bxnVar.a;
                fn31.T((c9n) obj, (o8n) null, 0, new l2w(s7wVar, bxnVar, i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null), (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 5:
                ven0 ven0Var = (ven0) obj;
                wvw wvwVar = (wvw) obj3;
                if (((String) ven0Var.getValue()).length() == i) {
                    jut jutVar = wvwVar.c;
                    i8h1 i8h1Var4 = (i8h1) jutVar.c;
                    x6h1 x6h1VarC4 = ((h4l0) jutVar.b).b.c();
                    x6h1VarC4.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    w6b1 w6b1VarA = f7b1.a(blc0.pa);
                    String str5 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                    i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    wvwVar.W(new mhv0("email_otp", "validate_otp", ew80.c, (String) null));
                    long j = wvwVar.e;
                    if (j <= 0 || wvwVar.d.b() < j) {
                        ((iu30) obj2).invoke(new pwe0(new kwe0((String) ven0Var.getValue())));
                    } else {
                        wvwVar.T();
                    }
                } else {
                    wvwVar.U(qvw.a);
                }
                return rih1Var;
            case 6:
                RecyclerView recyclerView = (RecyclerView) obj3;
                recyclerView.post(new cv70((dv70) obj2, (String) obj, recyclerView, this.c, (byte) 0));
                return rih1Var;
            case 7:
                xz90 xz90Var = (xz90) obj3;
                xok0 xok0Var = xz90Var.N0;
                xok0Var.getClass();
                x6h1 x6h1VarC5 = xok0Var.b.c();
                x6h1VarC5.i.add(new a7h1("participant_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA3 = x6h1VarC5.a();
                Integer numValueOf4 = Integer.valueOf(i);
                x6h1 x6h1VarC6 = y6h1VarA3.c();
                x6h1VarC6.i.add(new a7h1("remove_participant", (String) null, numValueOf4, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA4 = x6h1VarC6.a();
                String str6 = ((q6a0) obj2).c;
                String str7 = ((wz90) obj).b;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_participant", 1, sqg0.J(new mmr0[]{new mmr0("participant_id", str6 == null ? "" : str6), new mmr0("session_id", str7 != null ? str7 : "")})), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                xz90Var.Z.a(w7h1Var, xz90Var.Y.m(w7h1Var, (xj61) null).a);
                MobiusLoop mobiusLoop = xz90Var.O0;
                if (mobiusLoop != null) {
                    mym.l(mobiusLoop, new sz90(str6));
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 8:
                ((utj) obj3).c.invoke((apd) obj2, Integer.valueOf(i), (ouk0) obj);
                return rih1Var;
            case 9:
                int iS2 = ((hdn0) obj3).s();
                err0 err0Var = (hdn0) obj2;
                int iS3 = err0Var.s();
                return Integer.valueOf(err0Var.s() + ((iS2 <= 0 || iS3 <= 0 || (iS = (((iS2 - (iS3 * 2)) - ((hdn0) obj).s()) - i) / 2) < 0) ? 0 : iS));
            case 10:
                r6h1 r6h1Var = r6h1.c;
                b4t0 b4t0Var = (b4t0) obj2;
                f4t0 f4t0Var = (f4t0) obj3;
                ArrayList arrayList = f4t0Var.b;
                int i2 = f4t0Var.O0;
                j4t0 j4t0Var = f4t0Var.d;
                if (i2 > i) {
                    String str8 = ((fbr0) arrayList.get(i)).b;
                    i8h1 i8h1Var5 = j4t0Var.a;
                    x6h1 x6h1VarC7 = j4t0Var.c.b.c();
                    x6h1VarC7.i.add(new a7h1("watch_feed_pivoting_container", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    String str9 = i8h1Var5.m(new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), x6h1VarC7.a(), r6h1Var, System.currentTimeMillis()), (xj61) null).a.a;
                } else {
                    String str10 = ((fbr0) arrayList.get(i)).b;
                    i8h1 i8h1Var6 = j4t0Var.a;
                    x6h1 x6h1VarC8 = j4t0Var.c.b.c();
                    x6h1VarC8.i.add(new a7h1("watch_feed_pivoting_container", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    String str11 = i8h1Var6.m(new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10)), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis()), (xj61) null).a.a;
                }
                f4t0Var.O0 = i;
                ArrayList arrayList2 = b4t0Var.X;
                z3t0 z3t0Var = b4t0Var.Z;
                if (z3t0Var != null) {
                    b4t0.A(z3t0Var);
                    z3t0 z3t0Var2 = b4t0Var.Z;
                    if (z3t0Var2 == null) {
                        u890.C("currentRuntime");
                        throw null;
                    }
                    z3t0Var2.f.onNext(Boolean.FALSE);
                    z3t0 z3t0Var3 = b4t0Var.Z;
                    if (z3t0Var3 == null) {
                        u890.C("currentRuntime");
                        throw null;
                    }
                    air0 air0Var = z3t0Var3.e;
                    if (air0Var != null) {
                        air0Var.a();
                    }
                    z3t0 z3t0Var4 = b4t0Var.Z;
                    if (z3t0Var4 == null) {
                        u890.C("currentRuntime");
                        throw null;
                    }
                    z3t0Var4.e = null;
                    z3t0Var4.d.g();
                }
                Bundle bundle = b4t0Var.d;
                if (bundle != null) {
                    bundle.putBoolean("watch_feed_playback_mute_state_key", ((Boolean) b4t0Var.i.d.getValue()).booleanValue());
                }
                z3t0 z3t0Var5 = (z3t0) arrayList2.get(i);
                dcr0 dcr0Var = z3t0Var5.d;
                BehaviorSubject behaviorSubject = z3t0Var5.f;
                if (!dcr0Var.X) {
                    dcr0Var.f();
                }
                dcr0 dcr0Var2 = ((z3t0) arrayList2.get(i)).d;
                ViewGroup viewGroup = b4t0Var.e;
                air0 air0Var2 = new air0(dcr0Var2, b4t0Var.Y, yoi1.g(behaviorSubject), (mr20) null, viewGroup.getContext(), viewGroup, z3t0Var5.g.b, (x8c0) null, 136);
                z3t0Var5.e = air0Var2;
                SparseArray<Parcelable> sparseArray = z3t0Var5.g.c;
                if (sparseArray != null && (viewC = air0Var2.c()) != null) {
                    viewC.restoreHierarchyState(sparseArray);
                }
                behaviorSubject.onNext(Boolean.TRUE);
                b4t0Var.Z = z3t0Var5;
                ((z511) b4t0Var).a.d(i - 1, 3, (Object) null);
                String str12 = ((fbr0) arrayList.get(i)).b;
                i8h1 i8h1Var7 = j4t0Var.a;
                x6h1 x6h1VarC9 = j4t0Var.c.b.c();
                x6h1VarC9.i.add(new a7h1("watch_feed_pivoting_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                y6h1 y6h1VarA5 = x6h1VarC9.a();
                Integer num = (Integer) j4t0Var.b.o.getValue();
                x6h1 x6h1VarC10 = y6h1VarA5.c();
                x6h1VarC10.i.add(new a7h1("watch_feed_pivoting_page", (String) null, num, str12, (String) null));
                x6h1VarC10.j = true;
                y6h1 y6h1VarA6 = x6h1VarC10.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA6;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var7.f(k7h1Var.a(), (Set) null);
                ((d4t0) obj).a = i;
                if (i > 0 && f4t0Var.Q0) {
                    vi11 vi11Var = f4t0Var.f;
                    String strA = bbu.a(f4t0Var.g);
                    if (strA == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    hma1 hma1VarEdit = ((dma1) vi11Var.b).edit();
                    hma1VarEdit.a(bma1.b.n("watch_feed_tooltip_onboarding_user_".concat(strA)), true);
                    hma1VarEdit.g();
                    f4t0Var.Q0 = false;
                }
                return rih1Var;
            case 11:
                ((ss50) obj3).a(0);
                ((iu30) obj2).invoke(new p201((s201) obj, i));
                return rih1Var;
            case 12:
                i551 i551Var = (i551) obj3;
                return Boolean.valueOf(i551Var != null && ((h551) obj2).a(i551Var, i, (rnc0) obj));
            case 13:
                ((db51) obj3).l((apd) obj2, i, (ouk0) obj);
                return rih1Var;
            case 14:
                ((ven0) obj).setValue(Boolean.FALSE);
                ((vu30) obj3).invoke((m881) obj2, Integer.valueOf(i));
                return rih1Var;
            case 15:
                if (!(((mvh1) obj3) instanceof kvh1)) {
                    ((bih1) obj).h(3);
                    ((iu30) obj2).invoke(new kvh1(i));
                }
                return rih1Var;
            default:
                qpj1 qpj1Var = (qpj1) obj3;
                i8h1 i8h1Var8 = (i8h1) ((idd1) qpj1Var.c).getValue();
                h7l0 h7l0Var = (h7l0) qpj1Var.b;
                Integer numValueOf5 = Integer.valueOf(i);
                x6h1 x6h1VarC11 = h7l0Var.b.c();
                x6h1VarC11.i.add(new a7h1("voice_row", (String) null, numValueOf5, (String) null, (String) null));
                x6h1VarC11.j = false;
                i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj2).invoke(((hqk1) obj).a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka0(Object obj, int i, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.e = obj;
        this.c = i;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka0(Object obj, Object obj2, int i, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = i;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(0);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(iu30 iu30Var, ea0 ea0Var, int i, ven0 ven0Var) {
        super(0);
        this.a = (byte) 1;
        this.b = iu30Var;
        this.e = ea0Var;
        this.c = i;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka0(int i, Object obj, Object obj2, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.c = i;
        this.e = obj;
        this.b = obj2;
        this.d = ven0Var;
    }
}
