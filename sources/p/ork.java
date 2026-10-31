package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ork extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ork(Context context, byte b) {
        super(1);
        this.a = b;
        this.b = context;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String string = "";
        rih1 rih1Var = rih1.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return new nrk(context.getResources().getString(2131954993));
            case 1:
                c680.t((ns31) obj, context.getString(2131957129));
                return rih1Var;
            case 2:
                return PendingIntent.getBroadcast(context, 0, m961.a(context, "com.spotify.app.music.scopes.utils.action.player.NOTIFICATION_CHANGE_SEGMENT"), 201326592);
            case 3:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) obj));
                intent.addFlags(268435456);
                context.startActivity(intent);
                return rih1Var;
            case 4:
                oic1 oic1Var = (oic1) obj;
                String string2 = context.getString(oic1Var.a);
                List list = oic1Var.b;
                String str = oic1Var.c;
                String str2 = oic1Var.d;
                if (str.length() > 0 && str2.length() > 0) {
                    string = context.getString(2131952452, str, str2);
                } else if (str.length() > 0) {
                    string = context.getString(2131952454, str);
                }
                return new m9a1(string2, list, string, false, (String) null, false, oic1Var.e, 56);
            case 5:
                gon0 gon0VarL1 = yon1.l1(context);
                gon0VarL1.y((Bundle) obj);
                return gon0VarL1;
            case 6:
                return PendingIntent.getBroadcast(context, 1634473194, m961.a(context, "com.spotify.nowplaying.pip.PAUSE"), 201326592);
            case 7:
                return PendingIntent.getBroadcast(context, -810043495, m961.a(context, "com.spotify.nowplaying.pip.RESUME"), 201326592);
            case 8:
                return PendingIntent.getBroadcast(context, -1041978581, m961.a(context, "com.spotify.nowplaying.pip.SEEK_FORWARD_15_SEC"), 201326592);
            case 9:
                return PendingIntent.getBroadcast(context, -1925474541, m961.a(context, "com.spotify.nowplaying.pip.SEEK_BACK_15_SEC"), 201326592);
            case 10:
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse((String) obj));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    break;
                } catch (Exception unused) {
                }
                return rih1Var;
            case 11:
                ric1 ric1Var = (ric1) obj;
                String string3 = context.getString(ric1Var.a);
                List list2 = ric1Var.b;
                String str3 = ric1Var.c;
                String string4 = str3.length() > 0 ? context.getString(2131962701, str3) : "";
                string4.getClass();
                return new m9a1(string3, list2, string4, ric1Var.d, ric1Var.e, ric1Var.f, (String) null, 64);
            default:
                try {
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse((String) obj));
                    intent3.addFlags(268435456);
                    context.startActivity(intent3);
                    break;
                } catch (Exception unused2) {
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ork(Context context, m961 m961Var, byte b) {
        super(1);
        this.a = b;
        this.b = context;
    }
}
