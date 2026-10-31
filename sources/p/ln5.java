package p;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.android.permissionsimpl.PermissionsRequestActivity;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ln5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ln5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        n7h1 n7h1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((hh) obj2).invoke();
                ow3 ow3Var = ((pn5) obj).c;
                i8h1 i8h1Var = (i8h1) ow3Var.b;
                x6h1 x6h1VarC = ((rrk0) ow3Var.c).b.c();
                x6h1VarC.i.add(new a7h1("icon_change_confirm_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 1:
                ((f85) obj2).invoke();
                ((pn5) obj).c.j();
                return;
            case 2:
                o730 o730Var = ((l6b) obj2).a;
                fn31.T(o730Var.a, (o8n) null, 0, new n730(o730Var, (String) obj, (lnm) null, (byte) 0), 3);
                return;
            case 3:
                String strT = pro1.t("videoPodcastsDownloadAudioOnly");
                ((i4o) obj2).invoke(strT, ((xhr) obj).c.a(new ht8(strT)).a);
                return;
            case 4:
                ((dor) obj2).invoke();
                ((xhr) obj).c.a(gt8.c);
                return;
            case 5:
                fn31.T(cto1.q(((eg0) obj2).a), (o8n) null, 0, new n1o((rhh) obj, (lnm) null, (byte) 24), 3);
                return;
            case 6:
                i8h1 i8h1Var2 = (i8h1) ((cp31) obj2).c;
                x6h1 x6h1VarC3 = ((rrk0) obj).b.c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 7:
                i8h1 i8h1Var3 = (i8h1) ((mxr) obj2).a;
                fjl0 fjl0Var = (fjl0) obj;
                x6h1 x6h1VarC4 = fjl0Var.c.c();
                x6h1VarC4.i.add(new a7h1("confirm_deletion_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("cancel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                return;
            case 8:
                y380 y380Var = (y380) obj2;
                i8h1 i8h1Var4 = (i8h1) y380Var.a.get();
                r6h1 r6h1VarA = y380Var.c.a();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-import-progress";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC6 = x6h1VarI.a().c();
                x6h1VarC6.i.add(new a7h1("failure_dialog", (String) obj, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1VarA, System.currentTimeMillis()), (xj61) null);
                t480 t480Var = y380Var.d;
                if (t480Var != null && (n7h1Var = (n7h1) y380Var.e.getValue()) != null) {
                    n7h1Var.e(t480Var);
                }
                y380Var.d = null;
                return;
            case 9:
                suu suuVar = (suu) obj2;
                suuVar.f.b(suuVar.a.b().doOnSuccess(nm.R0).ignoreElement().n(suuVar.b).subscribe(new f72(new uu1((puu) obj, dialogInterface, suuVar, (byte) 9), (byte) 15)));
                return;
            case 10:
                quu quuVar = (quu) obj2;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((znl) it.next()).a);
                }
                quuVar.b(arrayList);
                return;
            case 11:
                ((lt8) ((zeu) obj2).b).a.m(cbp1.o().h().e().p(), (xj61) null);
                ((ohd) obj).resumeWith(Boolean.FALSE);
                return;
            case 12:
                uny unyVar = (uny) ((kp00) obj2).c;
                i8h1 i8h1Var5 = (i8h1) unyVar.b;
                i6l0 i6l0VarP = unyVar.p();
                i6l0VarP.getClass();
                x6h1 x6h1VarC7 = i6l0VarP.b.c();
                x6h1VarC7.i.add(new a7h1("explicit_dialog_when_not_locked", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("go_to_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                ((lzn0) ((uny) ((mev) obj).b).b).a(pro1.t("explicitContent"), i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pro1.t("explicitContent"))), x6h1VarC8.a(), i6l0VarP.a, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return;
            case 13:
                i8h1 i8h1Var6 = (i8h1) ((vx40) obj2).c;
                x6h1 x6h1VarC9 = ((nqk0) obj).b.c();
                x6h1VarC9.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 14:
                myb0 myb0Var = (myb0) obj2;
                xmu0 xmu0Var = myb0Var.g;
                vpu0 vpu0Var = (vpu0) obj;
                String str = vpu0Var.b.a;
                i8h1 i8h1Var7 = (i8h1) xmu0Var.b;
                x6h1 x6h1VarC10 = ((tdl0) xmu0Var.c).b.c();
                x6h1VarC10.i.add(new a7h1("leave_playlist_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("confirm_leave_playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_playlist", 1, Collections.singletonMap("playlist", str)), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q(myb0Var.d), (o8n) null, 0, new ss90(myb0Var, vpu0Var, (lnm) null, (byte) 12), 3);
                dialogInterface.dismiss();
                return;
            case 15:
                c1d0 c1d0Var = (c1d0) obj2;
                String str2 = (String) obj;
                i8h1 i8h1Var8 = (i8h1) c1d0Var.d.b;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-dialogs-make-private";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarC12 = x6h1VarI2.a().c();
                x6h1VarC12.i.add(new a7h1("make_private_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("confirm_making_private_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_private", 1, Collections.singletonMap("playlist_to_be_made_private", str2)), x6h1VarC13.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                fn31.T(cto1.q(c1d0Var.a), (o8n) null, 0, new a1d0(c1d0Var, str2, (lnm) null, (byte) 1), 3);
                dialogInterface.dismiss();
                return;
            case 16:
                fpo0 fpo0Var = (fpo0) obj2;
                rok0 rok0Var = fpo0Var.d2;
                if (rok0Var == null) {
                    u890.C("notificationOptInFlowLogger");
                    throw null;
                }
                i8h1 i8h1Var9 = (i8h1) rok0Var.b;
                x6h1 x6h1VarC14 = ((ixk0) rok0Var.c).a.c();
                x6h1VarC14.i.add(new a7h1("system_notification_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                x6h1VarC15.i.add(new a7h1("accept_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "android.settings.APP_NOTIFICATION_SETTINGS")), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                lcs lcsVar = fpo0Var.e2;
                if (lcsVar != null) {
                    lcs.b((Context) obj, lcsVar);
                    return;
                } else {
                    u890.C("notificationSettingsNavigator");
                    throw null;
                }
            case 17:
                PermissionsRequestActivity permissionsRequestActivity = (PermissionsRequestActivity) obj2;
                int i2 = PermissionsRequestActivity.d;
                ag0.B0(permissionsRequestActivity, (String[]) obj, 49374);
                permissionsRequestActivity.b = false;
                dialogInterface.dismiss();
                return;
            case 18:
                Uri uri = (Uri) obj;
                a6v0 a6v0Var = (a6v0) obj2;
                i8h1 i8h1Var10 = a6v0Var.b;
                wqk0 wqk0Var = a6v0Var.e;
                if (wqk0Var == null) {
                    u890.C("eventFactory");
                    throw null;
                }
                x6h1 x6h1VarC16 = wqk0Var.c.c();
                x6h1VarC16.i.add(new a7h1("upsell_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = false;
                y6h1 y6h1VarA = x6h1VarC16.a();
                String string = uri.toString();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (string == null) {
                    string = "";
                }
                i8h1Var10.m(new w7h1("", "", z7h1Var, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", string)), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                a6v0Var.f.b(a6v0Var.c.b(uri).subscribe(new ixp0(a6v0Var, (byte) 23), new z0u0(a6v0Var, uri, (byte) 2)));
                return;
            case 19:
                ((Consumer) obj2).accept(new ruv0(((String[]) obj)[i]));
                dialogInterface.cancel();
                return;
            default:
                lis lisVar = (lis) obj2;
                i8h1 i8h1Var11 = lisVar.a;
                x6h1 x6h1VarC17 = lisVar.c.b.c();
                x6h1VarC17.i.add(new a7h1("confirm_discard_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = true;
                x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                x6h1VarC18.i.add(new a7h1("keep_editing_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = false;
                String str3 = i8h1Var11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                ((j2u) obj).G();
                return;
        }
    }
}
