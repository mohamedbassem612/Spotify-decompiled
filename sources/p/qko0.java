package p;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qko0 extends glo0 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public mrs0 g;
    public CharSequence h;
    public Boolean i;

    public qko0(mrs0 mrs0Var) {
        if (TextUtils.isEmpty(mrs0Var.a)) {
            hhg1.n("User's name must not be empty.");
            throw null;
        }
        this.g = mrs0Var;
    }

    @Override // p.glo0
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT < 28) {
            bundle.putCharSequence("android.selfDisplayName", this.g.a);
            bundle.putBundle("android.messagingStyleUser", this.g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.h);
            if (this.h != null && this.i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.h);
            }
            ArrayList arrayList = this.e;
            if (!arrayList.isEmpty()) {
                bundle.putParcelableArray("android.messages", pko0.a(arrayList));
            }
            ArrayList arrayList2 = this.f;
            if (!arrayList2.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", pko0.a(arrayList2));
            }
            Boolean bool = this.i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }
    }

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        Notification.MessagingStyle messagingStyleB;
        dko0 dko0Var = this.a;
        boolean zBooleanValue = false;
        if (dko0Var == null || dko0Var.a.getApplicationInfo().targetSdkVersion >= 28 || this.i != null) {
            Boolean bool = this.i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } else if (this.h != null) {
            zBooleanValue = true;
        }
        this.i = Boolean.valueOf(zBooleanValue);
        int i = Build.VERSION.SDK_INT;
        mrs0 mrs0Var = this.g;
        if (i >= 28) {
            mrs0Var.getClass();
            messagingStyleB = mko0.a(rh5.c(mrs0Var));
        } else {
            messagingStyleB = kko0.b(mrs0Var.a);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            kko0.a(messagingStyleB, ((pko0) it.next()).c());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                lko0.a(messagingStyleB, ((pko0) it2.next()).c());
            }
        }
        if (this.i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
            kko0.c(messagingStyleB, this.h);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            mko0.c(messagingStyleB, this.i.booleanValue());
        }
        messagingStyleB.setBuilder((Notification.Builder) fdcVar.d);
    }

    @Override // p.glo0
    public final String d() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // p.glo0
    public final void e(Bundle bundle) {
        super.e(bundle);
        ArrayList arrayList = this.e;
        arrayList.clear();
        mrs0 mrs0VarB = (Build.VERSION.SDK_INT < 28 || !bundle.containsKey("android.messagingUser")) ? null : mko0.b(bundle, "android.messagingUser");
        if (mrs0VarB != null) {
            this.g = mrs0VarB;
        } else if (bundle.containsKey("android.messagingStyleUser")) {
            this.g = mrs0.a(bundle.getBundle("android.messagingStyleUser"));
        } else {
            String string = bundle.getString("android.selfDisplayName");
            mrs0 mrs0Var = new mrs0();
            mrs0Var.a = string;
            mrs0Var.b = null;
            mrs0Var.c = null;
            mrs0Var.d = null;
            mrs0Var.e = false;
            mrs0Var.f = false;
            this.g = mrs0Var;
        }
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.h = charSequence;
        if (charSequence == null) {
            this.h = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            arrayList.addAll(pko0.b(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.f.addAll(pko0.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public final void f(pko0 pko0Var) {
        ArrayList arrayList = this.e;
        arrayList.add(pko0Var);
        if (arrayList.size() > 25) {
            arrayList.remove(0);
        }
    }

    public qko0() {
    }
}
