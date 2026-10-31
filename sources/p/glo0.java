package p;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class glo0 {
    public dko0 a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;

    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    public static glo0 c(Notification notification) {
        glo0 qko0Var;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            String string = bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            boolean z = false;
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$ProgressStyle":
                        qko0Var = new flo0();
                        break;
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        qko0Var = new iko0();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        qko0Var = new bko0();
                        break;
                    case "androidx.core.app.NotificationCompat$MetricStyle":
                        qko0Var = new alo0();
                        break;
                    case "androidx.core.app.NotificationCompat$CallStyle":
                        qko0Var = new gko0();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        qko0Var = new cko0((byte) 1);
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        qko0Var = new cko0(z);
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        qko0Var = new qko0();
                        break;
                    default:
                        qko0Var = null;
                        break;
                }
            } else {
                qko0Var = null;
            }
            if (qko0Var == null) {
                if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                    qko0Var = new qko0();
                } else if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
                    qko0Var = new bko0();
                } else if (bundle.containsKey("android.bigText")) {
                    qko0Var = new cko0(z);
                } else if (bundle.containsKey("android.textLines")) {
                    qko0Var = new cko0((byte) 1);
                } else if (bundle.containsKey("android.callType")) {
                    qko0Var = new gko0();
                } else if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
                    qko0Var = new flo0();
                } else if (bundle.containsKey("android.metrics")) {
                    qko0Var = new alo0();
                } else {
                    String string2 = bundle.getString("android.template");
                    if (string2 == null) {
                        qko0Var = null;
                    } else if (string2.equals(Notification.BigPictureStyle.class.getName())) {
                        qko0Var = new bko0();
                    } else if (string2.equals(Notification.BigTextStyle.class.getName())) {
                        qko0Var = new cko0(z);
                    } else if (string2.equals(Notification.InboxStyle.class.getName())) {
                        qko0Var = new cko0((byte) 1);
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 36 && string2.equals(Notification.ProgressStyle.class.getName())) {
                            qko0Var = new flo0();
                        } else if (string2.equals(Notification.MessagingStyle.class.getName())) {
                            qko0Var = new qko0();
                        } else if (string2.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                            qko0Var = new iko0();
                        } else if (i < 37 || !string2.equals(Notification.MetricStyle.class.getName())) {
                            qko0Var = null;
                        } else {
                            qko0Var = new alo0();
                        }
                    }
                }
            }
            if (qko0Var != null) {
                try {
                    qko0Var.e(bundle);
                    return qko0Var;
                } catch (ClassCastException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public void a(Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.c);
        }
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strD = d();
        if (strD != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strD);
        }
    }

    public void b(fdc fdcVar) {
        ((Notification.Builder) fdcVar.d).setStyle(hko0.a());
    }

    public String d() {
        return null;
    }

    public void e(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.c = bundle.getCharSequence("android.summaryText");
            this.d = true;
        }
        this.b = bundle.getCharSequence("android.title.big");
    }
}
