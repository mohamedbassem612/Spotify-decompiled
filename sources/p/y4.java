package p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionListInteraction;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y4 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0507  */
    public final Object invoke() {
        w7h1 w7h1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new kpg0((xpw) ((z4) obj2).a.invoke((oud) obj), h3.R0);
            case 1:
                ((iu30) obj2).invoke(rih1Var);
                ((Function0) ((qj0) obj).e).invoke();
                return rih1Var;
            case 2:
                AccessibilityManager accessibilityManager = ((ch) obj2).b;
                if (accessibilityManager != null) {
                    accessibilityManager.removeAccessibilityStateChangeListener((vg) obj);
                }
                return rih1Var;
            case 3:
                AccessibilityManager accessibilityManager2 = ((ch) obj2).b;
                if (accessibilityManager2 != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener((zg) obj);
                }
                return rih1Var;
            case 4:
                ((ch) obj2).a.getContentResolver().unregisterContentObserver((ah) obj);
                return rih1Var;
            case 5:
                ssw0 ssw0Var = (ssw0) obj2;
                AccessibilityManager accessibilityManager3 = (AccessibilityManager) obj;
                if (!accessibilityManager3.isEnabled()) {
                    z = false;
                } else if (!accessibilityManager3.isTouchExplorationEnabled()) {
                    if (accessibilityManager3.isEnabled()) {
                        Iterator<AccessibilityServiceInfo> it = accessibilityManager3.getEnabledAccessibilityServiceList(-1).iterator();
                        while (it.hasNext()) {
                            if (ihc1.h0(it.next().getId(), "SwitchAccessService", true)) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                }
                return new qge(ssw0Var.l(Boolean.valueOf(z)));
            case 6:
                ((iu30) obj2).invoke((m40) obj);
                return rih1Var;
            case 7:
                ((iu30) obj2).invoke((n20) obj);
                return rih1Var;
            case 8:
                w60 w60Var = (w60) obj2;
                jh5 jh5Var = (jh5) obj;
                Object objC = w60Var.c.c(jh5Var);
                if (objC != null) {
                    return objC;
                }
                j3r j3rVarC = f3r.c(w60Var.a, jh5Var);
                if (j3rVarC == null || !(j3rVarC instanceof j3r)) {
                    return null;
                }
                return j3rVarC.a;
            case 9:
                ((ug0) obj2).a.d((tg0) obj);
                return rih1Var;
            case 10:
                an0 an0Var = (an0) obj2;
                p2p0 p2p0Var = an0Var.c;
                n42 n42VarA = an0Var.d.a();
                l62 l62Var = (l62) obj;
                Parcelable o52Var = new o52(l62Var.i, l62Var.t, l62Var.c, l62Var.X, l62Var.b, l62Var.f, "ad_npv");
                Bundle bundle = new Bundle();
                bundle.putParcelable("ad-data", o52Var);
                n42VarA.T0(bundle);
                p2p0Var.d(n42VarA, "AdsDsaDialogFragment");
                return rih1Var;
            case 11:
                ((uoa) obj2).o(((Boolean) ((ven0) obj).getValue()).booleanValue());
                return rih1Var;
            case 12:
                iw0 iw0Var = (iw0) obj2;
                int i = iw0Var.b;
                int i2 = iw0Var.c;
                int iLongValue = (int) ((Number) ((ven0) obj).getValue()).longValue();
                return Boolean.valueOf(i <= iLongValue && iLongValue <= i2);
            case 13:
                ((iu30) obj2).invoke(new ty0(((frr0) obj).s()));
                return rih1Var;
            case 14:
                v51 v51Var = (v51) obj2;
                i8h1 i8h1Var = v51Var.f;
                x6h1 x6h1VarC = v51Var.Y.a.c();
                x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                qhe0 qhe0Var = v51Var.g;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(qhe0Var, yon1.v());
                v51Var.Q0.onNext(new kn00(((g51) obj).e, (tn00) null));
                return rih1Var;
            case 15:
                v51 v51Var2 = (v51) obj2;
                v51Var2.f.j((w7h1) obj);
                qhe0 qhe0Var2 = v51Var2.g;
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                t8h1.n(qhe0Var2, yon1.v());
                v51Var2.Q0.onNext(new kn00(false, (tn00) null));
                return rih1Var;
            case 16:
                v51 v51Var3 = (v51) obj2;
                ((ohv0) v51Var3.a.b).a(new mhv0("adaptive_authentication", "close", ew80.c, "too_young_error"));
                v51Var3.Q0.onNext(new kn00(((o51) obj).e, (tn00) null));
                return rih1Var;
            case 17:
                lf1 lf1Var = (lf1) obj;
                ((iu30) obj2).invoke(new ff1(lf1Var.d, lf1Var.e, lf1Var.a.g.b));
                return rih1Var;
            case 18:
                ((iu30) obj2).invoke((vl1) obj);
                return rih1Var;
            case 19:
                ((iu30) obj2).invoke((xl1) obj);
                return rih1Var;
            case 20:
                fn31.T((c9n) obj2, (o8n) null, 0, new sv1((upo) obj, (lnm) null, (byte) 0), 3);
                return rih1Var;
            case 21:
                h22 h22Var = (h22) obj2;
                uba ubaVar = h22Var.K1;
                if (ubaVar == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var = h22Var.T1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC2 = dsk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String str = ((m320) obj).a;
                x6h1 x6h1VarC3 = y6h1VarA.c();
                x6h1VarC3.i.add(new a7h1("form_field", str, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 22:
                h22 h22Var2 = (h22) obj2;
                uba ubaVar2 = h22Var2.K1;
                if (ubaVar2 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var2 = h22Var2.T1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC4 = dsk0Var2.b.c();
                x6h1VarC4.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                String str2 = ((l320) obj).a;
                x6h1 x6h1VarC5 = y6h1VarA2.c();
                x6h1VarC5.i.add(new a7h1("form_field", str2, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                ubaVar2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                b8p1 b8p1VarY0 = h22Var2.Y0();
                t2j0 t2j0Var = (t2j0) b8p1VarY0.c;
                c12 c12VarN = AddressCollectionListInteraction.n();
                c12VarN.n(((UUID) b8p1VarY0.e).toString());
                t2j0Var.a(c12VarN.build());
                return rih1Var;
            case 23:
                h22 h22Var3 = (h22) obj2;
                uba ubaVar3 = h22Var3.K1;
                if (ubaVar3 == null) {
                    u890.C("pageBoundUbiLogger");
                    throw null;
                }
                dsk0 dsk0Var3 = h22Var3.T1;
                if (dsk0Var3 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC6 = dsk0Var3.b.c();
                x6h1VarC6.i.add(new a7h1("edit_address", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                String str3 = ((j320) obj).a;
                x6h1 x6h1VarC7 = y6h1VarA3.c();
                x6h1VarC7.i.add(new a7h1("form_field", str3, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                ubaVar3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 24:
                ((ViewTreeObserver) ((eyh0) obj2).d).removeOnGlobalLayoutListener((x22) obj);
                return rih1Var;
            case 25:
                ((a32) obj2).a.removeOnAttachStateChangeListener((y22) obj);
                return rih1Var;
            case 26:
                ((a32) obj2).b.removeOnScrollChangedListener((z22) obj);
                return rih1Var;
            case 27:
                return ((t8u0) obj2).a((of2) ((idd1) ((vf2) obj).e).getValue()).a();
            case 28:
                ii2 ii2Var = (ii2) obj2;
                i8h1 i8h1Var2 = ii2Var.e;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-age-signal-blocked-parent-setup";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "age-signal/blocked/parent-setup");
                x6h1VarR.i.add(new a7h1("ask_guardian_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA4 = x6h1VarR.a();
                String str4 = nik1.Y6.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str4 == null) {
                    str4 = "";
                }
                fn31.T((c9n) obj, (o8n) null, 0, new hi2(ii2Var, i8h1Var2.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null), (lnm) null, (byte) 0), 3);
                return rih1Var;
            default:
                ii2 ii2Var2 = (ii2) obj2;
                i8h1 i8h1Var3 = ii2Var2.e;
                int iC = l1d.C(((oi2) obj).a);
                if (iC == 0) {
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-age-signal-blocked-confirm-age";
                    x6h1VarI2.f = "1.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "age-signal/blocked/confirm-age");
                    x6h1VarR2.i.add(new a7h1("log_out_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarR2.a(), r6h1.c, System.currentTimeMillis());
                } else if (iC == 1) {
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-age-signal-blocked-ask-parent";
                    x6h1VarI3.f = "1.0.0";
                    x6h1VarI3.g = "22.0.0";
                    x6h1 x6h1VarR3 = kk0.r(x6h1VarI3, "age-signal/blocked/ask-parent");
                    x6h1VarR3.i.add(new a7h1("log_out_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarR3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var4 = y6h1.i;
                    x6h1 x6h1VarI4 = i3o1.i();
                    x6h1VarI4.h = "music";
                    x6h1VarI4.a = "mobile-age-signal-blocked-parent-setup";
                    x6h1VarI4.f = "1.1.0";
                    x6h1VarI4.g = "22.0.0";
                    x6h1 x6h1VarR4 = kk0.r(x6h1VarI4, "age-signal/blocked/parent-setup");
                    x6h1VarR4.i.add(new a7h1("log_out_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarR4.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var3.m(w7h1Var, (xj61) null);
                ii2Var2.d.a(yg8.O0);
                return rih1Var;
        }
    }
}
