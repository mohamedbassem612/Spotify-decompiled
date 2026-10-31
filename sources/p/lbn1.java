package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lbn1 extends jim0 {
    public final /* synthetic */ ny31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbn1(ny31 ny31Var, Looper looper) {
        super(looper, (byte) 4, false);
        this.b = ny31Var;
    }

    public final void handleMessage(Message message) {
        ny31 ny31Var = this.b;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new etn1());
                if (intent.hasExtra("google.messenger")) {
                    uxn1 parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof uxn1) {
                        ny31Var.g = parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        ny31Var.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        if (strValueOf.length() != 0) {
                            "Unexpected response action: ".concat(strValueOf);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = ny31.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (!Log.isLoggable("Rpc", 3) || stringExtra.length() == 0) {
                            return;
                        }
                        "Unexpected response string: ".concat(stringExtra);
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        ny31Var.b(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                    return;
                }
                if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (ny31Var.a) {
                        int i = 0;
                        while (true) {
                            try {
                                jv81 jv81Var = ny31Var.a;
                                if (i < jv81Var.c) {
                                    ny31Var.b(intent2.getExtras(), (String) jv81Var.f(i));
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    if (stringExtra2.length() != 0) {
                        "Unexpected structured response ".concat(stringExtra2);
                    }
                } else {
                    String str = strArrSplit[2];
                    String strSubstring = strArrSplit[3];
                    if (strSubstring.startsWith(":")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    ny31Var.b(intent2.putExtra("error", strSubstring).getExtras(), str);
                }
            }
        }
    }
}
