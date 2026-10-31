package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import com.spotify.creativework.v1.Release;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kw6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kw6(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ito itoVar;
        String str;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                mw6 mw6Var = (mw6) obj;
                i8h1 i8h1Var = (i8h1) mw6Var.d.get();
                wqk0 wqk0Var = (wqk0) obj3;
                x6h1 x6h1VarC = wqk0Var.c.c();
                x6h1VarC.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                String str2 = (String) obj2;
                mw6Var.c.a(str2, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 1:
                ix7 ix7Var = (ix7) obj;
                String str3 = (String) obj3;
                i8h1 i8h1Var2 = ((lt8) ix7Var.d).a;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-auto-download-snackbar";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = (String) obj2;
                x6h1 x6h1VarC2 = x6h1VarI.a().c();
                x6h1VarC2.i.add(new a7h1("onboarding_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((lzn0) ix7Var.c).a(str3, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 2:
                ((iu30) obj).invoke(new u7v0(((e8v0) obj3).c, (String) obj2));
                return;
            case 3:
                i8h1 i8h1Var3 = (i8h1) ((mtm) obj).j.get();
                x6h1 x6h1VarC4 = ((sqk0) obj3).b.c();
                x6h1VarC4.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                String str4 = (String) obj2;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str4));
                intent.setPackage(view.getContext().getPackageName());
                view.getContext().startActivity(intent);
                return;
            case 4:
                c7s c7sVar = (c7s) obj3;
                ((Function0) obj).invoke();
                c7sVar.a.a((String) obj2);
                c7sVar.b.b();
                return;
            case 5:
                y0o y0oVar = (y0o) ((tjq) obj).e;
                if (y0oVar != null) {
                    y0oVar.invoke(new y7v0(((f8v0) obj3).d, (String) obj2));
                    return;
                } else {
                    u890.C("eventHandler");
                    throw null;
                }
            case 6:
                o0g1 o0g1Var = (o0g1) obj;
                i8h1 i8h1Var4 = (i8h1) o0g1Var.d;
                rrk0 rrk0Var = (rrk0) o0g1Var.e;
                rrk0Var.getClass();
                x6h1 x6h1VarC5 = rrk0Var.b.c();
                x6h1VarC5.i.add(new a7h1("positive_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((xv61) ((fdc) ((wcr) obj3).b).d).a(rc11.a.b(b6u.class), rih1.a).a(Boolean.TRUE, Boolean.FALSE, (tv80) null);
                ((cwb) obj2).dismiss();
                return;
            case 7:
                List list = (List) ((fai0) obj).e();
                if (list == null || (itoVar = (ito) o7h.t0(((dhd1) obj3).b, list)) == null || (str = itoVar.b) == null) {
                    return;
                }
                teb tebVar = (teb) obj2;
                tebVar.f = str;
                tebVar.g = null;
                return;
            case 8:
                i8h1 i8h1Var5 = ((mu10) obj).e;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-taste-profile";
                x6h1VarI2.f = "3.1.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI2.a();
                Collections.singletonList("tasteprofile");
                rt10 rt10Var = (rt10) obj3;
                String str5 = rt10Var.c;
                x6h1 x6h1VarC6 = y6h1VarA.c();
                x6h1VarC6.i.add(new a7h1("taste_section", str5, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA2 = x6h1VarC6.a();
                String str6 = rt10Var.a;
                x6h1 x6h1VarC7 = y6h1VarA2.c();
                x6h1VarC7.i.add(new a7h1("taste_feedback_note_item", str6, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Consumer) obj2).accept(new ov10(str6, rt10Var.d));
                return;
            case 9:
                ((l811) obj).a = true;
                ssw0 ssw0Var = (ssw0) obj3;
                ssw0Var.l(new uh60(((ki60) obj2).a));
                ssw0Var.H((Throwable) null);
                return;
            case 10:
                ((rzd0) obj).a(new fzd0(1));
                kxd0 kxd0Var = (kxd0) obj2;
                ((io.reactivex.rxjava3.functions.Consumer) obj3).accept(new uwd0(kxd0Var.a, kxd0Var.b));
                return;
            case 11:
                ((rzd0) obj).a(new fzd0(2));
                lxd0 lxd0Var = (lxd0) obj2;
                ((io.reactivex.rxjava3.functions.Consumer) obj3).accept(new uwd0(lxd0Var.a, lxd0Var.b));
                return;
            case 12:
                ur00 ur00Var = (ur00) obj;
                lzn0 lzn0Var = (lzn0) ur00Var.b;
                String str7 = (String) obj2;
                i8h1 i8h1Var6 = (i8h1) ((idd1) ur00Var.f).getValue();
                x6h1 x6h1VarC10 = ((sqk0) obj3).b.c();
                x6h1VarC10.i.add(new a7h1("manage_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                lzn0Var.a(str7, i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 13:
                t2b.n(((dni0) obj3).d, ((LinearLayout) ((z6e0) obj).b).getContext());
                ((vnd1) obj2).p();
                return;
            case 14:
                ymu0 ymu0Var = (ymu0) obj;
                String str8 = (String) obj2;
                ymu0Var.f.a.a(t5p1.q(str8), ymu0Var.b.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", t5p1.q(str8))), ((tdl0) obj3).b, r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 15:
                ez01 ez01Var = (ez01) obj;
                i8h1 i8h1Var7 = ez01Var.c;
                x6h1 x6h1VarC11 = ez01Var.g.b.c();
                x6h1VarC11.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA3 = x6h1VarC11.a();
                idd1 idd1Var = ez01Var.h;
                String str9 = (String) idd1Var.getValue();
                tv80 tv80VarM = i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                String str10 = (String) obj2;
                if (str10 != null) {
                    svo svoVar = ez01Var.d;
                    svoVar.getClass();
                    svoVar.a = new rvo(str10);
                }
                ez01Var.b.f(new dwn0((String) idd1Var.getValue(), "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(tv80VarM)));
                ((cwb) obj3).dismiss();
                return;
            case 16:
                s880 s880Var = (s880) obj;
                i8h1 i8h1Var8 = (i8h1) s880Var.c;
                zul0 zul0Var = (zul0) ((idd1) s880Var.a).getValue();
                zul0Var.getClass();
                x6h1 x6h1VarC12 = zul0Var.a.c();
                x6h1VarC12.i.add(new a7h1("suggestion_removed_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("restore_removed_suggestion_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q((dg30) s880Var.f), (o8n) null, 0, new m311(obj3, (Object) s880Var, obj2, (lnm) null, (byte) 12), 3);
                return;
            case 17:
                xo21 xo21Var = (xo21) obj3;
                Set set = s4b1.f;
                String str11 = ((yo21) obj).c;
                if (uic.x(str11).c == blc0.l2) {
                    xo21Var.a.h(str11);
                    vnd1 vnd1Var = xo21Var.b;
                    i8h1 i8h1Var9 = (i8h1) vnd1Var.b;
                    x6h1 x6h1VarC14 = ((yok0) vnd1Var.c).b.c();
                    x6h1VarC14.i.add(new a7h1("listening_hours_request_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    ((EncoreButton) ((vo21) obj2).U0.d).setEnabled(false);
                    return;
                }
                return;
            case 18:
                uaq0 uaq0Var = ((eg1) obj).b;
                if (uaq0Var != null) {
                    uaq0Var.f(((zo21) obj3).c);
                }
                ((EncoreButton) ((wo21) obj2).U0.d).setEnabled(false);
                return;
            case 19:
                String uri = ((Release) ((vi11) obj).b).n().getUri();
                gal galVar = (gal) obj3;
                uri.getClass();
                ((lzn0) ((g931) obj2).b).a(uri, ((i8h1) galVar.b).m(((npl0) galVar.c).a(uri), (xj61) null), (Bundle) null);
                return;
            case 20:
                dc61 dc61Var = (dc61) obj;
                fn31.T(cto1.q(dc61Var.d), dc61Var.Z, 0, new n641(dc61Var, (vb61) obj3, (String) obj2, (lnm) null, (byte) 18), 2);
                return;
            case 21:
                y441 y441Var = (y441) obj;
                q9t q9tVar = (q9t) obj3;
                ((PublishSubject) obj2).onNext(new n1n1(q9tVar));
                kjo0 kjo0Var = q9tVar.a;
                li9 li9Var = (li9) y441Var.c;
                String str12 = kjo0Var.a;
                String str13 = kjo0Var.i;
                bdj0 bdj0Var = kjo0Var.h;
                li9Var.c(str12, "UNDO-DELETE", "", str13, bdj0Var.b, bdj0Var.a);
                bym1 bym1Var = (bym1) y441Var.b;
                int i = q9tVar.c;
                rrk0 rrk0Var2 = (rrk0) bym1Var.c;
                String str14 = kjo0Var.a;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC15 = rrk0Var2.b.c();
                x6h1VarC15.i.add(new a7h1("confirmation_snackbar", str14, numValueOf, (String) null, (String) null));
                x6h1VarC15.j = true;
                ((i8h1) bym1Var.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 22:
                SkipDialogFragment skipDialogFragment = (SkipDialogFragment) obj;
                n3h1 n3h1Var = skipDialogFragment.Y1;
                if (n3h1Var == null) {
                    u890.C("skipDialogLogger");
                    throw null;
                }
                n3h1Var.c((String) obj2);
                boolean z = ((j591) obj3).e;
                hnn0 hnn0VarL = pap1.w(skipDialogFragment).l();
                hnn0VarL.getClass();
                ((fe41) hnn0VarL.X.getValue()).b(Boolean.valueOf(z), "skipDialogResult");
                skipDialogFragment.Z0(false, false);
                return;
            case 23:
                w0o w0oVar = (w0o) obj;
                vt91 vt91Var = (vt91) obj2;
                ((lzn0) w0oVar.b).a(vt91Var.b, bcl1.f((bcl1) w0oVar.c, ((o0i) obj3).e, "snackbar_message", zmo1.s(vt91Var.b), (String) null, new dr91(vt91Var, (byte) 0), 8), (Bundle) null);
                return;
            case 24:
                cm0 cm0Var = (cm0) obj;
                i8h1 i8h1Var10 = (i8h1) cm0Var.h;
                ezl0 ezl0Var = (ezl0) obj3;
                x6h1 x6h1VarC16 = ezl0Var.c.c();
                x6h1VarC16.i.add(new a7h1("action_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = false;
                String str15 = (String) obj2;
                ((lzn0) cm0Var.g).a(str15, i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str15)), x6h1VarC16.a(), ezl0Var.b, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 25:
                fga1 fga1Var = (fga1) obj;
                TextView textView = (TextView) obj3;
                b8k1.m(textView, fg.g, textView.getContext().getString(2131962785), (sh) null);
                lpq0 lpq0Var = (lpq0) obj2;
                fga1Var.dismiss();
                if (lpq0Var instanceof bb20) {
                    et61 et61Var = fga1Var.T0;
                    if (et61Var != null) {
                        et61Var.invoke(lpq0Var);
                        return;
                    }
                    return;
                }
                if (!(lpq0Var instanceof eia1)) {
                    eg.o();
                    return;
                }
                et61 et61Var2 = fga1Var.S0;
                if (et61Var2 != null) {
                    et61Var2.invoke(lpq0Var);
                    return;
                }
                return;
            case 26:
                uaq0 uaq0Var2 = ((eg1) obj).b;
                if (uaq0Var2 != null) {
                    uaq0Var2.f(((nlc1) obj3).f.d);
                }
                ((EncoreButton) ((hlc1) obj2).U0.c).setEnabled(false);
                return;
            case 27:
                uaq0 uaq0Var3 = ((eg1) obj).b;
                if (uaq0Var3 != null) {
                    uaq0Var3.f(((mlc1) obj3).b.d);
                }
                ((llc1) obj2).U0.b.setEnabled(false);
                return;
            default:
                ohd ohdVar = (ohd) obj2;
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ohdVar.resumeWith(jhh1.a);
                    ((kt91) ((dlg1) obj).a).b();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ kw6(Object obj, Object obj2, String str, byte b) {
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }
}
