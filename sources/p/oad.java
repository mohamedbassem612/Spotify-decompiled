package p;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oad implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oad(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jzm) obj).invoke();
                return;
            case 1:
                ((f2t) obj).invoke();
                return;
            case 2:
                ((f2t) obj).invoke();
                return;
            case 3:
                ((f2t) obj).invoke();
                return;
            case 4:
                ((f2t) obj).invoke();
                return;
            case 5:
                ((dt90) obj).invoke();
                return;
            case 6:
                ((x680) obj).invoke();
                return;
            case 7:
                ((jzm) obj).invoke();
                return;
            case 8:
                ((x680) obj).invoke();
                return;
            case 9:
                ((ya21) obj).invoke();
                return;
            case 10:
                ((g521) obj).invoke();
                return;
            case 11:
                i8h1 i8h1Var = (i8h1) ((a680) obj).c;
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-sts-delete-dialog";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC = x6h1VarI.a().c();
                x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 12:
                ((q2u) obj).b.a("pin_item_in_folder");
                return;
            case 13:
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ((Runnable) ((ArrayList) obj).get(i)).run();
                return;
            case 14:
                ((quu) obj).b(z6x.a);
                return;
            case 15:
                ((iu30) ((ug3) obj).e).invoke(kz41.a);
                return;
            case 16:
                ((ifl1) obj).b = null;
                dialogInterface.dismiss();
                return;
            case 17:
                xmu0 xmu0Var = ((myb0) obj).g;
                i8h1 i8h1Var2 = (i8h1) xmu0Var.b;
                x6h1 x6h1VarC2 = ((tdl0) xmu0Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("leave_playlist_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                dialogInterface.dismiss();
                return;
            case 18:
                i8h1 i8h1Var3 = ((kkb) ((dxy) obj).c).a;
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-playlist-entity-dialogs-leave-playlist";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarC4 = x6h1VarI2.a().c();
                x6h1VarC4.i.add(new a7h1("leave_playlist_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 19:
                i8h1 i8h1Var4 = (i8h1) ((c1d0) obj).d.b;
                r6h1 r6h1Var5 = r6h1.c;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-dialogs-make-private";
                x6h1VarI3.f = "3.0.0";
                x6h1VarI3.g = "22.0.0";
                x6h1 x6h1VarC6 = x6h1VarI3.a().c();
                x6h1VarC6.i.add(new a7h1("make_private_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1Var5, System.currentTimeMillis()), (xj61) null);
                dialogInterface.dismiss();
                return;
            case 20:
                ((kek0) obj).invoke();
                return;
            case 21:
                rok0 rok0Var = ((fpo0) obj).d2;
                if (rok0Var == null) {
                    u890.C("notificationOptInFlowLogger");
                    throw null;
                }
                i8h1 i8h1Var5 = (i8h1) rok0Var.b;
                x6h1 x6h1VarC8 = ((ixk0) rok0Var.c).a.c();
                x6h1VarC8.i.add(new a7h1("system_notification_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("reject_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 22:
                if (Build.VERSION.SDK_INT >= 29) {
                    ((Activity) ((uip0) obj).b).startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                    return;
                }
                return;
            case 23:
                ((k2v0) obj).invoke();
                return;
            case 24:
                ((k2v0) obj).invoke();
                return;
            case 25:
                a6v0 a6v0Var = (a6v0) obj;
                i8h1 i8h1Var6 = a6v0Var.b;
                wqk0 wqk0Var = a6v0Var.e;
                if (wqk0Var == null) {
                    u890.C("eventFactory");
                    throw null;
                }
                x6h1 x6h1VarC10 = wqk0Var.c.c();
                x6h1VarC10.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null);
                return;
            case 26:
                ((lzn0) ((qdg) obj).b).e();
                return;
            case 27:
                ((wgb) ((mzr0) obj).g).c();
                return;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((d4v0) obj).invoke();
                return;
            default:
                ((kbp0) obj).invoke();
                return;
        }
    }
}
